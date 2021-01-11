package actions;
import java.util.Hashtable;

public class ActionList {

    public Hashtable<Enum, Action> getActionsList() {
        Hashtable<Enum, Action> actionsList = new Hashtable<>();
        actionsList.put(ActionName.SORT, new ActionSort());
        actionsList.put(ActionName.REVERSE, new ActionRevers());
        actionsList.put(ActionName.SHUFFLE, new ActionShuffle());
        return actionsList;
    }

}

