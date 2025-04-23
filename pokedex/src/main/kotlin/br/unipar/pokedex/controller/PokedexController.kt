package br.unipar.pokedex.controller

import br.unipar.pokedex.model.Pokemon
import org.springframework.web.bind.annotation.RestController

@RestController
class PokedexController {
    fun listarPokemons(): List<Pokemon> {
        // PRECISA RETORNAR UMA LISTA DO REPOSITÓRIO
    }
}