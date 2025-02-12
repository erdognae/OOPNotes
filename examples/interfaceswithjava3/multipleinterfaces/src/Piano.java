public class Piano implements KeyboardInstrument, Instrument {

    @Override
    public void play() {
       System.out.println("Thh piano is playing..");
    }

    @Override
    public void press() {
        System.out.println("The keyboard has been pressed at piano..");
    }
    
}
