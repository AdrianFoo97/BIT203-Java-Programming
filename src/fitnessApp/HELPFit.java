package fitnessApp;

import java.io.Serializable;
import java.util.*;
import java.time.*;

/**
 * HELPFit is the controller that has a collection of User objects and a
 * collection of TrainingSessions
 *
 * @author ngsm
 */
public class HELPFit implements Serializable{

    private ArrayList<User> hfUsers;
    private ArrayList<TrainingSession> hfSessions;

    /**
     * Constructor, sets up the list of users and sessions
     */
    public HELPFit() {
        hfUsers = new ArrayList<>();
        hfSessions = new ArrayList<>();

    }

    /**
     * A method to add a new member to HEPFit
     *
     * @param username
     * @param password
     * @param fullName
     * @param email
     * @param level
     * @return null if username already exists or cannot add
     */
    public Member addMember(String username, String password, String fullName, String email, MemberLevel level) {
        Member newM = new Member(username, password, fullName, email, level);
        if (hfUsers.contains(newM)) {
            return null;
        }
        if (hfUsers.add(newM)) {
            return newM;
        }
        return null;

    }

    /**
     * A method to add a trainer
     *
     * @param username
     * @param password
     * @param fullName
     * @param email
     * @return null if username already exists
     */
    public Trainer addTrainer(String username, String password, String fullName, String email, String specialty) {
        Trainer newT = new Trainer(username, password, fullName, email, specialty);
        if (hfUsers.contains(newT)) {
            return null;
        }
        if (hfUsers.add(newT)) {
            return newT;
        }
        return null;

    }

    /**
     * A method to add a session to HELPFIT
     *
     * @param theSession
     * @return true if the session is added successfully
     */
    public boolean addTrainingSession(TrainingSession theSession) {
        return (hfSessions.add(theSession));
    }

    /**
     * A method to check if a username already exists
     *
     * @param username
     * @return
     */
    public User findUser(String username) {
        for (User u : hfUsers) {
            if (u.getUsername().equalsIgnoreCase(username)) {
                return u;
            }
        }
        return null;

    }

    /**
     * A method to find a session in HELPFit
     * @param sessionID
     * @return the session that matches the ID
     */
     public TrainingSession findSession(String sessionID)
    {
        for (TrainingSession s:hfSessions)
        {
            if (s.getSessionID().equals(sessionID))
                return s;
            }
        return null;
    }
    /**
     * A method to show all training sessions that are upcoming and
     * available
     * @return String showing all upcoming sessions
     */
    public String showUpcomingTrainingSessions() {
        boolean found = false;
        String trainList = "List of upcoming training sessions";
        trainList += "\n ID \tTitle \t  Type  \t  Trainer  \tRating\tDate\tTime";
        trainList += "\n----\t------\t--------\t-----------\t------\t----\t----";
        for (TrainingSession t : hfSessions) {
            if (!t.getDate().isBefore(LocalDate.now()) && t.getStatus() == SessionStatus.AVAILABLE) {
                found = true;
                Trainer trainer = t.getTrainer();
                String rating = "none";
                String type = "Personal";
                if (t instanceof GroupTraining)
                    type = ((GroupTraining) t).getClassType().toString();
                if (trainer.getAverageRating() > 0) {
                    rating = trainer.getAverageRating() + "";
                }
                trainList += '\n'+t.getSessionID() + '\t'+ t.getTitle() 
                        +'\t' + type + '\t' + trainer.getFullName()
                        + '\t' + rating + '\t' + t.getDate() + '\t' + t.getTime();

            }
        }
        if (found)
            return trainList;
        else 
            return "No upcoming available training";
    }

    public ArrayList<TrainingSession> getHfSessions() {
        return hfSessions;
    }
    
    /**
     * This method will return a list of available sessions which are 
     * stored within HELPFit controller.
     * @return An array list of available sessions.
     */
    public ArrayList<TrainingSession> getAvailableHfSession(){
        ArrayList<TrainingSession> sessionList = new ArrayList<>();
        for(TrainingSession ts: hfSessions){
            if(ts.getStatus().equals(SessionStatus.AVAILABLE)){
                sessionList.add(ts);
            }
        }
        return sessionList;
    }
    
    public void updateSequences() {
        Collections.sort(hfSessions, new IDComparator());
        int lastIndex = hfSessions.size() - 1;
        String sessionIDLast = hfSessions.get(lastIndex).
                getSessionID();
        int nextNo = Integer.parseInt(sessionIDLast.substring(1));
        if (lastIndex >= 0) {
            TrainingSession.setIDnum(nextNo + 1);
        }
        else {
            TrainingSession.setIDnum(100);
        }
    }
    
}
