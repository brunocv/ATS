#!/bin/bash
source ./progress_bar.sh 
#resize da janela do terminal.
printf '\e[8;40;130t'

for (( i=0; i<99 ; i++ ))
do
	prog "$((i + 2))" 
	#curl -X POST  -u admin:admin 'http://localhost:9000/api/projects/delete?project='p${i}'' 
	curl -s -X POST  -u admin:admin 'http://localhost:9000/api/projects/delete?project=p1' > /dev/null
done 