导入：1. 本地库 2. 网上镜像
<hr>
如何使用

```js
<script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js"/>
<p id="p">p标签</p>
var p1 = document.getElementById("p")
var p2 = $(#p)
```

---

选择器

$("*") 选取所有元素

$("ul li") 后代选择器

$("p:first") 选取第一个p标签

$("p:eq(x)") 选取第x-1个p标签

$("[href]") 选取带有href属性的元素；$("a[href]") 选取a标签中带有href属性的元素

$("p, #demo") 组合选择器

---

常用方法(单参获取，双参设置)

1. 属性
    `attr()`
2. 样式
    `css()`
3. 事件
    `bind()`。button的bind('click',function(){}).不用onclick
4. 动画
    `animate()`

---
innertext和innerhtml对应的是text()和html()
只有单参和无参


.remove()
.append()
.replace()
.hide()
.show()
.toggle()【相当于hide和show】