package chapter_7;

/**
 * @author 李子煊
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        int[][] maze = {
                {1, 1, 1, 1, 1,1},
                {1, 0, 0, 0, 0,1},
                {1, 1, 1, 0, 0,1},
                {1, 0, 0, 0, 0,1},
                {1, 1, 1, 1, 1,1}
        };
        test001 t =new test001();
        boolean a =t.migong(maze,1,1);
        System.out.println(a);
    }
}

class test001{
    public boolean migong(int [][] arr,int a,int b){
        if(arr[4][3]==2){
            return true;
        }else {
            arr[a][b]=2;
            if(arr[a][b+1]==0){
                migong(arr,a,b+1);
                return true;
            }
            else if(arr[a+1][b]==0){
                migong(arr,a+1,b);
                return true;
            }
            else if(arr[a][b-1]==0){
                migong(arr,a,b-1);
                return true;
            }
            else if(arr[a-1][b]==0){
                migong(arr,a-1,b);
                return true;
            }
            else {
                return false;
            }
        }
    }
}