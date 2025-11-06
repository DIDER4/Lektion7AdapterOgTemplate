// ...existing code...
package adapter.spiritusadapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpiritusAdapterTest {

    @Test
    void getPris() {
        Spiritus s = new Spiritus(100, "Vodka");
        SpiritusAdapter a = new SpiritusAdapter(s);
        assertEquals(100, a.getPris());
    }

    @Test
    void setPris() {
        Spiritus s = new Spiritus(100, "Vodka");
        SpiritusAdapter a = new SpiritusAdapter(s);
        a.setPris(150);
        assertEquals(150, a.getPris());
        // also ensure underlying object updated
        assertEquals(150, s.getPrisen());
    }

    @Test
    void getNavn() {
        Spiritus s = new Spiritus(100, "Vodka");
        SpiritusAdapter a = new SpiritusAdapter(s);
        assertEquals("Vodka", a.getNavn());
    }

    @Test
    void setNavn() {
        Spiritus s = new Spiritus(100, "Vodka");
        SpiritusAdapter a = new SpiritusAdapter(s);
        a.setNavn("Gin");
        assertEquals("Gin", a.getNavn());
        // also ensure underlying object updated
        assertEquals("Gin", s.getBetegnelse());
    }

    @Test
    void beregnMoms() {
        Spiritus s = new Spiritus(100, "Vodka");
        SpiritusAdapter a = new SpiritusAdapter(s);
        assertEquals(25.0, a.beregnMoms(), 0.0001);
    }
}