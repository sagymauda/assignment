package actions;

import java.util.ArrayList;
import java.util.List;

public class ActionRevers implements Action {
    @Override
    public  List<Character> apply(List<Character> characters) {
        List<Character> newList = new ArrayList<>();
        for (int i = characters.size() - 1; i >= 0; i--) {
            newList.add(characters.get(i));
        }
        return newList;
    }

    @Override
    public String getName() {
      return   this.getClass().getName();
    }
}
