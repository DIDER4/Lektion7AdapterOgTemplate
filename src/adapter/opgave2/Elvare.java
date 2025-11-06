package adapter.opgave2;

public class Elvare extends Vare{
    public Elvare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        double pris = getPris();
        if (pris >= 3.0){
            return pris * 0.30;
        } else {
            return pris;
        }
    }
}
