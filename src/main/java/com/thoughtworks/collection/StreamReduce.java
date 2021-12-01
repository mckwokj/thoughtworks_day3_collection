package com.thoughtworks.collection;

import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (odd, number) -> number % 2 != 0 ? number : odd);
    }

    public String getLongest(List<String> words) {
        return words.stream()
                .reduce(words.get(0), (largestWord, word) -> word.length() > largestWord.length() ? word : largestWord);
    }

    public int getTotalLength(List<String> words) {
        return words.stream()
                .reduce("", (prevWords, word) -> prevWords + word)
                .length();
    }
}
