class check_check {
  public static void main (String [] args ) {
    int number = 7 ;
    int counter = 0;
    
    for ( int divisor = 1 ; divisor <= number ; divisor ++ ) {
      
      if (number % divisor == 0 ) 
      {
        counter ++ ; 
      }
      
    }
    if (counter == 2 ) 
    {
      System.out.println( number + " is a prime number .") ;
    }
    
   else 
   {
     System.out.println ( number + "is not a prime number " ) ;
   }
  }
}
      