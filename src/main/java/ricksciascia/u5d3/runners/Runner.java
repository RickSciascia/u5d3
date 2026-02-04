package ricksciascia.u5d3.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import ricksciascia.u5d3.U5d3Application;
import ricksciascia.u5d3.entities.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private MenuLista prova;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d3Application.class);
        System.out.println("Menu dal Runner");
        System.out.println(prova);
        Pizza boscaiola = ctx.getBean("getBoscaiola", Pizza.class);
//        System.out.println(boscaiola);
        Pizza margerita = ctx.getBean("getPizza", Pizza.class);
        Drink coca = ctx.getBean("getCocaCola", Drink.class);
        Drink acqua = ctx.getBean("getAcqua", Drink.class);
        List<Menu> listaOrdine1 = new ArrayList<>(Arrays.asList(boscaiola,coca));
        List<Menu> listaOrdine2 = new ArrayList<>(Arrays.asList(margerita,acqua));
        Tavolo tavolo1 = new Tavolo(1,2,StatoTavolo.OCCUPATO);
        Tavolo tavolo2 = new Tavolo(2,4,StatoTavolo.OCCUPATO);
        Ordine ordine1 = new Ordine(1,listaOrdine1,tavolo1, StatoOrdine.IN_CORSO);
        Ordine ordine2 = new Ordine(2,listaOrdine2,tavolo2,StatoOrdine.IN_CORSO);
        System.out.println(ordine1);
        double coperto = ctx.getBean("getCoperto",Double.class);
        System.out.println(ordine1.getTotale(tavolo1.getNCoperti(),coperto));
        System.out.println(ordine2);
        System.out.println(ordine2.getTotale(tavolo2.getNCoperti(),coperto));

    }
}