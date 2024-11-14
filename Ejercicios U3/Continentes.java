import java.util.ArrayList;
import java.util.HashSet;

class Person {
    String firstName;
    String lastName;
    String country;
    String continent;
    int age;
    String language;
    String greeting;

    public Person(String firstName, String lastName, String country, String continent, int age, String language) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.continent = continent;
        this.age = age;
        this.language = language;
        this.greeting = "";
    }
}

public class Continentes {

    public static boolean isMeetup (ArrayList<Person> person){
        boolean africa = false, americas = false, asia = false, europe = false, oceania = false; //inicialmente no existe ninguno y luego con el for se cambia el estado

        for (Person p : person) { //verificar que exista por lo menos una persona de cada continente
            switch (p.continent) {
                case "Africa":
                africa = true;
                    break;
                    case "Americas":
                    americas = true;
                    break;
                case "Asia":
                    asia = true;
                    break;
                case "Europe":
                    europe = true;
                    break;
                case "Oceania":
                    oceania = true;
                    break;
            }
        }
        return africa && americas && asia && oceania && europe;
    }

public static int javascriptDevelopers (ArrayList<Person> person){

    int javasriptContador = 0; //metodo que cuenta la cantidad de JavaScript developers y que sean Europeos
    for (Person javaPerson : person) {
        if (javaPerson.language == "JavaScript" && javaPerson.continent=="Europe") {
            javasriptContador++;
        }
    }
    return javasriptContador;
}

public static HashSet<String> languajeRepresented (ArrayList<Person> person){ //metodo para retornar set de lenguajes
    HashSet<String> languaje = new HashSet<>(); // se hace uso de hashset porque no repite elementos

    for (Person personLanguaje : person) {
        languaje.add(personLanguaje.language);
    }
    return languaje;
}

public static ArrayList<Person> addGreeting ( ArrayList<Person> person){ //agregar el atributo greeting

    for (Person person2 : person) {
        person2.greeting = "Hi " + person2.firstName +", what do you like the most about " + person2.language + "?";
    }
    return person;
}

    public static void main(String[] args) {
    
        ArrayList<Person> person = new ArrayList<Person>();
        person.add(new Person("Fatima", "A.", "Algeria", "Africa", 25, "JavaScript"));
        person.add(new Person("Agustín", "M.", "Chile", "Americas", 37, "C"));
        person.add(new Person("Jing", "X.", "China", "Asia", 39, "Ruby"));
        person.add(new Person("Laia", "P.", "Andorra", "Europe", 55, "Ruby"));
        person.add(new Person("Oliver", "Q.", "Australia", "Oceania", 65, "PHP"));

        System.out.println("¿Existe un representante en cada continente ? " + isMeetup(person));
        System.out.println();
        System.out.println("¿Cuántos JavaScript developers de Europa existen ? " + javascriptDevelopers(person));
        System.out.println();
        addGreeting(person);

        for (Person p : person) {
            System.out.println(p.greeting);
        }
        System.out.println();
        System.out.println("Lista de lenguajes: " + languajeRepresented(person));
    }
}
