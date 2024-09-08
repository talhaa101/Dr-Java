class loop_armstrong_number {
  public static void main (String [] args ) {
    
    int sum = 0 ;
    for (int start = 300 ; start <= 500 ; start++)
    {
    int store = start ;
    sum = 0 ;
    int temp = start; 
    while (temp > 0 )
    {
      int digit = temp % 10 ;
      sum = sum + (int) Math.pow ( digit , 3 ) ;
      temp = temp / 10 ;
    }
    
    if (store == sum )
    {
      System.out.println ( store + " is a Armstrong Number " ) ;
    }
    
//    else 
//    {
//      System.out.println (store + "No , this is not a Armstrong Number" ) ;
//    }
  }
 }
}
      
      
      