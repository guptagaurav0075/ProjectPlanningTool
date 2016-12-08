package OOAProject.Tiger.ProjectPlanning.ProjectManagementTool.Resources;

import OOAProject.Tiger.ProjectPlanning.ReusableBusinessClasses.Values.Duration;
import OOAProject.Tiger.ProjectPlanning.ReusableBusinessClasses.Values.Money.Currency;
import OOAProject.Tiger.ProjectPlanning.ReusableBusinessClasses.Values.Money.Money;
import OOAProject.Tiger.ProjectPlanning.ReusableBusinessClasses.Values.Time.DateTime;

import java.util.LinkedList;

public class TestingResource {

    public static void main(String[] args){

        try {
            DateTime startDate1 = new DateTime(6, 2016, 4);
            Duration duration1 = new Duration(12,1,0);
            Booking booking1 = new Booking(startDate1, duration1);

            Currency usd = new Currency("Dollar", "Cent", "USD", 100);
            Money costOfTruck = new Money(45, 0, usd);
            Equipment truck = new Equipment("Truck", costOfTruck, booking1);

            truck.makeBooking(new DateTime(7,2016,4), new Duration(0,1,0));

            LinkedList<Booking> myTruckBookings =  truck.getBookings();

            for(Booking booking : myTruckBookings){
                System.out.println(booking);
            }

        } catch (Exception E){
            //E.printStackTrace();
        }
    }



}
