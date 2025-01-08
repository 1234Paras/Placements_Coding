public class SearchInSortedMatrix{

    public static boolean staircaseSearch(int matrix[][], int keys){
        int rows = 0, cols = matrix[0].length-1;

        while(rows < matrix.length && cols >= 0) {
            if(matrix[rows][cols] == keys){
                System.out.println("Found key at The (" + rows + "," + cols + ")");
                return true;
            }
            else if(keys < matrix[rows][cols]){
                cols--;
            }
            else{
                rows++;
            }
        }
        System.out.println("Key is not Found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int keys = 33;
        staircaseSearch(matrix,keys);
    }
}

//Time Complexity - O(n + m);