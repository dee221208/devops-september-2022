# Day4

## Creating an empty Local Git Repository
```
cd ~
mkdir GitDemo
cd GitDemo
git init
```

## Configuring your Local Git Repository with your name and email
```
cd ~/GitDemo
git config user.name "Jeganathan Swaminathan"
git conifg user.email "mail2jegan@gmail.com"
git config --list
```

## Checking the status of your Git Local Repository
```
cd ~/GitDemo
git status
```

## Creating a new empty file and committing that to your Git Local Repository
```
cd ~/GitDemo
touch file1.txt
git status
git add file1.txt
git status
git commit -m "Added file1.txt in master"
git status
git log
```

## Creating two more files and commit them into your Git Local Repository
```
cd ~/GitDemo
touch file2.txt  file3.txt
git status
git add .
git status
git commit -m "Added file2.txt and file3.txt in master"
git status
git log
```

## Listing the branches in your Git Local Repository and finding which one is currently active
```
git branch
```

## Creating a new branch from master branch
```
cd ~/GitDemo
git status

git checkout -b dev
```

## Switching between branches

First find the active branch
```
git branch
```

Assuming you are in 'dev' branch, switch to 'master' branch
```
git checkout master
```

Assuming you are in 'master' branch now, switch back to 'dev' branch
```
git checkout dev
```

## Let's add some new file in 'dev' branch
```
cd ~/GitDemo
git status

git checkout -b dev
touch cars.txt
```

Stage the cars.txt file
```
git status
git add cars.txt
git status
```

Commit the cars.txt file into the `dev` branch
```
git commit -m "Added cars.txt in dev"
git status
git log
```

Now switch to 'master' branch and see the log and observe the difference between the log printed in 'master' and 'dev' branches.
```
git checkout master
git log
```

## Merging 'dev' branch changes into 'master' branch
```
cd ~/GitDemo
git status
git branch
git checkout master
git merge dev
git status
git log
```

## Discarding changes by using git reset
```
cd ~/GitDemo
git status

git checkout -b dev
touch gadgets.txt
git status
git add *
git status
git commit -m "Added gadgets.txt in dev"
git status
git log
```

Discard the recent commit
```
git checkout dev
git log
git reset --hard <previous-commit-id-shown-in-the-log'
git log
```

Expected output
<pre>
(jegan@tektutor.org)$ <b>git log</b>
commit 2621712c4154fd3fbb88713f616052216c48cd3e (HEAD -> dev)
Author: Jeganathan Swaminathan <mail2jegan@gmail.com>
Date:   Thu Sep 29 11:01:17 2022 +0530

    Added gadgets.txt in dev

commit 56ff9bc2d68b792396b3a7f750516b3a8a03bcf9 (master)
Author: Jeganathan Swaminathan <mail2jegan@gmail.com>
Date:   Thu Sep 29 10:13:20 2022 +0530

    Added cars.txt in dev

commit 48fe40fa58a2c65c852a28e380e1b9860ad4f62f
Author: Jeganathan Swaminathan <mail2jegan@gmail.com>
Date:   Thu Sep 29 10:00:22 2022 +0530

    Added file2 and file3 in master

commit 058cffc5977d46996e9e432423481e935b4f578f
Author: Jeganathan Swaminathan <mail2jegan@gmail.com>
Date:   Thu Sep 29 09:56:33 2022 +0530

    Initial commit done in master
(jegan@tektutor.org)$ <b>ls</b>
cars.txt  file1.txt  file2.txt  file3.txt  <b>gadgets.txt</b>
(jegan@tektutor.org)$ <b>git status</b>
On branch dev
nothing to commit, working tree clean
(jegan@tektutor.org)$ <b>git reset --hard 56ff9bc2d68b792396b3a7f750516b3a8a03bcf9</b>
HEAD is now at 56ff9bc Added cars.txt in dev
(jegan@tektutor.org)$ <b>ls</b>
cars.txt  file1.txt  file2.txt  file3.txt
</pre>

## Git Merge 
```
cd ~
mkdir GitMergeDemo
cd GitMergeDemo
git init
touch f1.txt
git add *
git commit -m "Added f1.txt in master"

touch f2.txt
git add *
git commit -m "Added f2.txt in master"

touch f3.txt
git add *
git commit -m "Added f3.txt in master"

git log
```

Let's create a 'dev' branch from 'master' branch
```
git checkout -b dev

touch f4.txt
git add *
git commit -m "Added f4.txt in dev"

touch f5.txt
git add *
git commit -m "Added f5.txt in dev"

git log
```

Let's switch back to 'master' branch
```
git checkout master

touch f6.txt
git add *
git commit -m "Added f6.txt in master"

touch f7.txt
git add *
git commit -m "Added f7.txt in master"

git log
```

