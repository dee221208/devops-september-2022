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


## Lab - Printing effective pom
```
cd ~/devops-september-2022
git pull
cd Day1/hello

mvn help:effective-pom
```

Expected output
```
jegan@tektutor.org hello]$ <b>mvn help:effective-pom</b>
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< org.tektutor:tektutor-hello-app >-------------------
[INFO] Building tektutor-hello-app 1.0.0
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-help-plugin:3.3.0:effective-pom (default-cli) @ tektutor-hello-app ---
[INFO] 
Effective POMs, after inheritance, interpolation, and profiles are applied:

<?xml version="1.0" encoding="UTF-8"?>
<!-- ====================================================================== -->
<!--                                                                        -->
<!-- Generated by Maven Help Plugin                                         -->
<!-- See: https://maven.apache.org/plugins/maven-help-plugin/               -->
<!--                                                                        -->
<!-- ====================================================================== -->
<!-- ====================================================================== -->
<!--                                                                        -->
<!-- Effective POM for project 'org.tektutor:tektutor-hello-app:jar:1.0.0'  -->
<!--                                                                        -->
<!-- ====================================================================== -->
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>org.tektutor</groupId>
  <artifactId>tektutor-hello-app</artifactId>
  <version>1.0.0</version>
  <repositories>
    <repository>
      <snapshots>
        <enabled>false</enabled>
      </snapshots>
      <id>central</id>
      <name>Central Repository</name>
      <url>https://repo.maven.apache.org/maven2</url>
    </repository>
  </repositories>
  <pluginRepositories>
    <pluginRepository>
      <releases>
        <updatePolicy>never</updatePolicy>
      </releases>
      <snapshots>
        <enabled>false</enabled>
      </snapshots>
      <id>central</id>
      <name>Central Repository</name>
      <url>https://repo.maven.apache.org/maven2</url>
    </pluginRepository>
  </pluginRepositories>
  <build>
    <sourceDirectory>/home/jegan/devops-september-2022/Day1/hello/src/main/java</sourceDirectory>
    <scriptSourceDirectory>/home/jegan/devops-september-2022/Day1/hello/src/main/scripts</scriptSourceDirectory>
    <testSourceDirectory>/home/jegan/devops-september-2022/Day1/hello/src/test/java</testSourceDirectory>
    <outputDirectory>/home/jegan/devops-september-2022/Day1/hello/target/classes</outputDirectory>
    <testOutputDirectory>/home/jegan/devops-september-2022/Day1/hello/target/test-classes</testOutputDirectory>
    <resources>
      <resource>
        <directory>/home/jegan/devops-september-2022/Day1/hello/src/main/resources</directory>
      </resource>
    </resources>
    <testResources>
      <testResource>
        <directory>/home/jegan/devops-september-2022/Day1/hello/src/test/resources</directory>
      </testResource>
    </testResources>
    <directory>/home/jegan/devops-september-2022/Day1/hello/target</directory>
    <finalName>tektutor-hello-app-1.0.0</finalName>
    <pluginManagement>
      <plugins>
        <plugin>
          <artifactId>maven-antrun-plugin</artifactId>
          <version>1.3</version>
        </plugin>
        <plugin>
          <artifactId>maven-assembly-plugin</artifactId>
          <version>2.2-beta-5</version>
        </plugin>
        <plugin>
          <artifactId>maven-dependency-plugin</artifactId>
          <version>2.8</version>
        </plugin>
        <plugin>
          <artifactId>maven-release-plugin</artifactId>
          <version>2.5.3</version>
        </plugin>
      </plugins>
    </pluginManagement>
    <plugins>
      <plugin>
        <artifactId>maven-clean-plugin</artifactId>
        <version>2.5</version>
        <executions>
          <execution>
            <id>default-clean</id>
            <phase>clean</phase>
            <goals>
              <goal>clean</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
      <plugin>
        <artifactId>maven-resources-plugin</artifactId>
        <version>2.6</version>
        <executions>
          <execution>
            <id>default-testResources</id>
            <phase>process-test-resources</phase>
            <goals>
              <goal>testResources</goal>
            </goals>
          </execution>
          <execution>
            <id>default-resources</id>
            <phase>process-resources</phase>
            <goals>
              <goal>resources</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
      <plugin>
        <artifactId>maven-jar-plugin</artifactId>
        <version>2.4</version>
        <executions>
          <execution>
            <id>default-jar</id>
            <phase>package</phase>
            <goals>
              <goal>jar</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
      <plugin>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.1</version>
        <executions>
          <execution>
            <id>default-compile</id>
            <phase>compile</phase>
            <goals>
              <goal>compile</goal>
            </goals>
          </execution>
          <execution>
            <id>default-testCompile</id>
            <phase>test-compile</phase>
            <goals>
              <goal>testCompile</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
      <plugin>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>2.12.4</version>
        <executions>
          <execution>
            <id>default-test</id>
            <phase>test</phase>
            <goals>
              <goal>test</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
      <plugin>
        <artifactId>maven-install-plugin</artifactId>
        <version>2.4</version>
        <executions>
          <execution>
            <id>default-install</id>
            <phase>install</phase>
            <goals>
              <goal>install</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
      <plugin>
        <artifactId>maven-deploy-plugin</artifactId>
        <version>2.7</version>
        <executions>
          <execution>
            <id>default-deploy</id>
            <phase>deploy</phase>
            <goals>
              <goal>deploy</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
      <plugin>
        <artifactId>maven-site-plugin</artifactId>
        <version>3.3</version>
        <executions>
          <execution>
            <id>default-site</id>
            <phase>site</phase>
            <goals>
              <goal>site</goal>
            </goals>
            <configuration>
              <outputDirectory>/home/jegan/devops-september-2022/Day1/hello/target/site</outputDirectory>
              <reportPlugins>
                <reportPlugin>
                  <groupId>org.apache.maven.plugins</groupId>
                  <artifactId>maven-project-info-reports-plugin</artifactId>
                </reportPlugin>
              </reportPlugins>
            </configuration>
          </execution>
          <execution>
            <id>default-deploy</id>
            <phase>site-deploy</phase>
            <goals>
              <goal>deploy</goal>
            </goals>
            <configuration>
              <outputDirectory>/home/jegan/devops-september-2022/Day1/hello/target/site</outputDirectory>
              <reportPlugins>
                <reportPlugin>
                  <groupId>org.apache.maven.plugins</groupId>
                  <artifactId>maven-project-info-reports-plugin</artifactId>
                </reportPlugin>
              </reportPlugins>
            </configuration>
          </execution>
        </executions>
        <configuration>
          <outputDirectory>/home/jegan/devops-september-2022/Day1/hello/target/site</outputDirectory>
          <reportPlugins>
            <reportPlugin>
              <groupId>org.apache.maven.plugins</groupId>
              <artifactId>maven-project-info-reports-plugin</artifactId>
            </reportPlugin>
          </reportPlugins>
        </configuration>
      </plugin>
    </plugins>
  </build>
  <reporting>
    <outputDirectory>/home/jegan/devops-september-2022/Day1/hello/target/site</outputDirectory>
  </reporting>
</project>


[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.684 s
[INFO] Finished at: 2022-09-26T01:47:35-07:00
[INFO] ------------------------------------------------------------------------
```
