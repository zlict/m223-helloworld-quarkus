# M223 Hello World (Quarkus)
Folgende Schritte sind notwendig um die Applikation zu erstellen und zu starten: 

1. Stellen Sie sicher, dass OpenJDK 11 oder höher installiert und JAVA_HOME korrekt gesetzt ist.  
2. Installieren Sie (falls noch nicht vorhanden) Apache Maven 3.8.1 oder höher
3. Wechseln Sie auf der Kommandozeile in den Ordner dieser Appliation. 
`cd m223-helloworld-quarkus/`
4. Starten Sie die Applikation mit 
```shell script
./mvnw compile quarkus:dev
```
5. Öffnen Sie Ihren Browser unter http://localhost:8080/hello/
6. Navigieren Sie zu http://localhost:8080/hello/greeting/{name}, wobei Sie statt `{name}` Ihren eigenen Namen einsetzen.

## Quelle
* https://quarkus.io/guides/getting-started
