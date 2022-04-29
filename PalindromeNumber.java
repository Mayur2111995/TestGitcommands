package Com.Bridgelabz;
public class PalindromeNumber {
    public void palindrome() {
        int rem, rev= 0, temp;
        int n=57;
        temp = n;
        while( n != 0 )
        {
            rem= n % 10;
            rev= rev * 10 + rem;
            n=n/10;
        }
        if (temp == rev)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");
    }

    public static void main(String[] args) {
        PalindromeNumber abc=new PalindromeNumber();
        abc.palindrome();
    }
}




