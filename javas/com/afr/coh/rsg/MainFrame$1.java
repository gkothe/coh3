package com.afr.coh.rsg;

class MainFrame$1
  implements Runnable
{
  public void run()
  {
    try
    {
      MainFrame frame = new MainFrame();
      frame.setVisible(true);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}
