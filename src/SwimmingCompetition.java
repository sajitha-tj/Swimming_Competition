import java.util.ArrayList;
import java.util.Scanner;

public class SwimmingCompetition {
    public static void main(String[] args){

        int no_of_swimmers, no_of_judges, no_of_spectators, no_of_staff;

        Scanner input = new Scanner(System.in);
        System.out.print("Number of swimmers: ");
        no_of_swimmers = input.nextInt();
        System.out.print("Number of judges: ");
        no_of_judges = input.nextInt();
        System.out.print("Number of spectators: ");
        no_of_spectators = input.nextInt();
        System.out.print("Number of Staff: ");
        no_of_staff = input.nextInt();

        ArrayList<Swimmer> swimmers = new ArrayList<>();
        for (int i = 0; i < no_of_swimmers; i++){
            swimmers.add(new Swimmer("swimmer"+i, "swm"+i));
        }

        ArrayList<Judge> judges = new ArrayList<>();
        for (int i = 0; i < no_of_judges; i++){
            judges.add(new Judge("judge"+i, "jdg"+i));
        }

        ArrayList<Spectator> spectators = new ArrayList<>();
        for (int i = 0; i < no_of_spectators; i++){
            spectators.add(new Spectator("spectator"+i, "spc"+i));
        }

        ArrayList<SupportingStaff> staffs = new ArrayList<>();
        for (int i = 0; i < no_of_staff; i++){
            staffs.add(new SupportingStaff("staff"+i, "stf"+i));
        }

        for (Swimmer swimmer:swimmers) {
            swimmer.checkScoreBoard();
            swimmer.swim();
        }

        for (Judge judge:judges) {
            judge.blowWhistle();
            judge.checkScoreBoard();
        }

        for (Spectator spectator:spectators) {
            spectator.checkScoreBoard();
        }

        for (SupportingStaff staff:staffs) {
            staff.checkScoreBoard();
        }
    }
}
