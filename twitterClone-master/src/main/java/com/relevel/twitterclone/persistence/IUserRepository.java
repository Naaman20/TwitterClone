package com.relevel.twitterclone.persistence;

import com.relevel.twitterclone.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 */
public interface IUserRepository extends JpaRepository<User,Long> {
}
