package adventure;

import java.util.List;

/**
 * @author adeelahuma
 */
public interface Grammer
{
    /**
     *  get GameAction by actionId
     *  @param actionId
     *  @return GameAction
     * */
    public GameAction getGameAction(String actionId);

    /**
     * Get Patterns for an action by actionId
     * @param  actionId
     * @return List<String> - List of patterns associated with an actionId
     *         For example: 1. put {object} in {object}
                            2. put {object} on {object}
     *
     *
     * */
    public List<String> getPatterns(String actionId);

    /**
     *  Add gameAction to Grammer
     *  @param gameAction object
     *  @return boolean - true- if action is added in grammer
     *                    false - if action is not added in grammer
     * */
    public boolean addAction(GameAction gameAction);

}
