public class TestProgrammers {
    public static void main(String[] args){
        Programmer programador1 = new Programmer();
        Programmer programador2 = new Programmer();

        programador1.name = "Alex";
        programador1.age = 15;
        programador1.wearGlasses = true;

        programador2.name = "Carlos";
        programador2.age = 20;
        programador2.wearGlasses = true;

        programador1.drinkCoffe();
        programador1.printDetails();

        programador2.printDetails();
        programador2.hasGlasses();
    }
}
