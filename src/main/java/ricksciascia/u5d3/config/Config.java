package ricksciascia.u5d3.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ricksciascia.u5d3.entities.Drink;
import ricksciascia.u5d3.entities.MenuLista;
import ricksciascia.u5d3.entities.Pizza;
import ricksciascia.u5d3.entities.Topping;

@Configuration
@PropertySource("application.properties")
public class Config {
    @Bean(
            name = {"getPizza"}
    )
    public Pizza getPizza() {
        ArrayList<Topping> listaIng = new ArrayList();
        listaIng.add(this.getPomodoro());
        listaIng.add(this.getMozzarella());
        return new Pizza("Pizza Margherita", 800, (double)4.0F, listaIng);
    }

    @Bean(
            name = {"getBoscaiola"}
    )
    public Pizza getBoscaiola() {
        ArrayList<Topping> listaIng = new ArrayList();
        listaIng.add(this.getFunghi());
        listaIng.add(this.getSalsiccia());
        listaIng.add(this.getMozzarella());
        return new Pizza("Pizza Boscaiola", 1400, (double)8.0F, listaIng);
    }

    @Bean(
            name = {"getAcqua"}
    )
    public Drink getAcqua() {
        return new Drink("Acqua 500ml", 0, (double)1.5F);
    }

    @Bean(
            name = {"getCocaCola"}
    )
    public Drink getCocaCola() {
        return new Drink("Coca-Cola 500ml", 250, (double)3.5F);
    }

    @Bean(
            name = {"getPomodoro"}
    )
    public Topping getPomodoro() {
        return new Topping("Pomodoro", 150, (double)0.5F);
    }

    @Bean(
            name = {"getMozzarella"}
    )
    public Topping getMozzarella() {
        return new Topping("Mozzarella", 350, (double)0.5F);
    }

    @Bean(
            name = {"getFunghi"}
    )
    public Topping getFunghi() {
        return new Topping("Funghi", 150, (double)1.5F);
    }

    @Bean(
            name = {"getSalsiccia"}
    )
    public Topping getSalsiccia() {
        return new Topping("Salsiccia", 300, (double)2.0F);
    }

//    @Bean
//    public ArrayList<Pizza> listaPizze() {
//        return new ArrayList<>(Arrays.asList(getPizza(),getBoscaiola()));
//    }
//
//    @Bean
//    public ArrayList<Drink> listaDrink() {
//        return new ArrayList<>(Arrays.asList(getAcqua(),getCocaCola()));
//    }
//
//    @Bean
//    public ArrayList<Topping> listaIngredienti() {
//        return new ArrayList<>(Arrays.asList(getSalsiccia(),getFunghi(),getMozzarella(),getPomodoro()));
//    }

    @Bean
    public double getCoperto(@Value("${costo.coperto}") double coperto) {
        return coperto;
    }

//    @Bean
//    public MenuLista menu() {
//        ArrayList<Pizza> pizze = new ArrayList();
//        pizze.add(this.getPizza());
//        pizze.add(this.getBoscaiola());
//        ArrayList<Drink> drink = new ArrayList();
//        drink.add(this.getAcqua());
//        drink.add(this.getCocaCola());
//        ArrayList<Topping> ingredienti = new ArrayList();
//        ingredienti.add(this.getPomodoro());
//        ingredienti.add(this.getMozzarella());
//        ingredienti.add(this.getFunghi());
//        ingredienti.add(this.getSalsiccia());
//        return new MenuLista(pizze, drink, ingredienti);
//    }
}