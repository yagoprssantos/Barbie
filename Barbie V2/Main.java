import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        
       // Main.printPalletes();
       new WorldController().run();
     

   }

   // apenas para fins de teste
   private static void printPalletes() {
       
    // Monochromatic: "Barbie's Pink Dream"
        Palette barbiesPinkDream = new Palette("Barbie's Pink Dream", Color.PINK, new MonochromaticStrategy());
        barbiesPinkDream.printColors();

        // Analogous: "Barbie's Malibu Sunset"
        Palette malibuSunset = new Palette("Barbie's Malibu Sunset", Color.PINK, new AnalogousStrategy());
        malibuSunset.printColors();

        // Complementary: "Barbie's Glam Night"
        Palette glamNight = new Palette("Barbie's Glam Night", Color.PINK, new ComplementaryStrategy());
        glamNight.printColors();

        // Square: "Barbie's Fashion Week"
        Palette fashionWeek = new Palette("Barbie's Fashion Week", Color.PINK, new SquareStrategy());
        fashionWeek.printColors();

        // Compound: "Barbie's Pool Party"
        Palette poolParty = new Palette("Barbie's Pool Party", Color.PINK, new CompoundStrategy());
        poolParty.printColors();

        // Shades: "Barbie's Romantic Date"
        Palette romanticDate = new Palette("Barbie's Romantic Date", Color.PINK, new ShadesStrategy());
        romanticDate.printColors();
   }
        
}