package com.develops.graphlibrary;

import android.os.Environment;
import android.util.Pair;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Hasil {
    public static ArrayList <Pair <Integer,Integer> > data = new ArrayList <Pair <Integer,Integer> > ();
    static Graph g= new Graph(200);
    public static int counterhuruf = 0;
    static String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android Watermark";
    static FileOutputStream  outStream = null;
    static OutputStreamWriter  outStreamWriter = null;

    public static void createWriter() throws IOException {
        System.out.println("test 5");
        File dir = new File(path);
        dir.mkdirs();
        File file = null;
        System.out.println("test 6");
        file = new File(new File(path), "/AndroidApp-Watermark-TA07.txt");
        System.out.println("test 7");
        file.createNewFile();
        System.out.println("test 8");
        outStream = new FileOutputStream(file, true);
        outStreamWriter = new OutputStreamWriter(outStream);
        System.out.println("test 9");
    }

    public static void buildWatermark( String watermark) throws IOException {
       createWriter();
       watermark = EncoderWatermark.encodeString(watermark);
       System.out.println(watermark);

        int ctr=2;
        for(char c: watermark.toCharArray()){
            counterhuruf++;
            int character_angka = Character.getNumericValue(c);
            for(int i = counterhuruf; i < counterhuruf + character_angka ;i++){
                g.addEdge(counterhuruf, ctr);
                String data = counterhuruf +" "+ ctr+"\n";
                System.out.println(data);
                outStreamWriter.append(data);
                ctr++;
            }

        }
        System.out.println("Ini Counter" + counterhuruf);
        insertAdjecencyListSize(counterhuruf);
        outStreamWriter.flush();

    }
    public static void insertAdjecencyListSize(int counterhuruf) throws IOException {

        outStreamWriter.append(Integer.toString( counterhuruf));

    }

}