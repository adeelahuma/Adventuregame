package adventure;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
	    Grammer grammer = new AdventureGameGrammer();

        /**
         *  Insert Game Action
         * */
        GameAction insertAction = new GameAction();
        insertAction.setId("insert");

        List<String> insertPattern = new ArrayList<String>();

        insertPattern.add("put {object} in {object}");
        insertPattern.add("put {object} into {object}");

        insertAction.setPatterns(insertPattern);

        /**
         *  Put_On Game Action
         * */
        GameAction putOnTopAction = new GameAction();
        putOnTopAction.setId("put_on_top");

        List<String> putOnPatterns = new ArrayList<String>();
        putOnPatterns.add("put {object} on {object}");
        putOnTopAction.setPatterns(putOnPatterns);


        /**
         *  Add both actions to grammer
         * */
        grammer.addAction(insertAction);
        grammer.addAction(putOnTopAction);


        GameAction insertAction_1 = grammer.getGameAction("insert");


        //TODO:Assert insertAction & insertAction_1 are same objects


        List<String> insertPattern_1 = grammer.getPatterns("insert");

        //TODO:Assert insertPattern & insertPattern_1 are same objects


    }
}
