package interfejsy.zad15;

public class TestMusic {

    public static void main(String[] args) {
        MusicPlayer m1 = new MusicPlayer();
        m1.playSound();
        m1.stopSound();
        System.out.println(SoundPlayer.getDeviceType());
    }
}
