## TAREA INTRODUCCIÓN MVN-GITY HEROKU

### Autor
> Miguel Angel Rodriguez Siachoque
> 24 de Agosto del 2021

### Descripcion
El proyecto consiste en la utilización y complementacion con la API Alpha Vantage, con lo cual los datos se estableceran mediante el usuario ingrese los datos que podran ser visibles.

### Ejecución
Se debe ejecutar con el siguiente comando:
> java -cp "target/classes;target/dependency/*" edu.escuelaing.arem.App

### Heroku
[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://limitless-springs-37536.herokuapp.com)

### Requisitos
- Java
- JUnit
- Spark
- Maven
- Git
- Heroku
- HTTP

### Diagrama de clases
![Diagrama Clases](images/DiagramClass.PNG)
En lo anterior se puede ver lo siguente:
- Un Cliente en la App.
- Un servidor que en este caso utilizaria Spark para su funcionamiento.
- Dos clases para las APIs, tanto para Alpha Advantage como para IEXcloud.
De lo anterior se pudo haber establecido la parte de cache que en estos momentos faltan y una mejor ejecución local y en el servidor IEXCloud.

### JavaDoc:
[JavaDoc - App](JavaDoc/index.html)