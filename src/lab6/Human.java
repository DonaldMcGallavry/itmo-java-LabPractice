package lab6;

abstract class Human implements Info {

    private String name;
    private String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
