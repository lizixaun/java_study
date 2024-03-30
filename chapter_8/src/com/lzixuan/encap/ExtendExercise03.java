package com.lzixuan.encap;

/**
 * @author 李子煊
 * @version 1.0
 */
public class ExtendExercise03 {
}
class Test{
    //在 Java 中，每个源文件只能有一个公共类（public class），而且该类的名称必须与文件名相匹配。
    // 因此，如果你在同一个源文件中有两个公共类，就会导致编译错误
    public static void main(String[] args) {
        PC pc = new PC("64","32","16","Asian");
        pc.getBrand();
        Notepad notepad = new Notepad("64","32","16","yellow");
        notepad.getColor();


    }
}
class computer{
    String cpu;
    String storage;
    String hard_disk;

    public computer(String cpu, String storage, String hard_disk) {//有参构造是给主方法调用定义函数属性的
        this.cpu = cpu;
        this.storage = storage;
        this.hard_disk = hard_disk;
    }

    public computer() {     //这个无参构造是给子类使用的
    }

    public String getDetails(){         //返回computer详细信息

        return (this.cpu+" "+this.storage+" "+this.hard_disk);
    }
}
class PC extends computer{
    String brand;
    public PC(String cpu, String storage, String hard_disk,String brand) {               //这里也需要写一个构造函数
        super(cpu,storage,hard_disk);
        this.brand=brand;
    }
    public String getBrand() {
        System.out.println(this.cpu+" "+this.storage+" "+this.hard_disk+" "+this.brand);
        return (this.cpu+" "+this.storage+" "+this.hard_disk+" "+this.brand);
    }


}
class Notepad extends computer{
    String color;
    public Notepad(String cpu, String storage, String hard_disk,String color) {
        super(cpu,storage,hard_disk);
        this.color=color;
    }

    public String getColor() {
        System.out.println(this.cpu+" "+this.storage+" "+this.hard_disk+" "+color);
        return (this.cpu+" "+this.storage+" "+this.hard_disk+" "+color);
    }

}
