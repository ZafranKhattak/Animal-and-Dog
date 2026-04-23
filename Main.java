class Animal
{
    private String name;

    Animal(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return name;
    }

    void makeSound()
    {
        System.out.println("Generic Sound");
    }
}

class Dog extends Animal
{
    private String breed;

    Dog(String name ,String breed)
    {
        super(name);
        this.breed = breed;
    }

    @Override 
    
    void makeSound()
    {
        System.out.println("Bark");
    }

    String getBreed()
    {
        return breed;
    }

    void displayInfo()
    {
        System.out.println(getName());
        System.out.println(getBreed());
    }
}


public class Main {
    
    public static void main(String[] args) {
        
        Dog dog = new Dog("Max", "Labrador");
        dog.makeSound();

        dog.displayInfo();
    }
}
