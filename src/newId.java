import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class newId {
    public static void main(String[] args) {
    String new_id = "abcdefghijklmn.p";

        new_id = new_id.toLowerCase();
        System.out.println(new_id);

        new_id = new_id.replaceAll("[^a-z0-9\\-_\\.]", "");
        System.out.println(new_id);

        new_id = new_id.replaceAll("\\.+", ".");
        System.out.println(new_id);

        new_id = new_id.replaceAll("^\\.", "");

        if(new_id == null || new_id.isEmpty()) {
            new_id = "a";
        } else {
            new_id = new_id.replaceAll("\\.$", "");
        }
        System.out.println(new_id);

        if(new_id.length() >= 16){
            new_id = new_id.substring(0, 15).replaceAll("\\.$", "");

        }
        System.out.println(new_id);

        while (true) {
            if(new_id.length() >= 3){
                break;
            } else {
                new_id = new_id + new_id.substring(new_id.length()-1, new_id.length());
            }
        }
        System.out.println(new_id);

    }
}
