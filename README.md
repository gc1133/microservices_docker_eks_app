# microservices_docker_eks_app

kompose convert

eksctl create cluster --name my-eks-demo-cluster --nodegroup-name my-eks-demo-node-group  --node-type t2.medium --nodes 2 --nodes-min 2 --nodes-max 3 --managed --asg-access

kubectl apply -f mydockerapp-volume-persistentvolumeclaim.yaml
kubectl apply -f mysql-deployment-final.yaml
kubectl apply -f discount-service-deployment-final.yaml
kubectl apply -f product-service-deployment-final.yaml



kubectl delete all -l io.kompose.service=mydockerapp-volume  
kubectl delete all -l io.kompose.service=mysql
kubectl delete all -l io.kompose.service=product-service
kubectl delete all -l io.kompose.service=discount-service
