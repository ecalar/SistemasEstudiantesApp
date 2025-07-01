package gm.presentacion;

import gm.datos.EstudianteDAO;
import gm.dominio.Estudiante;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SistemasEstudiantesApp {
    public static void main(String[] args) {
        var salir = false;
        var consola = new Scanner(System.in);
        //Se crea una instancia clase servicio
        var estudianteDao = new EstudianteDAO();
        while (!salir){
            try {
                mostrarMenu();
                salir = ejecutarOpciones(consola, estudianteDao);
            }catch (Exception e){
                System.out.println("Ocurrio un error al ejecutar operacion :" + e.getMessage());
            }
            System.out.println();
        }//fin while
    }

    private static void mostrarMenu(){
        System.out.println("""
                *** Sistemas de Estudiantes ***
                1. Listar Estudiantes.
                2. Buscar Estudiante.
                3. Agregar Estudiante.
                4. Modificar Estudiante.
                5. Eliminar Estudiante.
                6. Salir.
                
                Elige una opcion:
                
                """);
    }

    private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion) {
            case 1 ->{//Listar Estudiantes
                System.out.println("Listado de Estudiantes..");
                var estudiantes = estudianteDAO.listarEstudiantes();
                estudiantes.forEach(System.out::println);
            }
            case 2 ->{//Buscar estudiante por id
                System.out.println("Introduce el id a buscar: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante((idEstudiante));
                var encontrado = estudianteDAO.buscarEstudiantePorID(estudiante);
                if(encontrado)
                    System.out.println("Estudiante encontrado: " + estudiante);
                else
                    System.out.println("Estudiante NO Encontrado: " + estudiante);
            }
            case 3 ->{//Agregar Estudiante
                System.out.println("Agregar estudiante: ");
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //Crear el objeto estudiante sin el id
                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudianteDAO.agregarEstudiante(estudiante);
                if (agregado)
                    System.out.println("Estudiante agregado: " + estudiante);
                else
                    System.out.println("Estudiante NO Agregado: " + estudiante);
            }
            case 4 ->{//Modificar Estudiante
                System.out.println("Modificar Estudiante: ");
                System.out.println("ID Estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //Crear el objeto estudiante a modificar
                var estudiante = new Estudiante(idEstudiante, nombre, apellido, telefono, email);
                var modificado = estudianteDAO.modificarEstudiante(estudiante);
                if (modificado)
                    System.out.println("Estudiante Modificado: " + estudiante);
                else
                    System.out.println("Estudiante NO Mdoificado" + estudiante);
            }
            case 5 ->{//Eliminar Estudiante
                System.out.println("Eliminar Estudiante: ");
                System.out.println("ID Estudiante: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDAO.eliminarEstudainte(estudiante);
                if (eliminado)
                    System.out.println("Estudiante Eliminado: " + estudiante);
                else
                    System.out.println("Estudiante NO Eliminado: " + estudiante);
            }
            case 6 ->{//Salir
                System.out.println("Hasta Pronto!");
                salir = true;
            }
            default -> System.out.println("Opcion no reconocida");
        }
        return salir;
    }

}