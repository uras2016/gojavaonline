package Module6.musicalInstrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MusicShop {
    List<Guitar> guitars;
    List<Piano> pianos;
    List<Trumpet> trumpets;


    // getter & setter
    public List<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        this.guitars = guitars;
    }

    public List<Piano> getPianos() {
        return pianos;
    }

    public void setPianos(List<Piano> pianos) {
        this.pianos = pianos;
    }

    public List<Trumpet> getTrumpets() {
        return trumpets;
    }

    public void setTrumpets(List<Trumpet> trumpets) {
        this.trumpets = trumpets;
    }

    @Override
    public String toString() {
        return "MusicShop{"+"guitars="+guitars.size()+"pianos="+pianos.size()+"trumpets="+trumpets.size()+"}";
    }

}


