import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        for (int i = 0; i < testcase; i++) {
            int count = scanner.nextInt();
            List<Integer> votecontent = new ArrayList<>();
            int votecount = 0;
            for (int j = 0; j < count; j++) {
                int vote = scanner.nextInt();
                votecontent.add(vote);
                votecount += vote;
            }
            int maxvalue = Collections.max(votecontent);
            int maxcount = 0;
            for (int k = 0; k < votecontent.size(); k++) {
                if (maxvalue == votecontent.get(k)) {
                    maxcount++;
                }
            }
            if ((votecount / 2) < maxvalue) {
                System.out.println("majority winner " + (votecontent.indexOf(maxvalue)+1));
            } else if ((votecount / 2) >= maxvalue && maxcount == 1) {
                System.out.println("minority winner " + (votecontent.indexOf(maxvalue)+1));
            } else {
                System.out.println("no winner");
            }
        }
    }
}
