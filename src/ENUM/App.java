package ENUM;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Beer myBeer = new Beer(Size.BIG);
        Beer moreBeer = new Beer(Size.XLARGE);
        Beer stillMore = new Beer(Size.LARGE);
       myBeer.setSize(Size.SMALL);

        for (Size oneValues  : Size.values()){
            System.out.println(oneValues);
            //you can print the ordinal number
            System.out.println(oneValues.ordinal());
        }
    }
}
