package Arrays;

public class RichestCustomer {
    public static void main(String[] args) {
//        int[][] accounts = {
//                {1,5},
//                {7,3},
//                {3,5}
//        };

        int[][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };

        int max = -1;
        int sum =0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if(max < sum){
                max = sum;
            }
            sum =0;
        }
        System.out.println("Max wealth is "+max);
    }
}
