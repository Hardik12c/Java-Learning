public class Arraysjava{
    public static void main(String[] args){
        String[] names={"hardik","Dharmahendra","jai"};

        String[] fruits=new String[5];

        fruits[0]="orange";
        fruits[1]="mango";
        fruits[2]="guava";
        fruits[3]="banana";
        fruits[4]="grapes";

        for(int i=0;i<3;i++){
            System.out.println(names[i]);
        }

        for(int i=0;i<5;i++){
            System.out.println(fruits[i]);
        }
    }
}