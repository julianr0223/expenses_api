**Expenses API**

* Thecnologies
* Run in local
    * Containerize Database

    `docker run -d --name dev-postgres -e POSTGRES_PASSWORD=julianr -v ${HOME}/postgres-data/:/var/lib/postgresql/data -p 5432:5432 postgres`

    Then create a new database in postgres with name    'expenses_db'
* Run with docker in local
