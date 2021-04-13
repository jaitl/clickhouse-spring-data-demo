# clickhouse-spring-data-demo
Demo project for my article: name

## Run Clickhouse
1. Open docker folder: `cd docker`
2. Run Clickhouse: `docker-compose up -d`
3. Create tables:
    ```bash
    docker-compose run clickhouse-client --host clickhouse-server --user admin --password admin --multiquery < ../sql/script.sql
    ```
4. Login to db using clickhouse client:
    ```bash
    docker-compose run clickhouse-client --host clickhouse-server --user admin --password admin
    ```

## Run service
```bash
./gradlew bootRun
```

## Do request to service
1. Create an item
   ```bash
   ```
2. List items
      ```bash
   ```
3. Update an item
      ```bash
   ```
4. Delete an item
   ```bash
   ```
