package br.com.pontointeligente.service

import br.com.pontointeligente.documents.Empresa

interface EmpresaService {
    fun buscaPorCnpj(cnpj: String): Empresa?
    fun persistir(empresa: Empresa): Empresa
}