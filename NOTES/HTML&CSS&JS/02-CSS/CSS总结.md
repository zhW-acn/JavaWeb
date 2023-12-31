# CSS

Cascading Style Sheets

- 三种方式引入：   
    - 内联样式
    - 内部样式
    - 外部样式
       
假设三种引入方式都使用了，并且作用于同一个标签，以哪个为准<br>
三种引入方式都是使用的话，样式属性设置不一致；则都有效<br>
若设置的同一个属性值的话；<br>
内联式的优先级最高。内部样式和外部样式以代码的顺序；（后面会替换掉前面的内容）<br>

# 属性
~~~
字体颜色：color
字体大小：font-size
背景颜色：background-color
width:宽度
height:高度
text-align:center 水平居中
line-height: (height) 上下居中(=height)
~~~

# 标签的父子关系
  - css中关于宽高的确定不推荐直接写死；推荐使用百分比属性
  - 百分比属性是针对该标签的父标签而言的
  - 父子标签中关于样式的属性是可以继承的（不是绝对的，只是某些属性可以继承）
  - 假设父标签中设置了字体颜色，子标签中也设置字体颜色：以子标签设置的为准

# 常用选择器
1. 元素选择器
   - 根据标签名选中元素
   - 语法：标签名{}
   - eg: p{} h1{}
2. id选择器
   - 根据元素的id选中一个元素
   - 语法：#id属性值{}
   - eg: #box{} #button{}
3. 类选择器
   - 根据元素的class选中一组元素
   - 语法：.class属性值
   - eg: .abc{}
4. 通配选择器
   - 选中页面所有元素
   - 语法：*{}
   - *{margin: 0 auto; padding: 0;} 去除边距

**优先级：id > class > 元素**

# 复合选择器
1. 交集选择器
   - 选中同时具有：元素选择器+类选择器+...
   - 如果交集选择器中有元素选择器，元素选择器必须在开头
   - eg: div.red{}  div#s{}  .a.b.c{}  #a.b.c{}
2. 并集选择器
   - 选中包括其中之一的选择器
   - eg: div,red{}  div,#s{}  .a,.b,.c{}
3. 关系选择器
...

