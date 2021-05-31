package com.example.workout;

public class Workout {
    private String name;
    private String Description;
    public Workout(String name,String Description){
        this.name=name;
        this.Description=Description;
    }
    public static final Workout[] workout={
            new Workout("The Limb Loosener","5-HandStand Pushups\n1-legged squats\n15-pullups"),
            new Workout("core Agony","100-pull-ups\n100 push-ups\nSits ups \nsit-ups \nsquats"),
            new Workout("The wimp specials","5 pull-ups \npush-ups \nsquats"),
            new Workout("Sterngth and Length","500 meter run\n21 X 1.5 kettleball swing\n21 X pull ups")
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String toString(){
        return this.name;
    }
}
