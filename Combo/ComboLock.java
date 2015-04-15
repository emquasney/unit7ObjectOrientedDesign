public class ComboLock
{
    private int comb=0;
    private int num=0;
    private int time=0;
    private int sec1,sec2,sec3;
    public ComboLock( int secret1, int secret2, int secret3 )
    {
        sec1=secret1;
        sec2=secret2;
        sec3=secret3;
    }
    public void reset()
    {
        num=0;
        comb=0;
        time=0;
    }
    public void turnLeft( int ticks )
    {
        num+=ticks;
        while(num>39)
        {
            num-=40;
        }
        if(time==1&&num==sec2)
        {
            comb++;
        }
        
        time++;
        System.out.println(num);
    }
    public void turnRight( int ticks )
    {
        num-=ticks;
        while(num<0)
        {
            num+=40;
        }
        if(time==0&&num==sec1)
        {
            comb++;
        }
        if(time==2&&num==sec3)
        {
            comb++;
        }
        time++;
        System.out.println(num);
    }
    public boolean open()
    {
        if(comb==3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}