package Thanos;
import Hero.Hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Thanos {
    public static void main(String[] args) {

        // TODO 1 : Initialise une ArrayList de Hero nommée heroes
        List<Hero> heroes = new ArrayList<>();

        /* TODO 2 :
        Ajoute à la liste heroes les nouvelles instances de Hero suivantes :

// name: Black Widow, age: 34
// name: Captain America, age: 100
// name: Vision, age: 3
// name: Iron Man, age: 48
// name: Scarlet Witch, age: 29
// name: Thor, age: 1500
// name: Hulk, age: 49
// name: Doctor Strange, age: 42
         */
        Hero widow = new Hero("Black Widow", 34);
        Hero captain = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero iron = new Hero("Iron Man", 48);
        Hero witch = new Hero("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero ("Hulk", 49);
        Hero doctor = new Hero ("Doctor Strange", 42);

        heroes.add(widow);
        heroes.add(captain);
        heroes.add(vision);
        heroes.add(iron);
        heroes.add(witch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctor);

        // TODO 3: C'est l'anniversaire de Thor, il a maintenant 1501 ans ! Modifie son instance dans la liste
        Hero Thor = new Hero("Thor", 1501);
        heroes.set(5, Thor);

        // TODO 4 :Mélange la liste de façon aléatoire grâce à une méthode existante (elle est dans une ressource d'une étape précédente)
        Collections.shuffle(heroes, new Random());

        // TODO 5 : Ne garde que la première moitié de la liste grâce à une méthode existante (elle est dans une ressource d'une étape précédente)
        heroes = heroes.subList(0, heroes.size()/2 );

        // TODO 6 : Avec une boucle, affiche dans le terminal le nom des héros encore en vie
        for (Hero string : heroes) {
            System.out.println("Le nom du hero encore en vie est: " + string.getName());
        }
    }
}
