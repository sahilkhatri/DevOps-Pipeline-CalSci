FROM openjdk

WORKDIR ./

COPY target/DevOpsPipelineCalSci-1.0-SNAPSHOT-jar-with-dependencies.jar .

CMD ["java", "-jar", "DevOpsPipelineCalSci-1.0-SNAPSHOT-jar-with-dependencies.jar"]
