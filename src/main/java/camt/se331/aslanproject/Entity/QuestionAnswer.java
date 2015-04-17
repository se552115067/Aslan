package camt.se331.aslanproject.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Punjasin on 17/4/2558.
 */
@Entity
public class QuestionAnswer implements Comparable {
    @Id
    @GeneratedValue
    Long qid;
    String qname;
    String answer;
    boolean newest = true;

    public QuestionAnswer() {
    }

    public QuestionAnswer(String qname, String answer, boolean newest) {
        this.qname = qname;
        this.answer = answer;
        this.newest = newest;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
