import java.util.Scanner;

public class Bottle {

    private int capacity;
    private String mat;
    Scanner sc = new Scanner(System.in);


    public Bottle() {
    }

    void setCapacity () {

        for (;;) {
            System.out.print("Choose volume (1-25 liters): ");
            capacity = sc.nextInt();
            if (capacity <= 0) {
                System.out.println("Ha-ha, u are funny");
                continue;
            } else if (capacity >= 26) {
                System.out.println("Don`t be so foolish");
                continue;
            } else {
                break;
            }
        }
    }

    void getCapacity() {
        if (capacity == 1) {
            System.out.println("You choose " + capacity + " liter");
        }
        else {
            System.out.println("You choose "+ capacity + " liters");
        }
    }

    void setMaterial() {
        for (;;) {
            System.out.print("Choose material (plastic or glass): ");
            mat = sc.nextLine();
            if (mat.equals("glass")) {
                break;
            } else if (mat.equals("plastic")) {
                break;
            } else {
                System.out.println("Sorry, we don`t have such materials");
                continue;
            }
        }
    }

    void getMaterial() {
       if (mat.equals("glass")) {
           System.out.println("Glass bottle have been chosen");
       }
       else if (mat.equals("plastic")) {
           System.out.println("Plastic bottle have been chosen");
       }
    }

    void getCost () {
        if (mat.equals("glass")) {
            System.out.println((capacity * 6) + 20);
        }
        else if (mat.equals("plastic")) {
            System.out.println((capacity * 6) + 7);
        }
        else {
            System.out.println("Sorry, we don`t have such materials");
        }
    }

}

