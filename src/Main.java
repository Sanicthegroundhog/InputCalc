import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    private static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number: ");
            try{
                String Line = input.nextLine();
                int num = Integer.parseInt(Line);
                sum += num;
                count++;

            } catch(Exception e) {
                break;
            }
        }

        int average = 0;

        if(count == 0){
            average = 0;
        }else{
            average = sum / count;
        }

        System.out.println(sum);
        System.out.println(average);

    }
}
