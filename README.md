# Taller de diseño y programación: Abstracciones, interfaces y polimorfismo

### 1. Información de la aplicación
El programa se conforma de una serie de clases que extienden de una clase abstracta heredando sus atributos e implementando sus métodos, estas clases representan naves espaciales con atributos y métodos esenciales para su funcionamiento. El programa se implementa para hacer uso de las clases abstractas y las funcionalidades que estas poseen dentro del lenguaje de programación Java.


### 2. Clases
El programa cuenta con 4 clases en total y un archivo Main que ejecuta el funcionamiento del programa.

```
Class Spaceship 
```
- Clase abstracta que representa una nave espacial y sus atributos.

```
ShuttleVehicles
```
- Clase que extiende de Spaceship y representa una nave espacial propulsora conocida como vehículo lanzadera.

```
UnmannedSpaceships
```
- Clase que extiende de Spaceship y representa una nave espacial no tripulada.

```
MannedSpaceships
```
- Clase que extiende de Spaceship y representa una nave espacial tripulada.

```
Class Main
```
- Clase Main que ejecuta el programa en bucle permitiendo al usuario crear naves indefinidamente hasta que este decida finalizar el programa.