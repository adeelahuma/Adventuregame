package adventure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author adeelahuma
 */

public class AdventureGameGrammer implements Grammer
{
    /**
     *  Grammer is stored as a Hashmap
     *      key = actionId
     *      value = GameAction
     * */
    Map<String, GameAction> grammer = new HashMap<String, GameAction>();

    @Override
    public GameAction getGameAction(String actionId)
    {
        GameAction gameAction = null;

        if(actionId != null && grammer != null && !grammer.isEmpty())
        {
            gameAction = grammer.get(actionId);
        }

        return gameAction;
    }

    @Override
    public List<String> getPatterns(String actionId)
    {
        List<String> patterns = null;

        if(actionId != null && grammer != null && !grammer.isEmpty())
        {
            GameAction gameAction = grammer.get(actionId);

            if(gameAction != null )
            {
                patterns = gameAction.getPatterns();
            }
        }

        return patterns;
    }


    @Override
    public void addAction(GameAction gameAction)
    {

        if(gameAction != null && gameAction.getId() != null)
        {
            grammer.put(gameAction.getId(), gameAction);
        }

    }
}
