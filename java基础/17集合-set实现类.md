# 集合-set实现类

## 1、Set(掌握)
	(1)Set的特点：
		元素无序,唯一。
	注意：这里的顺序是指存储和取出顺序。

## 2、HashSet(掌握)
	(1)HashSet：不保证元素的迭代顺序。并且，不保证该顺序恒久不变。
	(2)怎么保证的呢?
		HashSet底层数据结构是哈希表。
		它依赖两个方法：hashCode()和equals()
		顺序：
			首先，判断hashCode()值是否相同。
				相同：
					继续走equals()方法，根据其返回值：
						true：说明元素重复，不添加到集合。
						false：说明元素不重复，添加到集合。
				不同：直接添加到集合。
	(3)怎么重写hashCode()和equals()方法呢?(忘了吧)
		hashCode():
			把对象的所有成员变量值相加即可。
			如果是基本类型，就加值。如果是引用类型，就加哈希值。
		equals():
			A:this==obj
			B:!(obj instanceof Student)
			C:所有成员变量的值比较。基本类型用==,引用类型用equals()。

		如果不会，自动生成。
	(4)案例：(掌握)
		HashSet存储字符串并遍历
		HashSet存储自定义对象并遍历
			针对自定义对象：
				需求：如果对象的成员都相同，我们就认为是同一个元素。

## 3、TreeSet(理解)
	(1)TreeSet：根据构造方法的不用，选择使用自然排序或者比较器排序。
	            按照实际的需求，可以对元素进行排序。并且保证唯一。
	(2)怎么保证的呢?
		排序：底层结构是二叉树。按照树节点进行存储和取出。
			两种实现：
				A:自然排序(元素具备比较性)
					TreeSet的无参构造，要求对象所属的类实现Comparable接口。			
				B:比较器排序(集合具备比较性)
					TreeSet的带参构造，要求构造方法接收一个实现了Comparator接口的对象。
		唯一：根据返回值是否为0。
		
		注意：
			如果同时有两种方案，以谁为主呢?以比较器为主。
	(3)案例：(理解)
		TreeSet存储字符串并遍历
		TreeSet存储Integer并遍历
		TreeSet存储自定义对象并遍历

## 4、Collection体现的集合总结
	Collection
		|--List
			|--ArrayList
				底层数据结构是数组，查询快，增删慢
				线程不安全，效率高。
			|--LinkedList
				底层数据结构是链表，查询慢，增删快
				线程不安全，效率高。
			|--Vector
				底层数据结构是数组，查询快，增删慢
				线程安全，效率低。
		|--Set 唯一
			|--HashSet
				底层数据结构是哈希表。
				如何保证元素唯一性呢?
				依赖两个方法。hashCode()和equals()。
				以后都自动生成。
			|--TreeSet
				底层数据结构是二叉树。
				如何保证元素唯一性呢?如何保证元素排序呢?	
				根据返回值是否是0，判断元素是否重复。
				排序有两种方案：
					元素具备比较性 实现Comparable接口
					集合具备比较性 实现Comparator接口

## 5、在集合中的数据结构问题
	ArrayXxx:底层数据结构是数组。查询快，增删慢。
	LinkedXxx:底层数据结构是链表。查询慢，增删快。
	HashXxx:底层数据结构是哈希表。跟两个有关。hashCode()和equals()
	TreeXxx:底层数据结构是二叉树。两种排序方式。Comparable接口和Comparator接口

## 6、什么时候，使用哪种Collection集合。
	元素唯一吗?
		唯一：
			Set
				需要排序吗?
					需要：TreeSet
					不需要：HashSet

			不知道，用HashSet。
		不唯一：
			List
				需要安全码?
					需要：Vector
					不需要：ArrayList和LinkedList
						查询多：ArrayList
						增删多；LinkedList
			不知道，用ArrayList。

## 7、Collections(理解)
	(1)Collections是针对Collection集合操作的工具类。
	(2)面试题：
		Collection和Collections的区别?
	(3)功能：
		排序
		查找
		反转
		最值
		随机置换
