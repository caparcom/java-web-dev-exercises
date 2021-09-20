package exercises.technology;

public class SmartPhone extends Computer{

    private String type;
    private String os;
    private double memoryInGigs;
    private double screenSize;
    private boolean hasHeadphoneJack;


    public SmartPhone(boolean hasHeadphoneJack, double screenSize, String type, String os, double memoryInGigs){
        super(type, os, memoryInGigs);
        this.hasHeadphoneJack = hasHeadphoneJack;
        this.screenSize = screenSize;
    }


    public void setHasHeadphoneJack(boolean hasHeadphoneJack) {
        this.hasHeadphoneJack = hasHeadphoneJack;
    }

    public boolean isHasHeadphoneJack() {
        return hasHeadphoneJack;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getOs() {
        return os;
    }

    public String getType() {
        return type;
    }

    public double getMemoryInGigs() {
        return memoryInGigs;
    }

    public void setMemoryInGigs(double memoryInGigs) {
        this.memoryInGigs = memoryInGigs;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String doesItHaveAHeadPhoneJack(){
        if (this.hasHeadphoneJack == true){
            return "yessir";
        }else {
            return "nossirrrr";
        }
    }





}

