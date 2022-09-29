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
