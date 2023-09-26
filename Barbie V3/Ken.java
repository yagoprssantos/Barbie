class Ken implements WorldInhabitant {
    
    private int influence;
    private Values values;

    public Ken(int influence, Values values) {
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
        double influence = popularity*0.1 + remuneration*0.4 + relevance*0.3 + beauty*0.2;
        return influence;
    }
}

