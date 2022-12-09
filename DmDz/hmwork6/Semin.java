import java.util.HashMap;
import java.util.Map;

public class Semin {
    private Map<Integer, Object> mapInt = new HashMap<>();

    private static final Object SOMETHING = new Object();

    public void methodAdd(int x) {
        mapInt.put(x, SOMETHING);
    }

    public int methodSize() { return mapInt.size();}

    public String methodRead() {
        return mapInt.keySet().toString();
    }






}
