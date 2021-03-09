web: bundle exec rails server -p $PORT
web: lein run -m user.web $PORT
web: java -Dserver.port=$PORT -jar target/inventory-0.0.1-SNAPSHOT.jar
web: java -Dserver.port=$PORT -jar target/product-0.0.1-SNAPSHOT.jar
web: java -Dserver.port=$PORT -jar target/user-0.0.1-SNAPSHOT.jar
worker:  bundle exec rake jobs:work

