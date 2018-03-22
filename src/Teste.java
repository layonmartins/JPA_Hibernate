import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		/*Aluno a1 = new Aluno();
		a1.setNome("João");
		a1.setIdade(18);
		a1.setMatricula("123456789");
		
		Aluno a2 = new Aluno();
		a2.setNome("Maria");
		a2.setIdade(18);
		a2.setMatricula("12345678");
		
		Aluno a3 = new Aluno();
		a3.setNome("José");
		a3.setIdade(18);
		a3.setMatricula("1234567");
		
		AlunoController con = new AlunoController();
		con.salvar(a1);
		con.salvar(a2);
		con.salvar(a3);
		*/

		AlunoController con = new AlunoController();
		
		List<Aluno> alunos = con.listar();
		
		for(int i = 0; i < alunos.size(); i++){
			System.out.println("Nome: " + alunos.get(i).getNome() 
					+ " - Idade: " + alunos.get(i).getIdade() 
					+ " - Matricula: " + alunos.get(i).getMatricula());
		}
		
	}

}
