import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers you want to enter");
        int totalNumbers = scanner.nextInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for(int i=0;i<totalNumbers;i++){
            System.out.println("Please enter "+(i+1)+"th Number");
            int number = scanner.nextInt();
            linkedHashMap.addNumber(number);
        }
        linkedHashMap.display();
        scanner.close();
    }
}
