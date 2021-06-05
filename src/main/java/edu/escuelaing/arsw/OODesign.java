package edu.escuelaing.arsw;

import java.io.*;
import java.util.Iterator;
import java.lang.Math;

/**
 * Principal class
 */
public class OODesign {
    /**
     * Main funtion
     * @param args Arguments received to establish the files with which to operate
     */
    public static void main(String[] args) {
        File file= new File(args[0]);
        System.out.println("The mean calculated was: " + mean(file));     
        System.out.println("The standard deviations calculated was: " + standardDeviation(file));
    }
    /**
     * returns the average of the data it will read read from the file
     * @param f the file with data
     * @return the mean of the data found in the file
     */
    public static Double mean(File f){
        LinkedList<Double> linked = new LinkedList<Double>();
        Double mean =0.0 ;   
        if (f.isDirectory()){
            for(File Entry: f.listFiles()){
                mean+= mean(Entry);
            }   
        }
        try{
            BufferedReader br= new BufferedReader(new FileReader (f));
            String line;
            Double number;
            while ((line =br.readLine()) != null){
                number = Double.valueOf(line);
                linked.add(number);
            }
            br.close();
            Iterator<Double> it = linked.iterator();          
            while (it.hasNext()){
                mean+=it.next();
            }
            mean = mean/linked.size();
            mean = Math.round(mean*100.0)/100.0;
        }catch(IOException e){
            System.out.println("File not Found");
        }
        return mean;

    }
        /**
     * returns the standard Deviation of the data it will read read from the file
     * @param f the file with data
     * @return the standard Deviation of the data found in the file
     */
    public static Double standardDeviation(File f){
        LinkedList<Double> linked = new LinkedList<Double>();
        double st =0 ;  
        Double mean = mean(f) ;  
        if (f.isDirectory()){
            for(File Entry: f.listFiles()){
                st+= standardDeviation(Entry);
            }   
        }
        try{
            BufferedReader br= new BufferedReader(new FileReader (f));
            String line;
            Double number;
            while ((line =br.readLine()) != null){
                number = Double.valueOf(line);
                linked.add(number);
            }
            br.close();
            Iterator<Double> it = linked.iterator();
            while (it.hasNext()){                
                st+= Math.pow((it.next()-mean),2);              
            }
            st = (st/(linked.size()-1));
            st = Math.sqrt(st);
            st = Math.round(st*100.0)/100.0;
            
        }catch(IOException e){
            System.out.println("File not Found");
        }
        return st;

    }


}

