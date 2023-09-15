// for 不用学
for (let i = 0; i < 5; i++) {
    console.log('我最喜欢枣子姐')
}

// for-in 循环迭代对象属性
var acn = {
    name: 'acane',
    age: 18,
    getacn: function () {return this}// 这也是个属性？？
}
console.log(acn.getacn())
for (let acnKey in acn) {
    console.log(acnKey)
}

// for-of
var nums = [1,2,2,34,56765,7,57,46];
/*
for (let numsKey in nums) { // 会报错num is not defined
    console.log(num)
}

 */
for (let num of nums) { // 数组型的迭代方式
    console.log(num)
}

// for-in 遍历key  for-of 遍历value。我是这样认为的


// while和do-while 不用学了

// break和continue 也不用学了

// 标签和break的应用。有汇编loop那味了
outer_block: {
    inner_block: {
        console.log('1');
        break outer_block;// 从inner_block和outer_block中跳出
        console.log(':-('); // 跳过
    }
    console.log('2'); // 跳过
}