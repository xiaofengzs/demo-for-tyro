#!/bin/bash

export DOCKER_IMAGE=tr1stanzhi/demo_for_tyr0

echo "build docker image"
docker build -t="${DOCKER_IMAGE}" ./
docker tag ${DOCKER_IMAGE} ${DOCKER_IMAGE}:lastest

echo "push docker image"
docker push ${DOCKER_IMAGE}:lastest
