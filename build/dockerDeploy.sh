#!/bin/bash
export REGISTRY_ADDR="docker.lzf.com:6666"
tag_docker_image(){
  image_name=$1
  version=$2
  cmd="sudo docker tag $image_name $REGISTRY_ADDR/$image_name:$version"
  echo "RUN $cmd"
  eval $cmd
}

push_docker_image(){
  image_name=$1
  version=$2
  cmd="sudo docker push $REGISTRY_ADDR/$image_name:$version"
  echo "RUN $cmd"
  eval $cmd
}

tag_docker_image "docker-maven-spring-boot-demo-1.0.0" $1
push_docker_image "docker-maven-spring-boot-demo-1.0.0" $1
