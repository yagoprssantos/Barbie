class Barbie implements WorldInhabitant {
        
    private int influence;
    private Values values;

    public Barbie(int influence, Values values) {
        this.influence = influence;
        this.values = values;
    }

    @Override
    public int getInfluence() {
        return influence;
    }

    @Override
    public double calculateInfluence() {
        double popularity = values.getPopularity();
        double remuneration = values.getRemuneration();
        double relevance = values.getRelevance();
        int beauty = values.getBeauty();

        //Adicionei pesos para alterar influência entre Ken e Barbie
        double influence = popularity*0.3 + remuneration*0.1 + relevance*0.2 + beauty*0.4;
        return influence;
    }
}