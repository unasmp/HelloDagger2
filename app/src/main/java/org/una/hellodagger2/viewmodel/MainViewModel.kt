package org.una.hellodagger2.viewmodel

import org.una.hellodagger2.de.Pet
import javax.inject.Inject

class MainViewModel {

    @Inject
    lateinit var pet: Pet

    fun name(): String {
        return pet.getName()
    }
}