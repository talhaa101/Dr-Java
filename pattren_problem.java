class pattren_problem {
  public static void main (String [] args) {
    int row = 4 ;
    
    for (int rowCount = 1 ; rowCount <= row ; rowCount++ ) 
    {
      for (int colCount =1 ; colCount <= rowCount; colCount++ ) 
      {
        System.out.print(colCount) ;
      }
      System.out.println () ;
    } 
    
  }
  
}

/*
1
12 
123 
1234
*/
