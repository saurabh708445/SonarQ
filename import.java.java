import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CaseInsensitiveSorting {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rohan", "amit", "POOJA", "aMiT", "RohaN");

        // Sorting in case-insensitive order using Comparator
        List<String> sortedNames = names.stream()
            .sorted(String.CASE_INSENSITIVE_ORDER)
            .collect(Collectors.toList());

        System.out.println("Names sorted in case-insensitive order: " + sortedNames);
    }
}