package Data;


import Models.envioModel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class envioData {
    private static final Map<Integer, envioModel> envios = new HashMap<>();

    static {
        envios.put(1, new envioModel(1, "Peninsular", 1.0));
        envios.put(2, new envioModel(2, "Canarias", 1.05));
        envios.put(3, new envioModel(3, "Internacional", 1.1));
    }

    public static envioModel getEnviosById(int id) {
        return envios.get(id);
    }

    public static Collection<envioModel> getAllEnvios() {
        return envios.values();
    }
}
