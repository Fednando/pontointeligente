package br.com.pontointeligente.service

import br.com.pontointeligente.documents.Funcionario

interface FuncionarioService {
    fun persistir(funcionario: Funcionario): Funcionario
    fun buscaPorCpf(cpf: String): Funcionario?
    fun buscaPorEmail(email: String): Funcionario?
    fun buscarPorId(id: String): Funcionario?
}