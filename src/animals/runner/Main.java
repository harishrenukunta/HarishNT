package animals.runner;

import animals.Animal;
import animals.Bird;
import animals.bird_types.Eagle;
import animals.bird_types.Penguin;

/* The purpose of this exercise is to demonstrate a few of the key concepts
of Object-Oriented Programming in Java.

Using the sample classes provided in the animals package,
complete the exercise by writing code to implement the following:
1) Multi-Level Inheritance using Interfaces
2) Method Overriding with Abstract classes
3) Method Overloading
4) Encapsulation
5) Polymorphism */

public class Main {

    public static void main(String[] args) {

        //TODO Question 2: Insert the code below to demo calling an Overridden method here
        Bird eagle = new Eagle("Eagle-Maroo");
        System.out.println(String.format("My name is:%s", ((Eagle)eagle).calculateRandomAge()));


        //TODO Question 3: Insert the code below to demo calling an Overloaded method here
        Bird penguin = new Penguin("Penguin-Athen");
        ((Penguin)penguin).calculateRandomAge(13);
        System.out.println(String.format("I am '%s' and of age %d", penguin.getName(), penguin.getAge()));



        //TODO Question 4: Insert the code below to demo Encapsulation here


        //TODO Question 5: Polymorphism ************************************************

        // A) Complete the code to demonstrate polymorphism using the Object class in Java
        Penguin penguin1 = new Penguin();
        Bird bird1 = (Bird) penguin1;
        penguin1.getAvgHopHeight();
        // Insert code here


        // B) Demonstrate upcasting:
        // Insert code here


        // C) Demonstrate downcasting:
        Bird bird = new Penguin("Penguine-Maroo");
        // Insert code here

        //TODO Question 5: End ***********************************************************

    }

}
