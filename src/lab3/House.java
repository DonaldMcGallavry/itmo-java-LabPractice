package lab3;

public class House {
    private int numFloors;
    private int yearConstruct;
    private String name;

    public House(int numFloors, int yearConstruct, String name){
        this.numFloors = numFloors;
        this.yearConstruct = yearConstruct;
        this.name = name;
    }
    public void printHouse(){
        System.out.println("Кол-во этажей: " + numFloors + '\n' +
                "год строительства: " + yearConstruct + '\n' +
                "Название: " + name);
    }
    public int howOld(){
        int currentYear = 2025;
        int s = 2025 - yearConstruct;
        return s;
    }
}
