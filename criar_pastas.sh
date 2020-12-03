#!/bin/bash

#Criar pastas vazias
for (( counter=0; counter<99; counter++ ))
do
mkdir -p ../Proj_sonar/$counter/src/main/java
done 
printf "Pastas criadas\n"

#Copiar trabalhos para as pastas criadas anteriormente e copiar a pom também 
for (( counter=0; counter<99; counter++ ))
do
cp pom.xml ../Proj_sonar/$counter
cp -a ../projectsPOO_1920/$counter/. ../Proj_sonar/$counter/src/main/java
done
printf "Ficheiros java nos sítios corretos + pom.xml\n"

#Resolução de erros para o mvn compile/package não falhar
#Projeto 26
cp ../projectsPOO_1920/26/Grupo31_POO2020/Usuаrio.java ../Proj_sonar/26/src/main/java/Grupo31_POO2020/Usuário.java
rm ../Proj_sonar/26/src/main/java/Grupo31_POO2020/Usuаrio.java 

#Projeto 96
cp ../projectsPOO_1920/96/Grupo242_POO2020/projeto/Projeto/OperaЗao.java ../Proj_sonar/96/src/main/java/Grupo242_POO2020/projeto/Projeto/Operaçao.java
rm ../Proj_sonar/96/src/main/java/Grupo242_POO2020/projeto/Projeto/OperaЗao.java

#Projeto 60->falta este import;Projeto 42->falta de main
if [ "$(uname)" == "Darwin" ]; then
	sed -i "" '2s/^/import view.InterfaceGeral;/' ../Proj_sonar/60/src/main/java/TrazAqui/controller/Parse.java
	sed -i "" 's/void menu()/void main(String[] args)/' ../Proj_sonar/42/src/main/java/Grupo11_POO2020/Trabalho-POO/TrazAqui.java

elif [ "$(uname)" == "Linux" ];then
	sed -i '2s/^/import view.InterfaceGeral;/' ../Proj_sonar/60/src/main/java/TrazAqui/controller/Parse.java
	sed -i 's/void menu()/void main(String[] args)/' ../Proj_sonar/42/src/main/java/Grupo11_POO2020/Trabalho-POO/TrazAqui.java
fi

#Encontrar a main dos projetos e alterar a pom com a main, por causa do sed é diferente para o MAC e LINUX
if [ "$(uname)" == "Darwin" ]; then
	for (( counter=0; counter<99; counter++ ))
	do
	
		if [ $counter != 1 ] && [ $counter != 11 ] && [ $counter != 33 ] && [ $counter != 35 ] && [ $counter != 38 ] && [ $counter != 41 ]  && [ $counter != 52 ] && [ $counter != 61 ] && [ $counter != 62 ] && [ $counter != 68 ] && [ $counter != 73 ] && [ $counter != 75 ] && [ $counter != 80 ]; then
	
			find ../Proj_sonar/$counter -regex ".*\.java"  -exec grep -l  "public[ static]* void main[ ]*[(].*[)]" {} \;| 
			sed 's|.*/||' | { read NAME ;sed -i "" 's/TESTE/'$NAME'/g' ../Proj_sonar/$counter/pom.xml ;}
		fi
	done
elif [ "$(uname)" == "Linux" ];then
	for (( counter=0; counter<99; counter++ ))
	do
	
		if [ $counter != 1 ] && [ $counter != 11 ] && [ $counter != 33 ] && [ $counter != 35 ] && [ $counter != 38 ] && [ $counter != 41 ]  && [ $counter != 52 ] && [ $counter != 61 ] && [ $counter != 62 ] && [ $counter != 68 ] && [ $counter != 73 ] && [ $counter != 75 ] && [ $counter != 80 ]; then
	
			find ../Proj_sonar/$counter -regex ".*\.java"  -exec grep -l  "public[ static]* void main[ ]*[(].*[)]" {} \;| 
			sed 's|.*/||' | { read NAME ;sed -i 's/TESTE/'$NAME'/g' ../Proj_sonar/$counter/pom.xml ;}
		fi
	done
fi




#quem não tem ficheiros fica com TESTE no pom.xml (38,62,75,80), caso do 42 que não tem main mas tem um menu que pode ser main

#Meter mains de projetos com mais que uma main encontrada, por causa do sed tem que de distinguir entre MAC ou LINUX
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


#Imprimir todas as mains postas nas poms
for (( counter=0; counter<99; counter++ ))
do
printf "$counter   "
awk 'NR==78' ../Proj_sonar/$counter/pom.xml
done

