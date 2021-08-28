import Audio.ManMadeSound;

public class Song extends ManMadeSound {
    String title, singer;
    int duration; // in seconds
    Song(String title, String singer, int duration) {
        this.title = title;
        this.singer = singer;
        this.duration = duration;
        this.volume = 85;
    }
    public void listen() {
        System.out.println("Playing " + title + " by " + singer + "🎶🎶🎶");
    }
    public double getVolume() {
        return volume;
    }
}
