public class TestProgrammers {
    public static void main(String[] args){
        Programmer programador1 = new Programmer("Alex", 15, true);
        Programmer programador2 = new Programmer("Carlos", 20, true);

        programador1.drinkCoffe();
        programador1.printDetails();

        programador2.printDetails();
        programador2.hasGlasses();
    }
}
