package AudioPlayer;

public class MainPlayer {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play();

        VideoPlayer videoPlayer=new VideoPlayer();
        videoPlayer.play();
    }
}
