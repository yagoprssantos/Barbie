import java.awt.Color;
import java.util.Scanner;

public class WorldController {

    private Scanner scanner = new Scanner(System.in);
    private World world;

    public void run() {
        ColorHarmonyStrategy chosenStrategy = getUserSelectedStrategy();
        Palette palette = new Palette("Barbie World Palette", Color.PINK, chosenStrategy);
        palette.printColors();
        this.world =  new World(palette);

        while (true) {
            clearConsole();
            world.printWorldStatus();
            displayOptions();
            executeUserChoice();
            printSeparator();
        }
    }

    private void displayOptions() {
        System.out.println("Escolha uma opção:");
        System.out.println("1: Adicionar Kens");
        System.out.println("2: Adicionar Barbies");
        System.out.println("3: Verificar quem está dominando");
        System.out.println("4: Sair");
    }

    private void executeUserChoice() {
        int option = this.scanner.nextInt();
        switch (option) {
            case 1:
                addKens();
                break;
            case 2:
                addBarbies();
                break;
            case 3:
                world.whoIsDominating();
                break;
            case 4:
                exitProgram();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }

    private void addKens() {
        System.out.println("Quantos Kens você quer adicionar?");
        int newKens = this.scanner.nextInt();
        System.out.println("Informe o nível de influência de um Ken:");
        int kenInfluence = this.scanner.nextInt();
        world.addKens(newKens, kenInfluence);
    }

    private void addBarbies() {
        System.out.println("Quantas Barbies você quer adicionar?");
        int newBarbies = this.scanner.nextInt();
        System.out.println("Informe o nível de influência de uma Barbie:");
        int barbieInfluence = this.scanner.nextInt();
        world.addBarbies(newBarbies, barbieInfluence);
    }

    private void exitProgram() {
        System.out.println("Saindo...");
        this.scanner.close();
        System.exit(0);
    }

    private void printSeparator() {
        System.out.println("\n");  // Pular duas linhas para melhorar a visibilidade
    }

   private ColorHarmonyStrategy getUserSelectedStrategy() {
       displayColorPaletteOptions();
        
       int choice = this.scanner.nextInt();
       return mapChoiceToStrategy(choice);
   }

   private void displayColorPaletteOptions() {
       System.out.println("Escolha uma paleta de cores:");
       System.out.println("1: Monocromática");
       System.out.println("2: Análoga");
       System.out.println("3: Complementar");
       System.out.println("4: Quadrada");
       System.out.println("5: Composta");
       System.out.println("6: Tons");
   }

   private ColorHarmonyStrategy mapChoiceToStrategy(int choice) {
       switch (choice) {
           case 1:
               return new MonochromaticStrategy();
           case 2:
               return new AnalogousStrategy();
           case 3:
               return new ComplementaryStrategy();
           case 4:
               return new SquareStrategy();
           case 5:
               return new CompoundStrategy();
           case 6:
               return new ShadesStrategy();
           default:
               System.out.println("Escolha inválida. Usando a estratégia Complementar como padrão.");
               return new ComplementaryStrategy();
       }
   }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}