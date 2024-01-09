
//																	《java基础》
// java运行    #java程序保存在"E:\java\java_study_base"
// //.java由javac编译，为.class文件。最后由java运行jvm是java可以运行在不同平台的虚拟机)-————这个些东西全部是在Java开发工具上面 ）
// //.java也被称为源文件，class也被叫为字节码文件
// //执行cmd：javac 名字.java
// //		  java 名字（类不用写，其实python也有类，但是由于简便，没写出来，就比如导包自己写的程序）
// 开发者：JDK=JRE+java开发工具【java,javac,javadoc,javap等】
// 使用者：JRE=jvm+java核心类库（类）#安装JRE就可以了。（非程序员，无需编译只需安装JRE）
//——————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
// 																//学习方法（顺序）
// 需求：1.工作需要2.跳槽对方需要。3.技术控
// 1.看看传统知识能不能解决-->引出我们学习新技术和知识点
// 2.学习一个新技术或者知识点的基本原理和基本语法（不要考虑细节）
// 3.快速入们（增删改查基本语法，打出来）
// 4.细节优化代码（工资高低决定）
//_____________________________________________________________________________________________________________________________________________________________________________
// 																// 这是Java的快速入门
// // 调整字体：preference-优先项，set改变size

// public class Hello{
//     // 编写一个主方法
//     public static void main(String[] args){
//         System.out.println("hello,world~");		// 分号（；）表示这条语句的结束
//     }
// }
// // 然后开始在这个文件的位置输入cmd,1.javac Hello.java(之后会出现java.class这个文件，下面的Java指的就是java.class)
//                                 // java Hello         #详细见oneNOte
// // 但是全部操作之后我们发现没有出现java.class，因为该文件夹的cmd属性编码与我们的保存文件编码不一样所以，改成一样的GBK就可以执行（在终端输入chcp也就是Changes the active console code page的意思）,但是我感觉很奇怪我们这个电脑需要将set file Enconding to utf-8,才能正常使用

