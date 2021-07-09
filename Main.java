public class Main {
    public static void main(String[] args) {
        Department<Wind> winds = new Department<>("Wind Instruments");
        Department<string> strings = new Department<>("String Instruments");
        Department<Percussion> percussion = new Department<>("Percussion Instruments");

        Wind wind1 = new Wind("Organ");
        Wind wind2 = new Wind("Flute");

        string string1 = new string("Guitar");
        string string2 = new string("violin");

        Percussion percussion1 = new Percussion("Timpani");
        Percussion percussion2 = new Percussion("Gong");

        winds.addInstrument(wind1);
        winds.addInstrument(wind2);

        strings.addInstrument(string1);
        strings.addInstrument(string2);

        percussion.addInstrument(percussion1);
        percussion.addInstrument(percussion2);



    }
}
