package kr.kb.quickstarter.view.activity

import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import kr.kb.quickstarter.R
import kr.kb.quickstarter.databinding.ActivityMainBinding
import kr.kb.quickstarter.helper.extention.startActivityWithFinish

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun init() {
        TODO("Not yet implemented")
    }
}