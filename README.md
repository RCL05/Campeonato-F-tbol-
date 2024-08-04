

---

# Sistema de Gestión de Campeonatos Deportivos
DIAGRMA UML

![CampeonatoDeportivo](https://github.com/user-attachments/assets/6b193d5e-53e1-4349-94f8-7534cb3539ab)



# Modificaciones Realizadas:
Clase Campeonato:

Definí los atributos y añadí listas para Estadisticas, InscripciondelEquipo, InscripcionJugador y Equipo.
Añadí el atributo calendario para relacionar con la clase Calendario.

Clase Principal Main:

Esta clase para crear y ejecutar instancias de los objetos definidos, registrar empates y mostrar la tabla de posiciones.


## Funcionalidades Principales

Este proyecto es un sistema de gestión de campeonatos deportivos que permite registrar y administrar diferentes aspectos de un campeonato, incluyendo equipos, jugadores, encuentros y resultados. El objetivo es facilitar la organización y seguimiento de campeonatos deportivos.


1. **Gestión de Campeonatos**:
   - Crear campeonatos con nombre y fechas de inicio y fin.
   - Registrar y administrar equipos participantes.

2. **Gestión de Equipos y Jugadores**:
   - Crear equipos con nombre y lista de jugadores.
   - Registrar jugadores con información personal y categoría.

3. **Programación de Encuentros**:
   - Programar encuentros deportivos entre equipos.
   - Registrar resultados de los encuentros.

4. **Tabla de Posiciones**:
   - Llevar y actualizar la tabla de posiciones del campeonato.
   - Mostrar la tabla de posiciones con los puntos obtenidos por cada equipo.


# Campeonato de Fútbol

Este es un proyecto de gestión de campeonatos de fútbol desarrollado en Java. La aplicación permite crear y gestionar campeonatos de fútbol, incluyendo la administración de equipos, jugadores y árbitros, y la generación de encuentros.

## Requisitos

- JDK 8 o superior
- IDE compatible con Java (por ejemplo, IntelliJ IDEA, Eclipse)

## Instalación

1. Clona el repositorio:
   ```
   git clone https://github.com/tu_usuario/tu_repositorio.git
   ```
   
2. Navega al directorio del proyecto:
   ```
   cd tu_repositorio
   ```

3. Compila y ejecuta el proyecto utilizando tu IDE o la línea de comandos.

## Uso

1. **Ejecuta la aplicación**:
   ```bash
   java com.mycompany.campeonatofutbol.CampeonatoFutbolGUI
   ```

2. **Agregar Datos**:
   - **Datos del Campeonato**: Introduce el nombre del campeonato, fecha de inicio y fecha de fin.
   - **Datos del Equipo**: Introduce el nombre y color del uniforme del equipo, y presiona "Añadir Equipo".
   - **Datos del Jugador**: Introduce el nombre del jugador, goles y asistencias, y presiona "Añadir Jugador".
   - **Datos del Árbitro**: Introduce el nombre del árbitro y el número de licencia, y presiona "Añadir Árbitro".

3. **Generar Encuentros**:
   - Selecciona dos equipos diferentes de las listas desplegables y presiona "Generar Encuentro".

4. **Generar Campeonato**:
   - Presiona "Generar Campeonato" para crear el campeonato con los datos ingresados.


¡Gracias por utilizar el sistema de gestión de campeonatos de fútbol!
```

Este archivo `README.md` proporciona una visión general de tu proyecto, instrucciones para la instalación y el uso, y detalles sobre cómo contribuir. Asegúrate de ajustar la URL del repositorio, el correo electrónico y la licencia según corresponda.
