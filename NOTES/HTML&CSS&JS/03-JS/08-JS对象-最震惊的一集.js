// 如何定义对象
/*
    1.user = new Object()
    2.user = Object()
    3.user = {}
    4.function user = {}
*/

// 定义属性
user = {
    name: 'acn',
    age: 18
};// 使用键值对定义对象的属性，用逗号隔开
// 访问对象属性
console.log(user.name); // 使用 .
console.log(user["age"]); // 使用[]
// 感觉.更好，idea有提示。更易读

// 定义方法
user1 = {
    name: 'acane',
    age: 18,

    getName: function () {
        return this.name;  // this就不解释了
    }
};
// 访问对象方法
console.log(user1.getName());// 如果不带括号，将返回函数定义


// 你他妈甚至可以在定义之后再加属性和方法
console.log(user1)
user1.play = '玩原神玩的'
user1.start = function (){console.log('原神启动')}
console.log(user1)


// 如何通过new获得对象
function user2(name,sex,age){ // function不是方法吗？？？！！构造方法也是方法！！！我悟了
    this.name = name;             //初始化对象的属性
    this.sex = sex;
    this.age = age;
}
var i = new user2(1,1,1);
console.log(i);