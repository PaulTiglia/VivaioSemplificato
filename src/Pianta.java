public class Pianta {
    private String genere;
    private String data;

    public Pianta(String genere, String data){
        this.genere = genere;
        this.data = data;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
