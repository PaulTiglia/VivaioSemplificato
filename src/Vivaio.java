public class Vivaio {
    private Vivaista[] vivaisti = new Vivaista[20];

    public Vivaio(Vivaista[] vivaisti) {
        this.vivaisti = vivaisti;
    }

    public boolean addVivaista(Vivaista v){
        for (int i = 0; i < vivaisti.length; i++) {
            if(vivaisti[i] == null){
                vivaisti[i] = v;
                return true;
            }
        }
        return true;
    }

    public Vivaista[] getVivaisti() {
        return vivaisti;
    }

    public void setVivaisti(Vivaista[] vivaisti) {
        this.vivaisti = vivaisti;
    }
}
