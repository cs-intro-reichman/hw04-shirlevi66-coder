public class Primes {
    public static void main(String[] args) {
    String nums = args[0];
    int n = Integer.parseInt(nums);
    boolean [] isprime = new boolean [n+1];
    int i = 2;
    while (i <= n){
      isprime [i] = true; 
      i++; 
    }
    int p = 2;
    while (p * p <= n){
    int k =  2*p;
         while (k <=n){
            isprime [k] = false;
            k = p + k;
        }
     p++;   
    }
    System.out.println("Prime numbers up to " + n + ":");

        int count = 0;
        int num = 2;
        while (num <= n) {
            if (isprime[num]) {
                System.out.println(num);
                count++;
            }
            num++;
        }

        double percent = 100.0 * count / (n - 1);
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + (int)percent + "% are primes)");

    }

    }
