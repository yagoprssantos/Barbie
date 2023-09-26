import java.awt.Color;
import java.util.List;

public class ColorHarmony {

    private ColorHarmonyStrategy strategy;

    public ColorHarmony(ColorHarmonyStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ColorHarmonyStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Color> generateHarmony(Color baseColor) {
        return strategy.generateHarmony(baseColor);
    }
}    
