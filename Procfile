web: bundle exec rails server -p $PORT
web: lein run -m user.web $PORT
web: java -jar target/inventory-0.0.1-SNAPSHOT
web: java -jar target/product-0.0.1-SNAPSHOT
web: java -jar target/user-0.0.1-SNAPSHOT
worker:  bundle exec rake jobs:work

