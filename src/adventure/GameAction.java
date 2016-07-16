package adventure;

import java.util.List;

/**
 * @author adeelahuma
 */

public class GameAction
{
    private String id;
    private List<String> patterns;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameAction that = (GameAction) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (patterns != null ? !patterns.equals(that.patterns) : that.patterns != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (patterns != null ? patterns.hashCode() : 0);
        return result;
    }
}
