# REGISTRO_D_GIMNASIOS

![gimnasios](https://github.com/Yoswell/REGISTRO_D_GIMNASIOS/assets/113799193/fbc6d87e-ff48-42a6-86de-0db8819ee643)

<strong>Instrucciones:</strong><br>Se deberá implementar un programa para llevar un registro de los gimnasios suscritos a la Asociación Nacional de Gimnasios y Centros de Salud.<br>

  🐽 <strong>Registro de equipos:</strong><br>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   En esta pantalla se podrá incluir los datos generales de cada equipo participante, con los siguientes campos:<br><br>

  🦴 Nombre del campo Tipo de dato<br>
  🦴 ID del gimnasio Identificador consecutivo numérico generado por el programa<br>
  🦴 Nombre del gimnasio Texto<br>
  🦴 Cantidad de máquinas Número entero<br>
  🦴 Incluye Crossfit Valor booleano (SÍ o NO)<br>
  🦴 Cantidad promedio de clientes mensual Número entero<br><br>

  La información de los gimnasios con los campos anteriormente especificados, se guardarán en una clase “Gimnasio” y cada una de estas se agregará a una única colección utilizando la clase ArrayList de Java<br>

  🐽 <strong>Listado de gimnasios:</strong><br>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;En esta pantalla se listan todos los gimnasios registrados en la colección (con todos sus campos). En     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;esta opción se debe utilizar una clase de tipo Iterator para recorrer la colección.

  🐽 <strong>Búsqueda y edición de un gimnasio:</strong><br> En esta pantalla se solicitará una cadena de texto, y el programa deberá buscar los gimnasios que contengan esa cadena de texto como parte del nombre. Puede ser al inicio, en el medio o al final del nombre. Una vez mostrados los registros encontrados, el usuario seleccionará un único registro para su edición. Cuando se seleccione un registro para su edición, se deberá mostrar en pantalla los campos del registro a editar con los valores actuales. El campo ID del gimnasio no podrá ser editado. Habrá un botón GUARDAR para guardar los datos

  🐽 <strong>Comparación de valores:</strong><br> Debe utilizar recursividad para esta operación. El usuario deberá ingresar un número para realizar la comparación. El programa realizará la búsqueda recursiva para seleccionar los registros cuyo valor en el campo. “Cantidad promedio de clientes mensual” sea mayor o igual al número ingresado por el usuario. El programa mostrará la lista con los registros encontrados (se muestran todos los campos de la clase gimnasio). Puede utilizar una estructura de datos aparte para realizar la búsqueda recursiva si lo considera necesario (por ejemplo: un arreglo primitivo).

  🐽 <strong>Ordenamiento de la lista de gimnasios:</strong><br> En esta pantalla se mostrarán los gimnasios registrados ordenados ascendentemente por el campo “Cantidad de máquinas” o por el campo “Nombre del gimnasio”, según lo indique el usuario de la aplicación. El ordenamiento debe hacerlo utilizando el algoritmo “Por Inserción” o el “MergeSort”, según lo indique el usuario. Previo al ordenamiento, se deben copiar los datos a ordenar del ArrayList a un arreglo para uso del algoritmo de ordenamiento correspondiente (Si utiliza el método Sort del ArrayList tendrá un cero en este punto automáticamente). Finalmente se mostrará la lista ordenada de gimnasios con todos sus campos, según el criterio de ordenamiento indicado.

  Debe existir un menú con cada una de las opciones. Los resultados de las opciones se muestran en la pantalla correspondiente, sin usar mensajes de diálogo para ello
