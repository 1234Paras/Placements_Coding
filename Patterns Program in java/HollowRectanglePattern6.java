public class HollowRectanglePattern6 {

    public static void HollowRectangle(int totRows, int totCols){

        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        HollowRectangle(4,4);
    }
}

/* Output :
****
*  *
*  *
****
*/
