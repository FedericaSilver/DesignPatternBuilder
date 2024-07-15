public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = new PersonBuilder().build();
        person.setFistName("Mario");
        person.setLastName("Rossi");
        Person person2 = new PersonBuilder().build();
        person2.setFistName("Pietro");
        person2.setLastName("Verdi");
        person2.setAge(19);
        person2.setAddress("Viale Primavera, 9");
        System.out.println(person);
        System.out.println(person2);

    }
}