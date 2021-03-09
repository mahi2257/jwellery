web: bundle exec rails server -p $PORT
web: lein run -m demo.web $PORT
web: java -jar inventory-0.0.1-SNAPSHOT.jar
web: java -jar product-0.0.1-SNAPSHOT.jar
web: java -jar user-0.0.1-SNAPSHOT.jar
worker:  bundle exec rake jobs:work

