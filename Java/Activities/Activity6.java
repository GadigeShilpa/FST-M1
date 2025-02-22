package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane{
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTakeoffTime;
    private Date lastTimeLanded;
    
    public Plane(int maxPassengers){
    	this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<String>();
    }
    public void onboard(String passengerName) {
        this.passengers.add(passengerName);
    }
    public void setTakeOff() {
    	this.lastTakeoffTime = new Date();
    	    	
    }

    public Date getTakeOffTime() {
    	
    	return this.lastTakeoffTime;
    }
    public void setLand() {
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }
    public List<String> getPassengers() {
        return passengers;
    }

}

public class Activity6 {
	public static void main(String[] args)  throws InterruptedException{
		//create an object for plane
		Plane b939 = new Plane(10);
		
		//On boarding passengers
		b939.onboard("Shilpa");
		b939.onboard("Rajesh");
		b939.onboard("Vidya");
		b939.onboard("Arun");
		
		//Set the takes off time
		b939.setTakeOff();
				
        System.out.println("Plane took off at: " + b939.getTakeOffTime());
        System.out.println("The passengers in the plane at the time of takeoff: " + b939.getPassengers());
        //Flying time
        
        Thread.sleep(5000);
        
        System.out.println("Plane is flying  ..... ");
        
        
        System.out.println("The passengers in the plane: "+b939.getPassengers());
        
     // set the Landing Time
     		b939.setLand();
     		System.out.println("Plane Landed at: " + b939.getLastTimeLanded());
     		System.out.println("The passengers in the plane after landing: " + b939.getPassengers());
        
    		
	}

}
