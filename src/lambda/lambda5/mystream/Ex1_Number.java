package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;

public class Ex1_Number {
    static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        System.out.println(direct(numbers));

        List<Integer> mapped = lambda(numbers);
        System.out.println(mapped);
    }

    public static List<Integer> direct(List<Integer> numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer n : numbers) {
            if(n % 2 == 0) {
                result.add(n * 2);
            }
        }
        return result;
    }

    private static List<Integer> lambda(List<Integer> numbers) {
        List<Integer> filtered = GenericFilter.filter(numbers, i -> i % 2 == 0);
        List<Integer> mapped = GenericMapper.map(filtered,i -> i * 2);
        return mapped;
    }
}
