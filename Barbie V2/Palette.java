import java.awt.Color;
import java.util.List;

public class Palette {
    

    private String name;
    private Color baseColor;
    private List<Color> colors;
   

    public Palette(String n, Color c, ColorHarmonyStrategy strategy) {
        this.name = n;
        this.baseColor = c;
        this.colors = new ColorHarmony(strategy).generateHarmony(this.baseColor);
    }

    public List<Color> getColors() {
        return this.colors;
    }

    public String getName() {
        return this.name;
    }

    public void printColors() {
        System.out.print(this.name + ": ");
        for (Color color : colors) {
            int red = color.getRed();
            int green = color.getGreen();
            int blue = color.getBlue();
            String hex = String.format("#%02X%02X%02X", red, green, blue);
            String ansiCode = String.format("\u001B[48;2;%d;%d;%dm  \u001B[0m", red, green, blue);
            System.out.print(ansiCode + " (" + hex + ") ");
        }
        // Pular duas linhas
        System.out.print("\n\n");
    }
}
