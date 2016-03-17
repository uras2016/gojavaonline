package Module6.musicalInstrument;

import java.util.ArrayList;
import java.util.List;

abstract class MusicalInstrument {

    public abstract String getType();

    @Override
    public String toString() {
        return "MusicalInstrument{"+getType()+"}";

    }
}
