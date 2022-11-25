package NUHealthCare.JobQueue;

import java.util.ArrayList;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class JobQueue {
  private ArrayList<JobRequest> jobRequestList;

  public JobQueue() {
    jobRequestList = new ArrayList<>();
  }

  public ArrayList<JobRequest> getJobRequestList() {
    return jobRequestList;
  }
  
  
}
