package Data;

import Models.frutasModel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class frutasData {
    private static final Map<Integer, frutasModel> frutas = new HashMap<>();

    static {
        frutas.put(1, new frutasModel(1, "papayas", 4.0));
        frutas.put(2, new frutasModel(2, "melocotones", 2.0));
        frutas.put(3, new frutasModel(3, "mangos", 3.0));
    }

    public static frutasModel getFrutaById(int id) {
        return frutas.get(id);
    }

    public static Collection<frutasModel> getAllFrutas() {
        return frutas.values();
    }
}
