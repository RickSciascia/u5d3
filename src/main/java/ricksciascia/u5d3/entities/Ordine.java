package ricksciascia.u5d3.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Ordine {
    private int nOrdine;
    private Tavolo tavolo;
    private List<Menu> elementiMenu;
    private StatoOrdine statoOrdine;
    private LocalDateTime oraOrdine;
//    private double totale;

    public Ordine(int nOrdine, List<Menu> elementiMenu, Tavolo tavolo, StatoOrdine status) {
        this.nOrdine = nOrdine;
        this.elementiMenu = elementiMenu;
        this.tavolo = tavolo;
        this.statoOrdine = status;
        this.oraOrdine = LocalDateTime.now();
//        this.totale = elementiMenu.stream().mapToDouble(Menu::getPrezzo).sum()+ (nCoperti*coperto);
    }

    public double getTotale(int nCoperti, double prezzoCoperto) {
        double totaleOrdine = getElementiMenu().stream().mapToDouble(Menu::getPrezzo).sum();
        System.out.println(totaleOrdine);
        double totaleCoperto = (nCoperti * prezzoCoperto);
        System.out.println(totaleCoperto);
        return totaleOrdine+totaleCoperto;
    }
//    toString


    @Override
    public String toString() {
        return "Ordine: { " +
                "nOrdine: " + nOrdine +
                ", tavolo: " + tavolo +
                ", elenco elementi: " + elementiMenu +
                ", status: " + statoOrdine +
                ", orario: " + oraOrdine +
                '}';
    }
}