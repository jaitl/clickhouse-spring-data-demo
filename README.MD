# clickhouse-spring-data-demo
[![build](https://github.com/Jaitl/clickhouse-spring-data-demo/actions/workflows/build.yml/badge.svg)](https://github.com/Jaitl/clickhouse-spring-data-demo/actions/workflows/build.yml)

Demo project for my article: [Working With ClickHouse From Spring Data Using MySql Driver](https://jaitl.pro/post/2021/04/16/clickhouse-spring-data/)

## Run Clickhouse
1. Open the docker folder: `cd docker`
2. Run Clickhouse: `docker-compose up -d`
3. Create tables:
    ```bash
    docker-compose run clickhouse-client --host clickhouse-server --user admin --password admin --multiquery < ../sql/script.sql
    ```
4. Login to DB using clickhouse client:
    ```bash
    docker-compose run clickhouse-client --host clickhouse-server --user admin --password admin
    ```

## Run the service
```bash
./gradlew bootRun
```
***Note:*** Java 11 or later has to be installed to run the demo project.

## Send a request to the service
* Create an item
   ```bash
   curl --header "Content-Type: application/json" \
      --request POST \
      --data '{ "itemId": "12323", "timestamp": "2009-09-22T16:47:08.432", "data": "123","list": {"list": ["1", "2", "3"]}}' \
      localhost:8080/v1/demo/item
   ```
* List items
   ```bash
   curl localhost:8080/v1/demo/item
   ```
