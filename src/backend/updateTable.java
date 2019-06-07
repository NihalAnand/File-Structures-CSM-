package backend;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Objects;
import java.util.Vector;

public class updateTable {
    
    public static void addtable(pointsTable pt) throws IOException, ClassNotFoundException{
    Vector<pointsTable> v=null;
    File f=new File("pointstable.txt");
    if(!f.exists()){
        f.createNewFile();
    }
    try{
            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream obj = new ObjectInputStream(fin);
            v = (Vector<pointsTable>) obj.readObject();
 
            v.add(pt);

            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream obj1 = new ObjectOutputStream(fout);
            obj1.writeObject(v);
    }
    catch(EOFException ex){
            v=new Vector<>();
            v.add(pt);

            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream obj1 = new ObjectOutputStream(fout);
            obj1.writeObject(v);
        }
    }
    
    public static void deletetable(String t) throws IOException, ClassNotFoundException{
    Vector<pointsTable> v=null;
    File f=new File("pointstable.txt");
    if(!f.exists()){
        f.createNewFile();
    }
    try{
            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream obj = new ObjectInputStream(fin);
            v = (Vector<pointsTable>) obj.readObject();
            int z=0;
            for(int j=0;j<v.size();j++){
                    if(v.elementAt(j).team.equals(t)){
                        z=j;
                    }
                }
            v.removeElementAt(z);
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream obj1 = new ObjectOutputStream(fout);
            obj1.writeObject(v);
    }
    catch(EOFException ex){
            System.err.println(ex);
        }
    }
    
    
    public static void updatetable(String team1,String team2,String winning_team,Double difference_in_runrate) throws FileNotFoundException, IOException, ClassNotFoundException
    {
            File f=new File("pointstable.txt");
            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream obj = new ObjectInputStream(fin);
            Vector<pointsTable> v = (Vector<pointsTable>) obj.readObject();
            for (pointsTable v1 : v) {
                if(v1.team.toLowerCase().equals(team1.toLowerCase()) || v1.team.toLowerCase().equals(team2.toLowerCase()) ){
                    if(winning_team.toLowerCase().equals("draw")){
                        v1.matches_played+=1;
                        v1.matches_drawn+=1;
                        v1.net_runrate+=difference_in_runrate;
                        v1.points+=1;
                    }
                    else if(v1.team.toLowerCase().equals(winning_team.toLowerCase()))
                    {
                        v1.matches_played+=1;
                        v1.matches_won+=1;
                        v1.net_runrate+=difference_in_runrate;
                        v1.points+=2;
                    }
                    else{
                        v1.matches_played+=1;
                        v1.matches_lost+=1;
                        v1.net_runrate-=difference_in_runrate;
                    }
                }
            }
            Vector<pointsTable> vv=updateTable.sortp(v);
            FileOutputStream fin1 = new FileOutputStream(f);
            ObjectOutputStream obj1 = new ObjectOutputStream(fin1);
            obj1.writeObject(vv);
            
    }
    
    public static Vector<pointsTable> showall() throws IOException, ClassNotFoundException{
        File f=new File("pointstable.txt");
        FileInputStream fin = new FileInputStream(f);
            ObjectInputStream obj = new ObjectInputStream(fin);
            Vector<pointsTable> v = (Vector<pointsTable>) obj.readObject();
 
            return v;
    }
    
    
//    @SuppressWarnings({"BoxedValueEquality", "NumberEquality"})
//    public static Vector<pointsTable> sortp(Vector<pointsTable> p){
//        Vector<pointsTable> v=new Vector<>();
//        int n=p.size();
//        int min=p.elementAt(0).points;
//        Double net=p.elementAt(0).net_runrate;
//        for(int j=0;j<n;j++){
//            min=0;
//            net=-1000.0;
//        for(int i=0;i<p.size();i++)
//        {   
//            if(p.elementAt(i).points>=min)
//            {   min=p.elementAt(i).points;
//                if(p.elementAt(i).net_runrate>=net){
//                net=p.elementAt(i).net_runrate;
//                }
//            }
//                
//        }
//        for(int z=0;z<p.size();z++)
//        {
//        if(p.elementAt(z).points==min && p.elementAt(z).net_runrate==net){
//            v.add(p.remove(z));
//            System.out.println(v);
//        }
//        }
//        }
//        return v;
//    }
    public static Vector<pointsTable> sortp(Vector<pointsTable> v)
    {
        Vector<pointsTable> temp=new Vector<>();
        int max=0;
        Double net=0.0;
        while(!v.isEmpty())
        {
            max=0;
            net=-100.0;
            for(int i=0;i<v.size();i++)
            {
                if(v.elementAt(i).points>max)
                {
                    max=v.elementAt(i).points;
                }
            }
            for(int i=0;i<v.size();i++)
            {
                if(v.elementAt(i).points==max && v.elementAt(i).net_runrate>net)
                {
                    net=v.elementAt(i).net_runrate;
                }
            }
            for(int i=0;i<v.size();i++)
            {
                if(v.elementAt(i).points==max && v.elementAt(i).net_runrate==net)
                {
                    temp.add(v.elementAt(i));
                    v.remove(i);
                }
            }
        }
        return temp;
    }
}
