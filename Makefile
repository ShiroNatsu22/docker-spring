UID = $(shell id -u)
GID = $(shell id -g)

build: halt
	docker compose build --build-arg UID=$(UID) --build-arg GID=$(GID)
.PHONY: build

up: compose
.PHONY: up

up-logs: compose-live-logs 
.PHONY: up-live-logs

halt:
	docker compose stop
.PHONY: halt

ssh:
	docker compose exec app /bin/bash

build-jar: 
	docker compose exec app /bin/bash ./mvnw clean install

compose:
	docker compose up -d
.PHONY: compose

compose-live-logs: 
	docker compose up 
.PHONY: compose-live-logs


create-cert:
	docker compose exec app /bin/bash -c "cd src/main/resources; keytool -genkeypair -alias certs -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore certs.p12 -validity 3650"

.phony: create-cert

