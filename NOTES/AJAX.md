# AJAX
是浏览器提供的API，通过JS调用。

```js
// 1.创建一个XHR对象，相当于打开了一个浏览器
var xhr = new XMLHttpRequest();
// 2.打开一个与网址之间的连接-
xhr.open('GET', 'URL');
// 3.通过连接发送一次请求
xhr.send(null);
// 4.指定xhr状态变化事件处理函数E
xhr.onreadystatechange = function () { 
    
    // 通过xhr的 reqdyState 判断此次请求的响应是否接收完成
    if(this.readyState === 4){
        // 获取响应体
        console.log(this.responseText)
    }
}
```