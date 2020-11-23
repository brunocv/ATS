
#!/bin/bash

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
if [ "$(uname)" == "Darwin" ] && [ $counter != 1 ] && [ $counter != 11 ] && [ $counter != 33 ] && [ $counter != 35 ] && [ $counter != 38 ] && [ $counter != 41 ] && [ $counter != 42 ] && [ $counter != 52 ] && [ $counter != 61 ] && [ $counter != 62 ] && [ $counter != 68 ] && [ $counter != 73 ] && [ $counter != 75 ] && [ $counter != 80 ]; then
	find ../Proj_sonar/$counter -regex ".*\.java"  -exec grep -l  "public[ static]* void main[ ]*[(].*[)]" {} \;| 
	cut -d "/" -f 7  | { read NAME ;sed -i "" 's/TESTE/'$NAME'/g' ../Proj_sonar/$counter/pom.xml ;}

elif [ "$(uname)" == "Linux" ] && [ $counter != 1 ] && [ $counter != 11 ] && [ $counter != 33 ] && [ $counter != 35 ] && [ $counter != 38 ] && [ $counter != 41 ] && [ $counter != 42 ] && [ $counter != 52 ] && [ $counter != 61 ] && [ $counter != 62 ] && [ $counter != 68 ] && [ $counter != 73 ] && [ $counter != 75 ] && [ $counter != 80 ]; then
	find ../Proj_sonar/$counter -regex ".*\.java"  -exec grep -l  "public[ static]* void main[ ]*[(].*[)]" {} \;| 
	cut -d "/" -f 7  | { read NAME ;sed -i 's/TESTE/'$NAME'/g' ../Proj_sonar/$counter/pom.xml ;}
fi
done

#quem não tem ficheiros fica com TESTE no pom.xml (38,62,75,80), caso do 42 que não tem main mas tem um menu que pode ser main

if [ "$(uname)" == "Darwin" ]; then
	sed -i "" 's/TESTE/TrazAquiApp.java/g' ../Proj_sonar/1/pom.xml 
	sed -i "" 's/TESTE/TrazAquiApp.java/g' ../Proj_sonar/11/pom.xml 
	sed -i "" 's/TESTE/Controller.java/g' ../Proj_sonar/33/pom.xml
	sed -i "" 's/TESTE/TrazAquiApp.java/g' ../Proj_sonar/35/pom.xml
	sed -i "" 's/TESTE/Main.java/g' ../Proj_sonar/41/pom.xml	
	sed -i "" 's/TESTE/TrazAqui.java/g' ../Proj_sonar/52/pom.xml
	sed -i "" 's/TESTE/App.java/g' ../Proj_sonar/61/pom.xml
	sed -i "" 's/TESTE/TrazAquiApp.java/g' ../Proj_sonar/68/pom.xml
	sed -i "" 's/TESTE/TestePrograma.java/g' ../Proj_sonar/73/pom.xml
elif [ "$(uname)" == "Linux" ]; then
	sed -i 's/TESTE/TrazAquiApp.java/g' ../Proj_sonar/1/pom.xml 
	sed -i 's/TESTE/TrazAquiApp.java/g' ../Proj_sonar/11/pom.xml 
	sed -i 's/TESTE/Controller.java/g' ../Proj_sonar/33/pom.xml
	sed -i 's/TESTE/TrazAquiApp.java/g' ../Proj_sonar/35/pom.xml
	sed -i 's/TESTE/Main.java/g' ../Proj_sonar/41/pom.xml	
	sed -i 's/TESTE/TrazAqui.java/g' ../Proj_sonar/52/pom.xml
	sed -i 's/TESTE/App.java/g' ../Proj_sonar/61/pom.xml
	sed -i 's/TESTE/TrazAquiApp.java/g' ../Proj_sonar/68/pom.xml
	sed -i 's/TESTE/TestePrograma.java/g' ../Proj_sonar/73/pom.xml
fi
printf "pom.xml pronto.\n"



for (( counter=0; counter<99; counter++ ))
do
printf "$counter   "
awk 'NR==42' ../Proj_sonar/$counter/pom.xml
done

