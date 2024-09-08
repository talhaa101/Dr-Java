class CheckCheck1 {
    public static void main(String[] args) {
        
        // Loop through numbers from 1 to 100
       int total_prime = 0 ;
        for (int start = 1; start <= 100; start++) {
            int counter = 0; // Reset the counter for each number
            
            // Check divisibility of the current number 'start'
            for (int divisor = 1; divisor <= start; divisor++) {
                if (start % divisor == 0) {
                    counter++; // Increment the counter if divisible
                }
            }
            
            // A prime number has exactly 2 divisors: 1 and itself
            if (counter == 2) 
            {
                total_prime ++ ;
                System.out.println(start + " is a prime number.");
            }
        }
        System.out.println( "The number of Prime numbers form 1 to 100 is " + total_prime);
    }
}
