package org.una.hellodagger2

import org.junit.Assert.assertEquals
import org.junit.Test
import org.una.hellodagger2.de.Cat
import org.una.hellodagger2.di.DaggerMainViewModelComponent
import org.una.hellodagger2.di.MainModule
import org.una.hellodagger2.viewmodel.MainViewModel

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun nameTest() {

        val vm = MainViewModel()

        DaggerMainViewModelComponent.builder()
                .mainModule(MainModule())
                .build()
                .inject(vm)

        assertEquals(vm.name(), Cat.NAME)
    }
}
