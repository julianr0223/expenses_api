# Expenses API

## Technologies

## Persist data
Expenses api use postgres sql database for persist data with spring jpa. For run in local
 it is possibly to run a postgres docker container:   
`docker run -d --name dev-postgres -e POSTGRES_PASSWORD=julianr -v ${HOME}/postgres-data/:/var/lib/postgresql/data -p 5432:5432 postgres`

Then create a new database in postgres with name    'expenses_db'


## Run in local
      
- Run app  
Run bootRun gradle task  
`gradlew bootRun`

### Run with docker in local
TODO: containerize project 
