import java.util.Comparator;

/**
 * Created by pwieczorek on 04.09.16.
 */
public class Person{

    private String name;
    private String surname;
    private String address;

    public Person(String name, String surname, String address) {
        this.name=name;
        this.surname=surname;
        this.address=address;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }



    public String toString() {
            return name + " " + surname + " " + address;
        }


}

