public class Calendar {
    String month;
	int Month
    int days;
    
 
    public static void main displayCalendar(int M){
        M = Months;
         for (int i=1; i<=4; i++){
            if (i ==1){
                month = "January";
            }else if (i==2){
                month = "February";
            }else if (i==3){
                month = "March";
            }else if (i==4){
                month = "April";
            }
         
            System.out.println("");
            System.out.println("");
            System.out.println("       " + month);
            System.out.println("Su Mo Tu We Th Fr Sa");
            
            if (i == 1 || i == 3 || i == 5{
                days = 31;
            }else if (i == 2){
                        days = 28;
                }else{
                    days = 29;                             
                }          
                }else{
                days = 28;
                }
            }else{
                days = 30;
            }
                 
                     
                }
            }
         }
         System.out.println("");
    }
   
    
}