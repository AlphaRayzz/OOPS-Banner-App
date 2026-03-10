public class OOPSbannerapp {
    public static void main(String[] args) {
     
        printBannerLine(" **** ", " **** ", " *****", "  **** ");
        
    
        printBannerLine(" *    *", " *    *", " *    ", " *     ");
        
  
        printBannerLine(" *    *", " *    *", " *    ", " *     ");
        
       
        printBannerLine(" *    *", " *    *", " *****", "   **  ");
        
   
        printBannerLine(" *    *", " *    *", " *    ", "     * ");
        
      
        printBannerLine(" *    *", " *    *", " *    ", "    ** ");
        
      
        printBannerLine(" **** ", " **** ", " *    ", " ****  ");
    }
    
    public static void printBannerLine(String O1, String O2, String P, String S) {
        System.out.println(String.join("  ", O1, O2, P, S));
    }
}


