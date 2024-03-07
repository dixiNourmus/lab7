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
                temptype = in.nextLine();
                if (temptype.equalsIgnoreCase("c")){
                    System.out.println("what is the temp");
                    tempC = in.nextDouble();
                    tempF = (tempC * 9 / 5) + 32;
                    System.out.println("Temp converted: " + tempF);
                    break;

                }else if(temptype.equalsIgnoreCase("f")){
                    System.out.println("what is the temp");
                    tempF = in.nextDouble();
                    tempC= (tempF * 5/9) - 32;
                    System.out.println("Temp converted: " + tempC);
                    break;
                }else{
                    System.out.println("you gave me trash " + temptype);

                }
        }
    }
}

