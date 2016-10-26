# naventEvaluacionTecnica

Respuestas

1) Ver implementación 


2) En este caso, para dar la mejor respuesta posible es preciso conocer mejor el negocio, el modelo de datos y la implementacion de la DB . Algunas consideraciones que se podrian mencionar para los casos mas comunes serian:

Independientemente del tipo de BD que se use, establecer una politica eficiente para renovar los elementos en la cache puede mejorar mucho la cantidad de consultas que se hacen a la BD.

Si hablamos de una base de datos relacional, es mucho mas eficiente realizar consultas por columnas que tengan un indice (por ejemplo el idPedido), asi que seria conveniente que las columnas por las cuales se necesita consultar lo tengan.

Si la DB lo soporta, utilizar el nivel de aislamiento correcto.
