# 🎓 SistemasEstudiantesApp

Aplicación de consola en Java con **persistencia MySQL**, diseñada para gestionar estudiantes usando una arquitectura modular y reforzar conceptos de bases de datos y POO.

---

## 📚 Descripción

Este proyecto facilita el registro, consulta y listado de estudiantes con atributos como nombre, apellido, email y teléfono. Desarrollado durante mi formación en el **CFGS DAM**, integra una base de datos MySQL para aprender la conexión y manejo de datos reales en Java.

---

## 🚀 Tecnologías Utilizadas

- Java 17+
- MySQL
- JDBC / DAO
- POO e Interfaces
- Interfaz de línea de comandos (CLI)

---

## 🎯 Objetivos de Aprendizaje

- Conectar una aplicación Java con base de datos MySQL.
- Implementar el patrón DAO (Data Access Object).
- Realizar operaciones CRUD (crear, leer/listar, actualizar, borrar).
- Controlar excepciones y gestionar conexiones.
- Estructurar código manteniendo separación de responsabilidades.

---

## 🧩 Funcionalidades Clave

- **Crear** nuevos estudiantes en la base de datos.
- **Listar** todos los estudiantes registrados.
- **Buscar** por ID o por criterios (si está implementado).
- **Actualizar** datos de alumnos existentes.
- **Eliminar** registros.
- Menú interactivo en consola que permite operar hasta decidir salir.

---

## ⚙️ Configuración & Ejecución

1. Crea una base de datos en MySQL, por ejemplo:

   ```sql
   CREATE DATABASE gestion_estudiantes;
   
2. Importa el esquema en src/main/resources/schema.sql (o desde tu propia selección de tablas).

3. Configura la conexión en application.properties / fichero de config:
   
   db.url=jdbc:mysql://localhost:3306/gestion_estudiantes
   db.user=tu_usuario
   db.password=tu_contraseña

4. Ejecuta la aplicación:

   mvn compile
   mvn exec:java -Dexec.mainClass="com.ecalar.SistemasEstudiantesApp"
   -(O ejecútalo directamente desde tu IDE.)-
   
---
   
## 📸 Capturas (próximamente)

Subiré capturas de la interacción con la base de datos en consola. ¡Estate atento!

---

## 🧠 Sobre el Autor

Proyecto parte de mi portfolio y evolución como desarrollador en CFGS DAM. Puedes ver más proyectos como este en: @ecalar.

---

## ⚙️ Estado del Proyecto

✅ Funcional y estable — abierto a mejoras como interfaz gráfica, tests unitarios, validaciones avanzadas o migración a Spring Boot.

---

## 📩 Contacto

Si te interesa saber más sobre mis proyectos:

    GitHub: @ecalar

    Email: enriquecalar@gmail.com





