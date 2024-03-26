import java.io.FileWriter;
import java.io.IOException;

public class LoggingService {
    private static LoggingService instance;
    private static final String LOG_FILE = "Log.txt";

    //get the instance
    public static LoggingService getInstance() {
        //check if only 1 instance has been created
        if (instance ==null){
            //For thread safety. Lock on any object when creating a singleton instanace
            synchronized (LoggingService.class){
                if(instance == null){
                    instance = new LoggingService();
                }                
            }
        }
        return instance;
    }

    //Declare a private Constructor
    private LoggingService(){
    }
   
    public void log(String msg){
        try{
            FileWriter writer = new FileWriter(LOG_FILE, true);
            String instanceName = LoggingService.getInstance().toString();
            //String className = LoggingService.getInstance().getClass().getName();
            writer.write(msg + " Instance : " + instanceName +  System.lineSeparator()); // Write message to file
            writer.close(); 
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }   
}


