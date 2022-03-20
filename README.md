## Ejemplo de comunicación entre microservicios usando Apache Kafka

Este proyecto en realidad son 2 proyectos independientes entre si, uno es un productor y el otro un consumidor kafka.

Es una simulación de un microservicios de "Customers" (publicador) y otro llamado "Notifications" (consumidor).

El funcionamiento tiene como objetivo solamente demostrar un ejemplo básico con Kafka de como funciona la comunicación asincrona. Al crear un "Customer" por API REST en el servicio de igual nombre se enviará asincronicamente un evento mediante Apache Kafka a "Notifications", que permitirá en Notifications usar estos datos para los fines que sean necesarios.

Si quieres aprender más sobre microservicios es aquí [SACAViX](https://sacavix.com)
