package backend;

import player.view.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

public class showAll {
    public static Vector<Player> showall() throws FileNotFoundException, IOException, ClassNotFoundException{
        File f=new File("player.txt");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream obj = new ObjectInputStream(fin);
        Vector<Player> v = (Vector<Player>)obj.readObject();
//        Vector<Player1> v1=new Vector<>();
//        for(int i=0;i<v.size();i++)
//        {
//            v1.add(new Player1(v.elementAt(i)));
//        }
            return v;
    }
}
