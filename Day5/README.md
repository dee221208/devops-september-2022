# Day 5

## Cleanup containers whose name starts with word ubuntu
```
docker rm -f $(docker ps -q --filter name=^ubuntu*)
```

## Let's downgrade the Jenkins as it seems to throw exception while launching Jenkins slave node
```
cd ~/Downloads
rm ./jenkins.war
wget https://get.jenkins.io/war/2.346/jenkins.war --no-check-certificate
java -jar ./jenkins.war  --enable-future-java
```
