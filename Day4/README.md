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
