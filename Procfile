web: bundle exec rails server -p $PORT
web: lein run -m user.web $PORT
web: java -Dserver.port=$PORT -jar user/target/user-0.0.1-SNAPSHOT.jar
web: java -Dserver.port=$PORT -jar inventory/target/inventory-0.0.1-SNAPSHOT.jar
web: java -Dserver.port=$PORT -jar producttarget/product-0.0.1-SNAPSHOT.jar
worker:  bundle exec rake jobs:work

