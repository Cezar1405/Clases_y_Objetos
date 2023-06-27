public class Programmer {
//Deiniendo variables
    private String name;
    private int age;
    private boolean wearGlasses;
    public Programmer(String name, int age, boolean wearGlasses){
        this.name = name;
        this.age = age;
        this.wearGlasses = wearGlasses;
    }

    public void drinkCoffe(){
        System.out.println("Expresso es el Sectreto!");
    }
    public void printDetails(){
        System.out.println(this.name+" is a "+this.age+" programmer");
    }
    public void hasGlasses(){
        System.out.println("is "+this.name+" wearing glasses? "+this.wearGlasses);
    }
}
