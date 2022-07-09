Algoritmo Extra11
	Definir nota1, nota2, nota3, nota4, menor Como Real
	Escribir "Ingresar las cuatro notas:"
	Leer nota1
	Leer nota2
	Leer nota3
	Leer nota4
	Si nota1<nota2 Entonces
		menor=nota1
	SiNo
		Si nota2<nota3 Entonces
			menor=nota2
		SiNo
			Si nota3<nota4 Entonces
				menor=nota3
			SiNo
				menor=nota4
			FinSi
		FinSi
	FinSi
	Escribir "La nota eliminada es: ", menor
	Escribir "El promedio es: ", (nota1+nota2+nota3+nota4-menor)/3
FinAlgoritmo
