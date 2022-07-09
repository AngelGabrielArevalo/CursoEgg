Algoritmo Extra3
	Definir usuario, contrasenia Como Caracter
	Definir ingreso Como Logico
	usuario=""
	contrasenia=""
	ingreso=Login(usuario, contrasenia)
	Escribir "Ingreso correcto: ",ingreso
FinAlgoritmo

Funcion ingreso <- Login(usuario , contrasenia)
	Definir ingreso Como Logico
	Definir cant Como Entero
	ingreso=Falso
	cant=0
	Hacer
		Escribir "Ingrese usuario:"
		Leer usuario
		Escribir "Ingrese contraseña:"
		Leer contrasenia
		Si usuario=="usuario1" Y contrasenia=="asdasd" Entonces
			ingreso=Verdadero
		SiNo
			cant=cant+1
		FinSi
	Mientras Que cant<3 Y ingreso=Falso
	Si cant>3 Entonces
		ingreso=Falso
	FinSi
FinFuncion