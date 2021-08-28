import Audio.NaturalSound;

public class Rain extends NaturalSound {
    Rain() {
        volume = 40;
    }
    public void listen() {
        System.out.println("Pitter patter 🌧💧🌧💧🌧💧");
    }
    public double getVolume() {
        return volume;
    }
}
