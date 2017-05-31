service-hi-ha

启动eureka-server-ha：
Java -jar eureka-server-ha-0.0.1-SNAPSHOT.jar –spring.profiles.active=peer1

java -jar eureka-server-ha-0.0.1-SNAPSHOT.jar –spring.profiles.active=peer2

启动service-hi:
java -jar service-hi-ha-0.0.1-SNAPSHOT.jar
