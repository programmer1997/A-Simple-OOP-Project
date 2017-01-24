
package planes;

/**
 *
 * @author Ajinkya Marathe
 */
import java.util.Scanner;


public class PlaneApp {

    // Main 
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        Planes one = new Planes(); // New Object
        int seat2, customer2; // variables needed for computation later
        while (true) {
            // **** Booking panel
            System.out.println("**************************************");
            System.out.println("Welcome to the Flight Booking Program");
            System.out.println("What do you want to do (Press the number in the bracket)");
            System.out.println("(1) Number of Empty Seats");
            System.out.println("(2) List of Empty Seats");
            System.out.println("(3) List of customers in order of seat no");
            System.out.println("(4) List of customers in the order of customer");
            System.out.println("(5) Book a seat");
            System.out.println("(6) Cancel Booking");
            System.out.println("(7) Quit");
            int choice = sc.nextInt();

            //switch statement to control
            switch (choice) {

                case 1:
                    one.showNumEmptySeats();
                    break;

                case 2:
                    one.showEmptySeats();
                    break;

                case 3:
                    one.showAssignedSeats();
                    break;

                case 4: PlaneSeat[] seat3;
                        seat3=one.sortSeats();
                        for(int i=0;i<12;i++)
                        {
                            System.out.println(seat3[i]+"\t"+seat3[i].getCustomerID());
                        }
                        
                    
                    
                break;    

                case 5:
                    System.out.println("What seat do you want?");
                    seat2 = sc.nextInt();
                    System.out.println("What is your customer id");
                    customer2 = sc.nextInt();
                    one.assignSeat(seat2, customer2);
                    break;

                case 6:
                    System.out.println("What is your booked seat number");
                    seat2 = sc.nextInt();
                    one.unAssignSeat(seat2);
                    break;

            }
        }

    }
}
