# Cookie
- cookie是记录在浏览器端的一个字符串，大小不能超过4kB
- 添加Cookie
   resp.addCookie()  

cookie除了key-value之外，还有一些字段用来控制cookie的行为：

1. setMaxAge(int)
   - 为此cookie超时时间。若设置其值为一个时间，那么当到达此时间后，此cookie失效。不设置的话默认值是Session，当浏览器关闭(不是标签页)后，此cookie失效。
   - 如果是正数单位是秒，如果是负数代表关闭浏览器失效，如果设置成零也就是将cookie失效。

2. setSecure(boolean)
   - 设置是否只能通过https来传递此条cookie，缺省为使用HTTP。
   - 把cookie设置为secure，只保证cookie与WEB服务器之间的数据传输过程加密，而保存在本地的cookie文件并不加密。如果想让本地cookie也加密，得自己加密数据。

3. setHttpOnly(boolean)
   - 若此属性为true，则只有在http请求头中会带有此cookie的信息，而不能通过document.cookie来访问此cookie。（防止js脚本XSS攻击）

4. setDomain(String)
   - 域，指定关联的WEB服务器或域。

5. setPath(String)
   - path字段为可以访问此cookie的页面路径。指定与cookie关联的WEB页。


# Session
- session是保存在服务器端的一个对象

1. 获取session
   - req.getSession(boolean),缺省为true
   - true: 获取不到就创建；false: 获取不到返回null
2. 添加数据
   - setAttribute(String, String)
3. 配置会话时间（web.xml）
   ```xml
   <session-config>
      <session-timeout>10</session-timeout>// 10分钟，缺省30分钟
   </session-config>
   ```


# Cookie和Session的异同
* cookie配合session可以实现状态的保存
* session没有cookie也可以工作
* 存储位置不同：Cookie是存储在客户端（浏览器）中的，而Session是存储在服务器端的内存或者硬盘中的。
* 存储方式不同：Cookie是以文本文件的形式存储在客户端的硬盘中，而Session是以对象的形式存储在服务器端的内存或者硬盘中。
* 存储内容不同：Cookie主要用于存储少量的用户数据，如用户ID、用户名等，而Session主要用于存储用户的状态信息，如登录状态、购物车信息等。
* 生命周期不同：Cookie可以设置过期时间，可以在浏览器关闭后仍然存在，而Session的生命周期与用户会话相关，当用户关闭浏览器或者超过一定时间没有活动时，Session就会过期并被销毁。
* 安全性不同：Cookie的数据可以被用户查看和修改，因此不适合存储敏感信息，而Session的数据存储在服务器端，用户无法直接访问和修改，因此更加安全。
