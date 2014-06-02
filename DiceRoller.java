public class DiceRoller implements Runnable
{
  private final String taskName;
  
  public DiceRoller(String name)
  {
    taskName = name;
  }
  
  public void run()
  {
    try
    {
      System.out.printf("%s Start \n",taskName);
      Runnable T1 = new OnlyThread(taskName);
      Thread worker = new Thread(T1);
      worker.setName(taskName);
      worker.start();
    }
    catch(Exception e)
    {
      System.out.printf("%s %s ",taskName, "terminated prematurely because of an interruption.");
    }
    
    System.out.printf("%s Finished Throwing.",taskName);
  }
}
