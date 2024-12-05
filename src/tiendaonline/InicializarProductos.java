package tiendaonline;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InicializarProductos {
    public static void main(String[] args) {
     
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Acelerómetro y giroscopio MPU6050", "Sensor de movimiento para proyectos electrónicos.", "/Imagenes/1.jpg", 225.50, 15, "4x4x1 cm", "sensor"));
        productos.add(new Producto("Arduino Mega 2560", "Placa de desarrollo versátil con múltiples puertos de E/S.", "/Imagenes/2.jpg", 495.00, 10, "10.2x5.3x2 cm", "arduino"));
        productos.add(new Producto("Arduino Nano", "Placa compacta ideal para proyectos pequeños.", "/Imagenes/3.jpg", 275.00, 8, "4.5x1.8x1.5 cm", "arduino"));
        productos.add(new Producto("Arduino Uno R3", "Placa básica para iniciarse en la electrónica.", "/Imagenes/4.jpg", 242.00, 12, "6.9x5.3x1.5 cm", "arduino"));
        productos.add(new Producto("Conjunto Diodos Rectificadores", "Paquete de diodos ideales para proyectos de rectificación.", "/Imagenes/5.jpg", 110.00, 20, "5x5x1 cm", "componente"));
        productos.add(new Producto("Diodo Rectificador", "Diodo para manejo de corrientes en circuitos electrónicos.", "/Imagenes/6.jpg", 16.50, 50, "0.5x0.5x2 cm", "componente"));
        productos.add(new Producto("Diodos LED", "Lote de LEDs de alta calidad para iluminación y señales.", "/Imagenes/7.jpg", 55.00, 100, "0.5x0.5x2 cm", "componente"));
        productos.add(new Producto("Display LCD 16x2 Fondo Azul", "Pantalla LCD con retroiluminación azul.", "/Imagenes/8.jpg", 132.00, 10, "8x2x1 cm", "módulo"));
        productos.add(new Producto("Interruptor On Off", "Interruptor básico para cortes de corriente.", "/Imagenes/9.jpg", 13.20, 30, "1x1x0.5 cm", "componente"));
        productos.add(new Producto("Jumper Pack H-H 20cm 40 piezas", "Cables hembra-hembra para conexiones rápidas.", "/Imagenes/10.jpg", 33.00, 25, "20x0.2x0.2 cm", "componente"));
        productos.add(new Producto("Jumper Pack M-H 20cm 40 piezas", "Cables macho-hembra para conexiones rápidas.", "/Imagenes/11.jpg", 33.00, 20, "20x0.2x0.2 cm", "componente"));
        productos.add(new Producto("Jumper Pack M-M 20cm 40 piezas", "Cables macho-macho para conexiones rápidas.", "/Imagenes/12.jpg", 33.00, 20, "20x0.2x0.2 cm", "componente"));
        productos.add(new Producto("Kit condensadores", "Set de condensadores para diferentes proyectos electrónicos.", "/Imagenes/13.jpg", 110.00, 15, "5x5x1 cm", "componente"));
        productos.add(new Producto("Kit resistencias", "Set de resistencias de diferentes valores.", "/Imagenes/14.jpg", 88.00, 20, "5x5x1 cm", "componente"));
        productos.add(new Producto("Módulo Bluetooth HC-05", "Módulo para comunicación inalámbrica.", "/Imagenes/15.jpg", 99.00, 10, "4x2x1 cm", "módulo"));
        productos.add(new Producto("Módulo regulador de voltaje LM2596", "Regulador para ajustes de tensión en circuitos.", "/Imagenes/16.jpg", 60.50, 18, "4x2x1.5 cm", "módulo"));
        productos.add(new Producto("Módulo relay 5V", "Relay para control de dispositivos con señales de 5V.", "/Imagenes/17.jpg", 49.50, 12, "2x2x2 cm", "módulo"));
        productos.add(new Producto("Módulo sensor LDR", "Sensor para medir intensidad lumínica.", "/Imagenes/18.jpg", 27.50, 15, "3x1x1 cm", "sensor"));
        productos.add(new Producto("Módulo WiFi ESP8266", "Módulo para conectar dispositivos a redes WiFi.", "/Imagenes/19.jpg", 88.00, 8, "2x2x1.5 cm", "módulo"));
        productos.add(new Producto("Potenciómetro 20K", "Potenciómetro para ajustes de resistencia.", "/Imagenes/20.jpg", 11.00, 30, "1.5x1.5x1.5 cm", "componente"));
        productos.add(new Producto("Protoboard Chica 400 Puntos", "Protoboard pequeña para prototipos electrónicos.", "/Imagenes/21.jpg", 44.00, 10, "8x5x1 cm", "componente"));
        productos.add(new Producto("Protoboard Grande 830", "Protoboard grande para prototipos electrónicos.", "/Imagenes/22.jpg", 66.00, 10, "16x10x1 cm", "componente"));
        productos.add(new Producto("Pulsador", "Botón pulsador para proyectos electrónicos.", "/Imagenes/23.jpg", 8.80, 50, "1x1x1 cm", "componente"));
        productos.add(new Producto("Sensor de distancia ultrasónico HC-SR04", "Sensor para medir distancias con ultrasonido.", "/Imagenes/24.jpg", 66.00, 15, "4.5x2x2 cm", "sensor"));
        productos.add(new Producto("Sensor de Flama KY-026", "Sensor para detección de llamas.", "/Imagenes/25.jpg", 38.50, 10, "3x2x1 cm", "sensor"));
        productos.add(new Producto("Sensor de gas MQ-2", "Sensor para detectar gases peligrosos.", "/Imagenes/26.jpg", 55.00, 12, "3x3x2 cm", "sensor"));
        productos.add(new Producto("Sensor de presión barométrica BMP280", "Sensor para medir presión atmosférica.", "/Imagenes/27.jpg", 82.50, 10, "2x2x1 cm", "sensor"));
        productos.add(new Producto("Sensor de temperatura y humedad DHT11", "Sensor para monitoreo de temperatura y humedad.", "/Imagenes/28.jpg", 33.00, 20, "2x1x1 cm", "sensor"));
        productos.add(new Producto("Sensor Infrarrojo TCRT5000", "Sensor infrarrojo para detección de objetos o líneas.", "/Imagenes/29.jpg", 22.00, 15, "1x1x1 cm", "sensor"));
        productos.add(new Producto("Servomotor SG90 RC", "Motor pequeño para control de posición.", "/Imagenes/30.jpg", 49.50, 10, "2.5x2.5x1 cm", "componente"));
        productos.add(new Producto("Transistor NPN", "Transistor para amplificación o conmutación.", "/Imagenes/31.jpg", 5.50, 50, "1x0.5x0.5 cm", "componente"));
        productos.add(new Producto("Zumbador piezoeléctrico", "Zumbador para señalización sonora.", "/Imagenes/32.jpg", 11.00, 20, "2x2x1 cm", "componente"));

        
        List<Oferta> ofertas = new ArrayList<>();
        ofertas.add(new Oferta("Módulo sensor de sonido", "Detecta niveles de sonido y los traduce en señales eléctricas.", "/Imagenes/33.jpg", 330.00, 10, "3x2x1 cm", "sensor", 5, 313.50));
        ofertas.add(new Oferta("Sensor de humedad del suelo", "Mide la cantidad de humedad presente en el suelo.", "/Imagenes/34.jpg", 275.00, 12, "5x2x0.5 cm", "sensor", 8, 253.00));
        ofertas.add(new Oferta("Módulo acelerómetro ADXL345", "Mide aceleración en 3 ejes con precisión.", "/Imagenes/35.jpg", 440.00, 4, "3x3x1 cm", "módulo", 5, 418.00));
        ofertas.add(new Oferta("Shield protoboard para Arduino", "Accesorio para conectar y probar componentes rápidamente.", "/Imagenes/36.jpg", 165.00, 20, "7x5x1 cm", "componente", 3, 160.05));
        ofertas.add(new Oferta("Sensor de corriente ACS712 5A", "Mide corriente eléctrica de hasta 5A con alta precisión.", "/Imagenes/37.jpg", 275.00, 9, "3.5x2.5x1 cm", "sensor", 7, 255.75));
        ofertas.add(new Oferta("Módulo controlador de motores L298N", "Controla dos motores de corriente directa de manera eficiente.", "/Imagenes/38.jpg", 550.00, 6, "6x4.5x1.5 cm", "módulo", 10, 495.00));
        ofertas.add(new Oferta("Pila 9V", "Regulador para alimentar placas y sensores.", "/Imagenes/39.jpg", 330.00, 10, "5x3x3 cm", "modulo", 10, 313.50));
        ofertas.add(new Oferta("Transistor 2N2222", "Transistor NPN para amplificación y control.", "/Imagenes/40.jpg", 16.50, 100, "0.5x0.2x0.2 cm", "componente", 3, 15.50));
        ofertas.add(new Oferta("Modulo RTC DS3231", "Reloj en tiempo real para proyectos electrónicos.", "/Imagenes/41.jpg", 385.00, 12, "3x2x1 cm", "modulo", 7, 354.95));
        ofertas.add(new Oferta("Módulo RFID", "Lector de tarjetas RFID para identificación.", "/Imagenes/42.jpg", 440.00, 10, "6x4x1 cm", "modulo", 10, 418.00));
        ofertas.add(new Oferta("Regulador de voltaje LM7805", "Estabilizador de voltaje a 5V.", "/Imagenes/43.jpg", 27.50, 40, "1x1x1 cm", "componente", 6, 25.75));
        ofertas.add(new Oferta("Diodo Zener 5.1V", "Diodo regulador de voltaje para circuitos.", "/Imagenes/44.jpg", 8.80, 50, "0.5x0.2x0.2 cm", "componente", 4, 8.00));

        // Guardar la lista en el archivo de productos
        PersistenciaProducto persistenciaProducto = new PersistenciaProducto();
        persistenciaProducto.guardarProductos(productos);
        
        //Guardar la lista de ofertas
        PersistenciaProducto persistenciaOferta = new PersistenciaProducto();
        persistenciaOferta.guardarOfertas(ofertas);
        
    }
}