package br.com.pontointeligente.service.impl

import br.com.pontointeligente.documents.Lancamento
import br.com.pontointeligente.repository.LancamentoRepository
import br.com.pontointeligente.service.LancamentoService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest

class LancamentoServiceImpl(val repository: LancamentoRepository) : LancamentoService {
    override fun buscaPorFuncionarioId(funcionarioId: String, pageRequest: PageRequest): Page<Lancamento> {
       return repository.findByFuncionarioId(funcionarioId, pageRequest)
    }

    override fun buscaPorId(id: String) = repository.findById(id).get()

    override fun persistir(lancamento: Lancamento) = repository.save(lancamento)

    override fun remover(id: String) = repository.deleteById(id)
}