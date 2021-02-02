package actions;

import java.util.List;

public interface Action {

      List<Character> apply (List<Character> characters);

      String getName();
}
