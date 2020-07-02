package br.com.pontointeligente.service

import br.com.pontointeligente.documents.Lancamento
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest

interface LancamentoService {

    fun buscaPorFuncionarioId(funcionarioId: String, pageRequest: PageRequest) : Page<Lancamento>
    fun buscaPorId(id: String): Lancamento
    fun persistir(lancamento: Lancamento): Lancamento
    fun remover(id: String)

}