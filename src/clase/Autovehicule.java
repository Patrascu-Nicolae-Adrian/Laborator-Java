package clase;

public abstract class Autovehicule {
    private String model;
    private Integer viteza;

    public Autovehicule(String model, Integer viteza, Integer an_fab) {
        this.model = model;
        this.viteza = viteza;
        this.an_fab = an_fab;
    }

    public Autovehicule() {
        this.model = null;
        this.viteza = null;
        this.an_fab = null;
    }

    public abstract void afisareModel();

    public void afisareViteza(){
        System.out.println("Viteza maxima a autovehicului este: " +  this.viteza);
    }

    @Override
    public String toString() {
        return "Autovehicule{" +
                "model='" + model + '\'' +
                ", viteza=" + viteza +
                ", an_fab=" + an_fab +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getViteza() {
        return viteza;
    }

    public void setViteza(Integer viteza) {
        this.viteza = viteza;
    }

    public Integer getAn_fab() {
        return an_fab;
    }

    public void setAn_fab(Integer an_fab) {
        this.an_fab = an_fab;
    }

    private Integer an_fab;
}
