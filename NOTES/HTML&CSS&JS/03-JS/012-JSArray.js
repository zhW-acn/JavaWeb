// 数组是对象
// 创建数组
 let arr = ['1','2','3'];
 let arr2 = new Array('1','2','3')

// 索引从0开始，如果访问不存在的索引将返回undefined
// .length返回


/* 添加元素
let arr = ['1','2','3'];
arr[5] = '4' // 如果跳过索引，这时索引3，4为空

通过push()，该方法将一个元素添加到数组的末尾

 */

/* 修改元素
通过使用赋值运算符分配新值，我们可以覆盖数组中的任何值
 */

// 遍历
for (let i = 0; i < arr.length; i++) {
    console.log(arr[i]);
}

for (let i of arr){
    console.log(i);
}

arr.forEach(function (i){
    console.log(i);
})

// 判断是否是数组
Array.isArray(arr);


// Array方法

arr.toString() // 转为字符串
arr.push() // 向后追加元素
arr.pop() // 弹出最后元素
arr.splice(1,0,'') // 从索引值为1的位置删除0个元素，并添加''，（没有items就不添加）
// 返回被删除元素的数组。注意，这个方法改变了原数组

var arr3 = arr.concat(arr2);// 合并两个或更多个数组在一起以形成一个新的数组
console.log(arr);
console.log(arr2);
console.log(arr3);

var arr4 = arr3.slice(0,1);// 从0开始切割，直到切割到1。如果只有0，切割到数组尾部
console.log(arr4);

arr3.indexOf(0) // 通过索引查找元素

arr3.fill(0,0,2) // [0,2)将数组元素全部置为0。若只有一个参数0，全部置为0

arr3.reverse() // 反转

arr3.sort() // 排序
// sort()只会检查数字的首位，并进行排序
var nums = [5, 1, 2, 17, 13, 6, 34];
nums.sort();
// 使用比较函数
nums.sort(function(a, b) {return a - b});
