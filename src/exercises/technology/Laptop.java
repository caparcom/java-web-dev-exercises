package exercises.technology;

public class Laptop extends Computer{

    private String type;
    private String os;
    private double memoryInGigs;
    private double screenSize;

    public Laptop(double screenSize, String type, String os, double memoryInGigs){
        super(type, os, memoryInGigs);
        this.screenSize = screenSize;
    }

    public Laptop(){

    }




    public void setType(){
        this.type = type;
    }
    public void setOs(){
        this.os = os;
    }
    public void setMemoryInGigs(){
        this.memoryInGigs = memoryInGigs;
    }
    public void setScreenSize(){
        this.screenSize = screenSize;
    }
    public String getType() {
        return type;
    }
    public String getOs() {
        return os;
    }
    public double getMemoryInGigs(){
        return memoryInGigs;
    }
    public double getScreenSize() {
        return screenSize;
    }



    public String forGaming(){
        if (this.memoryInGigs < 50){
            return "Hard no";
        } else {
            return "I mean, I would still get a PC but you can try.";
        }
    }











}
