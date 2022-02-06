package car;
import java.util.Scanner;

public class Parking {
    public static void main(String argu[])
    {
        Scanner sobj = new Scanner(System.in);
        Vehicle Vobj =new Vehicle();

        int choice;
        while (true)
        {
            System.out.println("select your option");
            System.out.println("------------");
            System.out.println("1- Parking Vehical");
            System.out.println("2- Exit Parking");
            System.out.println("3- Show Available parking areas/slots");
            System.out.println("4- option");

            System.out.println("your selected option is");
            choice = sobj.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println(" Enter your details and slect your parking slot ");
                    System.out.println("Enter your name: ");
                    String xx = sobj.next();
                    Vobj.setName(xx);

                    System.out.println("Enter your Vehicle number: ");
                    String a = sobj.next();
                    Vobj.setNumber(a);

                    System.out.println("Enter your Mobile number: ");
                    String b = sobj.next();
                    Vobj.setMobilenumber(b);

                    System.out.println("Enter your University ID: ");
                    String aa = sobj.next();
                    Vobj.setNumber(aa);

                    System.out.println("Please re check your details and enter done: ");
                    String aaa = sobj.next();
                    Vobj.setNumber(aaa);

                    /* Choose Vehicle */
                    int vehicletypenumber;
                    /* Print set */
                    System.out.println("select your option");
                    System.out.println("------------");
                    System.out.println("1- Parking Vehical");
                    System.out.println("2- Exit Parking");
                    System.out.println("3- Show Available parking areas/slots");
                    System.out.println("4- option");

                    System.out.println("your selected option is");
                    vehicletypenumber = sobj.nextInt();
                    switch (vehicletypenumber) {

                        case 1:
                            Vobj.setType("car");
                            break;

                    }
                    break;
                case 2:
                    System.out.println("option 2 is selected. Thank You Come again");
                    break;
                case 3:
                    System.out.println("option 3 is selected. Thank You");
                    System.out.println("Welcome "+ Vobj.getName());
                    System.out.println("your vehicle number is  "+ Vobj.getNumber());
                    System.out.println("your Mobile number is  "+ Vobj.getMobilenumber());
                    System.out.println("your University ID is  "+ Vobj.getIDnumber());
                    System.out.println("Your Details are correct");
                    break;
                case 4:
                    System.out.println("option 4 is selected. Thank You");
                    break;
                case 5:
                    System.out.println("option 1 is selected. Thank You");
                    break;
                default:
                    break;
            }
        }
    }

}