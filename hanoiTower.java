//package chapter_7;
//
///**
// * @author 李子煊
// * @version 1.0
// */
//public class hanoiTower {
//    public static void main(String[] args) {
//        Tower tower=new Tower();
//        tower.move(64,'A','B','C');
//    }
//}
//class Tower{
//    public void move(int mun,char a,char b,char c){
//        if(mun==1){
//            System.out.println(a+"->"+c);
//        }else {
//            move(mun-1,a,c,b);
//            System.out.println(a+"->"+c);
//            move(mun-1,b,a,c);
//        }
//    }
//}
