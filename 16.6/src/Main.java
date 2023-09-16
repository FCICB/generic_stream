import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] cars = {"vw","VW","buggati","passat","cc","cC","bmw","bMw"};
        List<String> list1 = new LinkedList<>();
        for (int i=0;i< cars.length;i++)
        {
            cars[i]=cars[i].toLowerCase(Locale.ROOT);
        }
        for(String car:cars)
            list1.add(car);


        List<String> listofcars = Arrays.asList(cars);
        printNonDuplicates(listofcars);
        printNumOfDuplicates(list1);
//        System.out.printf("%nsize of array %d , of list %d: ",cars.length,list1.size());

    }
    private static void printNonDuplicates(Collection<String> values)
    {
    
     System.out.printf("%nNonduplicates are: ");
     Set<String> set = new HashSet<>(values);
     for (String value : set)
            System.out.printf("%s ", value);
        System.out.println();
     }


    private static void printNumOfDuplicates(Collection<String> values)
    {
        Set<String> set = new HashSet<>(values);
        System.out.printf("num of duplicate words = %d",values.size()-set.size());
    }
 }

