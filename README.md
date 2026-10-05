# rabbitmq-ms-consumidor

Microservicio **Consumidor** (Spring Boot 4.1.1 · Java 21).

Guía actual: *Exchanges, Bindings y Routing Keys* (2.1.3 Etapa 1). Declara la topología de RabbitMQ:

| Elemento | Valor |
|---|---|
| Exchange | `logs.direct` (DirectExchange) |
| Colas | `all_logs_queue`, `errors_only_queue` (durables) |
| Bindings | `INFO`, `WARNING`, `ERROR` → `all_logs_queue` · `ERROR` → `errors_only_queue` |

`LogConsumer` escucha ambas colas y muestra `[MONITOR GENERAL]` o `[ALERTA CRÍTICA]` en consola.

## Ejecutar

1. Levantar RabbitMQ (`docker compose up -d` en la carpeta `rabbitmq-hello-world`).
2. Iniciar **primero** este Consumidor (crea el Exchange, las colas y los Bindings):

```bash
mvn clean package
mvn spring-boot:run
```

Con un mensaje `ERROR` enviado desde el Productor deben aparecer las dos líneas:

```
[MONITOR GENERAL] No se pudo conectar a la base de datos
[ALERTA CRÍTICA] No se pudo conectar a la base de datos
```
