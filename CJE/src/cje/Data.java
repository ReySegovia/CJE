/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cje;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author reyse
 */
public class Data {
        HashMap<String, String> hm = new HashMap<>();
        HashMap<String, String> hm2 = new HashMap<>();
        HashMap<String, String> hm3 = new HashMap<>();

        final static String outputFilePath = "C://Users//reyse//OneDrive//Desktop//doctor.txt";
        final static String outputFilePath2 = "C://Users//reyse//OneDrive//Desktop//paciente.txt";
        final static String outputFilePath3 = "C://Users//reyse//OneDrive//Desktop//cita.txt";
  
    public void addDoctor() {
            File file = new File(outputFilePath);
            BufferedWriter bf = null;

            try {
                bf = new BufferedWriter(new FileWriter(file));
                for (Map.Entry<String, String> entry : hm.entrySet()) {

                    bf.write(entry.getKey() + ":" + entry.getValue());

                    bf.newLine();
                }

                bf.flush();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bf.close();
                } catch (Exception e) {
                }
            }
            System.out.println("Doctor agregado correctamente. ");
        }
    
    public void addPaciente() {
        File file = new File(outputFilePath2);
        BufferedWriter bf = null;

        try {
            bf = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, String> entry : hm2.entrySet()) {

                bf.write(entry.getKey() + ":" + entry.getValue());

                bf.newLine();
            }

            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bf.close();
            } catch (Exception e) {
            }
        }
        System.out.println("Paciente agregado correctamente. ");
    }
    
    public void addCita() {
        File file = new File(outputFilePath3);
        BufferedWriter bf = null;

        try {
            bf = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, String> entry : hm3.entrySet()) {

                bf.write(entry.getKey() + ":" + entry.getValue());

                bf.newLine();
            }

            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bf.close();
            } catch (Exception e) {
            }
        }
        System.out.println("Cita agendada correctamente. ");
    }
}
