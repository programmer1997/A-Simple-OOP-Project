
package planes;

/**
 *
 * @author Ajinkya Marathe, Group BCG2;
 */
public class PlaneSeat {
    // Instance Variables
    private int seat;
    private boolean assigned;
    private int customerId;
    
    
    // constructor
    public PlaneSeat(int seat_id){
        // we set the customerId to 0 and assigned to false when a seat is created
        seat=seat_id;
        customerId=0;
        assigned=false;
    }
    
    //instance methods
    
    public  int getSeatID(){
        return seat;
    }
    
    public int getCustomerID(){
        return customerId;
    }
    
    public boolean isOccupied(){
        return assigned;
    }
    
    public  void assign(int cust_id){
        customerId=cust_id;
        assigned=true;
        
        
    }
    public  void unAssign(){
        
        // When the seat is unassigned, then the customer ID is set to 0
         customerId=0; 
        assigned=false;
        
    }
    
}
