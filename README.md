# rabbitmq-ms-consumidor

Microservicio **Consumidor** de la guía *Hello World con RabbitMQ* (Spring Boot 4.1.1 · Java 21).
Escucha la cola `hello` con `@RabbitListener` y muestra cada mensaje en consola. No expone API REST.

## Ejecutar

1. Levantar RabbitMQ (`docker compose up -d` en la carpeta `rabbitmq-hello-world`).
2. En este proyecto:

```bash
mvn clean package
mvn spring-boot:run
```

Al enviar un mensaje desde el Productor debe aparecer:

```
[✓] Mensaje recibido: Hello World desde RabbitMQ!
```
