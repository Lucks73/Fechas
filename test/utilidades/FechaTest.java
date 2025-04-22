package utilidades;


import org.junit.Test;

import static org.junit.Assert.*;

 public class FechaTest {

    @Test
    public void esBisiesto() {
        assertTrue(Fecha.esBisiesto(2004));
        assertTrue(Fecha.esBisiesto(2000));
        assertFalse(Fecha.esBisiesto(2025));
        assertFalse(Fecha.esBisiesto(2100));
    }

    @Test
    public void diaDelAnio() {
        Fecha f1 = new Fecha (22,1,2025);
        assertEquals(22,f1.diaDelAnio());

        Fecha f2 = new Fecha (22,2,2025);
        assertEquals(53,f2.diaDelAnio());

        Fecha f3 = new Fecha (31,12,2025);
        assertEquals(365,f3.diaDelAnio());

        Fecha f4 = new Fecha ( 31,12,2024);
        assertEquals(366,f4.diaDelAnio());
    }

    @Test
    public void diasEntreFechas() {
        Fecha f1 = new Fecha(22,10,2005);
        Fecha f2 = new Fecha(1,1,2005);
        assertEquals(294,f1.diasEntreFechas(f2));

        f2 = new Fecha(22,10,2005);
        f1 = new Fecha(1,1,2005);
        assertEquals(-294,f1.diasEntreFechas(f2));

    }

    @Test
    public void esPosterior()
    {
        Fecha fAnt = new Fecha(12,04,2023);
        Fecha fPosterior = new Fecha(7,05,2025);
        Fecha fIgual = new Fecha(12,04,2023);
        Fecha fMismoAnio = new Fecha(22,7,2023);

        assertTrue(fPosterior.esPosterior(fAnt));
        assertFalse(fAnt.esPosterior(fPosterior));
        assertFalse(fAnt.esPosterior(fIgual));
        assertTrue(fMismoAnio.esPosterior(fAnt));
    }



}