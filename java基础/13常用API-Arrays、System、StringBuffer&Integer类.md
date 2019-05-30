# 常用类

## 1、数组操作(理解)
	查找
		--普通查找:数组无序
		--二分查找(折半查找):数组有序

	代码：
		public static int getIndex(int[] arr,int value)
		{
			int maxIndex = arr.length-1;
			int minIndex = 0;
			int midIndex = (maxIndex+minIndex)/2;

			while(arr[midIndex]!=value)
			{
				if(arr[midIndex]>value)
				{
					maxIndex = midIndex - 1;
				}
				else if(arr[midIndex]<value)
				{
					minIndex = midIndex + 1;
				}

				if(minIndex > maxIndex)
				{
					return -1;
				}

				midIndex = (maxIndex+minIndex)/2;
			}

			return midIndex;
		}

## 2、Arrays工具类的使用(掌握)
	(1)Arrays是针对数组操作的工具类。
	(2)成员方法：
		public static String toString(数组):把数组变成字符串。
		public static void sort(数组):对数组进行排序。
		public static int binarySearch(int[] arr,int value):二分查找

## 3、System的方法(掌握)
	(1)系统类，提供了静态的变量和方法供我们使用。
	(2)成员方法：
		public static void exit(int value):退出jvm，非0表示异常退出。
		public static long currentTimeMillis():返回当前系统时间的毫秒值。
			和1970 年 1 月 1 日午夜之间的时间差

## 4、StringBuffer(掌握)
	(1)字符个数可以发生改变的字符串类。字符串缓冲区类。
	(2)构造方法：
		A:StringBuffer()
		B:StringBuffer(int capacity)
		C:StringBuffer(String str)
	(3)成员方法：(自己补齐)
		A:添加功能

		B:删除功能
		
		C:替换功能
		
		D:截取功能
		
		E:反转功能
	(4)案例：
		字符串反转。

## 5、基本类型包装类(掌握)
	(1)基本类型的数据我们只能使用值，不能做更多的操作。为了方便我们操作，
	   java就把每种基本类型进行了包装。提供方法供我们使用。
	(2)基本类型和包装类的对应关系
		byte
		short
		int		Integer
		long 
		float
		double
		char		Character
		boolean	
	(3)Integer构造方法
		A:Integer i = new Integer(int num);
		B:Integer i = new Integer(String s);
			注意：s必须是一个由数字字符组成的字符串。
	(4)String和int类型的转换
		A:String -- int
			Integer:
				public static int parseInt(String s)
		B:int -- String
			Integer:
				public static String toString(int i)
			String:
				public static String valueOf(int i)
	(5)JDK5以后的新特性
		A:自动装箱	基本类型--引用类型
		B:自动拆箱	引用类型--基本类型

		举例：
			Integer i = 100;
			i += 200;
	(6)面试题：byte常量池
	(7)案例：
		把字符串中的数字字符排序。
		需求："23 98 16 38 42"
		结果："16 23 38 42 98"