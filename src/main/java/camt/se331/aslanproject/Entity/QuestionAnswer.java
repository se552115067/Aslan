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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuestionAnswer)) return false;

        QuestionAnswer that = (QuestionAnswer) o;

        if (newest != that.newest) return false;
        if (answer != null ? !answer.equals(that.answer) : that.answer != null) return false;
        if (qid != null ? !qid.equals(that.qid) : that.qid != null) return false;
        if (qname != null ? !qname.equals(that.qname) : that.qname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = qid != null ? qid.hashCode() : 0;
        result = 31 * result + (qname != null ? qname.hashCode() : 0);
        result = 31 * result + (answer != null ? answer.hashCode() : 0);
        result = 31 * result + (newest ? 1 : 0);
        return result;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
