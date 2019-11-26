# jacoco-code-coverage-using-jacococli-with-java-agent-master
#--> First download the latest version 0.8.5 of jacocoagent and jacococli jar from jacoco zip archieve https://www.eclemma.org/jacoco/
#--> Run project war file in command line with jacocoagent jar in vm arguments with below command this will start project on localhost:8080
       java -javaagent:<path-of-jar>/jacocoagent.jar=address=*,port=36320,destfile=jacoco-it.exec,output=tcpserver -jar <path-to-application>/build/<war-name>.war
#--> Now hit the rest endpoints using postman/curl command to get code coverage
       curl -X GET http://localhost:8080/test?parameter=9
       curl -X GET http://localhost:8080/test?parameter=50
       curl -X GET http://localhost:8080/getEmployee/123
       curl -X GET http://localhost:8080/getEmployee/456
#--> now dump the file, which will be in exec format. This code will be all data collected from javaagent to analyze the code coverage. We will use this command to dump the report and the dump file will be inside the build folder.
       java -jar <path-of-jar>/jacococli.jar dump --address localhost --port 36320 --destfile <path-to-application>/build/jacoco-it.exec
#-->we will use the below command to create the final report and to generate code coverage reports readable in many formats, including HTML, CSV, and XML.
       java -jar <path-of-jar>/jacococli.jar report <path-to-application>/build/jacoco-it.exec --classfiles <path-to-application>/build/classes/java/main/org/broonix/controller --sourcefiles <path-to-application>/src/main/java/ --html <path-to-application>/build/jacoco-report
