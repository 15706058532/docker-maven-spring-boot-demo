#!/bin/bash
export buildPath=$(pwd)
cd ${buildPath%%build*}
mvn  -P pro clean package docker:build