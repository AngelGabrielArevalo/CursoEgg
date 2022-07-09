Algoritmo Integrador1
	
FinAlgoritmo

Funcion mover(mat,n,m, h, posx Por Referencia, posy Por Referencia)
	Si posx-1>=0 Y mat(posx-1,posy)==h Entonces
		mat(posx-1, posy)=mat(posx,posy)
		mat(posx,posy)=h
		posx=posx-1
	SiNo
		Si posx+1<=n-1 Y mat(posx+1,posy)==h Entonces
			mat(posx+1, posy)=mat(posx,posy)
			mat(posx,posy)=h
			posx=posx+1
		SiNo
			Si posy-1>=0 Y mat(posx,posy-1)==h Entonces
				mat(posx, posy-1)=mat(posx,posy)
				mat(posx,posy)=h
				posy=posy-1
			SiNo
				Si posy+1<=n-1 Y mat(posx,posy+1)==h Entonces
					mat(posx, posy+1)=mat(posx,posy)
					mat(posx,posy)=h
					posy=posy+1
				SiNo
					Si posx-1>=0 Y posy+1<=n-1 Y mat(posx-1,posy+1)==h Entonces
						mat(posx-1, posy+1)=mat(posx,posy)
						mat(posx,posy)=h
						posx=posx-1
						posy=posy+1
					SiNo
						Si posx-1>=0 Y posy-1>=0 Y mat(posx-1,posy-1)==h Entonces
							mat(posx-1, posy-1)=mat(posx,posy)
							mat(posx,posy)=h
							posx=posx-1
							posy=posy-1
						SiNo
							Si posx+1<=n-1 Y posy-1>=0 Y mat(posx+1,posy-1)==h Entonces
								mat(posx+1, posy-1)=mat(posx,posy)
								mat(posx,posy)=h
								posx=posx+1
								posy=posy-1
							SiNo
								Si posx+1<=n-1 Y posy+1<=n-1 Y mat(posx+1,posy+1)==h Entonces
									mat(posx+1, posy+1)=mat(posx,posy)
									mat(posx,posy)=h
									posx=posx+1
									posy=posy+1
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinFuncion
	