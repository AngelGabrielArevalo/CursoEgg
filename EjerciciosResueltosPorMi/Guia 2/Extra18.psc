Algoritmo Extra18
	Definir usuario, contrasenia Como Entero
	Hacer
		Escribir "Ingrese su nombre de usuario: "
		Leer usuario
		Escribir "Ingrese su contraseña:"
		Leer contrasenia
		Si (usuario<>1024 Y contrasenia<>4567) Entonces
			Escribir "Nombre de usuario o contraseña incorrectas"
		FinSi
	Mientras Que usuario<>1024 Y contrasenia<>4567
FinAlgoritmo
