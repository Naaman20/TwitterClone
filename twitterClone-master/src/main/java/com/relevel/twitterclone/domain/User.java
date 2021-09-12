package com.relevel.twitterclone.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * @since Jul 09, 2021 9:01 AM
 */
@Entity
public class User {

    @Id
    private long id;

    private String username;

    @OneToMany
    private List<Tweet> tweet;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Tweet> getTweet() {
        return tweet;
    }

    public void setTweet(List<Tweet> tweet) {
        this.tweet = tweet;
    }
}
