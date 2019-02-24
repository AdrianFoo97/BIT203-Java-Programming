package fitnessApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;

/**
 * This is a class to handle save file and load file
 * @author Adrian Foo
 */
public class FileHandling {
    /**
     * A method to select a file using filechooser
     * @param parent The JFrame that is the parent class of this dialog
     * @return 
     */
    private static File openFileChooser(javax.swing.JFrame parent){
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(parent);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            return file;
        }
        return null;
    }
    /**
     * A method that returns an object from a file
     * @param parent JFrame that calls this method
     * @return Object
     */
    public static Object readFromFile(javax.swing.JFrame parent) {
        File file = openFileChooser(parent);
        Object theObject = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            theObject = ois.readObject();
            ois.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (fis != null){
                try {
                    fis.close();
                }
                catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            return theObject;
        }
    }
    /**
     * A method to save an Object into a File
     * @param parent the JFrame that is the parent
     * @param theObject to be save
     */
    public static void saveToFile(javax.swing.JFrame parent, Object theObject){
        JFileChooser fc = new JFileChooser();
        File file = null;
        int returnVal = fc.showSaveDialog(parent);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            saveObject(file, theObject);
            System.out.println("Saving: " + file.getName());
        }
        else {
            System.out.println("Save command cancelled by user.");
        }
    }
    /**
     * A method to save the object into the selected file
     * @param file to save to
     * @param theObject to be saved
     */
    private static void saveObject(File file, Object theObject){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(theObject);
            oos.flush();
            oos.close();
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        finally {
            if (fos != null){
                try {
                    fos.close();
                }
                catch (IOException ioe) {
                    System.out.println(ioe.getMessage());
                }
            }
        }
        
    }
}
