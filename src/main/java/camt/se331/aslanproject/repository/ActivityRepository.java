package camt.se331.aslanproject.repository;

import camt.se331.aslanproject.Entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Punjasin on 17/4/2558.
 */
public interface ActivityRepository extends JpaRepository<Activity,Long> {
}
