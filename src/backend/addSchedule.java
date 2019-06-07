package backend;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class addSchedule {
    public static void addschedule(Schedule s) throws FileNotFoundException, ClassNotFoundException, IOException
    {
        File f=new File("schedule.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        Vector<Schedule> v=null;
        try{
        FileInputStream fin=new FileInputStream(f);
        ObjectInputStream obj=new ObjectInputStream(fin);
        
        v=(Vector<Schedule>)obj.readObject();
        
        v.add(s);
        
        FileOutputStream fout=new FileOutputStream(f);
        ObjectOutputStream obj2=new ObjectOutputStream(fout);
        
        obj2.writeObject(v);
        
        }
        catch(EOFException e)
        {
            v=new Vector<>();
            v.add(s);
            FileOutputStream fout1=new FileOutputStream(f);
            ObjectOutputStream obj3=new ObjectOutputStream(fout1);
            obj3.writeObject(v);
        }
        catch(IOException ex)
        {
            System.err.println(ex);
        }
    }
    public static Vector<Schedule> showall() throws IOException, ClassNotFoundException{
        
        File f=new File("schedule.txt");
        FileInputStream fin=new FileInputStream(f);
        ObjectInputStream obj=new ObjectInputStream(fin);
        
        Vector<Schedule> v=(Vector<Schedule>)obj.readObject();
        
        return v;
    }
}
