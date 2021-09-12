package com.relevel.twitterclone.domain;

import javax.persistence.*;

/**
 * @since Jul 09, 2021 9:02 AM
 */
@Entity
public class Tweet {

    @Id
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private String message;

    public Tweet() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
