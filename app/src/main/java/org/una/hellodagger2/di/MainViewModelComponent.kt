package org.una.hellodagger2.di

import dagger.Component
import org.una.hellodagger2.viewmodel.MainViewModel

@Component(modules = [MainModule::class])
interface MainViewModelComponent {
    fun inject(viewModel: MainViewModel)
}
