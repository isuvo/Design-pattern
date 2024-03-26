public class App {
    public static void main(String[] args) throws Exception {
        //Calling from main class 
        LoggingService loggingService = LoggingService.getInstance();
        loggingService.log("Main class");    
        
        //calling the logging sercice from another class 
        App appInstance = new App();
        AnotherClass anotherclass = appInstance.new AnotherClass();
        anotherclass.loggingService();
    }
    
    public class AnotherClass {
        public void loggingService(){
            LoggingService loggingServiceFromAnotherClass = LoggingService.getInstance();
            loggingServiceFromAnotherClass.log("AnotherClass");
        }

    }
}
