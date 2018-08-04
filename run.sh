#!/usr/bin/env bash

set -e

eval $(docker-machine env default)

echo "Build the project and docker images"

mvn clean package -U -Dmaven.test.skip=true
#docker-compose down
echo "Start the config service first and wait for it to become available"
docker-compose up -d --build 

echo  "Attach to the log output of the cluster"
docker-compose logs
