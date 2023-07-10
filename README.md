# Spring Microservices Project
Project to work on Services, Docker and Kubernetes.


# Tech
#### Microservice Framework Used : Spring Boot (Version 3.1.1)
#### Database Used : H2 (Configuration Setup in Application.properties)
#### Project management tool : Maven (Version 3.6.3)
#### Service Discovery Server and Client and Load Balancing : { Initially : Netflix Eureka (Version 1.4.7), finally : Kubernetes }
#### Fault tolerance library : { Initially : Resilience4j (Version 2.1.0), finally : Kubernetes }
#### Containerization : Docker (Version 24.0.2)
#### Container Orchestration Tool : Kubernetes
#### Kubernetes Interaction : Google Cloud SDK Shell & Kubectl (Version 5.0.1)

# Features & Tools
#### Used Feign Framework to reduce boilerplate code in calling different microservices from a microservice intrinsically.
#### All Microservices will register through service registry to discover what instances of microservices are present to interact with the demanding services.
#### To implement all the common features of each microservice at one place created a API Gateway.
#### Connected API Gateway to Eureka so that it can discover any services present.
#### Customized Routes for filters using API Gateway.
#### Solved and tested problems like FALLBACK RESPONSE when service is down, to reduce HITTING LOAD when service is down, RETRY REQUEST if service is down temporarily and to implement CIRCUIT BREAKER Framework Resilience4j.
#### For Solving deployment on different environment created Docker Images & Container.
#### Used Zipkin to ensure distributed tracing to trace request and bugs.
#### To gather all data and Intelligence from the metrics, logs and traces we use Open Telemetry.
#### Used Docker-Compose to run all the docker images easily.
#### Deployed on Kubernetes to get features like Auto Scaling, Service Discovery, Load Balancer, Self Healing and Zero downtime deployments.
#### Created Kubernetes Cluster.
#### Created Declarative and Centralized Config through .yaml file for making changes in Kubernetes from local and internally when currency conversion will call currency exchange so there will be no hardcoded hostname.
#### To avoid downtime on rolling or normal update using Liveness and Readiness Probes which is provided by the Actuator.

# Disclaimer
Added different folder(Kubernetes) of basic currency exchange and conversion services as K8S provide all other major fuctionality.
**From 1st October 2023 these links will not work as the free trial of Google Cloud will end.**

# Links
(http://35.224.147.163:8000/currency-exchange/from/USD/to/INR)

(http://34.123.39.118:8100/currency-conversion-feign/from/AUD/to/INR/quantity/10)

# Docker Images
#### Spring Microservice
(https://hub.docker.com/repository/docker/mudit1321/scm-currency-exchange-service/general)
(https://hub.docker.com/repository/docker/mudit1321/scm-currency-conversion-service/general)
(https://hub.docker.com/repository/docker/mudit1321/scm-naming-server/general)
(https://hub.docker.com/repository/docker/mudit1321/scm-api-gateway/general)

#### Kubernetes
(https://hub.docker.com/repository/docker/mudit1321/scm-currency-exchange-service-kubernetes/general)
(https://hub.docker.com/repository/docker/mudit1321/scm-currency-conversion-service-kubernetes/general)



