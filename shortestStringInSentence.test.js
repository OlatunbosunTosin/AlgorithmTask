const findShortestWord = require("./shortestStringInSentence.js")

test("test that length of Shortest word is returned", () =>{
    let sentence = "I am a girl";
    expect(findShortestWord(sentence)).toBe("I");
})

test("test that length of Shortest word is returned", () =>{
    let sentence = "We are Africans";
    expect(findShortestWord(sentence)).toBe("We");
})

test("test that length of Shortest word is returned", () =>{
    let sentence = "The world is wicked";
    expect(findShortestWord(sentence)).toBe("is");
})

test("test that length of Shortest word is returned", () =>{
    let sentence = ".. Horizon";
    expect(findShortestWord(sentence)).toBe("Horizon");
})

test("test that length of Shortest word is returned", () =>{
    let sentence = ".. Horizon ..";
    expect(findShortestWord(sentence)).toBe("Horizon");
})

