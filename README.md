# Tarea-3
Tarea 3 
Identificacion de Estudiante:

Institución Universitaria Digital de Antioquia
SANTIAGO NARVAEZ BRUGES 
ID 1082948682
S30 - EA3. Actividad Final - Manipulación de Árboles en Java
PREICA2602B010159
Curso: Estructura de Datos
Profesor: (Carlos Arturo Castro) -

**Objetivo**: un sistema de inventario en Java utilizando un árbol binario de búsqueda.
Que Sea capaz de registrar productos, mostrarlos ordenadamente y buscarlos mediante su ID.

**instrucciones de Uso:**
PASO 0: El menu

==============================
       TREE-STOCK
==============================
1. Registrar Producto
2. Mostrar Inventario
3. Buscar Producto
0. Salir
==============================
Seleccione una opción:
Deberia Salir Algo Asi, acontinuacion Darle a 1 y Registrar de la siguiente manera

PASO 1: Registar un ID
Ejemplo:
Ingrese el ID del producto: 50
Ingrese el nombre del producto: Laptop
el mismo quedara Registrado
puedes registrar cuantos tu quieras
"ID: 30
Nombre: Teclado
ID: 70
Nombre: Monitor
ID: 20
Nombre: Mouse
ID: 40
Nombre: Audifonos"

PASO 2: Revisar el inventario
Cuando Revisas el inventario te salen todos los registros anteriormente registrados con Su ID y nombre respectivamente
por lo que te deberia salir algo asi:

ID: 20 | Nombre: Mouse
ID: 30 | Nombre: Teclado
ID: 40 | Nombre: Audifonos
ID: 50 | Nombre: Laptop
ID: 70 | Nombre: Monitor

PASO 3: buscar si la ID existe o no Existe
Tan sencillo como Presionar 3
acontinuacion deberia salirte algo como esto:

--- BUSCAR PRODUCTO ---
Ingrese el ID que desea buscar: 

Luego se Ingresa la ID, por ejemplo 40, y el mismo programa te dira si existe o no existe, eh intentado ver si puede decir el nombre, pero el programa me falla al hacerlo.

**Comprensión teórica**
El ABB, o el Árbol binario de búsqueda, es una estructura de datos en donde cada nodo puede tener como máximo dos hijos, uno izquierdo y uno derecho, la regla principal es que los elementos de un ID menor que el nodo actual, se van a la izquierda y los mayores a la Derecha 
por ejemplo si tenemos un ID20 como raíz, un producto con ID15 se ira al a izquierda, pero si tenemos uno con ID20 se ira a la derecha 
esto sucediendo en nuestro inventario, en donde la recursividad se utilizara para insertar y buscar productos, la función se llama nuevamente a si misma para avanzar por el árbol
Por ejemplo, al insertar un producto con ID 20, primero se compara con 50. Como 20 es menor, se pasa al lado izquierdo, donde está 30. Como 20 también es menor que 30, se vuelve a avanzar hacia la izquierda hasta encontrar un espacio vacío.
esta búsqueda función de una manera similar, se compara el ID, lo busca con el nodo actual, y dependiendo su es mayor o menor, se continua por la derecha o por la izquierda
finalmente se usa el recorrido inorden, que visita la izquierda, la raíz, y la derecha permitiendo mostrar nuestro inventario ordenado de menor a mayor por ID.
ósea el ABB nos organiza los productos mediante comparaciones y recursividad permitiendo recorrer esa estructura automáticamente hasta encontrar la posición o el producto que necesitamos.

**LINK DEL VIDEO DE YOUTUBE:**
https://youtu.be/qdSrkI3wFYg

Capturas: <img width="336" height="636" alt="Screenshot_349" src="https://github.com/user-attachments/assets/66211ab5-b3ec-45af-9e8f-8771fe04cd4e" />
<img width="386" height="455" alt="Screenshot_348" src="https://github.com/user-attachments/assets/623f7e60-3116-4c32-a95a-4152acf0cc85" />
<img width="402" height="424" alt="Screenshot_347" src="https://github.com/user-attachments/assets/58f086ad-98cc-496e-8ecc-9adf06e7a429" />
<img width="368" height="562" alt="Screenshot_346" src="https://github.com/user-attachments/assets/d5512423-3da9-40f0-8e0b-a9a4cc080369" />
<img width="412" height="649" alt="Screenshot_345" src="https://github.com/user-attachments/assets/970efc0c-4ce4-47e3-b72e-139115ccf42e" />
<img width="573" height="723" alt="Screenshot_344" src="https://github.com/user-attachments/assets/99afb0a1-c12e-46f7-8f64-e37975641c4e" />
<img width="913" height="719" alt="Screenshot_343" src="https://github.com/user-attachments/assets/d6511829-2932-4aea-a8a0-b0d1c436fb0a" />

