# 集合-Map

## 1、Map(掌握)
	(1)Map是一个键值对形式的集合。它的元素都是有键和值组成。

	(2)Map和Collection的区别?(面试题)
		A:Map 是由键值对组成的集合,Map的键(key)是唯一的,值(value)可以重复。
		B:Collection 是有单列数据组成的集合,它的儿子List是可以重复的，Set是唯一的。

	(3)HashMap和Hashtable的区别?(面试题)
		HashMap:线程不安全，效率高。允许null键和值。
		Hashtable:线程安全，效率低。不允许null键和值。

	(4)Map的功能：(自己补齐)
		A:添加功能
                   
		B:判断功能
	    
		C:删除功能
		
		D:获取功能
	
		E:长度功能

	(5)Map的两种遍历方式(思路补齐)
		A:丈夫找妻子(掌握)
             a:把所有丈夫给集合起来。Set<K> ketSet()
		     b:遍历丈夫集合，获取到每一个丈夫。增强for , 迭代器
		     c:让丈夫去找妻子。get（Object key）

		B:根据结婚证找丈夫和妻子(理解，别人写你能看懂即可)
             a：获取所有结婚证的集合。Set<> entrySet()
		     b:遍历结婚证集合，获取到每一个结婚证对象。迭代器，增强for
		     c:通过结婚证对象获取丈夫和妻子getKey()和getValue()


## 2、HashMap(掌握)
	(1)HashMap存储字符串并遍历
		键：String
		值：String
	(2)HashMap存储自定义对象并遍历
		键：String
		值：Student

	(3)HashMap存储自定义对象并遍历
		键：Student(重写hashCode和equals方法,自动生成)
		值：String
		需求：如果对象的成员变量值都相同，我们则认为是同一个对象。

## 3、TreeMap(理解)
	(1)TreeMap存储字符串并遍历
		键：String
		值：String
	(2)TreeMap存储自定义对象并遍历
		键：String
		值：Student

	(3)TreeMap(传入一个比较器comparator)存储自定义对象并遍历
		键：Student
		值：String
		需求：如果对象的成员变量值都相同，我们则认为是同一个对象。
		      同时，我们还要按照年龄排序。

## 4、案例(理解)
	(1)统计字符串中每个字符出现的次数。

	(2)HashMap嵌套HashMap的使用。

	(3)HashMap嵌套ArrayList的使用。(掌握)
