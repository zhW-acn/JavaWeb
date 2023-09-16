// JavaScript中的字符串是原始数据类型，并且是不可变的，这意味着它们是不变的。

let msg1 = "Hello JS";   // 使用双引号
let msg2 = 'Hello JS';   // 使用单引号

let x = `该字符串使用反引号。`; // 模板常量

let ss = `sdsd\`s\`d` // 转义
console.log(ss)


// 字符串方法：所有字符串方法都返回一个新值。它们不会更改原始变量

// .length : Number - 返回字符串长度
// .concat(String) : String - 连接字符串
// .toUpperCase() : String - 转大写
// .toLowerCase() : String - 转小写
// .indexOf(String) : Number返回指定值在字符串中首次出现的索引
// .lastIndexOf(String) : Number返回指定值在字符串中最后出现的索引
// indexOf()与lastIndexOf()都接受第二个参数作为搜索的起始位置

// .search(String) : Number- 查找正则表达式和字符串之间的匹配项，找不到则将返回-1
// .split(String) : Array - 通过形参的方式切割字符串，返回字符串数组
// .trim() : String - 返回一个前后没有空格的字符串
// .replace(String, String) : String - 替换字符串，默认只替换第一个匹配的字符串
/* 提取部分字符串
slice(start, end)
substring(start, end)
substr(start, length)
 */
/* 访问字符串字符
charAt(index)
charCodeAt(index)
[]
 */

// ... 还有好多，不看了
// 使用template literal 占位符 ${}
let str1 = '我'
let str2 = '枣子姐'
let str3 = `${str1}永远喜欢${str2}`
console.log(str3)


