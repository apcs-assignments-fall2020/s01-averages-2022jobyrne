public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        //int[] row1 = mat[0];
        int counter = 0;
        double total = 0;
        for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[0].length; col++) {
                total = total + mat[row][col];
                counter = counter + 1;
            }
        }
    return total / counter;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        int size = mat.length * mat[0].length;
        double[] arr = new double[size + 1];
        double y = 0;
        double median = 0;
        int counter = 0;
        for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[0].length; col++) {
                y = mat[row][col];
                arr[counter] = y;
                counter = counter + 1;
            }
        }
        if (counter % 2 != 0)
        {
            median = arr[counter / 2];
            //odd
        }
        if (counter % 2 == 0)
        {
            //even amt of vals 
            
            median = (arr[counter / 2] + arr[(counter / 2) - 1] ) / 2;
        }
        
        //int finalcounter = counter;
       // median = arr[4];
        //need to access median of arr and turn into a double(find the midpoint of the arr array)

            return median;
        } 


    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        int size = mat.length * mat[0].length;
        int counter = 0;
        double y = 0;
        double[] arr = new double[size + 1];
        for (int row = 0; row < mat.length; row++) {
			for (int col = 0; col < mat[0].length; col++) {
                y = mat[row][col];
                arr[counter] = y;
                counter = counter + 1;
            }
        }
        double maxValue = -1;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++)
        {
            int count = 0;
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[j] == arr[i])
                {
                    count++;
                }
                if (count > maxCount)
                {
                    maxCount = count;
                    maxValue = (int)arr[i];
                }
            }
        }
        return maxValue;
    }


    public static void main(String[] args) {
        double[][] m1 = {
        {1,  2,  4, 6},
        {7,  9,  10, 12},
        {14, 15, 17, 18},
        {22, 23, 27, 30}
        };
        System.out.print(mean(m1));
        System.out.print(median(m1));
        System.out.print(mode(m1));

    }
}
