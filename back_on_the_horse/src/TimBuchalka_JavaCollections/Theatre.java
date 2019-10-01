package TimBuchalka_JavaCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Theatre {
	/*
	 * created by dev on 10 oct 2019
	 */
	
	public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
	    List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats); //shallow copy...its copied but the same object
	    															//thus if you change the original you change this and vice versa
	    Theatre.printList(seatCopy);
	    
	    Collections.reverse(seatCopy);
	    System.out.println("Printing seatCopy");
	    Theatre.printList(seatCopy);
	    System.out.println("Printing theatre.seats");
	    Theatre.printList(theatre.seats);
	    
	    Theatre.Seat minSeat = Collections.min(seatCopy);
	    Theatre.Seat maxSeat = Collections.max(seatCopy);
	    System.out.println("The min seat number is "+minSeat.getSeatNumber());
	    System.out.println("The max seat number is "+maxSeat.getSeatNumber());
	   
//        theatre.getSeats();
//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
    }//end main
	

	private final String theatreName;
	public List<Seat> seats = new ArrayList<>();  //changed from private for testing
	//private List<Seat> seats = new LinkedList<>();
	//private Collection<Seat> seats = new LinkedList<>(); //even more generic
	//private Collection<Seat> seats = new HashSet<>();
//	private Collection<Seat> seats = new LinkedHashSet<>();
	public Theatre(String theatreName, int numRows, int seatsPerRow) {
		super();
		this.theatreName = theatreName;

		int lastRow = 'A' + (numRows - 1);
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			} // end internal for
		} // end for
	}// end constructor

	public String getTheatreName() {
		return theatreName;
	}// end getter

	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = new Seat(seatNumber);
		int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
		if(foundSeat >=0){
			return seats.get(foundSeat).reserved;
		}//end if
		else{
			System.out.println("There is no seat "+seatNumber);
			return false;
		}//end else
		
//		for (Seat seat : seats) {
//			if (seat.getSeatNumber().equals(seatNumber)) {
//				requestedSeat = seat;
//				break;
//			} // end if
//		} // end for
//
//		if (requestedSeat == null) {
//			System.out.println("There is no seat " + seatNumber);
//			return false;
//		} // end if
//		return requestedSeat.reserve();
	}// end method

	// for testing
	public void getSeats() {
		for (Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		} // end for
	}// end method
	
	public static void printList(List<Seat> list){
		for(Seat seat : list){
			System.out.print(" "+ seat.getSeatNumber());
		}//end for
		System.out.println();
		System.out.println("=================================");
	}//end method

	public class Seat implements Comparable<Seat>{   //changed from private for testing

		private final String seatNumber;
		private boolean reserved = false;

		public Seat(String seatNumber) {
			this.seatNumber = seatNumber;
		}// end constructor

		public boolean reserve() {
			if (!this.reserved) {
				this.reserved = true;
				System.out.println("Seat " + seatNumber + " reserved");
				return true;
			} // end if
			else {
				return false;
			} // end else
		}// end method
		
		public boolean cancel(){
			if(this.reserved){
				this.reserved = false;
				System.out.println("Reservation of seat "+seatNumber+" canceled");
				return true;
			}//end if
			else{
				return false;
			}//end else
		}//end method
		
		public String getSeatNumber(){
			return seatNumber;
		}

		@Override
		public int compareTo(Seat seat) {

			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}

	}// end internal class

}// end class
