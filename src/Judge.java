public class Judge extends Human{

    public Judge(String name, String id) {
        super(name, id);
    }

    public void blowWhistle(){
        System.out.println(this.getName() + " is blowing the whistle");
    }
}
