package Com.Bridgelabz;
public class LeapYear {
    // Java program to check
    // for a leap year
        static boolean checkYear(int Year) {
            // If a year is multiple of 400,
            // then it is a leap year
            if (Year % 400 == 0)
                return true;
            // Else If a year is multiple of 100,
            // then it is not a leap year
            if (Year % 100 == 0)
                return false;
            // Else If a year is multiple of 4,
            // then it is a leap year
            if (Year % 4 == 0)
                return true;
            return false;
        }
        // Driver method
        public static void main(String[] args)
        {
            int year =1995;
            System.out.println( checkYear(1995)? "Leap Year" :
                    "Not a Leap Year" );
        }
    }

