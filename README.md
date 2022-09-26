# Devops September 2022 ( 26-30 Sep 2022 )

## Day 1

## Installing JDK 17 in CentOS 7.9 2009
```
cd ~/Downloads
wget https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.rpm 
sudo yum install -y jdk-17_linux-x64_bin.rpm
```

Expected output
<pre>
[jegan@tektutor.org ~]$ <b>cd Downloads/</b>
[jegan@tektutor.org Downloads]$ <b>wget https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.rpm</b>
--2022-09-25 22:21:46--  https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.rpm
Resolving download.oracle.com (download.oracle.com)... 23.1.36.114
Connecting to download.oracle.com (download.oracle.com)|23.1.36.114|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 162804836 (155M) [application/x-redhat-package-manager]
Saving to: ‘jdk-17_linux-x64_bin.rpm’

100%[===========================================================>] 162,804,836 11.3MB/s   in 14s    

2022-09-25 22:22:01 (10.9 MB/s) - ‘jdk-17_linux-x64_bin.rpm’ saved [162804836/162804836]

[jegan@tektutor.org Downloads]$ sudo yum install ./jdk-17_linux-x64_bin.rpm 
Loaded plugins: fastestmirror, langpacks
Examining ./jdk-17_linux-x64_bin.rpm: 2000:jdk-17-17.0.4.1-ga.x86_64
Marking ./jdk-17_linux-x64_bin.rpm to be installed
Resolving Dependencies
--> Running transaction check
---> Package jdk-17.x86_64 2000:17.0.4.1-ga will be installed
--> Finished Dependency Resolution

Dependencies Resolved

=====================================================================================================
 Package          Arch             Version                     Repository                       Size
=====================================================================================================
Installing:
 jdk-17           x86_64           2000:17.0.4.1-ga            /jdk-17_linux-x64_bin           302 M

Transaction Summary
=====================================================================================================
Install  1 Package

Total size: 302 M
Installed size: 302 M
Is this ok [y/d/N]: y
Downloading packages:
Running transaction check
Running transaction test
Transaction test succeeded
Running transaction
  Installing : 2000:jdk-17-17.0.4.1-ga.x86_64                                                    1/1 
  Verifying  : 2000:jdk-17-17.0.4.1-ga.x86_64                                                    1/1 

Installed:
  jdk-17.x86_64 2000:17.0.4.1-ga                                                                     

Complete!

[jegan@tektutor.org Downloads]$ <b>javac -version</b>
javac 17.0.4.1
[jegan@tektutor.org Downloads]$ <b>java -version</b>
java version "17.0.4.1" 2022-08-18 LTS
Java(TM) SE Runtime Environment (build 17.0.4.1+1-LTS-2)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.4.1+1-LTS-2, mixed mode, sharing)
</pre>