Let's merge the changes from 'dev' to 'master' branch. We need to switch to destination branch which is 'master' in this case.
```
git checkout master
git merge dev
git log
```

Merge will merge all the changes from the 'dev' branch into the 'master' branch with one extra commit for merging the changes.

## Git Rebase
```
cd ~
mkdir GitRebaseDemo
cd GitRebaseDemo
git init

touch f1.txt
git add *
git commit -m "Added f1.txt in master"

touch f2.txt
git add *
git commit -m "Added f2.txt in master"

touch f3.txt
git add *
git commit -m "Added f3.txt in master"

git log
```

Let's create a 'dev' branch from 'master' branch
```
git checkout -b dev

touch f4.txt
git add *
git commit -m "Added f4.txt in dev"

touch f5.txt
git add *
git commit -m "Added f5.txt in dev"

git log
```

Let's switch back to 'master' branch
```
git checkout master

touch f6.txt
git add *
git commit -m "Added f6.txt in master"

touch f7.txt
git add *
git commit -m "Added f7.txt in master"

git log
```

Let's copy the changes from 'dev' branch to 'master' branch using rebase
```
git checkout master
git rebase dev master
git log
```

Expected output
<pre>
</pre>

## Git Merge vs Git Rebase

#### Git Merge
<pre>
1. Git merge will retain the commit ids intact while merging the changes from source branch to the destination branch.
2. Git merge will require a commit to merge the changes
3. Git merge will attempt to auto-merge when there are no conflicts
4. Git merge will result in merge-conflicts if there are conflicting changes between the source and destrination branches. In such case, a merge conflict resolution has to be done.
</pre>

#### Git Rebase
<pre>
1. Post rebase, the log will look as though all the changes were done in the destination branch
2. Git rebase will change the commit id it is requires rearranges changes in the the destination.  This doesn't happen in merge.
</pre>



## Git Cherry Pick
<pre>
- Allows to skip and pick changes starting from a particular commit-id in a branch
</pre>

## Git Push
<pre>
- changes can be pushed from local Git Repo to GitHub Central Repo
</pre>

## Git Clone
- Downloads the entire code from a GitHub branch to local Git Repository
Example
<pre>
git clone https://github.com/tektutor/devops-september-2022.git
</pre>
## Git Pull
- Delta changes from GitHub to Local Repo can be pulled
For example
<pre>
cd ~/devops-september-2022
git pull
</pre>


## What is DevOps?
- automating manual developer testing efforts, qa testing efforing, system administrative tasks
- the mantra - convery into manual efforts into code
- Developer
  - does unit-testing and integration manually
  - DevOps recommends converting this effort into code
    - Test Driven Development (TDD)
      - Java
         - JUnit or TestNG, Mockito, EasyMock, PowerMock
      - C++
         - GoogleTest, GoogleMock, CppUnit
      - C#
         - Nunit & Moq
      - NodeJS, ReactJS, TypeScript, JavaScript
        - Jasmine & Karma
      - Python
        - PyTest
        
    - Behaviour Driven Development (BDD )
      - Helps in automating End-to-End Functional Test
      - Load, Stress, Performance, Component and API Test
      - Even non-technical business folks also can understand and review these cases as they look like English
      - Java/C++
        - Cucumber
      - C#
        - Specflow
        
    - QA Engineer
      - they do manual testing which can be automated by converting them into code
      - BDD Framework with Selenium, etc.,
    
    - System Administrators
      - they install OS, Softwares, and Configuration Management
      - these efforts can be automated using Ansible, Terraform, Cloudformation, Vagrant, Docker, Jenkins

## What is Continuous Integration?
- integrating code several times a day
- we should use process and tools to automate build and test efforts based on code commit
- the build should run automated test cases each time code is committed and share build report as feedback
- fail fast approach

## What is Continuous Deployment?
- The application binaries produced by CI builds are frequently deployed into dev,qa environments for further automated testing

## What is Continuous Delivery?
- Delivering the thoroughly tested application binaries to customer environments or in some cases to live production environment

## Jenkins
- is an opensource CI/CD Build Server
- developed by Kohsuke Kawaguchi(former Sun MicroSystems) in Java 
- initially it was developed as Hudson within Sun Microsystems, later when Oracle acquired Sun Microsystems the team got split 
- Cloudbees is the enterprise variant of Jenkins
- it can be used by programming language stack


## Starting Jenkins from CLI
For detailed step by step instructions, please refer my medium blog here
<pre>
https://medium.com/tektutor/ci-cd-with-maven-github-docker-jenkins-aca28c252fec
</pre>

```
cd ~/Downloads
java -jar ./jenkins.war
```

You can access the Jenkins Dashboard from the below URL
<pre>
http://localhost:8080
</pre>

When prompted for login credentials, you can type the below
<pre>
username - rps
password - rps@12345
</pre>
