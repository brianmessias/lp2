import java.util.Collections;
import java.util.ArrayList;

public class Principal{
	public static void main(String[] args){
		Aluno a = new Aluno();
		a.setNome("Brian");
		a.setIdade(18);

		Aluno b = new Aluno();
		b.setNome("Birma");
		b.setIdade(17);

		Aluno c = new Aluno();
		c.setNome("Karol");
		c.setIdade(19);

		Aluno d = new Aluno();
		d.setNome("Matheus");
		d.setIdade(15);


		Aluno e = new Aluno();
		e.setNome("Hebert");
		e.setIdade(31);

		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		lista.add(e);

		Collections.sort(lista);
		for (int i=0; i<5; i++){
			System.out.println(lista.get(i).getNome() + " - " + lista.get(i).getIdade());
		}
	}
}
