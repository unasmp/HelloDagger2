package org.una.hellodagger2.di

import dagger.Module
import dagger.Provides
import org.una.hellodagger2.de.Cat
import org.una.hellodagger2.de.Pet

@Module
class MainModule {

    @Provides
    fun providePet(): Pet {
        return Cat()
    }
}