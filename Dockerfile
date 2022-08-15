# syntax=docker/dockerfile:1
FROM clojure:lein
COPY . /usr/src/app
WORKDIR /usr/src/app
RUN lein check
