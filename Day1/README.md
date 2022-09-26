# Day 1 

## Ant build tool

- developed by Apache Foundation as an Open source build tool
- mainly used for Java projects as a build tool
- build.xml captures the project name and build instructions
- Ant doesn't haven't dependency management support
- Ant has conventions for java project directory structure, hence different project teams follow different folder structure and this leads to confusion


## Apache Maven build tool
- developed by Apache Foundation as an Open source build tool
- mainly used by Java projects as build tool but also works with other programming language stack
- has conventions for pretty much anything
    - it has conventions on how to name your projects
    - it has conventions on the folder structure ie where to place application source code, where to place test code
- convention over configuration
    - maven uses pom.xml to capture project name as Maven co-ordinates
    - maven has specific section where Maven depedencies can be captured
    - maven has specific section where your project dependencies can be captured
- Maven Co-ordinates
   - uses 3 co-ordinates
       1. GroupId 
           - string that can represents your organization reverse domain name 
           - to avoid naming collision within your organization, you can also append your project name
       2. ArtifactId 
          - name of jar/war/ear/zip 
       3. Version - x.y.z
            x - major version
            y - minor version
            z - incremental version
   - maven project names are unique combination of Maven coordinates
- Maven Plugins
  - these are jar files just like Maven dependencies
  - these plugins are required for Maven to compile your application or package your appliction binaries as a jar/war/ear/zip file, etc.,
  - Maven has plugins for every purpose
  - Maven has a plugin for compiling application code
  - Maven has a plugin for cleaning target folder that has application compiled/packaged binaries
  - Maven has plugin(s) for packaging your application as jar file, war file or ear file, etc.
  - Maven has plugin(s) for deploying application jars into external environment
     - you have a plugin to deploy jars to weblogic
     - you have a plugin to deploy jars to tomcat
     - you have built-in plugin to deploy jars to JFrog Artifactory or Sonatype Nexus
- Maven Dependencies
  - these are jar files just like plugins
  - these are third-party opensource libraries used by your application
  - For example:
     - your application might use log4j for writing applications
     - your application might use junit for unit and integration testing

- Maven Repositories
  - repository is a server ( typically a website )
  - that has a collection of many opensource third-party plugins and application dependency jars
  - in simple words a Modern FTP Server
      - we can manually download jars file just like how we do in classical FTP server
      - apart from this, programatically we could upload/download maven artifacts using their Maven Co-ordinates
  - supports 3 types of Repositories
    1. Local Repository
         - folder created under home directory of the logged in user .m2
    2. Private Repository
         - docker image called registry:2 can be used for R&D and learning purpose 
         - For production grade setup, you could use any of the below software
           1. JFrog Artifactory
           2. Sonatype Nexus
    3. Central Repository
       - is setup using Sonatype Nexus

## Maven High-Level Architecture
![Maven High Level Architecture](MavenHighLevelArchitecture.png)

# Maven Commands

## ⛹️‍♀️ Lab - Finding the maven version installed
```
mvn --version
```

Expected output
<pre>
jegan@tektutor.org devops-september-2022]$ <b>mvn --version</b>
Apache Maven 3.8.6 (84538c9988a25aec085021c365c560670ad80f63)
Maven home: /home/jegan/Downloads/apache-maven-3.8.6
Java version: 17.0.4.1, vendor: Oracle Corporation, runtime: /usr/java/jdk-17.0.4.1
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "3.10.0-1160.el7.x86_64", arch: "amd64", family: "unix"
</pre>

## ⛹️‍♂️ Lab - Validating pom.xml file in your first Maven project
```
cd ~/devops-september-2022
git pull

cd Day1/hello
mvn validate
```

Expected output
<pre>
jegan@tektutor.org hello]$ <b>mvn validate</b>
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.tektutor:tektutor-hello-app >-------------------
[INFO] Building tektutor-hello-app 1.0.0
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.104 s
[INFO] Finished at: 2022-09-26T00:39:28-07:00
[INFO] ------------------------------------------------------------------------
</pre>
