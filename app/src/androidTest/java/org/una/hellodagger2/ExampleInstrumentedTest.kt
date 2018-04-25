package org.una.hellodagger2

import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.una.hellodagger2.de.Dog
import org.una.hellodagger2.di.DaggerMainViewModelComponent
import org.una.hellodagger2.di.MainModule
import org.una.hellodagger2.viewmodel.MainViewModel

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun nameTest() {

        val vm = MainViewModel()

        DaggerMainViewModelComponent.builder()
                .mainModule(MainModule())
                .build()
                .inject(vm)

        assertEquals(vm.name(), Dog.NAME)
    }
}