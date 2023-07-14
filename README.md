# Docker Spring

# To initialize project for the first time rename application-example.properties to application.properties and execute:
    make build && make up && make build-jar

# To create certificates to use HTTPS execute
    make create-cert
## Follow the instructions. While the certificate configuration is done  configure application.properties following the instructions inside application.properties
    

# To view live logs. To use another Makefile command use another instace of terminal
    make up-logs

# Default port is 8080 with http
    http://localhost:8080
