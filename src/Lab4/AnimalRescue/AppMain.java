package Lab4.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.setName("rex");
        System.out.println(rex.getName());
        rex.setAge(5);
        System.out.println(rex.getAge());
        rex.setFriendly(true);
        System.out.println(rex.isFriendly());
        Dog nero = new Dog();
        nero.setRace("Husky");
        System.out.println(nero.getRace());
        Duck donald = new Duck();
        donald.setEat("Donald eats a lot of corn");
        System.out.println(donald.getEat());
        Recreation alergat = new Recreation();
        alergat.setName("Alergare prin parc");
        System.out.println(alergat.getName());
        Adopter andrei = new Adopter();
        andrei.setName("Andrei");
        System.out.println(andrei.getName());
        andrei.setGender("Sis trans cyborg");
        System.out.println(andrei.getGender());
        nero.setSleep("Sleeps all day");
        System.out.println(nero.getSleep());
        Vet alexandra = new Vet();
        alexandra.setAge(5);
        System.out.println(alexandra.getAge());
        Food homemade = new Food();
        homemade.setQuantity(10);
        System.out.println(homemade.getQuantity());
    }
}
