//Reverse Words in a Sentence
function reverseWords(sentence) {
    // Splitting the sentence into words
    const words = sentence.split(' ');

    // Reverse each word in the array
    const reversedWords = words.map(word => reverseWord(word));

    // Join the reversed words to form the final sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    // Convert the word to an array of characters, reverse, and join back to a string
    return word.split('').reverse().join('');
}

