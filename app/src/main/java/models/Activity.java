package models;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Time;


@Entity
@Table(name = "activities")
public class Activity {
    @DatabaseField(generatedId = true)
    private Long activity_id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_time")
    private Date duration;

    @Column(name = "burned_colories")
    private int burnedCalories;


    public Long getActivity_id() {
        return activity_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBurnedCalories() {
        return burnedCalories;
    }

    public void setBurnedCalories(int burnedCalories) {
        this.burnedCalories = burnedCalories;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "activity_id=" + activity_id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", burnedCalories=" + burnedCalories +
                '}';
    }
}
