# Reactive vs Imperative - performance comparison

### Build project
    
    ./gradlew clean build
    
### Run imperative and reactive servers locally

    ./gradlew :imperative:bootRun
    ./gradlew :reactive:bootRun
    
### Execute Gatling performance tests

    ./gradlew gatlingRun
    
## Docker
    
### Dockerize servers

    ./gradlew jibDockerBuild
    
### Push Docker images into AWS ECR

    docker push 509029984649.dkr.ecr.eu-central-1.amazonaws.com/imperative:latest
    docker push 509029984649.dkr.ecr.eu-central-1.amazonaws.com/reactive:latest