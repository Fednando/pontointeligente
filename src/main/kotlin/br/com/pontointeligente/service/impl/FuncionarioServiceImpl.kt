package br.com.pontointeligente.service.impl

import br.com.pontointeligente.documents.Funcionario
import br.com.pontointeligente.repository.FuncionarioRepository
import br.com.pontointeligente.service.FuncionarioService

class FuncionarioServiceImpl(val repository: FuncionarioRepository) : FuncionarioService {
    override fun persistir(funcionario: Funcionario) = repository.save(funcionario)
    override fun buscaPorCpf(cpf: String) = repository.findByCpf(cpf)
    override fun buscaPorEmail(email: String) = repository.findByEmail(email)
    override fun buscarPorId(id: String) = repository.findById(id).get()
}