// 算术运算符：+ - * / % ++ --
// ** 求幂：a**b，a的b次方

// 赋值运算符：= += -= *= **= /= %=

// 比较运算符：== ！= > < >= <=
// ===：相同，[a.equals(b) && a instanceof b] -> true
// !==：不同，![a.equals(b) && a instanceof b] -> true

// 按位运算符：& | ~ ^ << >> >>>

// 逻辑运算符：&& || !

// 字符串运算符：使用+拼接，还可以用+=追加

// 条件（三元）运算符：? :

// 一元运算符：
// delete：删除对象，对象的属性或数组中指定索引处的元素
// 如果可以执行操作，则delete运算符返回true；否则，返回false。 如果无法执行操作，则返回false。
var fruits = ["Apple", "Mango", "Banana"];
delete fruits[0];   // delete "Apple",return true
delete fruits[0];   // 什么都不会删除，索引为0的位置还存在，该属性为undefined
console.log(fruits) // [ <1 empty item>, 'Mango', 'Banana' ]

// typeof：返回变量或表达式的类型
// 值得注意的是：null，array为object类型
console.log(typeof "" + "\n" +
    typeof "Json" + "\n" +
    typeof "42" + "\n" +
    typeof 42 + "\n" +
    typeof true + "\n" +
    typeof false + "\n" +
    typeof undefined + "\n" +
    typeof null + "\n" +
    typeof {name: "Json", age: 22} + "\n" +
    typeof [2, 4, 6, 8] + "\n" +
    typeof function myFunc() {
    }
)

// void：指定要求值的表达式而不返回值
// 创建一个超文本链接，当用户单击该链接时，它不会执行任何操作。
// <a href="javascript:void(0)">Click here to do nothing</a>

// 关系运算符
// in：如果指定的属性在指定的对象中，则返回true
var user = {firstName: "acn", age: "22", color: "blue"};
console.log(
    ("firstName" in user) + "\n" +  //  true
    ("age" in user) + "\n" +//  true
    ("Food" in user)  //  false
)
// instanceof

//////////运算符优先级

