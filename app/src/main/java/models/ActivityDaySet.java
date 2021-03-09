package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.lang.annotation.Target;

@Entity
@Table(name = "activity_day_set")
public class ActivityDaySet {
    @ManyToOne
    @JoinColumn(name = "day_set_id")
    private DaySet daySet;

    @ManyToOne(targetEntity = Activity.class)
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public DaySet getDaySet() {
        return daySet;
    }

    public void setDaySet(DaySet daySet) {
        this.daySet = daySet;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
