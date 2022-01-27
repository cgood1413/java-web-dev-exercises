package exercises.technology;

public class Laptop extends Computer{

    private String internetBrowser;

    public Laptop(String make, String operatingSys, double storageGig){
        super(make, operatingSys, storageGig);
//        switch(make){
//            case "Apple":
//                this.internetBrowser = "Safari";
//                break;
//            case "Android":
//                this.internetBrowser = "Chrome";
//                break;
//            default:
//                this.internetBrowser = "Internet Explorer";
//        }
        switch (make) {
            case "Apple" -> this.internetBrowser = "Safari";
            case "Android" -> this.internetBrowser = "Chrome";
            default -> this.internetBrowser = "Internet Explorer";
        }
    }

    public String getInterNetBrowser(){
        return this.internetBrowser;
    }

    public void setInternetBrowser(String internetBrowser){
        this.internetBrowser = internetBrowser;
    }

    @Override
    public String print(){
        return "Beep boop I am a " + this.getMake() + " laptop using " + this.getInterNetBrowser() + " to browse the internet";
    }

}
