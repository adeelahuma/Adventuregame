package adventure;

import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author adeelahuma
 */
public class AdventureGameGrammerTest
{

    Grammer grammer = new AdventureGameGrammer();

    /**
     *  convenience get action methods for testing
     * */

    private GameAction getInsertGameAction()
    {
        /**
         *  Insert Game Action
         * */
        GameAction insertAction = new GameAction();
        insertAction.setId("insert");

        List<String> insertPattern = new ArrayList<String>();

        insertPattern.add("put {object} in {object}");
        insertPattern.add("put {object} into {object}");

        insertAction.setPatterns(insertPattern);

        return insertAction;
    }


    private GameAction getPutOnGameAction()
    {

        /**
         *  Put_On Game Action
         * */
        GameAction putOnTopAction = new GameAction();
        putOnTopAction.setId("put_on_top");

        List<String> putOnPatterns = new ArrayList<String>();
        putOnPatterns.add("put {object} on {object}");
        putOnTopAction.setPatterns(putOnPatterns);

        return putOnTopAction;
    }

    private GameAction getOpenGameAction()
    {

        /**
         *  Open Game Action
         * */
        GameAction openAction = new GameAction();
        openAction.setId("open");

        List<String> openPatterns = new ArrayList<String>();
        openPatterns.add("open {object}");

        openAction.setPatterns(openPatterns);

        return openAction;
    }

    @Test
    public void addGameAction()
    {

        Assert.assertTrue("Insert Action added", grammer.addAction(getInsertGameAction()));

    }

    @Test
    public void getGameAction()
    {
        GameAction putGA = getPutOnGameAction();

        Assert.assertTrue("Put-on-top Action added",grammer.addAction(putGA));

        GameAction putGA_1 = grammer.getGameAction(putGA.getId());

        Assert.assertNotNull(putGA_1);
        Assert.assertEquals("Inserted and Retreived Object are same", putGA, putGA_1);
    }

    @Test
    public void getPatterns()
    {
        GameAction open = grammer.getGameAction("open");

        Assert.assertNull("Should be Null because action not inserted in grammer yet", open);

        List<String> openAction = grammer.getPatterns("open");

        Assert.assertNull("Should be Null because action not inserted in grammer yet", openAction);

        open = getOpenGameAction();

        //add action to grammer
        grammer.addAction(open);

        Assert.assertNotNull("Should Not Null because action inserted in grammer ", grammer.getGameAction("open"));
        Assert.assertNotNull("Should Not Null because action  inserted in grammer ", grammer.getPatterns("open"));
        Assert.assertNotNull("Action Patterns Not Null", grammer.getPatterns("open"));

    }

}
