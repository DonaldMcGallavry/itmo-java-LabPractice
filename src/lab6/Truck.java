package lab6;

public class Truck extends Car {
    private int wheelNum;
    private double maxWeight;

    public Truck (int w, String m, char c, float s, double maxWeight, int wheelNum){
        super(w,m,c,s);
        this.maxWeight = maxWeight;
        this.wheelNum = wheelNum;
    }

    public void newWheels (int wheelNum){
        this.wheelNum = wheelNum;
        System.out.println("Кол-во колес: " + wheelNum);
    }

    @Override
    public void outPut(){
        super.outPut();
        System.out.println("Количество колес грузовика: " + wheelNum);
    }
}
