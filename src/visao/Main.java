package visao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Cliente;
import modelo.Produto;
import modelo.Funcionario;

public class Main {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

		int op = 999;
		Scanner opcao = new Scanner(System.in);
		Scanner cadastro = new Scanner(System.in);
		int id = 0;

		while (op != 0) {

			System.out.println("\n0 - Sair");
			System.out.println("1 - Produto");
			System.out.println("2 - Cliente");
			System.out.println("3 - Funcionário");
			System.out.println("4 - Pedido");
			System.out.println("------------------------------------");
			System.out.println("Digite a opção: ");
			op = opcao.nextInt();

			switch (op) {
			case 1:

				int opProduto = 999;
				Scanner opcaoProduto = new Scanner(System.in);

				while (opProduto != 0) {

					System.out.println("\n0 - Sair");
					System.out.println("1 - Cadastrar produto");
					System.out.println("2 - Alterar produto");
					System.out.println("3 - Deletar produto");
					System.out.println("4 - Listar produtos");
					System.out.println("------------------------------------");
					System.out.println("Digite a opção: ");
					opProduto = opcaoProduto.nextInt();

					switch (opProduto) {
					case 1:
						Produto produto = new Produto();
						Scanner leituraCadastro = new Scanner(System.in);
						id++;

						produto.setId(id);

						System.out.println("Nome: ");
						String nome = leituraCadastro.nextLine();
						produto.setNomeProduto(nome);

						System.out.println("Unidade de medida: ");
						String unidadeMedida = leituraCadastro.nextLine();
						produto.setUnidadeMedida(unidadeMedida);

						System.out.println("Setor: ");
						String setor = leituraCadastro.nextLine();
						produto.setSetor(setor);

						System.out.println("Valor: ");
						Double valor = leituraCadastro.nextDouble();
						produto.setValor(valor);

						System.out.println("Peso: ");
						Double peso = leituraCadastro.nextDouble();
						produto.setPeso(peso);

						listaProdutos.add(produto);

						System.out.println("Produto cadastrado com sucesso!");
						break;
					case 2:
						System.out.println("Digite o id do produto que deseja alterar: ");
						int idAlterarProduto = leitura.nextInt();

						for (Produto Produto : listaProdutos) {
							if (Produto.getId() == idAlterarProduto) {

								int opAlterarProduto = 999;
								Scanner opcaoAlterarProduto = new Scanner(System.in);

								while (opAlterarProduto != 0) {

									System.out.println("\n0 - Sair");
									System.out.println("O que você deseja alterar?");
									System.out.println("1 - Nome");
									System.out.println("2 - Valor");
									System.out.println("3 - Peso");
									System.out.println("4 - Unidade de Medida");
									System.out.println("5 - Setor");
									System.out.println("------------------------------------");
									System.out.println("Digite a opção: ");
									opAlterarProduto = opcaoAlterarProduto.nextInt();

									switch (opAlterarProduto) {
									case 1:
										Scanner leitura2 = new Scanner(System.in);

										System.out.println("Digite o novo nome: ");
										String novoNomeProduto = leitura2.nextLine();
										Produto.setNomeProduto(novoNomeProduto);

										System.out.println("Nome alterado com sucesso!");
										break;

									case 2:
										Scanner leitura3 = new Scanner(System.in);

										System.out.println("Digite o novo valor: ");
										Double novoValorProduto = leitura3.nextDouble();
										Produto.setValor(novoValorProduto);

										System.out.println("Valor alterado com sucesso!");
										break;

									case 3:
										Scanner leitura4 = new Scanner(System.in);

										System.out.println("Digite o novo peso: ");
										Double novoPesoProduto = leitura4.nextDouble();
										Produto.setPeso(novoPesoProduto);

										System.out.println("Peso alterado com sucesso!");
										break;

									case 4:
										Scanner leitura5 = new Scanner(System.in);

										System.out.println("Digite a nova unidade de medida: ");
										String novaUnidadeMedidaProduto = leitura5.nextLine();
										Produto.setUnidadeMedida(novaUnidadeMedidaProduto);

										System.out.println("Unidade de medida alterada com sucesso!");
										break;

									case 5:
										Scanner leitura6 = new Scanner(System.in);

										System.out.println("Digite o novo setor: ");
										String novoSetorProduto = leitura6.nextLine();
										Produto.setSetor(novoSetorProduto);

										System.out.println("Setor alterado com sucesso!");
										break;

									case 0:
										break;

									default:
										System.out.println("Opção inválida, digite novamente: ");
										break;
									}
								}
								opcaoAlterarProduto.close();
							} else {
								System.out.println("Produto não encontrado!");
							}
						}
						break;
					case 3:
						System.out.println("Digite o id do produto que deseja remover: ");
						int idRemoverProduto = leitura.nextInt();
						int i = 0;
						for (Produto Produto : listaProdutos) {
							if (Produto.getId() == idRemoverProduto) {
								listaProdutos.remove(i);
							} else {
								System.out.println("Produto não encontrado!");
							}
							i++;
						}
						break;

					case 4:
						for (Produto Produto : listaProdutos) {
							System.out.println("\n" + Produto);
						}
						break;

					case 0:
						break;

					default:
						System.out.println("Opção inválida, digite novamente: ");
						break;
					}
				}
			case 2:
				int opCliente = 999;
				Scanner opcaoCliente = new Scanner(System.in);

				while (opCliente != 0) {

					System.out.println("\n0 - Sair");
					System.out.println("1 - Cadastrar cliente");
					System.out.println("2 - Alterar cliente");
					System.out.println("3 - Deletar cliente");
					System.out.println("4 - Listar clientes");
					System.out.println("------------------------------------");
					System.out.println("Digite a opção: ");
					opProduto = opcaoCliente.nextInt();

					switch (opProduto) {
					case 1:
						Cliente cliente = new Cliente();
						Scanner leituraCadastro = new Scanner(System.in);
						id++;

						// Cliente.setId(id);

						System.out.println("Codigo: ");
						int codigo = leituraCadastro.nextInt();
						cliente.setCodigo(codigo);

						System.out.println("CPF: ");
						String cpf = leituraCadastro.nextLine();
						cliente.setCPF(cpf);

						System.out.println("Data de nascimento: ");
						String dataNasc = leituraCadastro.nextLine();
						cliente.setDataNasc(LocalDate.parse(dataNasc));

						System.out.println("Email: ");
						String email = leituraCadastro.nextLine();
						cliente.setEmail(email);

						System.out.println("Nome: ");
						String nome = leituraCadastro.nextLine();
						cliente.setNome(nome);

						listaClientes.add(cliente);

						System.out.println("Cliente cadastrado com sucesso!");
						break;
					case 2:
						System.out.println("Digite o id do produto que deseja alterar: ");
						int idAlterarCliente = leitura.nextInt();

						for (Cliente Cliente : listaClientes) {
							if (Cliente.getId() == idAlterarCliente) {

								int opAlterarCliente = 999;
								Scanner opcaoAlterarCliente = new Scanner(System.in);

								while (opAlterarCliente != 0) {

									System.out.println("\n0 - Sair");
									System.out.println("\nO que você deseja alterar?");
									System.out.println("1 - Código");
									System.out.println("2 - CPF");
									System.out.println("3 - Data de nascimento");
									System.out.println("4 - E-mail");
									System.out.println("5 - Nome");
									System.out.println("------------------------------------");
									System.out.println("Digite a opção: ");
									opAlterarCliente = opcaoAlterarCliente.nextInt();

									switch (opAlterarCliente) {
									case 1:
										Scanner leitura2 = new Scanner(System.in);

										System.out.println("Digite o novo código: ");
										int novoCodigoCliente = leitura2.nextInt();
										Cliente.setCodigo(novoCodigoCliente);

										System.out.println("Código alterado com sucesso!");
										break;

									case 2:
										Scanner leitura3 = new Scanner(System.in);

										System.out.println("Digite o novo CPF: ");
										String novoCPFCliente = leitura3.nextLine();
										Cliente.setCPF(novoCPFCliente);

										System.out.println("CPF alterado com sucesso!");
										break;

									case 3:
										Scanner leitura4 = new Scanner(System.in);

										System.out.println("Digite a nova data de nascimento: ");
										String novaDataNasc = leitura4.nextLine();
										Cliente.setDataNasc(LocalDate.parse(novaDataNasc));

										System.out.println("Data de nascimento alterada com sucesso!");
										break;

									case 4:
										Scanner leitura5 = new Scanner(System.in);

										System.out.println("Digite o novo E-mail: ");
										String novoEmailCliente = leitura5.nextLine();
										Cliente.setEmail(novoEmailCliente);

										System.out.println("E-mail alterado com sucesso!");
										break;

									case 5:
										Scanner leitura6 = new Scanner(System.in);

										System.out.println("Digite o novo nome: ");
										String novoNomeCliente = leitura6.nextLine();
										Cliente.setNome(novoNomeCliente);

										System.out.println("Nome alterado com sucesso!");
										break;

									case 0:
										break;

									default:
										System.out.println("Opção inválida, digite novamente: ");
										break;
									}
								}
								opcaoAlterarCliente.close();
							} else {
								System.out.println("Cliente não encontrado!");
							}
						}
						break;
					case 3:
						System.out.println("Digite o id do cliente que deseja remover: ");
						int idRemoverCliente = leitura.nextInt();
						int i = 0;
						for (Cliente Cliente : listaClientes) {
							if (Cliente.getId() == idRemoverCliente) {
								listaClientes.remove(i);
							} else {
								System.out.println("Cliente não encontrado!");
							}
							i++;
						}
						break;

					case 4:
						for (Cliente Cliente : listaClientes) {
							System.out.println("\n" + Cliente);
						}
						break;

					case 0:
						break;

					default:
						System.out.println("Opção inválida, digite novamente: ");
						break;
					}
				}

			case 3:
				int opFuncionario = 999;
				Scanner opcaoFuncionario = new Scanner(System.in);

				while (opFuncionario != 0) {

					System.out.println("\n0 - Sair");
					System.out.println("1 - Cadastrar funcionário");
					System.out.println("2 - Alterar funcionário");
					System.out.println("3 - Deletar funcionário");
					System.out.println("4 - Listar funcionários");
					System.out.println("------------------------------------");
					System.out.println("Digite a opção: ");
					opFuncionario = opcaoFuncionario.nextInt();

					switch (opFuncionario) {
					case 1:
						Funcionario funcionario = new Funcionario();
						Scanner leituraCadastro = new Scanner(System.in);
						id++;

						// Cliente.setId(id);

						System.out.println("CPF: ");
						String cpf = leituraCadastro.nextLine();
						funcionario.setCPF(cpf);

						System.out.println("Data de nascimento: ");
						String dataNasc = leituraCadastro.nextLine();
						funcionario.setDataNasc(LocalDate.parse(dataNasc));

						System.out.println("Matrícula Esocial: ");
						int matriculaEsocial = leituraCadastro.nextInt();
						funcionario.setMatriculaEsocial(matriculaEsocial);

						System.out.println("Nome: ");
						String nome = leituraCadastro.nextLine();
						funcionario.setNome(nome);

						System.out.println("Data de admissão: ");
						String dataAdmissao = leituraCadastro.nextLine();
						funcionario.setDataAdmissao(LocalDate.parse(dataAdmissao));

						System.out.println("Salário: ");
						Double salario = leituraCadastro.nextDouble();
						funcionario.setSalario(salario);

						listaFuncionarios.add(funcionario);

						System.out.println("Funcionarios cadastrado com sucesso!");
						break;
					case 2:
						System.out.println("Digite o id do funcionário que deseja alterar: ");
						int idAlterarFuncionarios = leitura.nextInt();

						for (Funcionario Funcionario : listaFuncionarios) {
							if (Funcionario.getId() == idAlterarFuncionarios) {

								int opAlterarFuncionario = 999;
								Scanner opcaoAlterarFuncionario = new Scanner(System.in);

								while (opAlterarFuncionario != 0) {

									System.out.println("\n0 - Sair");
									System.out.println("\nO que você deseja alterar?");
									System.out.println("1 - Matrícula do ESocial");
									System.out.println("2 - CPF");
									System.out.println("3 - Data de nascimento");
									System.out.println("4 - Salário");
									System.out.println("5 - Nome");
									System.out.println("6 - Data de admissão");
									System.out.println("------------------------------------");
									System.out.println("Digite a opção: ");
									opAlterarFuncionario = opcaoAlterarFuncionario.nextInt();

									switch (opAlterarFuncionario) {
									case 1:
										Scanner leitura2 = new Scanner(System.in);

										System.out.println("Digite a nova matrícula do eSocial: ");
										int novaMatriculaEsocial = leitura2.nextInt();
										Funcionario.setMatriculaEsocial(novaMatriculaEsocial);

										System.out.println("Matrícula do eSocial alterada com sucesso!");
										break;

									case 2:
										Scanner leitura3 = new Scanner(System.in);

										System.out.println("Digite o novo CPF: ");
										String novoCPFFuncionario = leitura3.nextLine();
										Funcionario.setCPF(novoCPFFuncionario);

										System.out.println("CPF alterado com sucesso!");
										break;

									case 3:
										Scanner leitura4 = new Scanner(System.in);

										System.out.println("Digite a nova data de nascimento: ");
										String novaDataNasc = leitura4.nextLine();
										Funcionario.setDataNasc(LocalDate.parse(novaDataNasc));

										System.out.println("Data de nascimento alterada com sucesso!");
										break;

									case 4:
										Scanner leitura5 = new Scanner(System.in);

										System.out.println("Digite o novo salário: ");
										Double novoSalario = leitura5.nextDouble();
										Funcionario.setSalario(novoSalario);

										System.out.println("Salário alterado com sucesso!");
										break;

									case 5:
										Scanner leitura6 = new Scanner(System.in);

										System.out.println("Digite o novo nome: ");
										String novoNomeCliente = leitura6.nextLine();
										Funcionario.setNome(novoNomeCliente);

										System.out.println("Nome alterado com sucesso!");
										break;

									case 6:
										Scanner leitura7 = new Scanner(System.in);

										System.out.println("Digite a nova data de admissão: ");
										String novaDataAdmissao = leitura7.nextLine();
										Funcionario.setDataAdmissao(LocalDate.parse(novaDataAdmissao));

										System.out.println("Data de admissão alterada com sucesso!");
										break;

									case 0:
										break;

									default:
										System.out.println("Opção inválida, digite novamente: ");
										break;
									}
								}
								opcaoAlterarFuncionario.close();
							} else {
								System.out.println("Funcionário não encontrado!");
							}
						}
						break;
					case 3:
						System.out.println("Digite o id do funcionário que deseja remover: ");
						int idRemoverFuncionario = leitura.nextInt();
						int i = 0;
						for (Funcionario Funcionario : listaFuncionarios) {
							if (Funcionario.getId() == idRemoverFuncionario) {
								listaFuncionarios.remove(i);
							} else {
								System.out.println("Funcionário não encontrado!");
							}
							i++;
						}
						break;

					case 4:
						for (Funcionario Funcionario : listaFuncionarios) {
							System.out.println("\n" + Funcionario);
						}
						break;

					case 0:
						break;

					default:
						System.out.println("Opção inválida, digite novamente: ");
						break;
					}
				}
				break;
			case 0:
				System.out.println("Finalizando o sistema.");
				break;

			default:
				System.out.println("Opção inválida, digite novamente: ");
				break;

			}
		}
		opcao.close();
		cadastro.close();
		leitura.close();
	}
}