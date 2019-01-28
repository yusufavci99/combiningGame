public class aa { 
   
   static String[] bigSorting(String[] unsorted) {
      for( int i = 0; i < unsorted.length; i++) {
         for( int j = 0; j < unsorted.length - 1; j++) {
            if( Integer.parseInt(unsorted[j]) > Integer.parseInt(unsorted[j+1])){
               String tmp = unsorted[j];
               unsorted[j] = unsorted[j+1];
               unsorted[j+1] = tmp;
            }
         }
      }
      return unsorted;
   }
   public static void main( String[] args) {
      String[] numbers = {"2","40","11","3","2","40","5","11","3","2","8","11","3"}; 
      numbers = bigSorting( numbers);
      
      for( String number : numbers) {
         System.out.println( number);
      }
   }
}