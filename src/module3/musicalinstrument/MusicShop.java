package module3.musicalinstrument;

import java.util.List;

public class MusicShop {
    private List<Trumpet> Trumpet;
    private List<Piano> Piano;
    private List<Guitar> Guiater;

    public List<Trumpet> getTrumpet() {
        return Trumpet;
    }

    public void setTrumpet(List<Trumpet> trumpet) {
        Trumpet = trumpet;
    }

    public List<Piano> getPiano() {
        return Piano;
    }

    public void setPiano(List<Piano> piano) {
        Piano = piano;
    }

    public List<Guitar> getGuiater() {
        return Guiater;
    }

    public void setGuiater(List<Guitar> guiater) {
        Guiater = guiater;
    }
}
