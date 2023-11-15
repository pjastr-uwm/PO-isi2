package pl.edu.uwm.a2;

public abstract class ComputerGraphic {
    private int width;
    private int heigth;
    private String fileName;

    public abstract void loadFile();
    public abstract void saveFile();
}
