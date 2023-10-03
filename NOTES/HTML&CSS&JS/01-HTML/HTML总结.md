# HTML

**Hyper Text Markup Language**

1. 块元素
* 独占一行，总是从新的一行开始；
* 行高以及外边距和内边距都可控制；
* 如果没有设置宽度，那么它的宽度是容器的100%；
* 自身可以容纳其他块元素和内联元素。
```html
<div>块级容器</div>
<p>段落</p>
<form>交互表单</form>
<h1>大标题h1~h6</h1>
<table>
    <tr>
        <td>第一行第一列</td>
        <td>第一行第二列</td>
    </tr>
    <tr>
        <td>第二行第一列</td>
        <td>第二行第二列</td>
    </tr>
</table>
<hr>分割线
<ul>无序列表
    <li>第一项</li>
</ul>
<ol>有序列表
    <li>第一项</li>
</ol>
```

2. 内联元素
* 内联元素特点：不会换行，会和其他内联元素共处同一行；
* 行高及外边距和内边距是不可改变的；
* 元素的宽度就是它自身内容如文字或图片的宽度，也不可改变的；
* 内联元素只能容纳文本或者其他内联元素，通常被包括在块元素中使用。
```html
<a>链接</a>
<span>内联容器</span>
<img>图片
<input>输入框
<select name="" id="">项目选择
    <option value=""></option>
</select>
<strong>粗体</strong>
<textarea name="" id="" cols="30" rows="10">多行文本输入框</textarea>
。。。
```
3. 空标签
```html
<br> ： 换行
<hr> ：分隔线
<input> ：文本框
<img> ：图片
<meta> ：元信息
<link> ：指定了外部资源与当前文档的关系
```