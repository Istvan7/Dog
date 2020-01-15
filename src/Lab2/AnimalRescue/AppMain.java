package Lab2.AnimalRescue;

import org.w3c.dom.ls.LSOutput;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.name = "Rex";
        rex.age =1.6f;
        rex.race = "pug";
        rex.size = 1.4f;
        rex.isFriendly =true;
        rex.health_level =9;
        rex.hungryness_level=3;
        rex.favourite_food="Raw food";


        Dog brunno = new Dog();
        brunno.name="brunno";
        brunno.age=0.5f;
        brunno.race= "labrador";
        brunno.size= 1.9f;
        brunno.isFriendly=true;
        brunno.health_level=7;
        brunno.hungryness_level=5;
        brunno.favourite_food="dry food";

        Dog sasha = new Dog();
        sasha.name="sasha";
        sasha.age=0.5f;
        sasha.race="husky";
        sasha.size=0.8f;
        sasha.isFriendly=true;
        sasha.health_level=10;
        sasha.hungryness_level=1;
        sasha.favourite_food="wet food";

        Dog oscar = new Dog();
        oscar.name="oscar";
        oscar.age=4;
        oscar.race="pitbull";
        oscar.size=2.5f;
        oscar.isFriendly=false;
        oscar.health_level=4;
        oscar.hungryness_level=9;
        oscar.favourite_food="home cooked food";

        Food dry_dog_food = new Food();
        dry_dog_food.name="Dr. Tim’s Dry Dog Food";
        dry_dog_food.price=50;
        dry_dog_food.quantity=30;
        dry_dog_food.available_in_stock=true;

        Food wet_dog_food =new Food();
        wet_dog_food.name="Taste of the Wild Wet Dog Food";
        wet_dog_food.price=25;
        wet_dog_food.quantity=20;
        wet_dog_food.available_in_stock=true;

        Food raw_dog_food= new Food();
        raw_dog_food.name="Natural Ultramix";
        raw_dog_food.price=40;
        raw_dog_food.quantity=20;
        raw_dog_food.available_in_stock=true;


        Adopter andrei =new Adopter();
        andrei.name="Andrei";
        andrei.gendar="Male";
        andrei.age=25;
        andrei.available_money=500;


        Adopter elena = new Adopter();
        elena.name="Elena";
        elena.gendar="Woman";
        elena.age=30;
        elena.available_money=325;

        Adopter razvan = new Adopter();
        razvan.name="Razvan";
        razvan.gendar="Male";
        razvan.age=18;
        razvan.available_money=150;

        Vet ionel = new Vet();
        ionel.name="Ionel";
        ionel.specialization="Companion animal-veterinarian";

        Vet alex = new Vet();
        alex.name="Alexandru";
        alex.specialization="food-safety veterinarians";


        Recreation alergat = new Recreation();
        alergat.name="Alergatul prin curte";

        Recreation plimbat = new Recreation();
        plimbat.name="Plimbatul prin parc";

        Recreation joaca = new Recreation();
        joaca.name="Jucatul cu mingea ";


        System.out.println(rex.name);
        System.out.println(brunno.age);
        System.out.println(sasha.health_level);
        System.out.println(oscar.race);



        }






    }


