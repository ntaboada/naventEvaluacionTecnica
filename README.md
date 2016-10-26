# naventEvaluacionTecnica

Respuestas

1) Ver implementación 

2) En este caso, para dar la mejor respuesta posible es preciso conocer mejor el negocio, el modelo de datos y la implementacion de la DB (Relacional, orientada a objetos, etc). De todos modos hay algunas consideraciones que se podrian mencionar para los casos mas comunes:

Independientemente del tipo de BD que se use, establecer una politica eficiente para renovar los elementos en la cache puede mejorar mucho la cantidad de consultas que se hacen a la BD.
Si hablamos de una base de datos relacional, es mucho mas eficiente realizar consultas por columnas que tengan un indice, asi que seria conveniente que las columnas por las cuales se necesita consultar lo tengan, y efectivamente realizar las consultar por el mismo.
