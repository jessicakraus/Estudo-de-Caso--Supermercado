package modelo;

import java.util.ArrayList;

public interface IFuncionarioBD {

	public boolean cadastrar(Funcionario f);

	public ArrayList<Funcionario> listar();

	public boolean alterar(Funcionario f, int id);

}
