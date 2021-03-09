package models;

import com.j256.ormlite.field.DatabaseField;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "day_set")
public class DaySet {

    @Column(name = "day_set_id")
    @DatabaseField(generatedId = true)
    private Long daySetId;

    @Column(name = "user_id")
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    public Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public void setDaySetId(Long daySetId) {
        this.daySetId = daySetId;
    }

    public Long getDaySetId() {
        return daySetId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
