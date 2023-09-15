// JavaScript语句由以下各项组成：值，运算符，表达式，关键字和注释。

/*
    声明变量：var 任意类型变量（函数级变量）
            let 局部变量（块级变量）
            const 只读常量（不可变常量）
            for in ：
                var myObj = {
                    name: "Seagull",
                    age:22,
                    height: 175,
                    city: "New Delhi",
                        getNothing: function () {return "";}
                  };

                 for (let x in myObj) {
                        document.write(x);
                  }

            for of：
                 let iterable = [10, 20, 30, 40, 50];
                 for (let x of iterable) {
                     document.write(x);
                  }
 */

/*
    变量域问题
 */

var x = 1;
var y = 2;
{
    var x = "hello";
    let y = "world";
    console.log("内部" + x + y);
}
console.log("外部" + x + y);