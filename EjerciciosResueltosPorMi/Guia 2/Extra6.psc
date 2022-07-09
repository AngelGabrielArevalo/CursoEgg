Algoritmo Extra6
	Definir mes Como Caracter
	Definir num1, num2, num3 Como Entero
	Escribir "Ingrese tres números:"
	Leer num1
	Leer num2
	Leer num3
	Si num1>=0 Y num1<=31 Y num2>=0 Y num2<=12 Entonces
		Segun num2 Hacer
			1:
				mes="Enero"
			2:
				mes="Febrero"
			3:
				mes="Marzo"
			4:
				mes="Abril"
			5:
				mes="Mayo"
			6:
				mes="Junio"
			7:
				mes="Julio"
			8:
				mes="Agosto"
			9:
				mes="Septiembre"
			10:
				mes="Octubre"
			11:
				mes="Noviembre"
			12:
				mes="Diciembre"
		FinSegun
		Escribir num1, " de ", mes, " de ", num3
	SiNo
		Escribir "FECHA INVALIDA"
	FinSi
FinAlgoritmo
