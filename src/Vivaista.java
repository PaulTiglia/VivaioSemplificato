public class Vivaista {
    private Pianta[] piante = new Pianta[100];
    private String nome;

    public Vivaista(Pianta[] piante, String nome) {
        this.piante = piante;
        this.nome = nome;
    }

    public boolean addPianta(Pianta p){
        for (int i = 0; i < piante.length; i++) {
            if(piante[i] == null){
                piante[i] = p;
                return true;
            }
        }
        return false;
    }

    public Pianta[] getPiante() {
        return piante;
    }

    public void setPiante(Pianta[] piante) {
        this.piante = piante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
