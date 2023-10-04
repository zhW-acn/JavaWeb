# 三大域对象

| 对象名称        | 对象类型               |
|-------------|--------------------|
| request     | HttpServletRequest |
| session     | HttpSession        |
| application | ServletContext     |


1. request
    - 生命周期：
        - 创建：客户端向服务器发送一次请求,服务器就会创建request对象 
        - 销毁：服务器对这次请求作出响应后就会销毁request对象 
        - 有效：仅在当前请求中有效
        - 作用：可以在请求转发中传递数据

2. session 
    - 生命周期： 
        - 创建：服务器端第一次调用getSession()；(保存在服务器内存中)
        - 销毁： 
            - 非正常关闭服务器(正常关闭session会序列化，再次启动服务器session会被反序列化)。 
            - session过期了默认30分钟。 
            - 手动调用session.invalidate()。
            - 注意：关闭浏览器再次访问会找不到session的会话id而不是session被销毁了。
        - 有效：用户打开浏览器会话开始，直到关闭浏览器会话才会结束。一次会话期间只会创建一个session对象。 
        - 作用：最典型的就是用户登录状态保存的。

3. application 
    - 生命周期： 
        - 创建：服务器启动的时候,服务器为每个WEB应用创建一个属于该web项目的对象ServletContext类。 
        - 销毁：服务器关闭或者项目从服务器中移除的时候。 
        - 有效：此信息在整个服务器上被保留


# 域对象的区别：
- request: 每一次请求都是一个新的request对象,如果在web组件之间需要共享同一个请求中的数据,只能使用请求转发。
- session: 每一次会话都是一个新的session对象,如果在一次会话中的多个请求之间需要共享数据,只能使用session。
- application: 应用对象,Tomcat启动到关闭,表示一个应用,在一个应用中有且只有一个application对象,作用于整个Web应用,可以实现多次会话之间的数据共享.
# 共同点：

1. 设置作用域中的共享数据（保存数据）
    
    作用域对象.setAttribute(String name,Object value);

2. 获取作用域中的共享数据（获取数据）

    Object value=作用域对象.getAttribute(String name);

3. 删除作用域中的指定的共享数据（删除数据）
    
    作用域对象.removeAttribute(String name);