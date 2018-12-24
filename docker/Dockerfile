FROM java:8

# 添加jar到容器
ADD docker-maven-spring-boot-demo-1.0.0.jar app.jar

# 容器启动后执行的命令
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /app.jar"]
