FROM mysql/mysql-server

MAINTAINER Dee Farrell <dee@dcfhosting.co.uk>

ADD data/ /docker-entrypoint-initdb.d/