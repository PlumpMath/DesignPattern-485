package FilterPattern;

/**
 * Created by thushara.wijekoon on 2/12/2015.
 */

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
