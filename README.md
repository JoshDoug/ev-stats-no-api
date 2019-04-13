# Norway EV Stats API, ev-stats-no-api

Base database container to run hibernate against and generate a schema:

```bash
# Database container
docker run -d --rm --name test-export-db -p 3306:3306 --env-file config/env.list --network ev-test-net -v `pwd`/db-data:/docker-entrypoint-initdb.d mariadb:latest

# Export container
docker run -d --rm --name db-exporter-app -p 8081:8080 --env-file config/env.list --network ev-test-net -v `pwd`/external:/exports db-exporter:0.0.2

# PhpMyAdmin or something to connect and adminster the database?

```