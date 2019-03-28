#!/usr/bin/env bash

mkdir -p ~/mysql-export-files

docker run -d --name rap-mysql -e MYSQL_ROOT_PASSWORD=123456 -p 3309:3306 \
  mysql:5.7 --character-set-server=utf8 --skip-character-set-client-handshake=1
