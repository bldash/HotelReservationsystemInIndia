package com.ticket.pratice;

import java.util.Scanner;

public class TicketBooking {
	static boolean rooms[] = new boolean[30];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("enter any of option from below option");
			System.out.println("1..to book room of  the hotel");
			System.out.println("2..to cancel  the room ");
			System.out.println("3..to see the room availbailty");
			System.out.println("4..to exit the process");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				bookRoom();
				break;
			case 2:
				cancelReservation();
				break;
			case 3:
				showRoomavailibilty();
				break;
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("Please enter the vaild room number");

			}

		}

	}

	public static void bookRoom() {
		System.out.println("enter the room number");
		int roomNumber = scanner.nextInt();
		if (roomNumber > 20 && roomNumber < 0) {
			System.out.println("please enter the vaild room number");
		}
		for (int i = 0; i < rooms.length; i++)

		{
			

			if (rooms[roomNumber] == false) {
				rooms[roomNumber] = true;
				System.out.println(roomNumber + "  number room is booked succesfully");
				break;
			} 
			else {

				System.out.println(roomNumber + "  number room is alreday booked..its not avalble");
				break;

			}

		}
	}

	public static void cancelReservation() {
		System.out.println("enter the room number u want to cancel ");

		int roomNumber = scanner.nextInt();
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[roomNumber] == false) {

				System.out.println("there is no reservation on this number");
				break;
			}
			if (rooms[roomNumber] == true) {
				rooms[roomNumber] = false;
				System.out.println("your resevation is canceled succesfuly frot the... " + roomNumber + "roomNumber");
				break;
			}
		}

	}

	public static void showRoomavailibilty() {
		System.out.println("below   room numbers are availble ");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] == false) {
				System.out.print(i + "->avaible    ");
			}

		}
		System.out.println(" ");
		System.out.println("below   room numbers are not availble ");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] == true) {
				System.out.print(i + "->booked    ");
			}

		}
	public void add1(){
		
			System.out.println("line 1 added");
	}

		public void add2(){
		
			System.out.println("line 2 added");
	}

	}

}
