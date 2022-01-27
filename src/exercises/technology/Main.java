package exercises.technology;

public class Main {
    public static void main(String[] args) {
//        Computer mac = new Computer("Apple", "macOS", 256);
//        System.out.println(mac.print());;

//        SmartPhone myNewPhone = new SmartPhone("Apple", "iOS", 64);
//        System.out.println(myNewPhone.print());
//        myNewPhone.addContact("Chance", 4155241);
//        System.out.println(myNewPhone.getPhonebook());
//        System.out.println(myNewPhone.getStorageGig());

//        Laptop airMac = new Laptop("Apple", "macOS", 123);
//        System.out.println(airMac.getInterNetBrowser());
//        airMac.setInternetBrowser("Chrome");
//        System.out.println(airMac.getInterNetBrowser());
//        System.out.println(airMac.print());

        Computer macbook = new Laptop("Apple", "macOS", 512);
        System.out.println(macbook.print());
        ((Laptop) macbook).setInternetBrowser("FireFox");
        System.out.println(macbook.print());
        System.out.println(macbook.compute(25, 25));
    }
}
