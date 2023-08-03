# Spring Microservices Project
Currency exchange and currency conversion microservices are a common component in financial systems that facilitate the conversion of one currency to another based on prevailing exchange rates. In this overview, we'll explore how such microservices can be implemented using Netflix Eureka, API Gateway, Docker, and Kubernetes.

#### Netflix Eureka:
Netflix Eureka is a service registry that enables microservices to discover and communicate with each other in a distributed system. In the context of currency exchange microservices, Eureka can be used to register and locate the currency exchange and conversion services. Each microservice registers itself with Eureka, which maintains a dynamic registry of available services, allowing other services to discover and interact with them.

#### API Gateway:
An API Gateway acts as a single entry point for clients to access various microservices. It provides a unified interface, authentication, authorization, load balancing, caching, and other cross-cutting concerns. In the case of currency exchange and conversion microservices, the API Gateway can expose a consolidated set of APIs that handle currency conversion requests and route them to the appropriate microservice based on the requested currency pair.

#### Docker:
Docker is a containerization platform that enables packaging applications and their dependencies into lightweight, portable containers. By containerizing currency exchange and conversion microservices using Docker, you can ensure consistency and reproducibility across different environments. Each microservice can be packaged as a separate Docker container, which includes the necessary runtime, dependencies, and configurations.

#### Kubernetes:
Kubernetes is an orchestration platform for managing containerized applications. It simplifies the deployment, scaling, and management of microservices across a cluster of machines. With Kubernetes, you can define and manage the desired state of your currency exchange and conversion microservices, scale them based on demand, and ensure high availability and fault tolerance.


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
#### Used Feign Library to reduce boilerplate code in calling different microservices from a microservice intrinsically.
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
(http://35.224.147.163:8000/currency-exchange/from/USD/to/INR) "You can also use AUD to INR or EUR to INR"
(http://34.123.39.118:8100/currency-conversion-feign/from/AUD/to/INR/quantity/10)

# Screenshots
![Screenshot 2023-07-13 192259](https://github.com/Deadlegend1321/Microservices/assets/51445048/3f13aae0-d727-46a2-9337-ac3bbe6bbf3f)
![Screenshot 2023-07-13 192333](https://github.com/Deadlegend1321/Microservices/assets/51445048/81c6d954-e6ba-444f-9b39-2e0edead8b6d)
![use](https://github.com/Deadlegend1321/Microservices/assets/51445048/1724c4f6-c4c9-48a8-9b3a-8ae59a8cea06)

# Docker Images
#### Spring Microservice
(https://hub.docker.com/repository/docker/mudit1321/scm-currency-exchange-service/general)
(https://hub.docker.com/repository/docker/mudit1321/scm-currency-conversion-service/general)
(https://hub.docker.com/repository/docker/mudit1321/scm-naming-server/general)
(https://hub.docker.com/repository/docker/mudit1321/scm-api-gateway/general)

#### Kubernetes
(https://hub.docker.com/repository/docker/mudit1321/scm-currency-exchange-service-kubernetes/general)
(https://hub.docker.com/repository/docker/mudit1321/scm-currency-conversion-service-kubernetes/general)



