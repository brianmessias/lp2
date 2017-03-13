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

		Disciplina um = new Disciplina();
		um.setNome("LP2");
		um.setProfessor("Herbert");

		Disciplina dois = new Disciplina();
		dois.setNome("WEB");
		dois.setProfessor("Marcelo");

		ArrayList<Nota> notas = new ArrayLista<Nota>();
		notas.add(new Nota (1, a, um));
		notas.add(new Nota (2, a, dois));

		notas.add(new Nota (3, b, um));
		notas.add(new Nota (4, b, dois));

		notas.add(new Nota (5, c, um));
		notas.add(new Nota (8, c, dois));

		notas.add(new Nota (6, d, um));
		notas.add(new Nota (2, d, dois));

		notas.add(new Nota (8, e, um));
		notas.add(new Nota (7, e, dois));

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

		Collections.sort(notas);
	}
}
