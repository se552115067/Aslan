package camt.se331.aslanproject.repository;

import camt.se331.aslanproject.Entity.QuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Punjasin on 17/4/2558.
 */
public interface QuestionRepository extends JpaRepository<QuestionAnswer,Long> {
}
