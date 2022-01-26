package ThreadEample;

public class Calculator{

    public static void main(String args[]){

        String str= "1+1";
        int sum=0;

        String [] arr= str.split("\\+\\-\\)\\(");
       // System.out.println(arr.length);

        for(int i=0;i<arr.length;i++){

            sum= sum  +  Integer.parseInt(arr[i]);
        }

        System.out.println(sum);

    }


}