var fruits = ["Apple", "Mango", "Banana", "Orange"];
fruits.forEach(function(element,index) {
    console.log(index + ": " + element);
});

// map()
// 新数组中的元素为原始数组元素调用函数处理后的值，并按照原始数组元素顺序依次处理元素
var nums1 = [1, 5, 20, 14, 55, 16];
var nums2 = nums1.map(twice); // 返回一个新数组
function twice(element) {
    return (element * 2);
}
console.log(nums1);
console.log(nums2);

// filter() 过滤
// filter会把传入的函数依次作用于每个元素，然后根据返回值是 true 还是false决定保留还是丢弃该元素
var age = [1, 30, 39, 29, 10, 13];
var val = age.filter(isAdult);
function isAdult(element) {
    return element >= 18;
}

// reduce()方法接收一个函数作为累加器，数组中的每个值（从左到右）开始缩减，最终计算为一个值
var nums = [10, 20, 30, 40, 50];
var sum = nums.reduce(getTotal);
function getTotal(x, y) {
    return (x + y);
}

// find()方法返回通过给定检测的数组中的第一个值。
var num = [1, 30, 39, 29, 10, 13];
var val = num.find(myFunc);
function myFunc(element) {
    return element >= 18;
}