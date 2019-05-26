# Powershell

[1151.ps1](1151.ps1)

Inside the file is a powershell oneliner:
```
# cat 1151.ps1 
.( $enV:cOMsPEc[4,15,25]-JoIN'')("$(set-itEM  'VarIabLe:Ofs' '') " +[STRiNG]( '24z78!3d-32-30h3b&69&66-20N28h24h78h20-2d!6cz65z20N31-30z29X7bX57V72z69-74!65&2dz68h6fX73-74&28z22!66-73z54z68N49V6eV67&73X55V44V4fN34&63!79!62&65V72N22z29-7d-65-6c!73!65V7bh57&72X69X74-65!2dz68N6fV73-74!28N22-4eN6fN2c&20h54-68N69N73X20N69-73V20z6e-6fz74-20h74V68-65z20X61X6eN73&77-65-72h21z21X21h22V29z7d'-sPlIt'V'-sPLiT'z' -Split'X'-spLiT'h'-sPlit '-' -spLIT '!'-Split '&'-sPLiT'N'|% {( [ChAr] ( [CONvErt]::ToInt16(($_.TostrINg()),16) ))} )+" $(sET-iTeM 'VAriaBle:ofS'  ' ' ) " )
```
Looks like some character is modified, use python to convert all the lowercase:
```bash
python -c "open('test.ps1','w').write(open('1151.ps1','r').read().lower())"
```
Lets run it!
```
./test.ps1
Cannot index into a null array.
At /root/Downloads/Fsec2/Powershell/test.ps1:1 char:1
+ .( $env:comspec[4,15,25]-join'')("$(set-item  'variable:ofs' '') " +[ ...
+ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
+ CategoryInfo          : InvalidOperation: (:) [], RuntimeException
+ FullyQualifiedErrorId : NullArray
```
It failed =(

Lets remove the front part `.( $env:comspec[4,15,25]-join'')` and run it again:
```
 ./test.ps1
 $x=20;if ($x -le 10){Write-host("fsThIngsUDO4cyber")}else{Write-host("No, This is not the answer!!!")} 
```

We got the flag!!

## Flag
> fsThIngsUDO4cyber