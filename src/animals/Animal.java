package animals;

public abstract class Animal {
    public int age;
    public String name;

    public Animal() {
        System.out.println("A Animal now exists without a name");
    }

    public Animal(String name) {
        System.out.println("A Animal now exists and was given the name " + name);
        this.name = name;
    }
    protected abstract int calculateRandomAge();

    public String getName(){
        return this.name;
    }

    protected Integer generateSecurityCode() {
        return 0;
    }

    public int getAge(){
        return this.age;
    }
}
