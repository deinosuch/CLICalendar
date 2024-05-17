package cz.cuni.mff.pasekaad;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Event implements Job{
    private Date time;
    private String name;
    private String description;
    
    public Event(Date time, String name, String description) {
        this.time = time;
        this.name = name;
        this.description = description;
    }
    
    public Date getTime() {
        return time;
    }
    
    public void changeTime(Date time) {
        this.time = time;
    }
    
    public String getName() {
        return name;
    }
    
    public void changeName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void changeDescription(String description) {
        this.description = description;
    }

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }
}
