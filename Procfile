web: bundle exec rails server -p $PORT
web: lein run -m user.web $PORT
web: java -jar inventory/target/inventory-0.0.1-SNAPSHOT.jar
web: java -jar product/target/product-0.0.1-SNAPSHOT.jar
web: java -jar user/target/user-0.0.1-SNAPSHOT
worker:  bundle exec rake jobs:work

