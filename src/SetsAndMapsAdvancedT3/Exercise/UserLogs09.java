package SetsAndMapsAdvancedT3.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogs09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String IPv4 = "(?:[0-9]{1,3}\\.){3}[0-9]{1,3}";
        String IPv6 = "([A-Z*a-z*0-9]*):(?<zeroes>[0-9]*):([A-Z*a-z0-9]*):([A-Z*a-z0-9]*):([A-Z*a-z0-9]*):([A-Z*a-z0-9]*):([A-Z*a-z0-9]*):([A-Z*a-z0-9]*)";

        Map<String, Map<String, Integer>> allTogether = new TreeMap<>();

        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String user = input.split("user=")[1];
            String ip = "";
            Pattern pattern = Pattern.compile(IPv4);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                ip = matcher.group();
            }
            pattern = Pattern.compile(IPv6);
            matcher = pattern.matcher(input);
            while (matcher.find()) {
                ip = matcher.group();
            }

            allTogether.putIfAbsent(user, new LinkedHashMap<>());
            allTogether.get(user).putIfAbsent(ip, 0);
            allTogether.get(user).put(ip, allTogether.get(user).get(ip) + 1);

            input = scanner.nextLine();
        }
        allTogether.forEach((key, value) -> {
            System.out.println(key + ":");
            List<String> print = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : value.entrySet()) {
                print.add(entry.getKey() + " => " + entry.getValue());
            }
            System.out.print(String.join(", ", print));
            if (print.size() > 0) {
                System.out.println(".");
            }
        });
    }
}
//destroyer:
//192.23.30.40 => 2, 192.23.30.41 => 1, 192.23.30.42 => 1.
