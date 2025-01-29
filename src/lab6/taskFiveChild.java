package lab6;

public class taskFiveChild extends taskFiveParent{


    @Override
    public String getName(){
        String name = super.getName();
        return "Добро пожаловать, " + name + "!";
    }
}
