#!/bin/bash

minikube start
eval $(minikube docker-env)
gradle -p ./microservizio1 build
gradle -p ./microservizio2 build
docker build -t micro1:c1 ./microservizio1
docker build -t micro2:c2 ./microservizio2
kubectl create -f ./createPod.yml
kubectl create -f ./createDeployment.yml
kubectl expose deployment deploy --type=LoadBalancer
kubectl autoscale deployment deploy --cpu-percent=50 --min=1 --max=3
minikube service deploy
minikube dashboard
echo '\nPotrebbero volerci un po di minuti'
