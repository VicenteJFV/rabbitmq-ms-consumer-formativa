package cl.duoc.rabbitmq_ms_consumidor;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Clase de configuración de RabbitMQ
@Configuration
public class RabbitMQConfig {

    // Declara la cola que utilizará el microservicio
    @Bean
    public Queue helloQueue() {

        // Crea la cola "hello"
        // false indica que la cola no es durable
        return new Queue("hello", false);
    }
}
