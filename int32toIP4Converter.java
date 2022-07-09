import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*public class Main {
    public static void main(String[] args) {
        Boolean[] array1 = {true, null};
        System.out.println(countSheeps(array1));
    }
*/
    public class int32toIP4Converter {
    public static String longToIP(long ip) {
        String added=String.format("%32s",Long.toBinaryString(ip)).replace(' ', '0');
        String[] chunks = added.split("(?<=\\G.{" + 8 + "})");
        for (int i=0;i!=chunks.length;i++) {
            chunks[i] = Long.toString(Long.parseLong(chunks[i], 2));
        }
        return String.format("%s.%s.%s.%s",chunks[0],chunks[1],chunks[2],chunks[3]); // do it!
    }
    }

