public class Theme {

    private String name;
    private Palette colors;
    private String description;

    public Theme(String n, Palette p) {
        this.name = n;
        this.colors = p;
    }

    public Theme(String n, Palette p, String d) {
        this.name = n;
        this.colors = p;
        this.description = d;
    }
    
}
