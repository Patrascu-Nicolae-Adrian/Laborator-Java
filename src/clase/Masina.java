package clase;

public class Masina extends Autovehicule implements AutoturismFunctionalitate {


    Persoana persoana;

    public Masina(){
        super(null,0,0);
        this.persoana = new Persoana();
    }
    public Masina(String model, Integer viteza, Integer an_fab, Persoana persoana ){
        super(model,viteza,an_fab);
        this.persoana = persoana;
    }

    @Override
    public void afisareModel() {
        System.out.println("Modelul masinii este: " + super.getModel());
    }

    public void afisareViteza(){
        System.out.println("Viteza maxima a masinii este: " +  super.getViteza());
    }
    public void afisareAn(){
        System.out.println("Viteza maxima a masinii este: " +  super.getAn_fab());
    }



    @Override
    public String toString() {
        return "Masina{" + super.toString() +
                ", persoana=" + persoana +
                '}';
    }
}
