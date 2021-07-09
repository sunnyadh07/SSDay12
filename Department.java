import java.util.ArrayList;

public class Department<T> {
    public String name;
    public int numberOfInstruments = 0;
    public ArrayList<T> instruments;

    public Department(String name) {
        this.name = name;
        numberOfInstruments = 0;
        instruments = new ArrayList<>();

    }

    public String getName() {
        return name;
    }


    public int getNumberOfInstruments() {
        return numberOfInstruments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String addInstrument(ArrayList<T> instrument) {
        instruments.add(instrument);
        numberOfInstruments++;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", numberOfInstruments=" + numberOfInstruments +
                ", instruments=" + instruments +
                '}';
    }
}

