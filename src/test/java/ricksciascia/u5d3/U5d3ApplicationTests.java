package ricksciascia.u5d3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ricksciascia.u5d3.entities.Ordine;
import ricksciascia.u5d3.entities.StatoTavolo;
import ricksciascia.u5d3.entities.Tavolo;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class U5d3ApplicationTests {
    @BeforeAll
    static void setup() {
        Tavolo t1 = new Tavolo(1,2,StatoTavolo.LIBERO);
        Tavolo t2 = new Tavolo(2,2,StatoTavolo.LIBERO);
    }

    @Test
	void testTavoloLibero() {
        Tavolo t1 = new Tavolo(1,2,StatoTavolo.LIBERO);
        StatoTavolo status = t1.getStatoTavolo();
        assertEquals(StatoTavolo.LIBERO,status);
    }



}
