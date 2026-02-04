package ricksciascia.u5d3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tavolo {
    private int nTavolo;
    private int nCoperti;
    private StatoTavolo statoTavolo;

    public Tavolo(int nTavolo, int nCoperti, StatoTavolo statoTavolo) {
        this.nTavolo = nTavolo;
        this.nCoperti = nCoperti;
        this.statoTavolo = statoTavolo;
    }
//    toString


    @Override
    public String toString() {
        return "Tavolo: " +
                "nTavolo: " + nTavolo +
                ", nCoperti: " + nCoperti +
                ", statoTavolo: " + statoTavolo;
    }
}