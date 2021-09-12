package com.relevel.twitterclone.persistence;

import com.relevel.twitterclone.domain.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Interface to perform all the JDBC operations.
 *
 * @since Jul 09, 2021 9:08 AM
 */
public interface ITwitterJDBC extends JpaRepository<Tweet, Long> {

    @Query("SELECT t FROM Tweet t WHERE t.user.id=:userId")
    List<Tweet> findByUserId(@Param("userId") long id);
}
