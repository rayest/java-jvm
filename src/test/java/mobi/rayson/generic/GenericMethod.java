package mobi.rayson.generic;

public class GenericMethod {
    public <T> String generic_method(T... input) {
        for (T element : input) {
            if (element instanceof Integer) {
                return "integer";
            }
            if (element instanceof String) {
                return "string";
            }
        }
        return null;
    }
}
