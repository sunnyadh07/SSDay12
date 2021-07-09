public abstract class Instrument {
    public String name;

    public Instrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                '}';
    }
}
