/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cje;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author reyse
 */
public class Main {
    public static void main(String[] args) throws IOException{
        //Doctor doctor = new Data();
        Main showMenu = new Main();
        showMenu.showMenu();

    }
        
        public void showMenu() throws IOException {
            Data doctor = new Data();
            Scanner input = new Scanner(System.in);
            
            System.out.println("Bienvenido a consultorio clinico! ");
            System.out.println("Elige una opcion:");
            System.out.println("1.Dar de alta doctores");
            System.out.println("2.Dar de alta pacientes");
            System.out.println("3.Crear una cita con fecha y hora");
            System.out.println("0.Salir");

            int option = input.nextInt();
            while (option > 0) {
                if (option < 1 || option > 3) {
                    System.err.println("Teclea una opción válida:");
                    System.err.println("1.Dar de alta doctores");
                    System.err.println("2.Dar de alta pacientes");
                    System.err.println("3.Crear una cita con fecha y hora");
                    System.err.println("0.Salir");
                    if (input.hasNextInt()) {
                        option = input.nextInt();
                    }
                } else if (option == 1) {
                    System.out.println("Escribe el ID y nombre del Doctor a agregar");
                    System.out.println("ID: ");
                    String doctorId = input.next();
                    System.out.println("Nombre: ");
                    String doctorNombre = input.next();
                    doctor.hm.put(doctorId, doctorNombre);
                    doctor.addDoctor();
                    System.out.println("Presiona 0 para salir o selecciona una nueva opcion: ");
                    System.out.println("1.Dar de alta doctores");
                    System.out.println("2.Dar de alta pacientes");
                    System.out.println("3.Crear una cita con fecha y hora");
                    if (input.hasNextInt()) {
                        option = input.nextInt();
                    }
                    
                } else if (option == 2) {
                    System.out.println("Escribe el ID y nombre del Paciente a agregar");
                    System.out.println("ID: ");
                    String pacienteId = input.next();
                    System.out.println("Nombre: ");
                    String pacienteNombre = input.next();
                    doctor.hm2.put(pacienteId, pacienteNombre);
                    doctor.addPaciente();
                    System.out.println("Presiona 0 para salir o selecciona una nueva opcion: ");
                    System.out.println("1.Dar de alta doctores");
                    System.out.println("2.Dar de alta pacientes");
                    System.out.println("3.Crear una cita con fecha y hora");
                    if (input.hasNextInt()) {
                        option = input.nextInt();
                    }
                } else if (option == 3) {
                    System.out.println("Crear cita con fecha y hora");
                    System.out.println("Escribe el ID del doctor y fecha de la cita a agendar");
                    System.out.println("ID del doctor: ");
                    String citaId = input.next();
                    System.out.println("Fecha y hora: ");
                    String citaHora = input.next();
                    doctor.hm3.put(citaId, citaHora);
                    doctor.addCita();
                    System.out.println("Presiona 0 para salir o selecciona una nueva opcion: ");
                    System.out.println("1.Dar de alta doctores");
                    System.out.println("2.Dar de alta pacientes");
                    System.out.println("3.Crear una cita con fecha y hora");
                    if (input.hasNextInt()) {
                        option = input.nextInt();
                    }
                }
            }
        }
}