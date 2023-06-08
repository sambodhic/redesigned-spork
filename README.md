# redesigned-spork  
Scala Spark Kafka  

Testing out StructuredKafkaWordCount.scala in the following environment -  
(Spark 3.4.0 using Scala version 2.12.17, OpenJDK 64-Bit Server VM, 17.0.7, Kafka 3.4.0, Zookeeper 3.6.3)  

Start Zookeeper  
$ zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties  
  
Start Kafka  
$ kafka-server-start /usr/local/etc/kafka/server.properties  
  
Check Status  
$ jps  
  
Create Kafka topic  
$ kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic demotopic1  
  
Start the producer  
$ kafka-console-producer --broker-list localhost:9092 --topic demotopic1  
  
Start the consumer (optional)  
$ kafka-console-consumer --bootstrap-server localhost:9092 --topic demotopic1 --from-beginning  
  
Compile Scala code (Spark)  
$ sbt compile  
  
Run Scala code (Spark)  
$ sbt "runMain Demo localhost:9092 subscribe demotopic1"  
