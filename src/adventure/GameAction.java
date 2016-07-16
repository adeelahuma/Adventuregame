package adventure;

import java.util.List;

/**
 * @author adeelahuma
 */

public class GameAction
{
    private String id;
    List<String> patterns;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getPatterns() {
        return patterns;
    }

    public void setPatterns(List<String> patterns) {
        this.patterns = patterns;
    }
}
