### Spring Boot GraphQL with Kubernetes Deployment

Run below command to build the image and run the image in container
```
sh start.sh
```

Run below command to stop and remove the container
```
sh stop.sh
```

Access GraphQL UI
```
http://localhost:8080/graphiql
```

Push a local image to remote image registry
```
docker login
docker tag spring-boot-graphql:1.0 <IMAGE-REGISTRY-USERNAME>/spring-boot-graphql:1.0
docker push <IMAGE-REGISTRY-USERNAME>/spring-boot-graphql:1.0
```

### Local Deployment

Start minikube and create a cluster
```
minikube start
```

Check minikube status
```
minikube status
```

Open minikube kubernetes dashboard UI
```
minikube dashboard
```

Local kubernetes deployment
```
kubectl apply -f spring-boot-graphql-deployment.yaml
```

Get service url to access the app UI
```
minikube service spring-boot-graphql --url
```

Stop minikube cluster
```
minikube stop
```

Delete minikube cluster
```
minikube delete
```

### Documentation
1. [Installing Kubernetes with Minikube](https://kubernetes.io/docs/setup/learning-environment/minikube/)
2. [Kubernetes Deployment](https://kubernetes.io/docs/tutorials/)
3. [GraphQL Spring Boot](https://www.graphql-java-kickstart.com/spring-boot/)
