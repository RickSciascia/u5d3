package ricksciascia.u5d3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Menu {
    private String nome;
    private int calorie;
    private double prezzo;


    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}