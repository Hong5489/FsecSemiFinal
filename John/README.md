# John

Attachment : [1160](1160)

The title hints this challenge gonna use **John the Ripper**

```bash
# file 1160 
1160: Zip archive data, at least v2.0 to extract
```

Unzip it:
```bash
# unzip 1160
Archive:  1160
   creating: open_me/
 extracting: open_me/go_deeper~ 
```
Unzip successful!
`go_deeper~` also a zip file:
```bash
# file go_deeper~ 
go_deeper~: Zip archive data, at least v2.0 to extract
```
Unzip it:
```bash
# unzip go_deeper~
Archive:  go_deeper~
   creating: go_deeper/
 extracting: go_deeper/go_deeper~~ 
```
`go_deeper~~` also a zip file

After couple of unzipping:
```bash
# unzip go_deeper~~
Archive:  go_deeper~~
   creating: go_deeper/
  inflating: go_deeper/almost_there  
  inflating: go_deeper/rockyou.txt
```
Finally reach the end

Try to unzip `almost_there`:
```
# unzip almost_there
Archive:  almost_there
[almost_there] flag password:
```
It require a password

Use `zip2john` to generate hash and save it :
```bash
zip2john almost_there > hash
```
And use `john` to crack it, remember to use `rockyou.txt` provided:
```bash
john hash --wordlist=rockyou.txt
```
After that use `john hash --show` to show cracked password:
```bash
# john hash --show
almost_there/flag:lovet-joearceneaux:flag:almost_there::almost_there

1 password hash cracked, 0 left
```
So the password is `lovet-joearceneaux`

Unzip `almost_there` with `lovet-joearceneaux` we get `flag`:
```bash
# cat flag
fs_compr3ss10n_w1th_unknOwn_p@ssw0rd_cyber
```

## Flag
> fs_compr3ss10n_w1th_unknOwn_p@ssw0rd_cyber