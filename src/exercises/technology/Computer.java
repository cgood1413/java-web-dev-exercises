package exercises.technology;

public class Computer {

    private String make;
    private String operatingSys;
    private double storageGig;

    public Computer(String make, String operatingSys, double storageGig){
        this.make = make;
        this.operatingSys = operatingSys;
        this.storageGig = storageGig;
    }

    public String getMake() {
        return make;
    }

    public String getOperatingSys() {
        return operatingSys;
    }

    public double getStorageGig() {
        return storageGig;
    }

    public void setOperatingSys(String operatingSys) {
        this.operatingSys = operatingSys;
    }

    public double compute(double num1, double num2){
        return num1 + num2;
    }

    public String print(){
        return "Beep boop I am a " + this.getMake() + " product running " + this.getOperatingSys();
    }

}
