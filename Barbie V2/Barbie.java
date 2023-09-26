class Barbie implements WorldInhabitant {
    private int influence;

    public Barbie(int influence) {
        this.influence = influence;
    }

    @Override
    public int getInfluence() {
        return influence;
    }
}