package br.unipar.pokedex.model

import jakarta.persistence.Enumerated

@Enumerated
enum class Tipo {
    ÁGUA, FOGO, TERRA, PEDRA, ELÉTRICO, VENENO, PSIQUICO, SOMBRIO,
    INSETO, LUTADOR, VOADOR, METAL, NORMAL, PLANTA, GELO, DRAGÃO,
    FANTASMA, FADA

}