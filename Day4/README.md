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

Now switch to 'master' branch and see the log and observe the difference between the log printed in 'master' and 'dev' brnaches.
```
git checkout master
git log
```
