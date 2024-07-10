public class Chessboard {
    public static void main(String[] args){
        int row = 8;

        for(int i=1; i<=row;i++){
            if(i%2!=0){
                System.out.println("1 0 1 0 1 0 1 0");
            }
            else{
                System.out.println("0 1 0 1 0 1 0 1");
            }
        }
    }
}