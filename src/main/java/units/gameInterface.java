package units;

import java.util.ArrayList;

public interface gameInterface {

    void step(ArrayList<Unit> units, ArrayList<Unit> team);

    String getInfo();


}
