package com.relevel.twitterclone.application;

import com.relevel.twitterclone.domain.Tweet;
import com.relevel.twitterclone.domain.User;
import com.relevel.twitterclone.exception.NotFoundException;
import com.relevel.twitterclone.persistence.ITwitterJDBC;
import com.relevel.twitterclone.persistence.IUserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Class to perform all the JDBC operations using {@link com.relevel.twitterclone.persistence.ITwitterJDBC}
 *
 * @since Jul 09, 2021 9:03 AM
 */
@Service
public class TwitterService {

    private final ITwitterJDBC twitterJDBC;
    private final IUserRepository userRepository;

    public TwitterService(ITwitterJDBC twitterJDBC, IUserRepository userRepository) {
        this.twitterJDBC = twitterJDBC;
        this.userRepository = userRepository;
    }

    public ResponseEntity<String> tweet(Tweet tweet) {
        if (tweet != null) {
            validateUser(tweet.getUser());
            userRepository.save(tweet.getUser());

            if (tweet.getMessage() == null || tweet.getMessage().isEmpty()) {
                throw new NotFoundException("tweet message not found");
            }

            twitterJDBC.save(tweet);

            return new ResponseEntity<>("Tweet: is successfully tweeted by user: " + tweet.getUser().getUsername(),
                    HttpStatus.CREATED);
        }

        throw new NotFoundException("Tweet not found");
    }

    public ResponseEntity<List<String>> searchTweetsByUser(User user) {
        validateUser(user);

        final List<String> tweets =
                twitterJDBC.findByUserId(user.getId()).stream().map(Tweet::getMessage).collect(Collectors.toList());

        return new ResponseEntity<>(tweets,HttpStatus.OK);
    }

    private void validateUser(User user) {
        if (user == null || user.getUsername() == null || user.getUsername().isEmpty()) {
            throw new NotFoundException("user not found");
        }
    }
}
