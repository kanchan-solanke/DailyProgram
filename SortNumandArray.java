public class SortArray {
    public void sortNum() {
        int[] num = new int[]{4, 7, 2, 8, 3, 9, 1, -1, -5};
        for (int i = 0; i < num.length; i++) {             // i=0 ; i<9 ;i+1   // j=0+1 j<9 ;j+1
            for (int j = i + 1; j < num.length; j++) {
                int temp = 0;
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            System.out.println(num[i]);
        }
    }
    // Sorting string

    public void sortString() {
        String[] str = new String[]{"Mumbai", "Pune", "Nagpur", "Bangalore", "Hyderabad"};
        String temp = "0";
        int k, m;
        for (k = 0; k < str.length; k++) {                              //k=0 k<5 then k increses +1 then it goes in inner loop
            for (m = k + 1; m < str.length; m++) {                      // m=0+1 =1 then m <5 ; m+1
                if (str[k].compareTo(str[m]) > 0) {                    // compare to string > 0
                    temp = str[k];
                    str[k] = str[m];
                    str[m] = temp;
                }
            }
            System.out.println(str[k]);
        }
    }

    public static void main(String[] args) {
        SortArray array = new SortArray();
        array.sortNum();
        array.sortString();
    }
}
