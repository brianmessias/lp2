class No{
	private int item;
	private No prox, ant;
	}
	public void setItem(int item){
		this.item = item;		
	}
	public int getItem(){
		return this.item;
	}
	public void setProx(No prox){
		this.prox = prox;
	}
	public No getProx(){
		return this.prox;
	}
	public void setAnt(No ant){
		this.ant = ant;
	}
	public No getAnt(){
		return this.ant;
	}
}
public class Lista{
	private No cabeca = null, aux = null;
	private int tam;
	
	public void inserir(int item){
		if (cabeca == null){
			cabeca.setItem(item);
			cabeca.setProx(null);
			cabeca.setAnt(null);
			aux = cabeca;
		}else{
			No novo = new No();
			novo.setItem(item);
			novo.setProx(null);
			novo.setAnt(aux);
			aux = novo;
		}
	}
	public void remover(){

	}
	public boolean pesquisar(int item){
		No cursor = cabeca;
		while (cursor.getItem() != item && cursor != null){
			cursor = cursor.getProx();
		}
		if (cursor == null){
			return false;
		}else{
			return true;
		}
	}
}
