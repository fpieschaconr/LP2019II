Proyecto final Lenguajes de Programacion 
Universidad Nacional de Colombia 2019-II

Traductor de SQLite a PostgreSQL
Felipe Pieschacon - Tom Erick Perez - Juan Nicolas Nobsa

-Dentro de la carpeta Sqlitetraducer se encuentra el codigo fuente utilizado asi como la gramatica de Sqlite tomada del proyecto de gramticas de antlr4 en Github
-En la carpeta test cases se hallan los ejemplos de inputs para traducir
-Para ejecutar el proyecto, hacer uso del .exe llamado SQLite2PostgreSQL que esta junto con este README
	.Primero se abre un archivo de input .txt o .sql
	.Segundo se da guardar archivo en el lugar deseado poniendo el nombre del archivo y su extension .txt o .sql 
	.En el archivo guardado se encontrara la traduccion para ser ejecutada en PostgreSQL basada en el archivo abierto de SQLite
	.Se cierra el ejecutable
-El programa tambien se puede compilar con el codigo fuente ejecutando la funcion main del archivo FileChooser
	.Si presenta problemas en compilar con Intellij, referirse al tutorial de Antlr en la pagina del curso 