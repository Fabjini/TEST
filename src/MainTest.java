import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void czyPierwszaJezeli0(){
        Assertions.assertFalse(Main.czyPierwsza(0));
    }
    @Test
    void czyPierwszaJezeli1(){
        Assertions.assertFalse(Main.czyPierwsza(1));
    }
    @Test
    void czyPierwszaJezeliUjemna(){
        Assertions.assertFalse(Main.czyPierwsza(-5));
    }
    @Test
    void czyPierwszaJezeliPierwsza5(){
        Assertions.assertTrue(Main.czyPierwsza(5));
    }
    @Test
    void czyPierwszaJezeliPierwsza17(){
        Assertions.assertTrue(Main.czyPierwsza(17));
    }
    @Test
    void czyPierwszaJezeliPotega(){
        Assertions.assertFalse(Main.czyPierwsza(25));
    }
    @Test
    void czyPierwszaJezeli11(){
        Assertions.assertFalse(Main.czyPierwsza(11*11));
    }
    @Test
    void zaszyfrujJezeliPustyTekst() {
        String oczekiwana = "";
        String aktualna = Main.zaszyfruj("");
        Assertions.assertEquals(oczekiwana,aktualna);
    }
    @Test
    void zaszyfrujJezeliDlugoscPotegaLiczbyCalkowitej(){
        String oczekiwana = "tmaa";
        String aktualna = Main.zaszyfruj("tama");
        Assertions.assertEquals(oczekiwana,aktualna);
    }
    @Test
    void zaszyfrujJezeliDlugoscTekstuMniejszaOdPotegiLiczbyCalkowitej(){
        String oczekiwana = "pgmrr oa";
        String aktulna = Main.zaszyfruj("program");
        Assertions.assertEquals(oczekiwana,aktulna);
    }
    @Test
    void zaszyfrujJezeliDlugoscPustyWiersz(){
        String oczekiwana = "prk rai om gi";
        String aktualna = Main.zaszyfruj("programiki");
        Assertions.assertEquals(oczekiwana,aktualna);
    }
}