
package perfectnumber;


public class PerfectNumber {

    
    public static void main(String[] args) {
        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
        isPerfectNumber(-1);
    }
    
    public static boolean isPerfectNumber (int number){
        int factor = 1;
        int sumOfFactors = 0;
        
        if (number < 1){
            System.out.println("false");
            return false;
        }
        else {
            while (factor < number){
                if (number % factor == 0){
                    sumOfFactors += factor;
                }
                factor++;
            }
            if (sumOfFactors == number){
                System.out.println("true");
                return true;
            }
            else{
                System.out.println("false");
                return false;
            }
        }
    }
    
}
