#!/bin/bash
vul=$(curl -sX GET -u admin:admin ‘http://http://localhost:9000/api/issues/search?projectKeys=ssl-dev&types=VULNERABILITY 42’);
bug=$(curl -sX GET -u admin:admin ‘http://www.example.com/api/issues/search?projectKeys=ssl-dev&types=BUG 17’);
no_vul=$(echo $vul | jq -r .total);
no_bug=$(echo $bug | jq -r .total);
echo “Total number of VULNERABILITIES are $no_vul”
echo “Total number of BUGS are $no_bug”



#obter os BUG,VULNARIBILIDADES E CODE SMELLS
http://localhost:9000/api/issues/search?ps=1&projectKey=%3Cproj0%3E&facets=types



#obtem all issues
http://localhost:9000/api/issues/search?componentRoots=org.codehaus.sonar:sonar


#tecnical debt em minutos. (1 dia=8h)
http://localhost:9000/api/issues/search?ps=1&projectKey=%3Cproj0%3E&facets=types&types=CODE_SMELL