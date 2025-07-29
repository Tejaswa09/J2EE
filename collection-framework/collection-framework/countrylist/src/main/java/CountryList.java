import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountryList {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<String>();

        countries.add("India");
        countries.add("Pakistan");
        countries.add("China");
        countries.add("Bangladesh");
        countries.add("Sri Lanka");
        countries.add("Iraq");
        countries.add("Indonesia");
        countries.add("USA");
        countries.add("Syria");
        countries.add("Russia");
        countries.add("Germany");
        countries.add("Bhuthan");
        countries.add("Genuiva");
        countries.add("Malayalam");

//        System.out.println("withoout single optimized code");
//        Stream<String> stream = countries.stream();
//        Predicate<String> predicate = St -> {
//            return St.startsWith("I");
//        } ;
//
//        Consumer<String> consumer = value -> {
//          System.out.println(value);
//        };
//
//        stream.filter(predicate).forEach(consumer);
//
//

//        Iterator<String> itr = countries.iterator();
//
//        while (itr.hasNext()){
//            String s = itr.next();
//            itr.remove();
//        }                                                 if we use the Iterator , it will manipulate on original Collection, it will effect to the original list

//        System.out.println(countries);
//

        System.out.println("ALl the countries");
        countries.stream().forEach(System.out::println);
        System.out.println();

        System.out.println("with single optimized code");
        countries.stream().filter(country -> country.startsWith("I")).forEach(System.out::println);
        System.out.println();

        System.out.println("COuntries starting with G");
        countries.stream().filter(country -> country.startsWith("G")).forEach(System.out::println);
        System.out.println();

        System.out.println("Countries end with a");
        System.out.println(countries.stream().collect(Collectors.groupingBy(country -> country.endsWith("a"))));
        System.out.println();

        System.out.println("countries in ascending order");
        countries.stream().sorted().forEach(System.out::println);
        System.out.println();

        System.out.println("Countries in descending order");
        countries.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(System.out::println);
        System.out.println();

        System.out.println("Countries in descending order by another approach");
        System.out.println(countries.stream().sorted((o1, o2) -> Integer.compare(o2.length(), o1.length())).collect(Collectors.toList()));
        System.out.println();

        System.out.println("Coubtries with more than 6 character");
        countries.stream().filter(country -> country.length() >= 6).forEach(System.out::println);
        System.out.println();

        System.out.println("countries with less than 4 characters");
        countries.stream().filter(country -> country.length() <= 4).forEach(System.out::println);
        System.out.println();

        System.out.println("COuntries contains O");
        countries.stream().filter(country -> country.contains("o")).forEach(System.out::println);
        System.out.println();

        System.out.println("Countries having the character occurance more than once");
//        countries.stream().filter(country -> country.);

        System.out.println("All countries with reverse the name");
        System.out.println(countries.stream().map(country -> new StringBuilder(country).reverse()).collect(Collectors.toList()));

        System.out.println("Checking pallindrome");
        System.out.println(countries.stream().filter(country -> country.equalsIgnoreCase(new StringBuilder(country).reverse().toString())).collect(Collectors.toList()));
        System.out.println();
        
        System.out.println("Country with len");
        countries.stream().forEach(country -> System.out.println(country + "-" + country.length()));

    }
}
