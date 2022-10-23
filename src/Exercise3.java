import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Exercise3 {

    private final Map<String, Integer> map = new HashMap<>();

    public Exercise3(Map<String, Integer> map) {
        this.map.putAll(map);
    }

    public Map<String, Integer> getMap() {
        return map;
    }


    public void addToMap(String s, Integer i) throws RuntimeException {

        if (map.containsKey(s) && map.containsValue(i)) {
            throw new RuntimeException("Такие значения уже есть в коллекции!");
        } else if (map.containsKey(s) && !map.containsValue(i)) {
            map.put(s, i);
        } else {
            map.put(s, i);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise3 exercise3 = (Exercise3) o;
        return map.equals(exercise3.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }

    @Override
    public String toString() {
        return map + " ";
    }
}
