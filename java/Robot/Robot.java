package Robot;

import java.util.Random;

public class Robot {

    private String name;
    private int age;
    protected String[] moods = {"Happy", "Sad", "Angry", "Excited", "Neutral"};
    protected String currentMood;
    
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getMood(){
        return this.currentMood;
    }

    public Robot(String name, int age) {
        this.name = name;
        this.age = age;
        this.currentMood = getRandomMood();
    }

    public void greetUser() {
        System.out.println("Hello! I am " + name + ", your friendly robot. How can I assist you today?");
    }

    public void recallInformation() {
        System.out.println("My name is " + name + ". I am " + age + " years old, and I am currently feeling " + currentMood + ".");
    }

    public void updateMood() {
        currentMood = getRandomMood();
    }

    private String getRandomMood() {
        Random random = new Random();
        int randomIndex = random.nextInt(moods.length);
        return moods[randomIndex];
    }

    public static void main(String[] args){
        Robot r = new Robot("somename", 1);
        r.greetUser();
        r.recallInformation();
        System.out.println(r.getAge());;
        System.out.println(r.getMood());
        System.out.println(r.getName());
        r.updateMood();
        System.out.println(r.getMood());
        SuperRobot sr = new SuperRobot("name", 2);
        sr.greetUser(1);
        sr.greetUser("feawiofjawi;ofa");
        sr.getAge();
        sr.getMood();
        sr.recallInformation();
        sr.updateMood();
        sr.updateMood();
        sr.recallInformation();
    }

}

class SuperRobot extends Robot{
    private String[] greetings = {
            "Hello, human!",
            "Greetings, friend!",
            "Salutations!",
            "Hey there!",
            "Greetings and salutations!"
    };
    public SuperRobot(String name, int age){
        super(name, age);
    }

    public void updateMood(int i) {
        currentMood = moods[i];
    }

    public void greetUser(String customGreeting) {
        System.out.println(customGreeting);
    }

    public void greetUser(int greetingIndex) {
        if (greetingIndex >= 0 && greetingIndex < greetings.length) {
            System.out.println(greetings[greetingIndex]);
        } else {
            System.out.println("Unknown Greeting");
        }
    }
    
}