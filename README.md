<p align="center">
<a href="https://travis-ci.org/sanchev/helloservice"><img src="https://travis-ci.org/sanchev/helloservice.svg?branch=master"><alt="Build Status"></a>
</p>

# HelloService Project
еуые
Service that return contacts (json) from the database.

## База данных

Для настройки базы данных используется файл /resources/db.properties

Возможные варианты:
* [H2](https://h2database.com/)
* [MySQL](https://www.mysql.com/)
* [PostgreSQL](https://www.postgresql.org/)

База данных должна иметь таблицу contacts с двумя полями:
* id - 64 bit integer
* name - varchar

База данных по умолчанию: h2db.mv.db
База данных для тестов: h2db_test.mv.db

## Сборка

* [Maven](https://maven.apache.org/)

## Автор

* **sanchev**
