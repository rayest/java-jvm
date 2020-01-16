# JAVA-JVM
> 关于 JAVA 及 JAVA 虚拟机的基础

### JAVA 代理
* 静态代理：Name getter
* 动态代理：Rent
* cglib 代理：Worker

### JAVA 字节码
``` shell
1. 编写 Demo_01.java 示例
2. 编译：javac Demo_01.java --> Demo_01.class
3. 查看和编辑十六进制文件：vim -b Demo_01.class --> :%!xxd
4. 重新查看二进制文件：:%!xxd -r
5. 查看编译后的字节码文件：javap -verbose -p Demo_01.class
```

### List
* ArrayList
> 0. ArrayList 是动态数组。动态的机制是由动态扩容数组实现的
> 1. 底层通过数组实现。在 add 操作时才会初始化数组大小，默认为10.
> 2. add 操作时，如果 list 已满，则新建一个底层数组，其中 newCapacity = oldCapacity + oldCapacity / 2
> 3. 然后将原数组中的数据复制到新数组中，实现扩容
> 4. 删除时，将指定下表处后的元素复制向前一位，覆盖掉 index 出的元素
