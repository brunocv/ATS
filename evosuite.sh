#!/bin/bash


DIR="../EvoSuite"

if [ -d "$DIR" ]; then
	echo "Existe diretoria ${DIR}..."
else
        echo "Erro: ${DIR} nao existe. Criando diretoria..."
        mkdir ../EvoSuite
fi



FILE="../EvoSuite/evosuite-1.1.0.jar"
if [ -f "$FILE" ]; then
    echo "Check: evosuite-1.1.0.jar existe."
else 
    echo "Check: evosuite-1.1.0.jar nao existe."
    echo "Fazendo download de evosuite-1.1.0.jar..."
    wget --no-check-certificate --content-disposition -O ../EvoSuite/evosuite-1.1.0.jar https://github.com/EvoSuite/evosuite/releases/download/v1.1.0/evosuite-1.1.0.jar
fi

FILE="../EvoSuite/evosuite-standalone-runtime-1.1.0.jar"
if [ -f "$FILE" ]; then
    echo "Check: evosuite-standalone-runtime-1.1.0.jar existe."
else 
    echo "Check: evosuite-standalone-runtime-1.1.0.jar nao existe."
    echo "Fazendo download de evosuite-standalone-runtime-1.1.0.jar..."
    wget --no-check-certificate --content-disposition -O ../EvoSuite/evosuite-standalone-runtime-1.1.0.jar https://github.com/EvoSuite/evosuite/releases/download/v1.1.0/evosuite-standalone-runtime-1.1.0.jar
fi



DIR="../Tarefa_3"
if [ -d "$DIR" ]; then
        echo "Existe diretoria ${DIR}..."
else
        echo "Erro: ${DIR} nao existe. Criando diretoria..."
        mkdir ../Tarefa_3
fi

DIR="../Proj_sonar/23"
if [ -d "$DIR" ]; then
        echo "Existe diretoria ${DIR}..."
else
        echo "Execute a tarefa 1 primeiro..."
        exit
fi

DIR="../Proj_sonar/83"
if [ -d "$DIR" ]; then
        echo "Existe diretoria ${DIR}..."
else
        echo "Execute a tarefa 1 primeiro..."
        exit
fi

#Mover ficheiros que quero trabalhar
cp -a ../Proj_sonar/23/ ../Tarefa_3/
cp -a ../Proj_sonar/83/ ../Tarefa_3/
printf "ficheiros copiados para  trabalhar.\n\n"

#EvoSuite requer java files compilados antes de executar
javac ../Tarefa_3/23/src/main/java/ProjetoPOO/*.java
javac ../Tarefa_3/83/src/main/java/Trabalho/src/*.java
printf "ficheiros compilados.\n\n"

printf "###################################################\n"
printf "##   Quer o REPORT de testes em HTML ou CSV?     ##\n" 
printf "###################################################\n\n"
printf "1 - HTML \n"
printf "2 - CSV \n"


re='^[0-9]+$'
read report

if [ "$(uname)" == "Darwin" ]; then
	printf "nada\n"
elif [ "$(uname)" == "Linux" ]; then
	if ! [[ $report =~ $re ]] ; then #verifica se é um numero.
        	echo "error:Escreva 1 ou 2" >&2; exit 1
	elif (( report == 1 )); then
        	echo "HTML escolhido"
		
		gnome-terminal -- bash -c "cd ../Tarefa_3/23; java -jar ../../EvoSuite/evosuite-1.1.0.jar -target src/main/java/ProjetoPOO/ -Dstatistics_backend=HTML -Dplot=true -Dcoverage_matrix=true -Dsearch_budget=40; exec bash"
		gnome-terminal -- bash -c "cd ../Tarefa_3/83; java -jar ../../EvoSuite/evosuite-1.1.0.jar -target src/main/java/Trabalho/src -Dstatistics_backend=HTML -Dplot=true -Dcoverage_matrix=true -Dsearch_budget=40; exec bash"

	elif (( report == 2 )); then
		echo "CSV escolhido"
		gnome-terminal -- bash -c "cd ../Tarefa_3/23; java -jar ../../EvoSuite/evosuite-1.1.0.jar -target src/main/java/ProjetoPOO/ -Dstatistics_backend=CSV -Dplot=true -Dcoverage_matrix=true -Dsearch_budget=40; exec bash"
                gnome-terminal -- bash -c "cd ../Tarefa_3/83; java -jar ../../EvoSuite/evosuite-1.1.0.jar -target src/main/java/Trabalho/src -Dstatistics_backend=CSV -Dplot=true -Dcoverage_matrix=true -Dsearch_budget=40; exec bash"
	else
    		echo "Entre 1 e 2!"; exit 1
	fi
fi

