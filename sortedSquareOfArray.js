function sortSquareArray(numbers){
    squaredArray = [];
    for (let index = 0; index < numbers.length; index++){
        squaredArray[index] = numbers[index] * numbers[index];
    }
    sortArray(squaredArray);
    return squaredArray;
}


function sortArray(numbers) {
    for (let index = 0; index < numbers.length-1; index++){
        for (let indexes = index+1; indexes < numbers.length; indexes++){
            if(numbers[index] > numbers[indexes]){
                let temp = numbers[index];
                numbers[index] = numbers[indexes];
                numbers[indexes] = temp;
            }
        }
    }
    return numbers;
}
module.exports = sortSquareArray;
