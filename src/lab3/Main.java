package lab3;

public class Main {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
        System.out.println("============================");
        SimpleClass class1 = new SimpleClass("black", "something", 65.354);
        class1.printSimpleClass();
        System.out.println("============================");
        House house = new House(12,1980,"WhiteHouse");
        house.printHouse();
        System.out.println(house.howOld());
        System.out.println("============================");
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(151, "pine");
        System.out.println(tree2.toString());
        Tree tree3 = new Tree(54,true, "fir");
        System.out.println(tree3.toString());
    }
}
