#!/bin/bash

if [ "$(uname)" == "Darwin" ]; then
    printf "Mac top \n"
elif [ "$(uname)" == "Linux" ]; then
    printf "Linux top \n"
fi

