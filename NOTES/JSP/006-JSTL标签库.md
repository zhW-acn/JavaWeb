~~众所周知~~
，由于Tomcat10使用的是JakartaEE9的标准，Servlet的标准包不再由Apache支持维护，转交给Jakarta管理，对应的最新JSTL只能在[Jakarta.ee](https://jakarta.ee/zh/specifications/tags/2.0/)
官网下载。

就在刚才我成功使用tomcat9旧版本的JSTL，解决了由于版本不一致的问题。

[下载Impl和Spec](https://tomcat.apache.org/download-taglibs.cgi?Preferred=https%3A%2F%2Fdlcdn.apache.org%2F)，导入到lib。

# 删除编译文件夹！！妈的

我下了tomcat10和jakarta的2.0.0jar包。发现依然可以运行。

<hr>

1. c:set：定义变量【设置域对象中的共享数据】

   `<c:set scope="page" var="name" value="page"/>`
   第一个指定var的域，第二个是变量关键字，第三个是变量的值

   如何使用变量：使用`${域对象别名.关键字}`如果该域没有找到对应变量，就向更大的域寻找

   相当于request.setAttribute("name","page");

2. 判断
    1. c:if
        ```
       <c:if test="true">
            test为真就显示
       </c:if>
       ```
    2. c:choose
        ```
        <c:choose>
        <c:when test="${age2 eq 18}">
        刚成年
        </c:when>
        <c:when test="${age2 gt 18}">
        已成年
        </c:when>
        <c:otherwise>
            未成年
        </c:otherwise>
        </c:choose>
       ```
       对比一下switch-case：choose=switch。case=when。default=otherwise
3. c:foreach 循环
    ```
    <c:forEach var="i" begin="0" end="10" step="2">
    ${i}<br>
    </c:forEach>
   ```
   局部变量var，从0开始到10结束，每次步进2【这玩意可以是负数吧。。大概。。懒得试了】
