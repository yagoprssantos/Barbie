import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

interface ColorHarmonyStrategy {
    List<Color> generateHarmony(Color baseColor);
}

class MonochromaticStrategy implements ColorHarmonyStrategy {
    public List<Color> generateHarmony(Color baseColor) {
        List<Color> colors = new ArrayList<>();
        float[] hsb = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
        for (int i = 0; i < 5; i++) {
            colors.add(Color.getHSBColor(hsb[0], hsb[1], hsb[2] - i * 0.1f));
        }
        return colors;
    }
}

class AnalogousStrategy implements ColorHarmonyStrategy {
    public List<Color> generateHarmony(Color baseColor) {
        List<Color> colors = new ArrayList<>();
        float[] hsb = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
        for (int i = -2; i <= 2; i++) {
            colors.add(Color.getHSBColor(hsb[0] + i * 0.05f, hsb[1], hsb[2]));
        }
        return colors;
    }
}

class ComplementaryStrategy implements ColorHarmonyStrategy {
    public List<Color> generateHarmony(Color baseColor) {
        List<Color> colors = new ArrayList<>();
        float[] hsb = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
        colors.add(baseColor);
        colors.add(Color.getHSBColor((hsb[0] + 0.5f) % 1, hsb[1], hsb[2]));
        colors.add(Color.getHSBColor((hsb[0] + 0.25f) % 1, hsb[1], hsb[2]));
        colors.add(Color.getHSBColor((hsb[0] + 0.75f) % 1, hsb[1], hsb[2]));
        colors.add(Color.getHSBColor(hsb[0], hsb[1] - 0.1f, hsb[2]));
        return colors;
    }
}

class SquareStrategy implements ColorHarmonyStrategy {
    public List<Color> generateHarmony(Color baseColor) {
        List<Color> colors = new ArrayList<>();
        float[] hsb = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
        for (int i = 0; i < 4; i++) {
            colors.add(Color.getHSBColor((hsb[0] + i * 0.25f) % 1, hsb[1], hsb[2]));
        }
        return colors;
    }
}

class CompoundStrategy implements ColorHarmonyStrategy {
    public List<Color> generateHarmony(Color baseColor) {
        List<Color> colors = new ArrayList<>();
        float[] hsb = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
        colors.add(baseColor);
        colors.add(Color.getHSBColor((hsb[0] + 0.1f) % 1, hsb[1], hsb[2]));
        colors.add(Color.getHSBColor((hsb[0] + 0.5f) % 1, hsb[1], hsb[2]));
        colors.add(Color.getHSBColor((hsb[0] + 0.6f) % 1, hsb[1], hsb[2]));
        return colors;
    }
}

class ShadesStrategy implements ColorHarmonyStrategy {
    public List<Color> generateHarmony(Color baseColor) {
        List<Color> colors = new ArrayList<>();
        float[] hsb = Color.RGBtoHSB(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), null);
        for (int i = 0; i < 5; i++) {
            colors.add(Color.getHSBColor(hsb[0], hsb[1] - i * 0.1f, hsb[2]));
        }
        return colors;
    }
}