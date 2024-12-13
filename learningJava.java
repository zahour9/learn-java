public class learningJava {
    public static double getBigNum(double[] arr){
        double num = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > num){
             if(arr[i] % 2 == 0){
                num = arr[i];
             }
            }
        }
        return num;
    }
}

