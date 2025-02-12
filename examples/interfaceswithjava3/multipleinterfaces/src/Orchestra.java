import java.util.ArrayList;
import java.util.List;

public class Orchestra {

    
        private List<Instrument> instruments = new ArrayList<>();
    
        // Yapıcı metot
        public Orchestra() {
            
            instruments.add(new Guitar());
            instruments.add(new Piano());
            
        }

        public void playAll() {
            for (Instrument instrument : instruments) {
                instrument.play();
        }
        }
    

}

/*

public class Orchestra {      DİZİ ŞEKLİNDE DE TANIMLANABİLİR.
    private Instrument[] instruments = { new Guitar(), new Piano() };

    public void playAll() {

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }



 */