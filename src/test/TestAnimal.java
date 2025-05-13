package test;

import domain.Giraffe;

public class TestAnimal {

    public static void main(String[] args) {
        Giraffe giraffe = new Giraffe("Жорик", 5);

        giraffe.eat();              
        giraffe.sleep();            
        giraffe.move();             
        giraffe.makeSound();        

        giraffe.reachHighLeaves();  
        giraffe.stretchNeck();      
    }
}
