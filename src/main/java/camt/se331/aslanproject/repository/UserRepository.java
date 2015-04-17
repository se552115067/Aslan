package camt.se331.aslanproject.repository;

import camt.se331.aslanproject.Entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Punjasin on 24/3/2558.
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
