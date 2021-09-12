package com.relevel.twitterclone.presentation;

import com.relevel.twitterclone.application.TwitterService;
import com.relevel.twitterclone.domain.Tweet;
import com.relevel.twitterclone.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Rest controller class to implement REST end points.
 *
 * @since Jul 09, 2021 9:11 AM
 */
@RestController
public class TwitterController {

    private TwitterService service;

    public TwitterController(TwitterService service) {
        this.service = service;
    }

    @PostMapping("/tweet")
    public ResponseEntity<String> tweet(@RequestBody Tweet tweet) {
        return service.tweet(tweet);
    }

    @PostMapping("/searchTweetsByUser")
    public ResponseEntity<List<String>> searchTweetsByUser(@RequestBody User user) {
        return service.searchTweetsByUser(user);
    }
}
