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

## Maven Profile
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

# Docker

## What are Docker Images?

## What is a Docker Container?

## Docker Registries

## Docker Alternatives

