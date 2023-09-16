/*
JavaScript中的数字被认为是准确的，最多15位数字。
第16位后四舍五入
 */
// 如果字符串包含数字值，可以参与运算
console.log(1 / '0.5'); // 2
console.log(1 / '万元申万的'); // NaN

// 无穷
var x = 5 / 0;   // 将返回无穷
var y = -5 / 0;  // 将返回负无穷
// ±Infinity是一个数字
console.log(typeof Infinity);

// 基数
/*
    0x:16   0x10-16
    0b:2    0b10-2
    0o:8     0o10-8
 */
console.log(0x10);
console.log(0b10);
console.log(0o10);

// 使用toString返回指定基数的值
var num = 1024
console.log(num.toString(2));
console.log(num.toString(8));
console.log(num.toString(16));

// 返回以指数表示的数字字符串
num.toExponential(2)

// 格式化数字，四舍五入或用0填充
num.toFixed(2)

// 返回数字值（不管是Object还是Number，String）
num.valueOf()

// 将变量转换为数字
/*Number() - 将给定的参数转换为数字
parseInt() - 解析一个字符串,并返回一个整数
parseFloat() - 解析一个字符串,并返回一个浮点数
 */
