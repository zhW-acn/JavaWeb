// JS是弱语言，变量与值没有关联性

// JS基本类型：字符串（String）、数字(Number)、布尔(Boolean)、对空（Null）、未定义（Undefined）、Symbol。
/*
String 单引号和双引号之间没有区别，在字符串内可以嵌套引号，只要彼此不匹配即可，或使用 \ 转义
    需要注意的是，字符串+数字输出："acn"+1   ->  "acn1"
                             1+1+"acn" ->  "2acn"
Number 没有整数和浮点数的指定，带小数或不带都是该类型
Boolean true、false
Null 空
Undefined 无定义
 */
// 引用数据类型：对象(Object)、数组(Array)、函数(Function)。
/*
Object 类似结构体，是属性的集合，每个属性以键值对形式出现--var user = {firstName:"acane", age:22, color:"blue", location:"unknown"};
Array 多个值的集合，这些值可以是不同属性--var arr = [1, 'a', true];
 */