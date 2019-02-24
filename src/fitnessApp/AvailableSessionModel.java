
package fitnessApp;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 * This is a table model used for displaying available training
 * session table
 * @author Adrian Foo
 */
public class AvailableSessionModel extends AbstractTableModel{
    private static final String[] colHeader = {
        "Session ID", "Title", "Date", "Time", "Fee", "Training Type", 
        "Trainer", "Specialty", "Average Rating"
    };
    private ArrayList<TrainingSession> sessionList;

    public AvailableSessionModel(ArrayList<TrainingSession> sessionList) {
        setSessionList(sessionList);
    }

    public TrainingSession getTrainingSessionAt(int index){
        TrainingSession theSession = (TrainingSession)sessionList.get(index);
        return theSession;
    }
    
    public void setSessionList(ArrayList<TrainingSession> sessionList){
        this.sessionList = sessionList;
    }
    
    @Override
    public int getRowCount() {
        return sessionList.size();
    }

    @Override
    public int getColumnCount() {
        return colHeader.length;
    }
    
    public String getColumnName(int column){
        return colHeader[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TrainingSession theSession = (TrainingSession)sessionList.get(rowIndex);
        Trainer theTrainer = theSession.getTrainer();
        switch(columnIndex){
            case 0:
                return theSession.getSessionID();
            case 1: 
                return theSession.getTitle();
            case 2: 
                return theSession.getDate().toString();
            case 3: 
                return theSession.getTime().toString();
            case 4: 
                return theSession.getFee();
            case 5: 
                if(theSession instanceof GroupTraining){
                    return ((GroupTraining) theSession).getClassType();
                }
                else if(theSession instanceof PersonalTraining){
                    return "Personal Training";
                }
            case 6: 
                return theTrainer.getFullName();
            case 7: 
                return theTrainer.getSpecialty();
            case 8: 
                return theTrainer.getAverageRating();
            default: 
                return "";
        }
    }
    
}
