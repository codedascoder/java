public class ReverseString {
    public static void main(String[] args){
        String str= "madam";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(" Reversed Value of the string is : "+reversed);
        if (str.equals(reversed)){
            System.out.println(str+ " is a palindrome");
        }
        else {
            System.out.println(str+ " is not a palindrome");
        }

    }
}
