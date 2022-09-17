package kr.kb.quickstarter.view.activity

import android.os.Bundle
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<T: ViewDataBinding>(
    @LayoutRes private val layoutRes: Int
): AppCompatActivity(){

    protected lateinit var binding: T
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutRes)
        init()
    }
    abstract fun init()

    protected fun showToast(message: String, duration: Int = Toast.LENGTH_SHORT){
        Toast.makeText(this, message, duration)
    }
}