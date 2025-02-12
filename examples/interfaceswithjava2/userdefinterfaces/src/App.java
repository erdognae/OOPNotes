public class App {
    public static void main(String[] args) throws Exception {
        

        Instrument guitar = new Guitar(); // Bu ifade, bir arayüz (interface) ve onun bir implementasyonu olan bir sınıf (class) arasındaki ilişkiyi gösterir. 
        Instrument piano = new Piano();

        guitar.play();
        piano.play();
    }
}
// Arayüzleri referans tutucu olarak kullanıyorsak mutlaka erşieceğimiz metodların ilgili arayüzde tanımlanması gerekir.
