public class Armstrong {
    public static void main(String[]args){
        int number=132;
        int original=number;
        int sum=0;
        while (number>0){
            int digit = number%10;
            sum+=digit*digit*digit;
            number/=10;
        }
        if (sum==original){
            System.out.println(original+" is armstrong number");
        }
        else {
            System.out.println(original+" is not a armstrong number");
        }
    }
}
