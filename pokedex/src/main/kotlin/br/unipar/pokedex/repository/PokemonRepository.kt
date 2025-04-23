package br.unipar.pokedex.repository

import br.unipar.pokedex.model.Pokemon
import com.google.cloud.firestore.Firestore
import com.google.firebase.cloud.FirestoreClient
import org.springframework.stereotype.Repository

@Repository
class PokemonRepository {
    private val firestore: Firestore = FirestoreClient.getFirestore()
    private val collection = firestore.collection("pokedex")

    fun save(pokemon: Pokemon) : Pokemon {
        val document = collection.document(pokemon.numeroPokedex!!)
        val registeredPokemon = pokemon.copy(numeroPokedex = document.id)
        document.set(registeredPokemon)

        return registeredPokemon
    }
}