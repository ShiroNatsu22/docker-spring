# Docker Spring

# To initialize project for the first time
    make up && make build-jar

# To create certificates to use HTTPS execute into docker container and fill the information:
## Move generated certificate to src/main/resources and configure application.properties    
    keytool -genkeypair -alias certs -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore certs.p12 -validity 3650

# To view live logs. To use another Makefile command use another instace of terminal
    make up-logs

# Default config is set to
    http://localhost:8080
