package exercises.technology;

public class Computer {

    private String type;
    private String os;
    private double memoryInGigs;

    public Computer(String type, String os, double memoryInGigs){
        this.type = type;
        this.os = os;
        this.memoryInGigs = memoryInGigs;
    }

    public Computer (){

    }




    private void setType(){
        this.type = type;
    }
    private String getType(){
        return type;
    }
    private void setOs(){
        this.os = os;
    }
    private String getOs(){
        return os;
    }
    private void setMemoryInGigs(){
        this.memoryInGigs = memoryInGigs;
    }
    private double getMemoryInGigs(){
        return memoryInGigs;
    }





    public String info(){
        return "This is a " + type + " using the " + os + " operating system with approximately " + memoryInGigs + " Gigabytes of memory.";
    }

    public String shouldIBuy(){
        if (this.type.equals("The Coolest")){
            return "Totally";
        } else {
            return "No way Jose";
        }
    }







}
