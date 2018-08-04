FROM openjdk:8u171-jdk
COPY target/yerevan.jar /opt/yerevan.jar
ENTRYPOINT ["java","-Xmx512m", "-jar","/opt/yerevan.jar"]
EXPOSE 2025