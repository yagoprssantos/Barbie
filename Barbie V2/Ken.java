class Ken implements WorldInhabitant {
    
    private int influence;

    public Ken(int influence) {
        this.influence = influence;
    }

    @Override
    public int getInfluence() {
        return influence;
    }
}
