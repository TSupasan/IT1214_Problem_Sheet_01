import java.util.Scanner;

class Movie{

    int ticketNumber;
    String customerName;
    int seatNUmber;

    int[] ticketNumberarry = new int[10];
    String[] customerarry = new String[10];

    void booking(){

        Scanner sc = new Scanner(System.in);
        int choose;

        do{
            System.out.println("enter seat number");
            seatNUmber = sc.nextInt();

            if(ticketNumberarry[seatNUmber] == 0){
                ticketNumberarry[seatNUmber] = 1;
                
                System.out.print("Enter your name: ");
                sc.nextLine(); 
                customerName = sc.nextLine();

                customerarry[seatNUmber] = customerName;
                System.out.println("Seat " + seatNUmber + " successfully booked for " + customerName);

            }
            else{
                System.out.println("seat is not available");
            }

            System.out.println("do you want book another seat yes-0 || no-1");
            choose = sc.nextInt();

            if(choose != 1){
                break;
            }
        }
        while(choose != 1);

    }

    void cancel() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seat number to cancel (0–9): ");
        int seatNumber = sc.nextInt();

        if (ticketNumberarry[seatNumber] == 1) {
            ticketNumberarry[seatNumber] = 0;
            System.out.println("Ticket for " + customerarry[seatNumber] + " at seat " + seatNumber + " has been canceled.");
            customerarry[seatNumber] = null;
        } 
        else {
            System.out.println("Seat " + seatNumber + " is not booked.");
        }
    }
    
    void displaySeats() {
        System.out.println("\nSeat Status");
        for (int i = 0; i < ticketNumberarry.length; i++) {
            if (ticketNumberarry[i] == 1) {
                System.out.println("Seat " + i + ": Booked by " + customerarry[i]);
            } else {
                System.out.println("Seat " + i + ": Available");
            }
        }
        System.out.println("-------------------\n");
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Movie M = new Movie();

        int choice;

        do{
            System.out.println("welocome to theater");
            System.out.println("1. book ticket");
            System.out.println("2. cancel ticket");
             System.out.println("3. View seats");
            System.out.println("4. exists");

            choice =sc.nextInt();

            switch (choice) {
                case 1:
                    M.booking();
                    break;
                case 2:
                   M.cancel();
                case 3:
                   M.displaySeats();
                case 4:
                    break;
                default:
                    System.out.println("invalid choice");    
            }
            

        }while (choice != 4);
    }

}