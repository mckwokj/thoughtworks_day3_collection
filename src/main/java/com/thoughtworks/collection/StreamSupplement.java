package com.thoughtworks.collection;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSupplement {

    public StreamSupplement() {
    }

    public List<Integer> sortFromMaxToMin(List<Integer> numbers) {
        return null;
    }

    public double getAverage(List<Integer> numbers) {
        int total = numbers.stream()
                .reduce(0, (sum, number) -> sum + number);

        return total * 1.0 / numbers.size();
    }

    public int getMaxValue(List<Integer> numbers) {
        return numbers.stream()
                .reduce(numbers.get(0), (max, number) -> number > max ? number : max);
    }

}
