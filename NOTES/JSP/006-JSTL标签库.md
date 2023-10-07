~~众所周知~~，由于Tomcat10使用的是JakartaEE9的标准，Servlet的标准包不再由Apache支持维护，转交给Jakarta管理，对应的最新JSTL只能在[Jakarta.ee](https://jakarta.ee/zh/specifications/tags/2.0/)官网下载。


就在刚才我成功使用tomcat9旧版本的JSTL，解决了由于版本不一致的问题。

[下载Impl和Spec](https://tomcat.apache.org/download-taglibs.cgi?Preferred=https%3A%2F%2Fdlcdn.apache.org%2F)，导入到lib。

# 删除编译文件夹！！妈的

我下了tomcat10和jakarta的2.0.0jar包。发现依然可以运行。

