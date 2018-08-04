FROM openjdk
COPY target/yerevan.jar /opt/yerevan.jar
ENTRYPOINT ["java","-Xmx512m", "-jar","/opt/yerevan.jar"]
EXPOSE 2025