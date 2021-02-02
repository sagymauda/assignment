package actions;

import java.util.List;
import java.util.Random;

public class ActionShuffle implements Action {
    @Override
    public List<Character> apply(List<Character> characters) {
        Random rand = new Random();
        for (int i = 0; i < characters.size(); i++) {
            int randomIndexToSwap = rand.nextInt(characters.size());
            Character temp = characters.get(randomIndexToSwap);
            characters.set(randomIndexToSwap, characters.get(i));
            characters.set(i, temp);
        }
        return characters;
    }

    @Override
    public String getName() {
        return   this.getClass().getName();
    }

}
