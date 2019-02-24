package fitnessApp;

import java.util.Comparator;

/**
 * This is a comparator by comparing the session id of the
 * training session
 * @author Adrian Foo
 */
public class IDComparator implements Comparator<TrainingSession> {

    @Override
    public int compare(TrainingSession lhs, TrainingSession rhs) {
        if (lhs == rhs){
            return 0;
        }
        return (lhs.getSessionID().compareTo(rhs.getSessionID()));
    }
    
}
