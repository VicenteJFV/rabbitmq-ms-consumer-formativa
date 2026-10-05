package cl.duoc.rabbitmq_ms_consumidor;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

// Componente encargado de recibir mensajes
@Component
public class Receiver {

    // Escucha los mensajes que lleguen a la cola "hello"
    @RabbitListener(queues = "hello")
    public void receiveMessage(String message) {

        // Muestra en la consola el mensaje recibido
        System.out.println("[✓] Mensaje recibido: " + message);
    }
}
