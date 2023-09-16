// 如何定义函数
// function [函数名](形参列表){ // 函数体 };
// 爽点是不用预先定义返回值，不愧是弱语言
function print(){
    console.log("哦哈哟学妹");
}
print();

// 函数表达式
var i = function (num){return num*num;};
console.log(i("13")); // 离不离谱