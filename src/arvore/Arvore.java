package arvore;

public class Arvore<TIPO extends Comparable> {
	private Elemento<TIPO>raiz;
	
	public Arvore() {
		this.raiz = null;
	}
	
	public void adicionar(TIPO valor) {
		Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
			if (raiz == null);{
				this.raiz = novoElemento;
			}{
				Elemento<TIPO> atual = this.raiz;
				while(true) {
					if (novoElemento.getValor().compareTo(atual.getValor())== -1){
						if(atual.getEsquerda()!= null) {
						atual = atual.getEsquerda();
				
						}else{
							atual.setEsquerda(novoElemento);
							break;
					}
			}else{
					if (atual.getDireita() != null){
						atual = atual.getDireita();

                    }else{
						atual.setDireita(novoElemento);
                        break;
					}
				}
			}
		}	
	}
	public Elemento<Integer> getRaiz() {
		return null;
	}


	public void emOrdem(Elemento<TIPO>atual){
		if (atual != null){
		emOrdem(atual.getEsquerda());
		System.out.println(atual);
		emOrdem(atual.getDireita());
		}

	}


	
}