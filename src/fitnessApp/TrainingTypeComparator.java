package fitnessApp;

import java.util.Comparator;

/**
 * This is a comparator to compare the training history by 
 * using the type of training history
 * @author foo
 */
public class TrainingTypeComparator implements Comparator<TrainingSession>{
    public int compare(TrainingSession lhs, TrainingSession rhs){
        if (lhs.getClass().equals(rhs.getClass()) && lhs instanceof GroupTraining){
            int result = ((GroupTraining)lhs).getClassType().compareTo(((GroupTraining)rhs).getClassType());
            
            if (result != 0){
                return result;
            }
            return (lhs.getDate().compareTo(rhs.getDate()));
        }
        else if (lhs.getClass().equals(rhs.getClass()) && lhs instanceof PersonalTraining) {
            return (lhs.getDate().compareTo(rhs.getDate()));
        }
        else if (lhs instanceof PersonalTraining) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
