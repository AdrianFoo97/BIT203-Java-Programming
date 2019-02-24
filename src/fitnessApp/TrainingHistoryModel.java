package fitnessApp;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.table.AbstractTableModel;

/**
 * This is a table model used for the training history table
 * @author Adrian Foo
 */
public class TrainingHistoryModel extends AbstractTableModel{
    private static final String[] colHeader = {
        "Session No", "Title", "Date", "Time", "Training Type"
    }; 
    private ArrayList<TrainingSession> session;
    
    public TrainingHistoryModel(ArrayList<TrainingSession> session){
        setTrainingSession(session);
    }
    
    public void setTrainingSession(ArrayList<TrainingSession> session){
        this.session = session;
    }
    
    @Override
    public int getRowCount() {
        return session.size();
    }

    @Override
    public int getColumnCount() {
        return colHeader.length; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TrainingSession theSession = (TrainingSession)session.get(rowIndex);
        switch(columnIndex){
            case 0: 
                return theSession.getSessionID();
            case 1: 
                return theSession.getTitle();
            case 2: 
                return theSession.getDate();
            case 3: 
                return theSession.getTime();
            case 4: 
                if (theSession instanceof PersonalTraining){
                    return "Personal Training";
                }
                else if (theSession instanceof GroupTraining){
                    return ((GroupTraining) theSession).getClassType();
                }
            default: 
                return "";
        }
    }
    
    public String getColumnName(int column){
        return colHeader[column];
    }
    
    public TrainingSession getSessionAt(int index){
        TrainingSession theSession = (TrainingSession)session.get(index);
        return theSession;
    }
    
    public ArrayList sortByDate(ArrayList<TrainingSession> sessionList){
        ArrayList<TrainingSession> sortedList = new ArrayList<>(sessionList);
        Collections.sort(sortedList);
        return sortedList;
    }
    
    public ArrayList sortByType(ArrayList<TrainingSession> sessionList){
        ArrayList<TrainingSession> sortedList = new ArrayList<>(sessionList);
        Collections.sort(sortedList, new TrainingTypeComparator());
        return sortedList;
    }
    
}
