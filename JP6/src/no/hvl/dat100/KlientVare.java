package no.hvl.dat100;
import static java.lang.System.*;
public class KlientVare {
  public static void main(String[]args) {
    Varelager lager = new Varelager(10);
    
    Vare iPhoneX = new Vare(1,"iPhone X", 10999);
    Vare samsungNote8 = new Vare(2,"Samsung note 8", 9490);
    Vare lGV30 = new Vare(3,"LG V30",8999);
    Vare sonyX = new Vare(4, "SONY Xperia", 7999);
    Vare sonyZ = new Vare(5, "SONY Z", 15999);
    
    lager.leggTil(iPhoneX);
    lager.leggTil(samsungNote8);
    lager.leggTil(lGV30);
    lager.leggTil(sonyX);
    lager.leggTil(sonyZ);
        
    out.println(lager.toString());
    out.println(lager.toStringPris());
//    out.println(iPhoneX.toString());
//    out.println(samsungNote8.toString());
//    out.println(lGV30.toString());
//    out.println(sonyX.toString());
//    out.println(sonyZ.toString());
    
    /*
    out.println(samsungNote8.toBilligere(iPhoneX));
    out.println(samsungNote8.toBilligere(samsungNote8));
    out.println(iPhoneX.toBilligere(samsungNote8));
    */
  }
}
