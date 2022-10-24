package javasolution;

public class O14_Inheritance1 {
    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}




class Bird extends Animal{
    void walk(){
        System.out.println("I am walking");
    }

    void fly(){
        System.out.println("I am flying");
    }

    void sing(){
        System.out.println("I am singing");
    }
}




class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}



// https://www.hackerrank.com/challenges/java-inheritance-1/problem?isFullScreen=true