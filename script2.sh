#!/bin/bash
vul=$(



#
curl -sX GET -u admin:admin -v 'http://localhost:9000/api/components/search?qualifiers=TRK' > ola.json);
bug=$(curl -sX GET -u admin:admin ‘http://www.example.com/api/issues/search?projectKeys=ssl-dev&types=BUG 17’);
no_vul=$(echo $vul | jq -r .total);
no_bug=$(echo $bug | jq -r .total);
echo “Total number of VULNERABILITIES are $no_vul”
echo “Total number of BUGS are $no_bug”



#obter os BUG,VULNARIBILIDADES E CODE SMELLS
http://localhost:9000/api/issues/search?ps=1&projectKey=p0&facets=types
http://localhost:9000/api/issues/search?ps=1&project=p0



#obtem all issues
http://localhost:9000/api/issues/search?componentRoots=org.codehaus.sonar:sonar


#tecnical debt em minutos. (1 dia=8h)
http://localhost:9000/api/issues/search?ps=1&projectKey=p0&facets=types&types=CODE_SMELL








#a lista de projetos compilados
curl -sX GET -u admin:admin -v 'http://localhost:9000/api/components/search?qualifiers=TRK' > ola.json


#ver tokens existentes
curl -sX GET -u admin:admin -v 'http://localhost:9000/api/user_tokens/search?name=ATS'



#criar token
curl -X POST -v -u admin:admin 'http://localhost:9000/api/user_tokens/generate?name=ATS'
#delete Token
curl -X POST -v -u admin:admin 'http://localhost:9000/api/user_tokens/revoke?name=ATS'




#ZOna de edicao


curl -sX GET -u admin:admin -v 'http://localhost:9000/api/issues/search'



   
