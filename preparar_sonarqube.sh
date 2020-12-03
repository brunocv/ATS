#!/bin/bash
#mudar  as preferencias do terminal;
#Preferences->Perfil->Shell-> When the shell exits -> change to "Close the window" if it was closed properly

#Mvn compile e mvn package
if [ "$(uname)" == "Darwin" ]; then
	ativo=0
	# proj 35 -> chama funções que nao existem
	for (( counter=0; counter<99 ; counter++ ))
	do
		if [ $counter != 35 ] && [ $counter != 38 ] && [ $counter != 42 ] && [ $counter != 62 ] && [ $counter != 75 ] && [ $counter != 80 ]; then
			DIR=$(pwd)
			osascript -e 'tell application "Terminal" to do script  "cd '${DIR}/../Proj_sonar/${counter}'; mvn compile; mvn package; exit"'
			#osascript -e 'tell application "Terminal" to do script  "cd '${DIR}/../Proj_sonar/${counter}'; mvn verify;"'
			((ativo++))
			printf "$counter \n"
		fi
		if [ $ativo -gt 1 ]; then
			sleep 25
			ativo=0
		fi
	done
	printf "Mvn compile e mvn package feitos no Mac.\n"
elif [ "$(uname)" == "Linux" ]; then
	#23 segundos +/- que demora a correr 1 mvn compile+mvn package
	ativo=0
	for (( counter=0; counter<99; counter++ ))
	do
		if [ $counter != 35 ] && [ $counter != 38 ] && [ $counter != 42 ] && [ $counter != 62 ] && [ $counter != 75 ] && [ $counter != 80 ]; then
			#Este é o oficial
			gnome-terminal -- bash -c "cd ../Proj_sonar/$counter; mvn compile; mvn package; exit; exec bash"
			#Este é o de teste
			#gnome-terminal -- bash -c "cd ../Proj_sonar/$counter; mvn compile; mvn package; exec bash"
			((ativo++))
			printf "$counter \n"
		fi
		if [ $ativo -gt 2 ]; then
			sleep 25
			ativo=0
		fi
	done
	printf "Mvn compile e mvn package feitos no Linux.\n"
fi


sleep 20
#Executar o SONARQUBE

if [ "$(uname)" == "Darwin" ]; then
	osascript -e 'tell application "Terminal" to do script "/opt/sonarqube-8.5.0.37579/bin/macosx-universal-64/sonar.sh console;exit"'
	printf "A executar sonarqube no Mac.\n"
elif [ "$(uname)" == "Linux" ]; then
    	gnome-terminal -- bash -c "cd; ./opt/sonarqube-8.5.0.37579/bin/linux-x86-64/sonar.sh console; exit; exec bash"
	printf "A executar sonarqube no Linux.\n"
fi


