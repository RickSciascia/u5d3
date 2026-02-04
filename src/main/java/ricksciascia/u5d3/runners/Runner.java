package ricksciascia.u5d3.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import ricksciascia.u5d3.entities.MenuLista;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private MenuLista prova;

    @Override
    public void run(String... args) throws Exception {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Runner.class);
        System.out.println("Menu dal Runner");
        System.out.println(prova);

    }
}