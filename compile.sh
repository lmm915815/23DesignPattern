#!/bin/bash
basedir=`pwd`
if [ $# -ne 1  ];then
    echo "$@ workdir"
    exit -1
fi 
pushd  $basedir/$1 2>&1 > /dev/null 
    mkdir -p classes
    find src/ -name "*.java" > src/sources.list
    javac -cp classes -d classes @src/sources.list
popd 2>&1 > /dev/null
