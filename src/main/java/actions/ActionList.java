package actions;
import java.util.Hashtable;

public class ActionList {

    public Hashtable<String, Action> getActionsList() {
        Hashtable<String, Action> actionsList = new Hashtable<>();
        actionsList.put(new ActionSort().getName(), new ActionSort());
        actionsList.put(new ActionRevers().getName(), new ActionRevers());
        actionsList.put(new ActionShuffle().getName(), new ActionShuffle());
        return actionsList;
    }

}

