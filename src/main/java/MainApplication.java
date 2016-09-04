import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by pwieczorek on 04.09.16.
 */
public class MainApplication {

    static ArrayList<Person> arrPerson = new ArrayList<>();

    static Comparator<Person> personComparator = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            int i = o1.getSurname().compareTo(o2.getSurname());
            return ~i;
        }
    };

    static Comparator<Person> personComparator2 = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            int i = o1.getAddress().compareTo(o2.getAddress());
            return i;
        }
    };

    static Person person0 = new Person("Jan","Kowalski","Gdańsk");
    static Person person1 = new Person("Wojciech","Zieliński","Kwidzyn");
    static Person person2 = new Person("Magdalena","Nowak","Warszawa");
    static Person person3 = new Person("Anna","Krzemińska","Częstochowa");
    static Person person4 = new Person("Mateusz","Żyśko","Sopot");



    public static void main(String[] args) {

        arrPerson.add(person0);
        arrPerson.add(person4);
        arrPerson.add(person2);
        arrPerson.add(person3);
        arrPerson.add(person1);



        System.out.println("Przed sortowaniem:");

        for(Person person : arrPerson) {
            System.out.println(person.toString());
        }

        Collections.sort(arrPerson,personComparator);

        System.out.println("\nPo sortowaniu nazwiskami:");

        for(Person person : arrPerson) {
            System.out.println(person.toString());
        }

        Collections.sort(arrPerson,personComparator2);

        System.out.println("\nPo sortowaniu adresami:");

        for(Person person : arrPerson) {
            System.out.println(person.toString());
        }

    }
}
