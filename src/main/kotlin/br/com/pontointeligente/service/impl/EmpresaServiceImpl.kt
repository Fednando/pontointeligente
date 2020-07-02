package br.com.pontointeligente.service.impl

import br.com.pontointeligente.documents.Empresa
import br.com.pontointeligente.repository.EmpresaRepository
import br.com.pontointeligente.service.EmpresaService

class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {
    override fun buscaPorCnpj(cnpj: String) = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa) = empresaRepository.save(empresa)
}