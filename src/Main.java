
import clase.Masina;
import clase.Persoana;

public class Main {
    public static void main(String[] args) {
        Masina masina1 = new Masina();
        System.out.println(masina1);
        Persoana persoana = new Persoana("Popescu Andrei", 25);
        Persoana persoana1 = new Persoana("Popescu Ion", 29);
        Masina masina2 = new Masina("BMW", 260, 2010, persoana);
        System.out.println(masina2);
        Persoana[] persoane = new Persoana[2];
        persoane[0] = persoana;
        persoane[1] = persoana1;
        for(Persoana p : persoane){
            System.out.println(p + " ");
        }
        masina2.afisareViteza();

    }
}