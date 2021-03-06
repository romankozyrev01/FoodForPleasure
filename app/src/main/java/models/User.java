package models;


import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Stack;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "height")
    private Integer height;

    @Column(name = "start_weight")
    private Double startWeight;

    @Column(name = "final_weight")
    private Double finalWeight;

    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
    private Date birthday;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "stack_id")
    private List<Stack> stacks;

    @Column(name = "current_weight")
    private Double currentWeight;

    @Column(name = "gender")
    private String gender;

    @Column(name="daily_colories")
    private  int dailyColories;

    @Column(name="authorized_token")
    private String authorizedToken;

    @Column(name="goal")
    private String goal;

    public String getAuthorizedToken() {
        return authorizedToken;
    }

    public void setAuthorizedToken(String authorizedToken) {
        this.authorizedToken = authorizedToken;
    }

    public int getDailyColories() {
        return dailyColories;
    }

    public void setDailyColories(int dailyColories) {
        this.dailyColories = dailyColories;
    }

    public Long getUser_id() {
        return user_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Double getStartWeight() {
        return startWeight;
    }

    public void setStartWeight(Double startWeight) {
        this.startWeight = startWeight;
    }

    public Double getFinalWeight() {
        return finalWeight;
    }

    public void setFinalWeight(Double finalWeight) {
        this.finalWeight = finalWeight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Stack> getStacks() {
        return stacks;
    }

    public void setStacks(List<Stack> stacks) {
        this.stacks = stacks;
    }

    public Double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(Double currentWeight) {
        this.currentWeight = currentWeight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge(){
       String[] str =  birthday.toString().split(" ");
       return  2020 - Integer.parseInt(str[str.length - 1]);
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", startWeight=" + startWeight +
                ", finalWeight=" + finalWeight +
                ", birthday=" + birthday +
                ", stacks=" + stacks +
                ", currentWeight=" + currentWeight +
                ", gender='" + gender + '\'' +
                ", dailyColories=" + dailyColories +
                ", authorizedToken='" + authorizedToken + '\'' +
                '}';
    }
}
