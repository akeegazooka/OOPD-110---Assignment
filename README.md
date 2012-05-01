OOPD-110---Assignment
=====================

OOPD 110 Assignment:	

  	I've Put all the specifications etc. in the wiki - to view the pages just click on the 'pages' tab - it's quite simple 
	to edit it too so feel free to add anything. This GIT thing is starting to grow on me -K

####Git Crash Course####
assuming you have GIT installed etc.	
To start off you need to clone the repository
<ol>
	<li> open up the GIT bash on windows or a terminal on Linux </li>
	<li> cd to the directory you want to store the assignment folder </li>
	<li> type ' git clone https://meelz@github.com/akeegazooka/OOPD-110---Assignment.git ' Without the quotes </li>	
</ol>
This results in you having a 1:1 copy of our current Assignment file/folder structure	
	
Next up, how to use GIT push and pull	
	
after changing the existing files within the directory in order to upload the changes you will need to use GIT commit and GIT push
<ol>
	<li> To record the changes you have made type in ' git commit -a (This takes record of every change made) you will be required to write a record of what you changed </li>
	<li> Once the commit is complete, to upload the changed simply type in 'GIT push' This will push all your changes onto the repository </li>
</ol>
	
	
If someone else has made changes to the repository and you wish to recieve those changes simply type 'git pull' from within the directory.
	git pull takes all of the files and overwrites the existing ones, in order to just recieve the changes you need to use ' git checkout ' this delivers only the modifications and is far more efficient.

Finally - Adding and removing files
<ul>
	<li>In order to add a file to the repository after you have created it in your local directory you type ' git add <file> ' (Without the quotes or angle brackets) if you wish to add every new
	file just type ' git add -A ' (Case sensitive) this will add every new file to the record after doing this dont forget to commit the changes with ' git commit -a ' </li>
	
	<li>In order to remove a file you simply type ' git rm <file> ' this will remove it from the local directory and from successive updates - Dont forget to commit the changes after you've rm'd the file(s)!</li>
</ul>
	