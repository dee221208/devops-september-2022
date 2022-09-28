# Day 3

## Programming Language Types
1. Imperative
   Code will have
   1. What and
   2. How
   Examples
    - C/C++, Java, Python, Shell Scripting, Batch Files, Powershell, etc
    - they are very powerful
    - are not apt tools for Configuration Management
      - because you will end up writing lengthy code which is difficult to understand and maintain
      
2. Declarative
   - YAML 
   - In declarative languages, you just need to convey what you would like to automate and leave the how part to Ansible

## What is Configuration Management Tool?
- used by generally DevOps Engineers to automate Software installation and configurations
- given a machine with OS, Configuration Management Tool can install any software and configure those softwares or configure the OS with different user with certain privilege, etc.,
- Ansible can also provision a Docker container, Virtual Machine or an ec2 instance in aws but it doesn't fall under the Provisioner Tool

## What is a Provisioner Tool?
- Provisioner Tools can create a new Virtual Machine on-prem or can spin-off a new ec2 instance on public/private/hybrid cloud environment
- these tools are primarily used to provision a new machine with some Operating System
- Examples
  - Docker
  - Vagrant
  - Cloudformation
  - Terraform

## What is an Orchestration Tool?
- Orchestration Tools like Docker SWARM, Google Kubernetes or Red Hat OpenShift manage containerized applications
- Orchestration tools helps in monitoring the health of your application deployed in Kubernetes/OpenShift cluster and repairs when they get aborted or get killed or crashes or stops responding
- Orchestration Platforms are self-healing platforms
    - they can repair themseleves as well can repair application deployed within the Orchestration platform
- provides an ecosystem for your deployed application and make them Highly Available (HA)
- helps in scaling up/down your containerized application instances on demand
  i.e when the user-traffic to your application increases, they can auto-scale up the number of instance of your microservice/application based on user-defined rules/metrics
  When the user-traffic to your application decreases, they can auto-scale down the number of instances of your microservice/application based on user-defined rules/metrics
- rolling update
  - helps in upgrading/degrading your live application from one version to other without downtime

## Ansible Overview
- is developed in Python
- is developed by Michael Deehan as open source tool with help from open source community/contributors
- Michael Deehan is former employee of Red Hat
- Michael Deehan has quit Red Hat and founded Ansible Inc organization and started developing Ansible Core - open source Configuration Management Tool
- Ansible uses YAML (Yet Another Markup Language ) as its DSL

## Ansible Alternatives
- Puppet
  - DSL used is Ruby
- Chef
  - DSL used is Ruby
- Salt/Salt Stack

## What is an Ansible inventory file?
- is a text file that can created using any plain text editor of your choice
- it has SSH connection details to Unix/Linux/Mac Ansible Nodes(Servers) that you wish to manage using Ansible
- it has Windows WinRM connection details to Windows Ansible Nodes(Servers) that you wish to manage using Ansible

## What is the use of ansible.cfg file in Ansible?
- use this ansible.cfg configuration file to capture/manage configurations
- this file can be kept in multiple places
- Ansible looks for ANSIBLE_CONFIG environment variable, if the env variable points to ansible.cfg in some location on your system, ansible uses that config file
- If in case ANSIBLE_CONFIG environment variable isn't defined, then ansible looks ansible.cfg file in your current directory, if it is there it will use that
- If Ansible isn't able find the ansible.cfg neither using in ANSIBLE_CONFIG environment varible nor in the current directory, then it looks into your home directory for file named .ansible.cfg if it finds it will use that.
- As a last resort, it uses the /etc/ansible/ansible.cfg if ansible couldn't find the ansible.cfg in the earlier locations

## What is DSL?
- Domain Specific Language
- is the language in which we automate things

## What is an Ansible Controller Machine(ACM)?
- the machine where Ansible is installed is the Ansible Controller Machine
- Ansible Controller Machines must be a Linux machine 
- but it seems to work in Mac/Unix
- Ansible Controller Machine(ACM) can never be a Microsoft Windows OS
- but Ansible can manage machines(Ansible Nodes) with Unix/Mac/Linux/Windows OS

## What is Ansible Node?
- Ansible Node are the servers that you wish to automate software installations
- Ansible Node can be a Container, Virtual Machine, could be a Physical Server with some OS, ec2 instance in AWS
- Windows Ansible Node
  - Pre-requisites ( Software requirements )
    - PowerShell should be available
    - .Net Framework should be there
    - WinRM shoud be enabled/configured
- Unix/Linux/Mac Ansible Nodes
  - Pre-requisities ( Software requirements )
    - Python should be installed
    - SSH Server should be installed
  
## Difference betweeen Ansible Core and Ansible Tower
- Ansible comes in 3 flavours
  1. Ansible Core 
     - open source
     - Command Line Interface (CLI)
     - is installed typically in your Laptop/Desktop
     
  2. Ansible Tower
     - Red Hat Product is developed on top of AWX
     - You can't develop Ansible Playbook, we can run the pre-existing Playbook
     - comes with Web Console (Web based GUI)
     - can run the Playbook via GUI from your Web browser
     - supports User Management
     - you get graphics metrics
     - you can historical logs of all your Ansible playbook executions
     - you will get support from Red Hat

  3. AWX
     - works and looks like Ansible Tower
     - comes with WebConsole just like Ansible Tower but it is a opensource
     - you won't get a support
     - developed on top of Ansible Core
     
## Ansible High Level Architecture
![Ansible High Level Architecture](AnsibleHighLevelArchitecture.png.png)

# Ansible Commands

## Finding Ansible Version
```
ansible --version
```

Expected output
<pre>
[jegan@tektutor.org Day3]$ <b>ansible --version</b>
ansible [core 2.11.12] 
  config file = /home/jegan/.ansible.cfg
  configured module search path = ['/home/jegan/.ansible/plugins/modules', '/usr/share/ansible/plugins/modules']
  ansible python module location = /home/jegan/.local/lib/python3.6/site-packages/ansible
  ansible collection location = /home/jegan/.ansible/collections:/usr/share/ansible/collections
  executable location = /home/jegan/.local/bin/ansible
  python version = 3.6.8 (default, Nov 16 2020, 16:55:22) [GCC 4.8.5 20150623 (Red Hat 4.8.5-44)]
  jinja version = 3.0.3
  libyaml = True
</pre>
