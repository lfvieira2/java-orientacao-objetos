
public class Application {

	public static void main(String[] args) {

		/*Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Teste");
		funcionario.setCpf("021528252");
		funcionario.setSalario(2400.0);
		
		System.out.println(
				"O funcionário \"" 
				+ funcionario.getNome() + "\" vai receber " 
				+ funcionario.getBonificacao() + " R$ de bonificação."
		);*/
	
		// ---------------------------------------
		
		/*Gerente gen = new Gerente();
		
		gen.setNome("Gerente");
		gen.setCpf("5123123");
		gen.setSalario(5000.0);
		gen.setSenha(111);
		
		System.out.println(
				"O funcionário \"" 
				+ gen.getNome() + "\" vai receber " 
				+ gen.getBonificacao() + " R$ de bonificação."
		);
		
		System.out.println(gen.autentica(111));*/
		
		// ---------------------------------------

//		Gerente g = new Gerente();
//		EditorVideo ed = new EditorVideo();
//		Designer ds = new Designer();
//		
//		ControleBonificacao controle = new ControleBonificacao();
//		
//		g.setNome("João");
//		g.setCpf("51113");
//		g.setSalario(5000.0);
//		
//		ed.setNome("ed");
//		ed.setCpf("22222");
//		ed.setSalario(2500.0);
//		
//		ds.setNome("ds");
//		ds.setCpf("1111");
//		ds.setSalario(1500.0);
//
//		controle.registra(g);
//		controle.registra(ed);
//		controle.registra(ds);
//		
//		System.out.println(controle.getSoma());
//		
		// ---------------------------------------
		
		Gerente g2 = new Gerente();
		g2.setSenha(2222);
		
		Administrador adm1 = new Administrador();
		adm1.setSenha(2222);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g2);
		si.autentica(adm1);
		si.autentica(cliente);
		
	}
}
