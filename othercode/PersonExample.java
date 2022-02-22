import java.util.*;

public class PersonExample {
    public static void main(String[] args) {
        Person person1 = new Person("Jane", 32);
        Person person2 = new Person("Ray", 64);
        Person person3 = new Person("Mike", 31);
        Person person4 = new Person("Jon", 23);
        Person person5 = new Person("Mary", 37);

        List<Person> list = Arrays.asList(person1, person2, person3, person4, person5);

        //can we sort this by age?
        System.out.println("Before sorting " + list + "\n \n");
        //use comparator!!
        Comparator<Person> comparatorByAge = Comparator.comparingInt(p -> p.age);
        list.sort(comparatorByAge);
        //list.sort(new PersonAgeComparator());

        System.out.println("After sorting " + list);

    }

}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PersonAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.age, person2.age);
    }

}
