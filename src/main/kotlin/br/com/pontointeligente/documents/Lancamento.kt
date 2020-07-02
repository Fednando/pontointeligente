package br.com.pontointeligente.documents

import br.com.pontointeligente.enums.TipoEnum
import org.springframework.data.annotation.Id
import java.util.*

data class Lancamento (
        val data: Date,
        val tipo: TipoEnum,
        val funcionarioId: String,
        val descricao: String? = "",
        val localizacao: String? = "",
        @Id val id: String? = null
)