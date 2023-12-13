package interfejsy.zad15;

public interface SoundPlayer {

    void playSound();

    default void stopSound(){
        System.out.println("Sound Stopped");
    }

    static String getDeviceType(){
        return "Sound Device";
    }

}
