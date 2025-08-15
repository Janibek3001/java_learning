package fundamentals;

public class program {
    public static void main(String[] args) {
        Person Tom = new Person("Tom", 22);
        Tom.Display();
    }
}

class Person {
    String name;
    int age;

    {
        name = "Undefined";
        age = 0;
    }

    Person(){}

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void Display() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
    }
}