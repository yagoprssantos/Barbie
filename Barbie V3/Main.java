import java.awt.Color;

// 1.b Alterar as funções addKen() e addBarbie() para que sejam
// instanciados os objetos e armazenados na classe World()
// ao invés de um contador; Utiliza Lista para armazenar os objetos
// criados.

// 1.c Crie as implementações necessárias para que o usuário possa
// remover Kens e Barbies.

// 2.a Realize as implementações necessárias para que usuário possa
// trocar a paleta de cores do mundo Barbie durente a excução
// do programa.

// Bônus. Elimine o switch-case da função mapChoiceStrategy()
// de maneira que a função tenha no máximo 5 linhas de código.

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