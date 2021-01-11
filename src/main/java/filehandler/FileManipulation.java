package filehandler;

import actions.*;
import java.util.List;

public class FileManipulation {
    public void manipulate(String fileFrom, String fileTo, ActionName actionName) throws Exception {
        ActionList actionList = new ActionList();
        Action action = null;

        if(fileFrom== null){
            throw  new Exception("need to enter file location for: copy from");
        }
        if(fileTo==null){
            throw  new Exception("need to enter file location for: copy to");
        }
        //read from the file
        List<Character> charactersList = FileHandler.readFromFileUrl(fileFrom);


        //see if Enum is in keys list
        if (actionList.getActionsList().containsKey(actionName)) {
            action = actionList.getActionsList().get(actionName);
        } else {
            try {
                throw new Exception("No Such Action Available");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        assert action != null;
       charactersList = action.apply(charactersList);

        //write to file
        FileHandler.writeToFileUrl(fileTo, charactersList);
    }


}
