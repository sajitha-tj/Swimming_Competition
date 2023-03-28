public class Swimmer extends Human{

    public Swimmer(String name, String id) {
        super(name, id);
    }

    public void swim() {
        System.out.println(this.getName() + " is Swimming");
    }
}
