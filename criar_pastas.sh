#!/bin/bash
./limpar.sh
for (( counter=0; counter<99; counter++ ))
do
mkdir -p ../Proj_sonar/$counter/src/main/java
done 
printf "Pastas criadas\n"


for (( counter=0; counter<99; counter++ ))
do
cp pom.xml ../Proj_sonar/$counter
find ../projectsPOO_1920/$counter -type f -name "*.java" -exec cp -n {} ../Proj_sonar/$counter/src/main/java \;
done
printf "Ficheiros java nos sítios corretos + pom.xml\n"


for (( counter=0; counter<99; counter++ ))
do
find ../Proj_sonar/$counter -regex ".*\.java"  -exec grep -l  "public static void main\(.*\)" {} \;| cut -d "/" -f 7  | { read NAME ;sed -i "" 's/TESTE/'$NAME'/g' ../Proj_sonar/$counter/pom.xml ;}
done
printf "pom.xml pronto. \n"




