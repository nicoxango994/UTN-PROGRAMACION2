/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces.y.excepciones;

import Entities.Cliente;
import Entities.Pedido;
import Entities.Producto;
import Entities.TarjetaCredito;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class InterfacesYExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Perfume Dior", 50000));
        pedido.agregarProducto(new Producto("Perfume Armani", 45000));
        pedido.cambiarEstado("En preparacion");

        double total = pedido.calcularTotal();

        TarjetaCredito tc = new TarjetaCredito();
        double totalConDescuento = tc.aplicarDescuento(total);
        tc.procesarPago(totalConDescuento);
        
        System.out.println("PARTE 2 - 1 ----------------------------------------------------------------");
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese numerador: ");
            int a = sc.nextInt();

            System.out.print("Ingrese divisor: ");
            int b = sc.nextInt();

            int resultado = a / b;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    
    
    System.out.println("PARTE 2 - 2 ----------------------------------------------------------------");
    
        try {
            System.out.print("Ingrese un número: ");
            String texto = sc.nextLine();
            int numero = Integer.parseInt(texto);

            System.out.println("Número ingresado: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es un número válido.");
        }
        
        System.out.println("PARTE 2 - 3 ----------------------------------------------------------------");
        
            try (Scanner sc1 = new Scanner(new File("archivo.txt"))) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe.");
        }

        
        System.out.println("PARTE 2 - 5 ----------------------------------------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader("texto.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
            
        }
}