// //---------------------------------------------------
// // E:\java\java_study_base>java Name.java
// // Hello, my name is lizixuan
// //---------------------注释--------------------------
// // 1. 每一次保存都会产生一个.class文件，这样可以保证每次+class，确保可以执行和调试代码
// class Dog{
// }
// // 2. 需要记住这个和python的区别，不要混淆，一次要执行一个，不能混着来。
// //3.一个源文件只能有一个public,其他类的个数不限，也可将main方法写在非public类中，然后指定运行（java dog1）非public类，这样入口方法就是非public的main方法
// class Dog1{
// 	public static void main(String[] args){
// 		System.out.println("hello 小狗狗");
// 	}
// }
// //3.会得到dog1类，然后我们可以：java dog1（将dog1做为一个主类加载到jvm机运行，跟我们前面的也差不多）
//__________________________________________________________________________________________________________________________________________________________________________
//转义字符
// //											换行符P52
// public class study_1{
// 	public static void main(String[] args){
// 		\t ：一个制表位，实现对齐的功能
// 		System.out.println("北京\t天津\t上海");//固定宽度
// 		System.out.println("北京\n天津\n上海");//得到三行
// 		//System.out.println("C:\Users\李子煊\Desktop\编程\")//路径上有斜杆，前面还得加上去一个斜杆（第一个\是转义的意思，第二个才是输出）,window的地址就是这要，要不然前面加上一个r
// 		System.out.println("C:\\Users\\李子煊\\Desktop\\编程");
// 		System.out.println("老韩说：后面如果加上斜杆的话计算机，以两个斜杆一句话，就不知道我们后面说什么，所以使用的时候需要加上\"老韩说话\"");
// //		1.输出 韩顺平教育
// 		//2.\r表示回车，但是不换行，所以会将前面的字改掉，得到：北京平教育
// 		System.out.println("韩顺平教育\r 北京")//回车不会换行
// 		System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
// 	}
// }
// // \t ：一个制表位，实现对齐的功能
// // \n ：换行符
// // \\ ：一个\
// // \" :一个"
// // \' ：一个' \r :一个回车 System.out.println("韩顺平教育\r 北京")
//_____________________________________________________________________________________________________________________________________________________________________________________
// //									注释comment
// /*多行注释*/
// //文档注释，可以被JDK提供的javadoc所解析，生成一套以网页文件形式体现该程序的说明文档，一般写在类前面如下
// /**
// *@author 李子煊
// *@version 1.0
// */
// public class study_1{
//  	public static void main(String[] args){
//  	}
//  }
//  //接下来将怎么生成一个网页文件：javadoc -d 文件名 -xx -yy 文件名.java(使用javadoc将文件生成在文件名地址 -生成内容也就是我们上面的version等等，最后选择这些信息由哪一个.Java文件提供)
//  //1.在随便地方建立一个目录：C:\Users\李子煊\Desktop\编程\java\temp"temp意思 临时雇员，（尤指）临时秘书 vi. 打临时工，做临时工作，打零工
//  //代码为：javadoc -d C:\\Users\\李子煊\\Desktop\\编程\\java\\temp -author -version study_1.java
//  //文旦标签可以参考：javadoc标签
//————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
//											java代码规范（基础）P59
//1.类，和方法的注释，要以Javadoc方式来写
//2.多行注释，单行注释是给代码的维护者看的，也就是读者
//3.源文件使用utf-8,老师这边是因为配合控制台，实际项目就是保存为utf-8的
//——————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
// //											doc命令（标准P59,原本P26）
//  md d:\\temp//创建
//  rd d:\\temp//删除
//查看当前目录是有什么内容		1。dir		2.dirdird:\abc2\test200
//切换到其他盘下：盘符号cd:change directory  案例演示：切换到c盘:cd/D c:
//切换到上一级：案例演示：cd..
//切换到根目录：cd\案例演示：cd\
//————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
//												变量类型（原本30页）+33等于标准页
// public class study_1{
// 	public static void main(string[] args){
// 		//记录人的信息
// 		int age = 30;
// 		double score =88.9;
// 		char gender = '男';
// 		System.out.println(age);
// 	}
// }
// //字符（char）：用单引号（' '）表示，用于表示单个字符。例如：char gender = '男';
// //字符串（String）：用双引号（" "）表示，用于表示由多个字符组成的文本。例如：String name = "John";
//--------------------------------------------------------------------------------------
//变量的含义就是内存里面开辟一个空间，由电脑的变量指向（p30）
//举例子：int a=5 	#就是内存里面开辟一个int大小的空间，然后a为一个地址，空间里面放一个数字5.#如果这个时候再次赋值a=10;
//那么就是再次找到a地址对应的电脑内存位置将5改为10
//字节不一样空间大小也不一样
//int4个字节空间，double8个字节空间（个子高的空间占地大）
//-------------------------------------------------------------------------------------------------------------
//									数据类型表（p34）#图表需要看
//string在java中不是一个数据类型准确说是一个类（class）
//1. java 数据类型分为两大类 基本数据类型， 引用类型
// 2. 基本数据类型有 8 中 数值型 [byte , short , int , long , float ,double] char , boolean
// 3. 引用类型 [类， 接口， 数组]
//byte范围：-128————127（二级制决定）
//bit:是最小存储单位-----byte是基本存储单位（意思就是我们基本上使用byte）
//-----------------------------------------------------------------------------------------------------------------------------------
////									数据类型细节(p36)
////整数类型
//public class study_1{
//    public static void main(String[] args){
//        //java 的整型常量（具体值） 默认为 int 型， 声明 long 型常量须后加‘l’或‘L’
//        int n1=1;//默认int，所以这个1是int
//        //int n2=1L;//long的的精密度更大，不兼容，（不对的）
//        long n2=1L;
//        //-----------------------------------------------------------------
//        //浮点数使用陷阱: 2.7 和 8.1 / 3 比较
//        //看看一段代码
//        double num11 = 2.7;
//        double num12 = 2.7; //8.1 / 3; //2.7
//        System.out.println(num11);//2.7
//        System.out.println(num12);//接近 2.7 的一个小数， 而不是 2.7
//        //因为计算机比较笨，不知道小数后面还有没有所以导致结果的判断错误
//        //得到一个重要的使用点: 当我们对运算结果是小数的进行相等判断是， 要小心
//        //应该是以两个数的差值的绝对值， 在某个精度范围类判断
//        if( num11 == num12) {
//            System.out.println("num11 == num12 相等");
//        }
//
//        //正确的写法
//        //num11-num12差值的绝对值小于一个值
//        if(Math.abs(num11 - num12) < 0.000001 ) {
//            System.out.println("差值非常小， 到我的规定精度， 认为相等...");
//        }
//    };
////Java 的浮点型常量(具体值)默认为 double 型， 声明 float 型常量， 须后加‘f’或‘F'
//----------------------------------------------------------------------------------------------------
//上面的Math类，API（Application Programming Interface）文档里面提供java类的相关方法位置（韩顺平 2021零基础学Java 【软件 资料 代码 笔记】\资料\分享资料\分享资料\java API 文档）
//jav类的组织形式（P41）
//————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
//
