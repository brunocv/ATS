#!/bin/bash
source ./progress_bar.sh
#resize da janela do terminal.
printf '\e[8;40;130t'

DIR=$(pwd)

FILES=$(grep -rl 'System.out.print.*' ${DIR}/../Proj_sonar |  awk '/.*\.java/{ print $0 }')
#x=$(grep -R -l 'System.out.print.*' /Users/ril/Desktop/ATS/project/Proj_sonar) ;while read line; do echo "LINE: '${line}'"; done < <(echo "$x")
re1='Proj_sonar/68/'
re2='Proj_sonar/0/'
re3='Proj_sonar/16/'
re4='Proj_sonar/4/'
re5='Proj_sonar/22/'
re6='Proj_sonar/85/'
re7='Proj_sonar/47/'
re0='\n'

contador=1;
resolve_prints_mac()
{
	echo "$FILES" | while read line ;
	do
		if [[ $line != *${re1}* ]] &&  [[ $line != *${re2}* ]] &&[[ $line != *${re3}* ]] &&[[ $line != *${re4}* ]]&&[[ $line != *${re5}* ]] &&[[ $line != *${re6}* ]] &&[[ $line != *${re7}* ]]; then
			prog "$(((( ${contador} * 100)) / 383))"
			n=$(grep -m1 -n "^[public| ]*.*class .*\|[public| ]*interface .*" "${line}" | sed 's/:.*//'| tr -dc '0-9')
			n2=$(( ${n} + 2 ))
            ext=".class.getName()"
            #printf $n
            #printf "\t\t"
            #printf $line
            #printf "\n"
            name_class=$(echo ${line} | rev | cut -d"/" -f1  | rev | cut -d"." -f1)
            final=$name_class$ext
            find ${line} -exec sed -i '' -e "${n}s/^/import java.util.logging.Level;import java.util.logging.Logger; /" {} \;
            find ${line} -exec sed -i '' -e "${n2}s/^/private transient static Logger logger = Logger.getLogger(${final}); /" {} \;
            LC_CTYPE=C sed -i "" 's/System.out.println()/logger.log(Level.WARNING,"\\n")/g' ${line}
            LC_CTYPE=C sed -i "" 's/System.out.println(/logger.log(Level.WARNING,/g' ${line}
			LC_CTYPE=C sed -i "" 's/System.out.print(/logger.log(Level.WARNING,/g' ${line}
			((contador++))
		fi
	done
	printf "\nFIM\n";
}

resolve_prints_linux()
{
        echo "$FILES" | while read line ;
        do
            if [[ $line != *${re1}* ]] &&  [[ $line != *${re2}* ]] &&[[ $line != *${re3}* ]] &&[[ $line != *${re4}* ]]&&[[ $line != *${re5}* ]] &&[[ $line != *${re6}* ]] &&[[ $line != *${re7}* ]]; then
                prog "$(((( ${contador} * 100)) / 383))"
                n=$(grep -m1 -n "^[public| ]*.*class .*\|[public| ]*interface .*" "${line}" | sed 's/:.*//'| tr -dc '0-9')
                n2=$(( ${n} + 2 ))
                ext=".class.getName()"
                #printf $n
                #printf "\t\t"
                #printf $line
                #printf "\n"
                name_class=$(echo ${line} | rev | cut -d"/" -f1  | rev | cut -d"." -f1)
                final=$name_class$ext
                find ${line} -exec sed -i  -e "${n}s/^/import java.util.logging.Level;import java.util.logging.Logger; /" {} \;
                find ${line} -exec sed -i  -e "${n2}s/^/private transient static Logger logger = Logger.getLogger(${final}); /" {} \;
                LC_CTYPE=C sed -i  's/System.out.println()/logger.log(Level.WARNING,"\\n")/g' ${line}
                LC_CTYPE=C sed -i  's/System.out.println(/logger.log(Level.WARNING,/g' ${line}
                LC_CTYPE=C sed -i  's/System.out.print(/logger.log(Level.WARNING,/g' ${line}
                ((contador++))
            fi
        done
        printf "\nFIM\n";
}


if [ "$(uname)" == "Darwin" ]; then
resolve_prints_mac
elif [ "$(uname)" == "Linux" ]; then
resolve_prints_linux
fi
