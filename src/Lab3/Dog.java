package Lab3;

public class Dog {
    private String name;
    private String race;
    private float age;
    private
    float size;
    private boolean isFriendly;
    private int health_level;
    private int hungryness_level;
    private String favourite_food;

    public void run() {
        System.out.println("(tries to)Runs all day!");
    }

    public void sleep() {
        System.out.println("Snors a lot");

    }

    public void eat() {
        System.out.println("Eats 3 meals a day ");
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAge() {
        return age;
    }

    public void setRace(String race) {
        this.race = race;
        }

    public String getRace () {
        return race;}

    public void  setsize(float size) {
        this.size = size;
    }

    public float getsize () {
        return size;
    }
}