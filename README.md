# ituNetworkBuilders

Folks: 
Most important Commands to work with this directory.. 
@ Steffi, Swetha, Deboleena, Beleena, Onkar: 

#One time Setup : 
Download github, signup over there. 

**Windows Users :**
Go to git bash 

**Mac Users :**
Go to terminal

```
cd /path-to-your-repo/ (ex: cd C:\Apache\htdocs  for windows or cd ~/Library/WebServer/Documents for Mac or linux)
git clone https://github.com/sushruthreddygade/ituNetworkBuilders.git
git status
cd ituNetworkBuilders/

```

#For code checkins : 

It's a good practise to always check git status before you start coding. 

```
cd ~/Documents/ituNetworkBuilders/
git branch -b [name_of_your_new_branch]   {note: ITU is standard prefix. Please make sure you work on differnt branch for each feature..}
 ex: git branch -b ITU-1
** Modify files **
git add --all
git commit -m "[name_of_your_new_branch]: gist-of-what-feature-youwork-on"
**Push the branch on github :**
$ git push -u origin [name_of_your_new_branch]
When you want to commit something in your branch, be sure to be in your branch.
```

I'll take care of merging branches to the master. 
#Please make sure you have backups before and after you start coding and pushing code to the server. 
