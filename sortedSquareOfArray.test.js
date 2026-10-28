const sortSquareArray = require("./sortedSquareOfArray.js")

test("test that array of four numbers returns squared array", () =>{
    let numbers = [3,8,6,2];
    let expected = [4,9,36,64];
    expect(sortSquareArray(numbers)).toEqual(expected);
})

test("test that array of five numbers returns squared array", () =>{
    let numbers = [10,3,8,6,2];
    let expected = [4,9,36,64,100];
    expect(sortSquareArray(numbers)).toEqual(expected);
})


test("test that array of ten numbers returns squared array", () =>{
    let numbers = [10,7,8,1,2,4,5,3,9,6];
    let expected = [1,4,9,16,25,36,49,64,81,100];
    expect(sortSquareArray(numbers)).toEqual(expected);
})

