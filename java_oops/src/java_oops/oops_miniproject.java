package java_oops;
import java.util.ArrayList;
import java.util.Scanner;

class Video {
    String videoName;
    boolean checkout;
    int rating;

    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }

    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        this.checkout = true;
    }

    public void doReturn() {
        this.checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}

class VideoStore {
    ArrayList<Video> store = new ArrayList<>();

    public void addVideo(String name) {
        store.add(new Video(name));
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    public void doCheckout(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void doReturn(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void receiveRating(String name, int rating) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void listInventory() {
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-15s | %-18s | %-7s\n", "Video Name", "Checkout Status", "Rating");
        for (Video v : store) {
            System.out.printf("%-15s | %-18s | %-7d\n", v.getName(), v.getCheckout(), v.getRating());
        }
        System.out.println("--------------------------------------------------------");
    }
}

public class oops_miniproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();
        int choice;

        do {
            System.out.println("MAIN MENU=========");
            System.out.println("1.Add Videos: ");
            System.out.println("2.Check Out Video : ");
            System.out.println("3.Return Video : ");
            System.out.println("4.Receive Rating : ");
            System.out.println("5.List Inventory : ");
            System.out.println("6.Exit : ");
            System.out.print("Enter your choice(1..6): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    String addName = sc.nextLine();
                    store.addVideo(addName);
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    String checkName = sc.nextLine();
                    store.doCheckout(checkName);
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to Return: ");
                    String returnName = sc.nextLine();
                    store.doReturn(returnName);
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to Rate: ");
                    String rateName = sc.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rate = sc.nextInt();
                    sc.nextLine();
                    store.receiveRating(rateName, rate);
                    break;
                case 5:
                    store.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
        sc.close();
    }
}
