import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempF = 0;
        double tempC = 0;
        String temptype ="";
        String trash = "";
        while(true) {
            System.out.println("are you starting with F or C");
            if (in.hasNextLine()){
                temptype = in.nextLine();
                if (temptype.equalsIgnoreCase("c")){
                    System.out.println("what is the temp");
                    tempC = in.nextDouble();
                    tempF = (tempC * 9 / 5) + 32;
                    System.out.println("Temp converted: " + tempF);
                    break;

                }
            }


            if (in.hasNextDouble()) {



            } else {

                trash = in.nextLine();
                in.nextLine();
                System.out.println("you gave me trash: " + trash);
                System.exit(0);


            }

        }
    }
}

