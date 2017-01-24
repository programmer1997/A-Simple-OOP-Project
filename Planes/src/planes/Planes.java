/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planes;

/**
 *
 * @author Ajinkya
 */
public class Planes {

    private PlaneSeat[] seat = new PlaneSeat[12];
    private int numEmptySeat;
    private final int NUM_SEAT = 12;

    // Constructor
    public Planes() {
        numEmptySeat = 12;
        for (int i = 0; i < 12; i++) {
            seat[i] = new PlaneSeat(i + 1);
        }

    }

    public PlaneSeat[] sortSeats() {

       PlaneSeat[] sortedSeat = new PlaneSeat[NUM_SEAT]; //creating new object sortedSeat//
		System.arraycopy(seat, 0, sortedSeat, 0, seat.length); //creating indexed array//
		for (int index = 1; index < seat.length; index++)
		{
			PlaneSeat key = sortedSeat[index];
			int position = index;
			// Insertion sort
			while (position > 0 && key.getCustomerID()-sortedSeat[position-1].getCustomerID() < 0)
			{
				sortedSeat[position] = sortedSeat[position-1];
				position--;
			}
			sortedSeat[position] = key;
		}
		return sortedSeat;
    }

    public void showNumEmptySeats() {
        System.out.println("The number of empty seats are   " + numEmptySeat);
    }

    public void showEmptySeats() {
        System.out.println("The empty seats are-");

        for (int i = 0; i < 12; i++) {
            if (seat[i].isOccupied() == false) {
                System.out.println(i + 1);
            }
        }
    }

    public void showAssignedSeats() {
        System.out.println("The assigned seats are-");

        for (int i = 0; i < 12; i++) {
            if (seat[i].isOccupied() == true) {
                System.out.print(i + 1);
                System.out.println("\t\t" + seat[i].getCustomerID());
            }
        }
    }

    public void assignSeat(int seatId, int cust_id) {
        seat[seatId - 1].assign(cust_id);
        numEmptySeat--;
    }

    public void unAssignSeat(int seatId) {
        seat[seatId - 1].unAssign();
        numEmptySeat++;
    }

}
