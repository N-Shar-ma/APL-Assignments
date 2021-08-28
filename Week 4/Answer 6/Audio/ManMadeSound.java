package Audio;

public abstract class ManMadeSound implements Listenable {
    protected double volume; // in decibel
    protected void increaseVolume(double difference) {
        volume = Math.max(0, volume-difference);
    }
    protected void decreaseVolume(double difference) {
        volume += difference;
    }
}
