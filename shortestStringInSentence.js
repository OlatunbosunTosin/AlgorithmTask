function findShortestWord(sentence) {
    let sentenceArray = sentence.split(" ");
    let minLength = Number.MAX_VALUE;
    let leastLength = "";
    let regex = /[A-Za-z]+/;
    for (let index = 0; index < sentenceArray.length; index++){
        if(regex.test(sentenceArray[index]) && sentenceArray[index].length < minLength){
            minLength = sentenceArray[index].length;
            leastLength = sentenceArray[index];
        }
    }return leastLength;
    
}

module.exports = findShortestWord;