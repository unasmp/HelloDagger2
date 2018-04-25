package org.una.hellodagger2.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.una.hellodagger2.R
import org.una.hellodagger2.di.DaggerMainViewModelComponent
import org.una.hellodagger2.di.MainModule
import org.una.hellodagger2.viewmodel.MainViewModel

class MainActivity(private val vm: MainViewModel = MainViewModel()) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainViewModelComponent.builder()
                .mainModule(MainModule())
                .build()
                .inject(vm)

        mainText.text = vm.name()
    }
}

