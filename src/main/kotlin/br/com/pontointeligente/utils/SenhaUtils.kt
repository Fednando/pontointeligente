package br.com.pontointeligente.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class SenhaUtils {

    fun gerarBCrypt(senha: String): String = BCryptPasswordEncoder().encode(senha)

}