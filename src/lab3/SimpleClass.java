package lab3;

public class SimpleClass {
    private String color;
    private String name;
    private double weight;

    public SimpleClass(String color, String name, double weight){
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public  SimpleClass(String color) {
        this.color = color;
    }
    public  SimpleClass(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    public SimpleClass(){

    }

    public void printSimpleClass(){
        System.out.println("Цвет: " + color + '\n'
                + "Название: " + name + '\n' + "Вес: " + weight);
    }
}
