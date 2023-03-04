FROM openjdk

WORKDIR ./

COPY target/DevOpsPipelineCalSci-1.0-SNAPSHOT.jar .

#CMD ["java", "-jar", "DevOpsPipelineCalSci-1.0-SNAPSHOT.jar"]
CMD ["mkdir", "testdir"]
