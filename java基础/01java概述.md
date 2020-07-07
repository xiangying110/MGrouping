#java基础概述

## 1. Java语言概述(了解)
	(1)Java语言的发展史
		Java之父 -- 詹姆斯·高斯林（James Gosling）
	(2)Java语言的平台
		A:J2SE 基础版,桌面应用。
		B:J2ME 微型版,手机开发。(android,ios)
		C:J2EE 企业版,所有浏览器访问的应用程序。

		注意：JDK5以后改名
			JavaSE,JavaME,JavaEE

		J2SE是学习其他两门的基础。
	(3)Java语言的特点
		其他的很多特点...

		开源：源代码开放
		跨平台：在任意操作系统下都可以使用。
	(4)跨平台(理解)
		通过火星人和中国，德国人的交流知道的原理，找一个翻译。
		而java语言的这个翻译是jvm。

		注意：java语言是跨平台的，jvm不是跨平台的。
	(5)JRE和JDK(掌握)
		JRE: JVM + class library	运行环境
		JDK: JRE + tools		开发工具包

		一句话：有JDK开发的软件，必须在JRE上运行，并由JVM保证跨平台。
## 2. HelloWorld案例(掌握)
	(1)开发工具(了解)
		A:记事本windows自带的
		B:高级记事本EditPlus
		C:集成开发工具Eclipse/MyEclipse
	(2)一个HelloWorld案例
		最终代码：
			class Demo
			{
				public static void main(String[] args)
				{
					System.out.println("Hello World");
				}
			}

		解释：
			A:java语言的最基本单位是类。用class表示
				定义类的格式：
					class 类名
			B:程序如果要运行，就必须有main方法，它是被jvm调用。
				格式：
					public static void main(String[] args)
			C:程序如果要输出一些内容，就必须使用输出语句。
				格式：
					System.out.println("Hello World");
	(3)一个Java程序的执行。
		A:开发源程序(.java文件)
			Demo.java
		B:通过javac命令编译(.class)
			javac Demo.java     cmd里使用
		C:通过java命令执行
			java Demo    cmd里使用
	(4)常见的错误及注意事项
		A:文件扩展名导致编译失败。把隐藏文件扩展名给显示出来。
			win7,win8的同学如果不会单独问我。
		B:非法字符错误
			只要看到是非法字符，肯定是中英文问题。
			因为我们要求所有的符号全部是英文状态的。
		C:注意大小写问题
			class -- Class
			String -- string
			System -- system
		D:括号的对应问题
			在java程序中，括号都是成对出现的。
			所以，我建议在编写程序时，请遇到括号，成对打。
		E:main方法格式错误	
			public static void main(String [] args){ }
		F:当java源文件发生变化后，请重写编译在运行
		G:缩进问题
			写代码，遇到{}，请缩进一个tab位置。
## 3. 环境变量(理解)
	(1)path环境变量的作用
		让javac和java命令可以在任意的目录下使用。
	(2)path环境变量的配置(掌握)
		A:只修改path
			D:\develop\Java\jdk1.7.0_45\bin;以前的path
		B:先建立一个JAVA_HOME,后修改path
			新建：JAVA_HOME 值是 D:\develop\Java\jdk1.7.0_45
			修改：%JAVA_HOME%\bin;以前的path

		推荐使用B方案。
	(3)classpath环境变量的配置
		让指定的class文件在任意目录都可以被访问。

		技巧：在最左边配置一个.;
		      这样做的好处就是能够先在当前目录下查找并执行。
    (4)path和classpath的区别
		path是为了让exe文件可以在任意目录下运行
		classpath是为了让class文件可以在任意目录下运行