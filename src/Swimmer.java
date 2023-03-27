public class Swimmer {
    private String name;
    private int id;

    public Swimmer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void swim(){
        System.out.println(this.name + " is Swimming");
    }
    public void checkScoreBoard(){
        System.out.println(this.name + " is checking scoreboard");
    }

}
