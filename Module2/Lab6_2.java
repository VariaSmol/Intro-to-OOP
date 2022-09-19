import java.util.Scanner;
public class Lab6_2 {

    public static void main(String[] args) {

        String array[] = new String[3];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three cities (case-sensitive, no spaces!
        ) ");

        System.out.print("Enter the first city: " );

        String city1 = input.next();
        input.nextLine();

        array[0] = city1;

        System.out.print("\nEnter the second city: " );

        String city2 = input.next();
        input.nextLine();

        array[1] = city2;

        System.out.print("\nEnter the third city: " );

        String city3 = input.next();
        input.nextLine();

        array[2] = city3;

        for (int j = 0; j < 2; j++)

            for (int i = 0; i < 2; i++) {

                String d;

                if (array[i + 1]
                        .charAt(0) < array[i]
                        .charAt(0)
                ) {

                    d = array[i + 1];

                    array[i + 1] = array[i];

                    array[i] = d;

                }

            }

        System.out.print("The three cities in alphabetical order are: " );

        for (int i = 0; i < 3; i++)

            System.out.print(array[i] + " " );

        input.close();

    }
}
