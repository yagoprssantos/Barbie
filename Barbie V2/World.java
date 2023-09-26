import java.awt.Color;
import java.util.List;

class World {

    private int totalKens = 0;
    private int totalBarbies = 0;
    private int influenceKens = 0;
    private int influenceBarbies = 0;
    private Palette palette;

    public World(Palette palette) {
        this.palette = palette;
    }

    public void addKens(int count, int influence) {
        this.totalKens += count;
        this.influenceKens += count * influence;
    }

    public void addBarbies(int count, int influence) {
        this.totalBarbies += count;
        this.influenceBarbies += count * influence;
    }


    public void printWorldStatus() {
        normalizeInfluences();  
        List<Color> colors = palette.getColors();
        Color kenColor = colors.get(0);
        Color barbieColor = colors.get(1);

        System.out.println("----- Mundo Barbie -----");
        palette.printColors();

        System.out.println("----- Informações Atuais -----");

        System.out.println("#Kens: " + this.totalKens + " #Barbies: " + this.totalBarbies + "\n");

        System.out.print("Influência de Kens:    ");
        System.out.println(generateInfluenceBar(kenColor, influenceKens, 30));

        System.out.print("Influência de Barbies: ");
        System.out.println(generateInfluenceBar(barbieColor, influenceBarbies, 30));

        System.out.println("-----------------------------");
    }

    public void whoIsDominating() {
        if (influenceKens > influenceBarbies) {
            System.out.println("Os Kens estão dominando o mundo!");
        } else if (influenceKens < influenceBarbies) {
            System.out.println("As Barbies estão dominando o mundo!");
        } else {
            System.out.println("Está equilibrado!");
        }
    }

      private String generateInfluenceBar(Color color, int influence, int maxBarSize) {
        StringBuilder bar = new StringBuilder();
        String ansiCode = String.format("\u001B[48;2;%d;%d;%dm  \u001B[0m", color.getRed(), color.getGreen(), color.getBlue());
        int scaledInfluence = (int) Math.round((double) influence / 100 * maxBarSize);
        for (int i = 0; i < scaledInfluence; i++) {
            bar.append(ansiCode);
        }
        return bar.toString();
    }

    private void normalizeInfluences() {
        int totalInfluence = influenceKens + influenceBarbies;
        if (totalInfluence > 0) {
            double factor = 100.0 / totalInfluence;
            influenceKens = (int)(influenceKens * factor);
            influenceBarbies = (int)(influenceBarbies * factor);
        }
    }

}