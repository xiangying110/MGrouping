# 集合-Collection&List接口
## 1、集合(理解)
	(1)java是一种面向对象语言，如果我们要针对多个对象进行操作，就必须对多个对象进行存储。
	   而对多个元素进行存储，前面我们学习过数组，数组的弊端，长度固定。这样，数组将不能
	   满足变化的要求。所以，java就提供了集合供我们使用。
	(2)集合的特点：
		1、长度可以发生改变
		2、只能存储对象
		3、可以存储多种类型对象(一般存储的还是同一种)
	(3)集合和数组的区别
		1、长度问题
			数组固定
			集合可变
		2、存储元素问题
			数组可以是基本类型，也可以是引用类型。
			集合只能是引用类型。
		3、是否同一类型
			数组元素类型一致。
			集合元素类型可以不一致。
	(4)集合体系的由来
		集合是存储多个元素的容器，但是，由于数据结构不同，java就提供了多种集合类。
		而这多种集合类有共性的功能，所以，通过不断的向上抽取，最终形成了集合体系
		结构。

		数据结构：数据存储的方式。

		程序 = 算法 + 数据结构

		Collection
			|--List
				|--ArrayList
				|--Vector
				|--LinkedList
			|--Set
				|--HashSet
				|--TreeSet
	(5)如何学习和使用一个继承体系呢?
		学习顶层：因为顶层定义的是共性内容。
		使用底层：因为底层才是具体的实现。

## 2、Collection的功能(掌握)
	(1)Collection的功能(自己补齐中文意思)
		1、添加功能(掌握)
			boolean add(Object obj):向集合中添加一个元素。
			boolean addAll(Collection c):向集合中添加一个集合的元素。
		2、删除功能(掌握)
			void clear():删除集合中所有的元素。
			boolean remove(Object obj):删除集合中指定的元素。
			boolean removeAll(Collection c):删除集合中指定的集合元素。
		3、判断功能(掌握)
			boolean isEmpty():判断集合是否为空。
			boolean contains(Object obj):判断集合是否包含指定的元素。
			boolean containsAll(Collection c):判断集合是否包含指定的集合中的元素。
		4、遍历功能(掌握)
			Iterator iterator():迭代器。
				hasNext（）:判断是否还有元素
				next():获取下一个元素
		5、长度功能(掌握)
			int size():获得集合的元素个数。
		6、交集功能
			boolean retainAll(Collection c):判断集合中是否有相同的元素。
		7、转换功能
			Object[] toArray():把集合变成数组。
	(2)迭代器的使用
		1、使用步骤
			1、通过集合对象获取迭代器对象。
			2、通过迭代器对象判断。
			3、通过迭代器对象获取。
		2、迭代器原理
			由于多种集合的数据结构不同，所以存储方式不同，所以，取出方式也不同。
			这个时候，我们就把判断和获取功能定义在了一个接口中，将来，遍历哪种
			集合的时候，只要该集合内部实现这个接口即可。
		3、迭代器源码
			public interface Iterator
			{
				public abstract boolean hasNext();
				public abstract Object next();
			}

			public interface Collection
			{
				public abstract Iterator iterator();
			}

			public interface List extends Collection
			{
				...
			}
			
			public class ArrayList implements List
			{
				public Iterator iterator()
				{
					return new Itr();
				}

				private class Itr implements Iterator
				{
					public boolean hasNext(){...}
					public Object next(){...}
				}
			}
	(3)集合的常见使用步骤：
		1、创建集合对象
		2、创建元素对象
		3、把元素添加到集合中
		4、遍历集合
			1、通过集合对象获取迭代器对象。
			2、通过迭代器对象判断。
			3、通过迭代器对象获取。
	(4)Collection存储字符串和自定义对象并遍历。
		1、存储字符串
			Collection c = new ArrayList();

			//String s = "hello";
			//c.add(s);
			c.add("hello");
			c.add("world");
			c.add("java");

			Iterator it = c.iterator();
			while(it.hasNext())
			{
				String s = (String)it.next();
				System.out.println(s);
			}


		2、存储自定义对象(自己补齐)
                            Collection c=new ArrayList();
                            Student s1=new Student("林青霞",26);           
                            c.add("s1");
                      
                            Iterator it=c.iterator();
                            while(it.hasNext()）
                              {
                                String s=(String)it.next();
                                System.out.println(s);
                              }

## 3、List的特有功能(掌握)
	

	(1)List的特有功能(自己补齐)
		1、添加功能
			void add(int index,Object obj): 
		2、删除功能
			Object remove(int index): 
		3、修改功能
			Object set(int index,Object obj): 
		4、获取功能
			Object get(int index): 
			int indexOf(Object obj): 
			ListIterator listIterator():
	(2)List的遍历方式
		1、Iterator迭代器
		2、ListIterator迭代器(了解)
		3、普通for+get()
	(3)ListIterator迭代器
		是Iterator的子接口。
		 
	(4)面试题：并发修改异常
		1、并发修改异常的产生原因
			用迭代器遍历集合，用集合去操作集合。
		2、解决方案：
			1、使用集合操作。
			2、使用列表迭代器操作。
	(5)List集合存储字符串和自定义对象并遍历。(自己补齐)
		1、存储字符串

		2、存储自定义对象

	(6)List特点：
		1. 有序(存储和取出的顺序一致)
		2. 可以重复
		3. 可以通过索引值操作对应位置的元素