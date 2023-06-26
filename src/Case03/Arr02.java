package Case03;

public class Arr02 {
    public static void main(String[] args) {
        int[][] arr=new int[2][];
        arr[0]=new int [] {21,33,65};
        arr[1]=new int [] {38,76,45};                               //前置条件
        int sum =0;                                                 //销售总额
        for(int i=0;i<arr.length;i++){
            int quarter=0;                                          //季度销售总额
            for(int j=0;j<arr[i].length;j++){
                quarter=quarter+arr[i][j];
            }
            System.out.println("第"+ (i+1) +"季度销售额为："+quarter);
            sum += quarter;
        }
        System.out.println("销售总额为："+ sum );
    }
}
