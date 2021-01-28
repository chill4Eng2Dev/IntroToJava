           // UML Class Diagram                     
/***************************************************
*                   Stock                          *  
* -------------------------------------------------*  
* -startTime: long                                 *
* -endTime: long                                   *
* -------------------------------------------------* 
* +getStartTime(): long                            *
* +getEndTime(): long                              *
* +StopWatch():                                    *
* +start(): void                                   *
* +stop(): void                                    *
* +getElapsedTime(): long                          *
***************************************************/

public class StopWatch {
    
    private long startTime;
    private long endTime;
    
    // default constructor
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    
    // method to initialize start time with current time
    public void start() {
        startTime = System.currentTimeMillis();
    }
    
    // method to initialize endtime with current time
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    
    /** accessor methods */
    // return start time
    public long getStartTime() {
        return startTime;
    }
    
    // returns end time
    public long getEndTime() {
        return endTime;
    }
    
    // calculates the elapsed time between start and stop
    public long getElapsedTime() {
        return endTime - startTime;
    }
    
}
