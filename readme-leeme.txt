mpParking

Aplicación para administrar un parqueadero.


#Descripción:
Esta aplicación esta hecha en Java, usa el motor de base de datos MariaDB.
Están incluidos el archivo ejecutable (.jar) y el SQL de la base de datos.

Tiene como funciones la de registrar tanto vehiculos como motocicletas, con sus respectivas marcas,
es opcional si se quiere registrar el id(cédula) del cliente. Una vez registrado el recibo, aparecerá
en la parte de facturación la opción para registrar la salida del vehículo.

Esta app tiene la opción de ver o calcular los ingresos económicos que se han tenido en un tiempo determinado;
el usuario podrá escoger este intervalo, ya que cuenta con la facilidad de poder escoger las fechas. El usuario
podrá escoger entre si quiere ver los ingresos por automiviles, motocicletas,ambas o una placa en específico, 
esto con el fin de sacar estadísticas para poder saber que vehículo está generando más ingresos.

En la parte de seguridad, la aplicación maneja un usuario llamado 'admin' con clave '2468'. Este
usuario es el que tiene prioridad en la aplicación, y posee la el beneficio de usar mas funciones en ella,
tales como la de cambiar lo que se está cobrando por minuto u hora para cada vehículo, modificar el total de
los puestos disponibles para lo vehiculos, registrar un usuario, inhabilitarlo, cambiar su nick o contraseña.
Ademas cuenta con la posibilidad de cambiar el total cobrado al cliente, en case de que quiera aplicar
algún descuento.

Una vez se vayan registrando la entrada de vehículos la aplicación detectara, que tipo de vehículo se registró
y mostrará en pantalla los puestos que quedan disponibles. 

#Uso

Para usar esta app lo primero que debes tener instalado es el JRE para poder correr aplicaciones java.
Puedes descargarlo de la página de Oracle: http://www.oracle.com/technetwork/java/javase/downloads/
Debes instalar tambien el XAMPP para Windows o LAMPP para linux.
Una vez tengas instalado lo anterior debes acceder al phpmyadmin, crearte una base de datos con
el nombre que desees e importar el archivo .sql (mpParking.sql). Puedes borrar todos los registros
en la parte de recibos,facturas, usuarios(menos el admin), o adicionar marcas. Si quieres que los id de cada campo
inicien desde 1, tienes que digitar este comando en la consala SQL: alter table nombreTabla auto_increment=1
Algo muy importante: la conexión a la base de datos esta configurada con el nombre de la base de datos 'mpParking'
y la clave en blanco ''. Si le has puesto otro nombre o tienes otra clave, debes modficarla del archivo
que está en esta ruta: src/modelo/conexion.java

Ya hecho esto puedes ejecutar el .jar y empezar a usar la aplicación.




 
