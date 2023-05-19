# Docker Spring

# To initialize project for the first time
    make build && make up && make build-jar

# To create certificates to use HTTPS execute
    make create-cert
## Follow the instructions. While the configuration is done  configure application.properties following the instructions inside the file   
    

# To view live logs. To use another Makefile command use another instace of terminal
    make up-logs

# Default port is 8080 with https
    http://localhost:8080
