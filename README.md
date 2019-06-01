# Getting Started

### Run Docker
```
docker pull elasticsearch:6.6.2
docker run -d --name elasticsearch -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" elasticsearch:6.6.2
```
### Kitematic for Docker
`brew install kitematic`

### Check Elasticsearch state
`curl http://localhost:9200/_cluster/state`

### Run Maven
```mvn clean package```

### Create a User
`curl -sXPOST http://localhost:8080/user -H "Content-Type: application/json" -d '{"username":"sufinawaz", "firstName": "Sufi", "lastName": "Nawaz"}'`

### Fetch a User by Username
`curl -sXGET http://localhost:8080/user/username/<USERNAME> -H "Content-Type: application/json"`
