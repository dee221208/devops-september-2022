# Day 2

## ⛹️‍♂️ Lab - Compiling a Multi-module project
```
cd ~/devops-september-2022
git pull
cd Day2/multi-module-project
mvn clean install
```

Expected output
<pre>
[jegan@tektutor.org multi-module-project]$ <b>mvn clean install</b>
[INFO] Scanning for projects...
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Build Order:
[INFO] 
[INFO] crm                                                                [pom]
[INFO] frontend                                                           [jar]
[INFO] business-layer                                                     [jar]
[INFO] data-access-layer                                                  [jar]
[INFO] main                                                               [jar]
[INFO] 
[INFO] --------------------------< org.tektutor:crm >--------------------------
[INFO] Building crm 1.0                                                   [1/5]
[INFO] --------------------------------[ pom ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ crm ---
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ crm ---
[INFO] Installing /home/jegan/devops-september-2022/Day2/multi-module-project/pom.xml to /home/jegan/.m2/repository/org/tektutor/crm/1.0/crm-1.0.pom
[INFO] 
[INFO] -----------------------< org.tektutor:frontend >------------------------
[INFO] Building frontend 1.0                                              [2/5]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ frontend ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ frontend ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/devops-september-2022/Day2/multi-module-project/frontend/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ frontend ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/devops-september-2022/Day2/multi-module-project/frontend/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ frontend ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/devops-september-2022/Day2/multi-module-project/frontend/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ frontend ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/devops-september-2022/Day2/multi-module-project/frontend/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ frontend ---
[INFO] Surefire report directory: /home/jegan/devops-september-2022/Day2/multi-module-project/frontend/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.tektutor.FrontendTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.054 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ frontend ---
[INFO] Building jar: /home/jegan/devops-september-2022/Day2/multi-module-project/frontend/target/frontend-1.0.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ frontend ---
[INFO] Installing /home/jegan/devops-september-2022/Day2/multi-module-project/frontend/target/frontend-1.0.jar to /home/jegan/.m2/repository/org/tektutor/frontend/1.0/frontend-1.0.jar
[INFO] Installing /home/jegan/devops-september-2022/Day2/multi-module-project/frontend/pom.xml to /home/jegan/.m2/repository/org/tektutor/frontend/1.0/frontend-1.0.pom
[INFO] 
[INFO] --------------------< org.tektutor:business-layer >---------------------
[INFO] Building business-layer 1.0                                        [3/5]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ business-layer ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ business-layer ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/devops-september-2022/Day2/multi-module-project/business-layer/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ business-layer ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/devops-september-2022/Day2/multi-module-project/business-layer/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ business-layer ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/devops-september-2022/Day2/multi-module-project/business-layer/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ business-layer ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/devops-september-2022/Day2/multi-module-project/business-layer/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ business-layer ---
[INFO] Surefire report directory: /home/jegan/devops-september-2022/Day2/multi-module-project/business-layer/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.tektutor.BusinessLayerTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.059 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ business-layer ---
[INFO] Building jar: /home/jegan/devops-september-2022/Day2/multi-module-project/business-layer/target/business-layer-1.0.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ business-layer ---
[INFO] Installing /home/jegan/devops-september-2022/Day2/multi-module-project/business-layer/target/business-layer-1.0.jar to /home/jegan/.m2/repository/org/tektutor/business-layer/1.0/business-layer-1.0.jar
[INFO] Installing /home/jegan/devops-september-2022/Day2/multi-module-project/business-layer/pom.xml to /home/jegan/.m2/repository/org/tektutor/business-layer/1.0/business-layer-1.0.pom
[INFO] 
[INFO] -------------------< org.tektutor:data-access-layer >-------------------
[INFO] Building data-access-layer 1.0                                     [4/5]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ data-access-layer ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ data-access-layer ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/devops-september-2022/Day2/multi-module-project/data-access-layer/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ data-access-layer ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/devops-september-2022/Day2/multi-module-project/data-access-layer/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ data-access-layer ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/devops-september-2022/Day2/multi-module-project/data-access-layer/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ data-access-layer ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/devops-september-2022/Day2/multi-module-project/data-access-layer/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ data-access-layer ---
[INFO] Surefire report directory: /home/jegan/devops-september-2022/Day2/multi-module-project/data-access-layer/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.tektutor.DataAccessLayerTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.053 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ data-access-layer ---
[INFO] Building jar: /home/jegan/devops-september-2022/Day2/multi-module-project/data-access-layer/target/data-access-layer-1.0.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ data-access-layer ---
[INFO] Installing /home/jegan/devops-september-2022/Day2/multi-module-project/data-access-layer/target/data-access-layer-1.0.jar to /home/jegan/.m2/repository/org/tektutor/data-access-layer/1.0/data-access-layer-1.0.jar
[INFO] Installing /home/jegan/devops-september-2022/Day2/multi-module-project/data-access-layer/pom.xml to /home/jegan/.m2/repository/org/tektutor/data-access-layer/1.0/data-access-layer-1.0.pom
[INFO] 
[INFO] -------------------------< org.tektutor:main >--------------------------
[INFO] Building main 1.0                                                  [5/5]
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ main ---
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ main ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/devops-september-2022/Day2/multi-module-project/main/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ main ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/devops-september-2022/Day2/multi-module-project/main/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ main ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/jegan/devops-september-2022/Day2/multi-module-project/main/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ main ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/jegan/devops-september-2022/Day2/multi-module-project/main/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ main ---
[INFO] Surefire report directory: /home/jegan/devops-september-2022/Day2/multi-module-project/main/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.tektutor.MainTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.05 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ main ---
[INFO] Building jar: /home/jegan/devops-september-2022/Day2/multi-module-project/main/target/main-1.0.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ main ---
[INFO] Installing /home/jegan/devops-september-2022/Day2/multi-module-project/main/target/main-1.0.jar to /home/jegan/.m2/repository/org/tektutor/main/1.0/main-1.0.jar
[INFO] Installing /home/jegan/devops-september-2022/Day2/multi-module-project/main/pom.xml to /home/jegan/.m2/repository/org/tektutor/main/1.0/main-1.0.pom
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for crm 1.0:
[INFO] 
[INFO] crm ................................................ SUCCESS [  0.276 s]
[INFO] frontend ........................................... SUCCESS [  1.676 s]
[INFO] business-layer ..................................... SUCCESS [  0.371 s]
[INFO] data-access-layer .................................. SUCCESS [  0.361 s]
[INFO] main ............................................... SUCCESS [  0.372 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.173 s
[INFO] Finished at: 2022-09-26T22:32:07-07:00
[INFO] ------------------------------------------------------------------------
</pre>

## ⛹️‍♂️ Maven Profile
```
cd ~/devops-september-2022
git pull
cd Day2/profiles

mvn test -P test
```

Expected output
<pre>

</pre>

## Hypervisor
- aka virtualization technology
- heavy weight Virtualization
   - Guest Operating System (Virtual Machine)
      - they need to allocated dedicated hardware resources 
         - CPU Cores
         - RAM
         - Hard Disk Storage
- its a combination of hardware & software technology
- General Purpose Processors (x86_64 bit Processor)
   - AMD
     - AMD-V (Virtualization Feature)
   - Intel
     - VT-X (Virtualization Feature)

- Two types
  1. Type 1 ( Bare Metal Hypervisors )
     - example VMWare vSphere/vCenter
     - Microsoft Hyper-V
  2. Type 2
     - Example
       VMWare 
         - Fusion (Mac OS-X)
         - Workstation ( Windows/Linux/Mac )
       Oracle
         - VirtualBox (Free - Windows/Linux/Mac)
       
       
## Container Technology
- application virtualization technology
- each container is nothing but an application process
- each container runs in its own namespace
- every container has got its own network stack (7 OSI Layers)
- container is not an Operating System
- every container get its own IP and file system
- containers looks like a Virtual Machine but one container can host/run only one application
- every container gets its own ports ( 0 - 65535 ports )
- hence technically it is possible to run 10 tomcat web server on the same machine all listing at port 8080
- containers don't need to be allocated with dedicated CPU, RAM or Storage
- container technology is ligh weight virtualization technology
- containers depends on the OS Kernel on the Host OS where containers are running for any OS feature
- all containers running on the same desktop/laptop/workstation/servers share the underlying hardwares resources available on that machine

## What is Container Runtime?
- Container runtime helps managing containers
  - creating a container
  - starting a container
  - stoping a container
  - restarting a container
  - abort/kill a container
  - delete a container
- Example
  - runC is a Container Runtime

## What is Container Engine?
- Container Engine depends on Container Runtime to manage containers
- Container Engine provides easy to use user-friendly commands to manage containers and images
- Container Engine depends on other tools to manage images just like how they depend on Container Runtime
- end-users like us will only use Container Engine as they are easy to use, but they internally depends on other tools to get the job done
- Example
  - Docker is a Container Engine that depends on runC Container Runtime
  - Podman is a Container Engine that depends on CRI-O Container Runtime

## Linux Kernel Features that enable Container Technology
1. Namespace
   - helps in isolating one container from accessing other container resources
   - just like how Hypervisors isolate one Virtual Machine from access other Virtual Machine resources
2. Control Group (CGroup)
   - we should be able to apply resource quota restrictions for each container optionally
   - For instance
      - we could restrict a container to use maximum 25% CPU ( in a system with 4 core - it can only 1 core )
      - we could restrict a container to use upto 1GB RAM

# Docker
- is one of the Container Engines
- Docker is developed in Go Programming Language by Docker Inc organization
- Docker comes in 2 flavours
  1. Community Edition (CE) - opensource or personal or non-commercial use
  2. Enterprise Edition (EE) - Commercial use

## What is Docker Hub?
- a website that has many Docker Images
- the website is managed by Docker Inc organization which developed Docker
- any one would be able to contribute i.e push their custom images to Docker Hub for public use

## What are Docker Images?
- a blueprint of a container
- we can use existing docker images from Docker Hub
- in certain scenarios, you may look for container images with specific tools pre-installed. But it is impossible to find every tool that projects need in a image that comes from Docker Hub. In such cases, you can pick an Docker Hub that has most of the tools you were looking for, and prepare a custom Docker image by installing all necessary tools.
- containers are created from Docker Image
- From one Container any number of Containers can be created

## What is a Docker Container?
- an running instance of a Docker Image
- tools installed on the Docker Image are available for use in Container
- one container typically runs one application

## Docker Registries
- Docker Registry has many collection of Docker Images
- Docker supports 3 types of Registries
  1. Local Registry ( /var/lib/docker folder on your system )
  2. Private Registry ( can be setup using JFrog Artifactory or Sonatype Nexus )
  3. Remote Registry ( Docker Hub website )

## Docker Alternatives
- LXC
- Containerd
- Podman

## ⛹️‍♂️ Lab - Finding the docker version
```
docker --version
```

Expected output
<pre>
[jegan@tektutor.org Day2]$ <b>docker --version</b>
Docker version 20.10.18, build b40c2f6
</pre>

## ⛹️‍♂️ Lab - Troubleshooting Docker permission denied errors
```
newgrp docker
docker images
```

## ⛹️‍♂️ Lab - Listing Docker Images from your Local Docker Registry
```
docker images
```

Expected output
<pre>
[jegan@tektutor.org Day2]$ <b>docker images</b>
REPOSITORY                                TAG       IMAGE ID       CREATED       SIZE
mysql                                     latest    43fcfca0776d   12 days ago   449MB
docker.bintray.io/jfrog/artifactory-oss   latest    e7053142b08e   3 weeks ago   1.24GB
</pre>

## ⛹️‍♂️ Lab - Downloading Docker Image from Docker Hub to Local Registry
```
docker pull hello-world:latest
```

Expected output
<pre>
[jegan@tektutor.org Day2]$ <b>docker pull hello-world:latest</b>
latest: Pulling from library/hello-world
2db29710123e: Pull complete 
Digest: sha256:62af9efd515a25f84961b70f973a798d2eca956b1b2b026d0a4a63a3b0b6a3f2
Status: Downloaded newer image for hello-world:latest
docker.io/library/hello-world:latest
[jegan@tektutor.org Day2]$ docker images
REPOSITORY                                TAG       IMAGE ID       CREATED         SIZE
mysql                                     latest    43fcfca0776d   12 days ago     449MB
docker.bintray.io/jfrog/artifactory-oss   latest    e7053142b08e   3 weeks ago     1.24GB
hello-world                               latest    feb5d9fea6a5   12 months ago   13.3kB
</pre>

## ⛹️‍♂️ Lab - Deleting a Docker Image from Local Registry
```
docker rmi hello-world:latest
```

Expected output
<pre>
[jegan@tektutor.org Day2]$ <b>docker rmi hello-world:latest</b>
Untagged: hello-world:latest
Untagged: hello-world@sha256:62af9efd515a25f84961b70f973a798d2eca956b1b2b026d0a4a63a3b0b6a3f2
Deleted: sha256:feb5d9fea6a5e9606aa995e879d862b825965ba48de054caab5ef356dc6b3412
Deleted: sha256:e07ee1baac5fae6a26f30cabfe54a36d3402f96afda318fe0a96cec4ca393359
</pre>

## ⛹️‍♂️ Lab - Creating your first docker container
```
docker run hello-world:latest
```

Expected output
<pre>
[jegan@tektutor.org Day2]$ <b>docker run hello-world:latest</b>
Unable to find image 'hello-world:latest' locally
latest: Pulling from library/hello-world
2db29710123e: Pull complete 
Digest: sha256:62af9efd515a25f84961b70f973a798d2eca956b1b2b026d0a4a63a3b0b6a3f2
Status: Downloaded newer image for hello-world:latest

Hello from Docker!
This message shows that your installation appears to be working correctly.

To generate this message, Docker took the following steps:
 1. The Docker client contacted the Docker daemon.
 2. The Docker daemon pulled the "hello-world" image from the Docker Hub.
    (amd64)
 3. The Docker daemon created a new container from that image which runs the
    executable that produces the output you are currently reading.
 4. The Docker daemon streamed that output to the Docker client, which sent it
    to your terminal.

To try something more ambitious, you can run an Ubuntu container with:
 $ docker run -it ubuntu bash

Share images, automate workflows, and more with a free Docker ID:
 https://hub.docker.com/

For more examples and ideas, visit:
 https://docs.docker.com/get-started/
</pre>


## ⛹️‍♂️ Lab - Listing currently running containers
```
docker ps
```

Expected output
<pre>
[jegan@tektutor.org Day2]$ <b>docker ps</b>
CONTAINER ID   IMAGE                                            COMMAND                  CREATED        STATUS        PORTS                                                           NAMES
ad3588fe2258   mysql:latest                                     "docker-entrypoint.s…"   20 hours ago   Up 20 hours   3306/tcp, 33060/tcp                                             mysql
1cbbabada110   docker.bintray.io/jfrog/artifactory-oss:latest   "/entrypoint-artifac…"   21 hours ago   Up 21 hours   0.0.0.0:8081-8082->8081-8082/tcp, :::8081-8082->8081-8082/tcp   artifactory
</pre>

## ⛹️‍♂️ Lab - Listing all containers including the one that exited
```
docker ps -a
```

Expected output
<pre>
[jegan@tektutor.org Day2]$ docker ps -a
CONTAINER ID   IMAGE                                            COMMAND                  CREATED         STATUS                     PORTS                                                           NAMES
<b>9db646569c40   hello-world:latest                               "/hello"                 2 minutes ago   Exited (0) 2 minutes ago                                                                   dazzling_lalande</b>
ad3588fe2258   mysql:latest                                     "docker-entrypoint.s…"   20 hours ago    Up 20 hours                3306/tcp, 33060/tcp                                             mysql
1cbbabada110   docker.bintray.io/jfrog/artifactory-oss:latest   "/entrypoint-artifac…"   21 hours ago    Up 21 hours                0.0.0.0:8081-8082->8081-8082/tcp, :::8081-8082->8081-8082/tcp   artifactory
</pre>


## ⛹️‍♂️ Lab - Creating a container and running it in background
```
docker run -dit --name ubuntu1 --hostname ubuntu1 ubuntu:16.04 /bin/bash
docker ps
```

Expected output
<pre>
[jegan@tektutor.org Day2]$ <b>docker run -dit --name ubuntu1 --hostname ubuntu1 ubuntu:16.04 /bin/bash</b>
Unable to find image 'ubuntu:16.04' locally
16.04: Pulling from library/ubuntu
58690f9b18fc: Pull complete 
b51569e7c507: Pull complete 
da8ef40b9eca: Pull complete 
fb15d46c38dc: Pull complete 
Digest: sha256:91bd29a464fdabfcf44e29e1f2a5f213c6dfa750b6290e40dd6998ac79da3c41
Status: Downloaded newer image for ubuntu:16.04
517846b24a6a775d9e192d41cb68a0f74d43062fe321525d1e2ceb8c2e9378e6
[jegan@tektutor.org Day2]$ <b>docker ps</b>
CONTAINER ID   IMAGE                                            COMMAND                  CREATED         STATUS         PORTS                                                           NAMES
<b>517846b24a6a   ubuntu:16.04                                     "/bin/bash"              6 seconds ago   Up 5 seconds                                                                   ubuntu1</b>
ad3588fe2258   mysql:latest                                     "docker-entrypoint.s…"   20 hours ago    Up 20 hours    3306/tcp, 33060/tcp                                             mysql
1cbbabada110   docker.bintray.io/jfrog/artifactory-oss:latest   "/entrypoint-artifac…"   21 hours ago    Up 21 hours    0.0.0.0:8081-8082->8081-8082/tcp, :::8081-8082->8081-8082/tcp   artifactory
</pre>

## ⛹️‍♂️ Lab - Opening a shell inside a running container
```
docker ps
```

Expected output
<pre>
[jegan@tektutor.org Day2]$ <b>docker ps</b>
CONTAINER ID   IMAGE                                            COMMAND                  CREATED         STATUS         PORTS                                                           NAMES
<b>517846b24a6a   ubuntu:16.04                                     "/bin/bash"              6 seconds ago   Up 5 seconds                                                                   ubuntu1</b>
ad3588fe2258   mysql:latest                                     "docker-entrypoint.s…"   20 hours ago    Up 20 hours    3306/tcp, 33060/tcp                                             mysql
1cbbabada110   docker.bintray.io/jfrog/artifactory-oss:latest   "/entrypoint-artifac…"   21 hours ago    Up 21 hours    0.0.0.0:8081-8082->8081-8082/tcp, :::8081-8082->8081-8082/tcp   artifactory
[jegan@tektutor.org Day2]$ docker exec -it ubuntu1 /bin/bash
root@ubuntu1:/# <b>hostname</b>
ubuntu1
root@ubuntu1:/# <b>hostname -i</b>
172.17.0.4
root@ubuntu1:/# <b>ls</b>
bin  boot  dev  etc  home  lib  lib64  media  mnt  opt  proc  root  run  sbin  srv  sys  tmp  usr  var
root@ubuntu1:/# <b>exit</b>
exit
</pre>

## ⛹️‍♂️ Lab - Stopping a running container
```
docker ps
docker stop ubuntu1
docker ps
```

Expected output
<pre>
[jegan@tektutor.org Day2]$ <b>docker ps</b>
CONTAINER ID   IMAGE                                            COMMAND                  CREATED         STATUS         PORTS                                                           NAMES
<b>517846b24a6a   ubuntu:16.04                                     "/bin/bash"              6 minutes ago   Up 6 minutes                                                                   ubuntu1</b>
ad3588fe2258   mysql:latest                                     "docker-entrypoint.s…"   21 hours ago    Up 21 hours    3306/tcp, 33060/tcp                                             mysql
1cbbabada110   docker.bintray.io/jfrog/artifactory-oss:latest   "/entrypoint-artifac…"   21 hours ago    Up 21 hours    0.0.0.0:8081-8082->8081-8082/tcp, :::8081-8082->8081-8082/tcp   artifactory
[jegan@tektutor.org Day2]$ <b>docker stop ubuntu1</b>
ubuntu1
[jegan@tektutor.org Day2]$ <b>docker ps</b>
CONTAINER ID   IMAGE                                            COMMAND                  CREATED        STATUS        PORTS                                                           NAMES
ad3588fe2258   mysql:latest                                     "docker-entrypoint.s…"   21 hours ago   Up 21 hours   3306/tcp, 33060/tcp                                             mysql
1cbbabada110   docker.bintray.io/jfrog/artifactory-oss:latest   "/entrypoint-artifac…"   21 hours ago   Up 21 hours   0.0.0.0:8081-8082->8081-8082/tcp, :::8081-8082->8081-8082/tcp   artifactory
</pre>
