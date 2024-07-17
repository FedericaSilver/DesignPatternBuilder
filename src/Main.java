public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        personBuilder.setAge(18);
        personBuilder.setFirstName("Mol");
        personBuilder.setLastName("Trev");
        personBuilder.setAddress("Via della vittoria");
        Person person3 = personBuilder.build();
        System.out.println(person3);
        Person person = new PersonBuilder().build();
        person.setFirstName("Mario");
        person.setLastName("Rossi");
        Person person2 = new PersonBuilder().build();
        person2.setFirstName("Pietro");
        person2.setLastName("Verdi");
        person2.setAge(19);
        person2.setAddress("Viale Primavera, 9");
        System.out.println(person);
        System.out.println(person2);

    }
}