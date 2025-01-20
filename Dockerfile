# Utilizar una imagen base de Java (ajusta la versión según tu proyecto)
FROM openjdk:17-jdk-alpine

# Copiar la aplicación al contenedor
COPY target/CrudEmpleados-0.0.1-SNAPSHOT.jar CrudEmpleados-0.0.1-SNAPSHOT.jar

# Establecer variables de entorno para la conexión a Oracle
ENV SPRING_DATASOURCE_URL=jdbc:oracle:thin:@localhost:1521:xe
ENV SPRING_DATASOURCE_USERNAME=System
ENV SPRING_DATASOURCE_PASSWORD=12345

# Exponer el puerto de la aplicación (ajusta si es necesario)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java","-jar","/CrudEmpleados-0.0.1-SNAPSHOT.jar"]