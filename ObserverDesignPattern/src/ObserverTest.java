
import java.util.Scanner;

public class ObserverTest {
    private static Scanner scan;

	public static void main( String[] args ) {
        Group grp = new Group("DesignPatternGroup");
        
        scan = new Scanner(System.in);
        User u = new User("");
        
        for (int i = 1; i <= 4; i++) {
            System.out.print("\nEnter a user name: ");
            String name = scan.nextLine();
            u = new User(name);
            u.Subscribe(grp);
        }
        System.out.print("\nEnter a new Post: ");
        grp.newPost(scan.nextLine());
        
        u.unSubscribe(grp);
        
        System.out.print("\nEnter another Post: ");
        grp.newPost(scan.nextLine());
    }
}