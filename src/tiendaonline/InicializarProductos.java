
package tiendaonline;

import java.util.ArrayList;
import java.util.List;

public class InicializarProductos {
    public static void main(String[] args) {
     
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Acelerómetro y giroscopio MPU6050", "Sensor de movimiento para proyectos electrónicos.", "/Imagenes/1.jpg", 20.50, 19.89, 15, "4x4x1 cm", "sensor"));
        productos.add(new Producto("Arduino Mega 2560", "Placa de desarrollo versátil con múltiples puertos de E/S.", "/Imagenes/2.jpg", 45.00, 43.65, 10, "10.2x5.3x2 cm", "arduino"));
        productos.add(new Producto("Arduino Nano", "Placa compacta ideal para proyectos pequeños.", "/Imagenes/3.jpg", 25.00, 24.25, 8, "4.5x1.8x1.5 cm", "arduino"));
        productos.add(new Producto("Arduino Uno R3", "Placa básica para iniciarse en la electrónica.", "/Imagenes/4.jpg", 22.00, 21.34, 12, "6.9x5.3x1.5 cm", "arduino"));
        productos.add(new Producto("Conjunto Diodos Rectificadores", "Paquete de diodos ideales para proyectos de rectificación.", "/Imagenes/5.jpg", 10.00, 9.70, 20, "5x5x1 cm", "componente"));
        productos.add(new Producto("Diodo Rectificador", "Diodo para manejo de corrientes en circuitos electrónicos.", "/Imagenes/6.jpg", 1.50, 1.46, 50, "0.5x0.5x2 cm", "componente"));
        productos.add(new Producto("Diodos LED", "Lote de LEDs de alta calidad para iluminación y señales.", "/Imagenes/7.jpg",5.00, 4.85, 100, "0.5x0.5x2 cm", "componente"));
        productos.add(new Producto("Display LCD 16x2 Fondo Azul", "Pantalla LCD con retroiluminación azul.", "/Imagenes/8.jpg", 12.00, 11.64, 10, "8x2x1 cm", "módulo"));
        productos.add(new Producto("Interruptor On Off", "Interruptor básico para cortes de corriente.", "/Imagenes/9.jpg", 1.20, 1.16, 30, "1x1x0.5 cm", "componente"));
        productos.add(new Producto("Jumper Pack H-H 20cm 40 piezas", "Cables hembra-hembra para conexiones rápidas.", "/Imagenes/10.jpg", 3.00, 2.91, 25, "20x0.2x0.2 cm", "componente"));
        productos.add(new Producto("Jumper Pack M-H 20cm 40 piezas", "Cables macho-hembra para conexiones rápidas.", "/Imagenes/11.jpg", 3.00, 2.91, 20, "20x0.2x0.2 cm", "componente"));
        productos.add(new Producto("Jumper Pack M-M 20cm 40 piezas", "Cables macho-macho para conexiones rápidas.", "/Imagenes/12.jpg", 3.00, 2.91, 20, "20x0.2x0.2 cm", "componente"));
        productos.add(new Producto("Kit condensadores", "Set de condensadores para diferentes proyectos electrónicos.", "/Imagenes/13.jpg", 10.00, 9.70, 15, "5x5x1 cm", "componente"));
        productos.add(new Producto("Kit resistencias", "Set de resistencias de diferentes valores.", "/Imagenes/14.jpg", 8.00, 7.76, 20, "5x5x1 cm", "componente"));
        productos.add(new Producto("Módulo Bluetooth HC-05", "Módulo para comunicación inalámbrica.", "/Imagenes/15.jpg", 9.00, 8.73, 10, "4x2x1 cm", "módulo"));
        productos.add(new Producto("Módulo regulador de voltaje LM2596", "Regulador para ajustes de tensión en circuitos.", "/Imagenes/16.jpg", 5.50, 5.34, 18, "4x2x1.5 cm", "módulo"));
        productos.add(new Producto("Módulo relay 5V", "Relay para control de dispositivos con señales de 5V.", "/Imagenes/17.jpg", 4.50, 4.37, 12, "2x2x2 cm", "módulo"));
        productos.add(new Producto("Módulo sensor LDR", "Sensor para medir intensidad lumínica.", "/Imagenes/18.jpg", 2.50, 2.43, 15, "3x1x1 cm", "sensor"));
        productos.add(new Producto("Módulo WiFi ESP8266", "Módulo para conectar dispositivos a redes WiFi.", "/Imagenes/19.jpg", 8.00, 7.76, 8, "2x2x1.5 cm", "módulo"));
        productos.add(new Producto("Potenciómetro 20K", "Potenciómetro para ajustes de resistencia.", "/Imagenes/20.jpg",1.00, 0.97, 30, "1.5x1.5x1.5 cm", "componente"));
        productos.add(new Producto("Protoboard Chica 400 Puntos", "Protoboard pequeña para prototipos electrónicos.", "/Imagenes/21.jpg", 4.00, 3.88, 10, "8x5x1 cm", "componente"));
        productos.add(new Producto("Protoboard Grande 830", "Protoboard grande para prototipos electrónicos.", "/Imagenes/22.jpg", 6.00, 5.82, 10, "16x10x1 cm", "componente"));
        productos.add(new Producto("Pulsador", "Botón pulsador para proyectos electrónicos.", "/Imagenes/23.jpg",0.80, 0.78, 50, "1x1x1 cm", "componente"));
        productos.add(new Producto("Sensor de distancia ultrasónico HC-SR04", "Sensor para medir distancias con ultrasonido.", "/Imagenes/24.jpg", 6.00, 5.82, 15, "4.5x2x2 cm", "sensor"));
        productos.add(new Producto("Sensor de Flama KY-026", "Sensor para detección de llamas.", "/Imagenes/25.jpg", 3.50, 3.40, 10, "3x2x1 cm", "sensor"));
        productos.add(new Producto("Sensor de gas MQ-2", "Sensor para detectar gases peligrosos.", "/Imagenes/26.jpg", 5.00, 4.85, 12, "3x3x2 cm", "sensor"));
        productos.add(new Producto("Sensor de presión barométrica BMP280", "Sensor para medir presión atmosférica.", "/Imagenes/27.jpg", 7.50, 7.28, 10, "2x2x1 cm", "sensor"));
        productos.add(new Producto("Sensor de temperatura y humedad DHT11", "Sensor para monitoreo de temperatura y humedad.", "/Imagenes/28.jpg", 3.00, 2.91, 20, "2x1x1 cm", "sensor"));
        productos.add(new Producto("Sensor Infrarrojo TCRT5000", "Sensor infrarrojo para detección de objetos o líneas.", "/Imagenes/29.jpg", 2.00, 1.94, 15, "1x1x1 cm", "sensor"));
        productos.add(new Producto("Servomotor SG90 RC", "Motor pequeño para control de posición.", "/Imagenes/30.jpg", 4.50, 4.37, 10, "2.5x2.5x1 cm", "componente"));
        productos.add(new Producto("Transistor NPN", "Transistor para amplificación o conmutación.", "/Imagenes/31.jpg", 0.50, 0.49, 50, "1x0.5x0.5 cm", "componente"));
        productos.add(new Producto("Zumbador piezoeléctrico", "Zumbador para señalización sonora.", "/Imagenes/32.jpg", 1.00, 0.97, 20, "2x2x1 cm", "componente"));

        
        // Guardar la lista en el archivo
        PersistenciaProducto persistenciaProducto = new PersistenciaProducto();
        persistenciaProducto.guardarProductos(productos);

        System.out.println("Archivo de productos creado exitosamente.");
    }
}
