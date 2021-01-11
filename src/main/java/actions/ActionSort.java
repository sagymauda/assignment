package actions;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActionSort implements Action {

    @Override
    public List<Character> apply(List<Character> characters) {
        int j = 0;
        char temp = 0;
        for (int i = 0; i < characters.size(); i++) {
            for (j = 0; j < characters.size(); j++) {
                if (characters.get(j) > characters.get(i)) {
                    temp = characters.get(i);
                    characters.set(i,characters.get(j));
                    characters.set(j,temp);
                }
            }
        }
        for (Character c :
                characters) {
            System.out.println(c);
        }
        return characters;
    }

}
