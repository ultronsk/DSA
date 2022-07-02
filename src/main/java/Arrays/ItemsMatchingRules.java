package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ItemsMatchingRules {
    public static void main(String[] args) {
        String[] structure = {"type", "color", "name"};
        String[][] items = {{"phone","blue","pixel"},{"computer","silver","phone"},{"phone","gold","iphone"}};
        String ruleKey = "type";
        String ruleValue = "phone";
        int ruleKeyValue=-1;
        int count=0;
        for (int i = 0; i < structure.length; i++) {
            if(structure[i].equals(ruleKey)){
                ruleKeyValue=i;
            }
        }

        for (int i = 0; i < items.length; i++) {
                if(items[i][ruleKeyValue].equals(ruleValue)){
                    count++;
            }
        }
        System.out.println("Total Count is "+count);
    }
}
