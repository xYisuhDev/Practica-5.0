# 🌟 WELCOME! 🌟

Hey there! 👋  
You've just landed on my **4th practice** from the subject **`Entornos de Desarrollo`** 🚀

---

## 📁 Folder Structure

Here’s how everything is organized 🗂️:

- 📦 **`src/`** → Source code lives here ✨
- 📚 **`lib/`** → Dependencies and libraries go here 🧩
- ⚙️ **`bin/`** → Compiled output files appear here automatically 🧠

---

## 💡 What's This Project About?

This project is all about diving deeper into **Java's Object-Oriented Programming (OOP)** 💻☕

🏛️ The theme? **A Library System**!  
You’ll find:

- 📖 **Books**
- 🧍 **People**
- 🏠 **Rooms**

Each class includes its own methods (beyond the usual getters & setters) so you can explore how OOP concepts come to life — **for example: polymorphism** 🔁✨

---

🧠 **Goal:** Strengthen my Java skills and understand how to structure real-world applications using OOP principles.

---

## 🧱 Core Domain Model

The system is organized around three abstract pillars:

- 📖 **Libro** → extended by `LibroFisico` (páginas, ubicación) and `LibroDigital` (formato, tamaño MB).
- 🧍 **Persona** → with the subclasses `Usuario` (nº socio, préstamos) and `Empleado` (puesto, sueldo).
- 🏠 **Sala** → specialized at `SalaLectura`, `SalaEstudio` and `SalaInformatica`, all managed from `Biblioteca`.

La clase `Biblioteca` compone salas, agrega libros y mantiene el registro de personas que realizan visitas o se convierten en responsables de cada sala.

## 📋 Funcionalidades destacadas

- Visits log (`registrarVisita`) and hall managers (`asignarResponsable`).
- Gestión diferenciada de libros físicos y digitales Differentiated managing of `LibrosFisicos` and `LibrosDigitales`.
- Association of users with borrowed books and employees as reference staff.
- Full deployment of the library's state(salas, libros, personas) from `mostrarInformacion()`.

---

Made with ❤️ by _Jesús Palma González_
