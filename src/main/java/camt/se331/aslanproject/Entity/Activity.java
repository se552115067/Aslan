package camt.se331.aslanproject.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Created by Punjasin on 17/4/2558.
 */
@Entity
public class Activity implements Comparable {
    @Id
    @GeneratedValue
    Long aid;
    String aname;
    String adescripion;
    List<String> image;

    public Activity(String aname, String adescripion, List<String> image) {
        this.aname = aname;
        this.adescripion = adescripion;
        this.image = image;
    }

    public Activity() {
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAdescripion() {
        return adescripion;
    }

    public void setAdescripion(String adescripion) {
        this.adescripion = adescripion;
    }

    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Activity)) return false;

        Activity activity = (Activity) o;

        if (adescripion != null ? !adescripion.equals(activity.adescripion) : activity.adescripion != null)
            return false;
        if (aid != null ? !aid.equals(activity.aid) : activity.aid != null) return false;
        if (aname != null ? !aname.equals(activity.aname) : activity.aname != null) return false;
        if (image != null ? !image.equals(activity.image) : activity.image != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aid != null ? aid.hashCode() : 0;
        result = 31 * result + (aname != null ? aname.hashCode() : 0);
        result = 31 * result + (adescripion != null ? adescripion.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
