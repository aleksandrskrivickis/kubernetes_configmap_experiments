sudo mvn package
sudo docker build -t kubernetes-test .
sudo docker run -p 8080:8080 kubernetes-test
