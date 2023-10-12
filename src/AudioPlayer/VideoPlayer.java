package AudioPlayer;

public class VideoPlayer implements Playable{
    public VideoPlayer() {
    }

    @Override
    public void play() {
        System.out.println("Đang phát Video …");
    }
}