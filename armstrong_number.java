class armstrong_number {
  public static void main (String [] args) {
    
    int number = 371 ;
    int sum = 0 ;
    
    int last_number = number % 10 ;
    int first_two_number = number / 10 ;
    
    int second_number = first_two_number % 10 ;
    int first_number = number / 100 ;
    
     sum = (int) Math.pow( last_number , 3 ) +  (int) Math.pow( second_number , 3 ) + (int) Math.pow( first_number , 3 );
     
     System.out.println(sum) ;
  }
}
  