# String类

## 1. String类(掌握)
	(1)字符串：多个字符组成的一串数据。
	(2)构造方法：
		A:String s = new String();
		B:String s = new String(byte[] bys);
		C:String s = new String(byte[] bys,int index,int length);
		D:String s = new String(char[] chs);
		E:String s = new String(char[] chs,int index,int length);
		F:String s = new String(String str);
		G:String s = "hello";
	(3)字符串的特点及面试题
		A:字符串一旦被赋值，就不能改变。
			注意：字符串的值不能改变，没有说引用变量不能改变。
		B:面试题：
			a:String s = new String("hello")和String s = "hello"的区别。
			b:请写出结果:
				String s1 = new String("hello");
				String s2 = new String("hello");
				System.out.println(s1==s2);
				System.out.println(s1.equals(s2));

				String s3 = new String("hello");
				String s4 = "hello";
				System.out.println(s3==s4);
				System.out.println(s3.equals(s4));

				String s5 = "hello";
				String s6 = "hello";
				System.out.println(s5==s6);
				System.out.println(s5.equals(s6));
	(4)成员方法(补齐方法意思)
		A:判断功能
			boolean equals(Object obj)
			boolean equalsIgnoreCase(String str)
			boolean contains(String str)
			boolean startsWith(String str)
			boolean endsWith(String str)
			boolean isEmpty()
		B:获取功能
			int length()
			char charAt(int index)
			int indexOf(int ch)
			int indexOf(String str)
			int indexOf(int ch,int fromIndex)
			int indexOf(String str,int fromIndex)
			String substring(int start)
			String substring(int start,int end)
		C:转换功能
			byte[] getBytes()
			char[] toCharArray()
			static String copyValueOf(char[] chs)
			static String valueOf(char[] chs)
			static String valueOf(int i)
			String toLowerCase()
			String toUpperCase()
			String concat(String str)

		D:其他功能
			a:替换功能
				String replace(char oldChar,char newChar)
				String replace(String oldString,String newString)

			b:切割功能
				String[] split(String regex)
			
			c:去除两端空格功能
				String trim()
			
			d:字典顺序比较功能
				int compareTo(String str)
				int compareToIgnoreCase(String str) 
	(5)案例：(理解--明天写一遍)
		A:模拟用户登录
		B:字符串遍历
		C:统计字符串中大写，小写，数字字符出现的次数
		D:把字符串的首字母大写，其他小写
		E:大串中截取小串

