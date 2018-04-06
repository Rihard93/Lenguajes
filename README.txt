miniPHP - Analizador Lexico

/* ESTRUCTURA GENERAL DEL PROGRAMA */

- Al iniciar el programa, este solicita atravez de la interfaz grafica la carga de un archivo con extension .php o .txt.
- Se crea un archivo temporal (Extension .out) en el que todo el archivo se pasa a minusculas, para facilitar la busqueda en el diccionario.
- Tras crear el archivo temporal y arreglar la estructura, este archivo es eliminado por completo.
- El programa analiza el archivo y determina que elementos pertencen al diccionario previamente definido.
- Si el programa encontro algun error, se activa una bandera de error, lo cual le indica al programa que se debe crear el archivo de errores.
- Por cada error detectado, se escribira la palabra "ERROR" mas el token no reconocido en el archivo de texto y en pantalla.
- Si no se detecta ningun error, el programa creara el archivo con la extension .out y procedera a dar el formato correcto al archivo de salida.
- Si no hay errores se mostrar un mensaje en pantalla que indica Fin del Archivo, indicando asi que se ha llegado al final del archivo a analizar.


/* FUNCIONAMIENTO DEL PROGRAMA */

- Mi programa funciona correctamente porque diseñe una serie de conjuntos (En base a los requerimientos del proyecto) en el cual puedo detectar
cualquier estructura ingresada en el archivo de texto.
- El programa esta diseñado para reconocer las estructuras requeridas en el enunciado del proyecto, pero si en algun caso esto no se pudiera reconocer
como estructura, el programa es capaz de reconocer por individual cada caracter ingresado.
- El manejo de errores que tengo en mi sistema, es que todo aquel caracter que no este previamente definido en los conjuntos o expresiones regulares
sera tomado como un caracter desconocido para representar correctamente el analizador lexico.  