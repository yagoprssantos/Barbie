class Values {
    private String name;
    private double popularity;
    private double remuneration;
    private double relevance;
    public int beauty = 0;

    public Values(String name, double popularity, double remuneration, double relevance) {
        this.name = name;
        this.popularity = popularity;
        this.remuneration = remuneration;
        this.relevance = relevance;
    }

    public String getName() {
        return name;
    }

    public double getPopularity() {
        return popularity;
    }

    public double getRemuneration() {
        return remuneration;
    }

    public double getRelevance() {
        return relevance;
    }
    
    public int getBeauty() {
        return beauty;
    }

}

