package ru.job4j.tracker;

public class StubOutput implements Output {
    private final StringBuilder buffrer = new StringBuilder();

    @Override
    public void println(Object object) {
        if (object != null) {
            buffrer.append(object.toString());
        } else {
            buffrer.append("null");
        }
        buffrer.append(System.lineSeparator());
    }

    public String toString() {

        return buffrer.toString();
    }
}
