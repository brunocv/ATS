for (( i=0; i<99 ; i++ ))
do
	curl -X POST  -u admin:admin 'http://localhost:9000/api/projects/delete?project='p${i}''
done 