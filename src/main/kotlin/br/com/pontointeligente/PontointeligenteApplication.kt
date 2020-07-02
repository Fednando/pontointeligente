package br.com.pontointeligente

import br.com.pontointeligente.documents.Empresa
import br.com.pontointeligente.documents.Funcionario
import br.com.pontointeligente.enums.PerfilEnum
import br.com.pontointeligente.repository.EmpresaRepository
import br.com.pontointeligente.repository.FuncionarioRepository
import br.com.pontointeligente.utils.SenhaUtils
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class PontointeligenteApplication(val empresaRepository: EmpresaRepository,
								  val funcionarioRepository: FuncionarioRepository) : CommandLineRunner{



	override fun run(vararg args: String?) {
		empresaRepository.deleteAll()
		funcionarioRepository.deleteAll()

		val empresa = Empresa("Empresa", cnpj = "10443887000146")
		val company = empresaRepository.save(empresa)

		val admin = Funcionario("Admin", "admin@empresa.com",
				SenhaUtils().gerarBCrypt("123456"), cpf = "25708317000",
				perfil = PerfilEnum.ROLE_ADMIN, empresaId = company.id!!)
		val adminDb = funcionarioRepository.save(admin)

		val funcionario = Funcionario("Funcionario",
		"funcionario@empre.com", SenhaUtils().gerarBCrypt("123456"),
		"44325441557", PerfilEnum.ROLE_USUARIO, empresaId = company.id)
		val userDb = funcionarioRepository.save(funcionario)

		System.out.println("Empresa ID: " + company.id)
		System.out.println("Admin ID: " + adminDb.id)
		System.out.println("Funcionario ID: " + userDb.id)


	}
}

fun main(args: Array<String>) {
	SpringApplication.run(PontointeligenteApplication::class.java, *args)
}
