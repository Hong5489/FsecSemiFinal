# Exe Reverse

*Forget to copy the description*

[1171.exe](1171.exe)

Run it in terminal or powershell (I use powershell):
```
.\1171.exe
Hello There!
Let's play a game and if you got all the right answers you will get the flag
Otherwise i am afraid you have to start over..

Question 1:
Please type true or false
true
Right Answer!

Question 2:
Please type true or false
false
Better luck next time :(
```
Each question only got two answer, its easy to brute force!

Use `echo` command and pipe it the `1171.exe`

Adding \`n for newline
```
echo "true`ntrue" | .\1171.exe
Hello There!
Let's play a game and if you got all the right answers you will get the flag
Otherwise i am afraid you have to start over..

Question 1:
Please type true or false
Right Answer!

Question 2:
Please type true or false
Right Answer!

Question 3:
Please type true or false
Better luck next time :(
```
It works! Keep adding true or false to the end:
```
echo "true`ntrue`nfalse`ntrue`nfalse`nfalse`ntrue`ntrue`ntrue`nfalse" | .\1171.exe
Hello There!
Let's play a game and if you got all the right answers you will get the flag
Otherwise i am afraid you have to start over..

Question 1:
Please type true or false
Right Answer!

Question 2:
Please type true or false
Right Answer!

Question 3:
Please type true or false
Right Answer!

Question 4:
Please type true or false
Right Answer!

Question 5:
Please type true or false
Right Answer!

Question 6:
Please type true or false
Right Answer!

Question 7:
Please type true or false
Right Answer!

Question 8:
Please type true or false
Right Answer!

Question 9:
Please type true or false
Right Answer!

Question 10:
Please type true or false
Right Answer!

Flag : fswhatwasthatcyber
```
We get the flag!! Just brute forcing!

## Flag
> fswhatwasthatcyber