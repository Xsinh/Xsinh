package com.implozia.cubeopengl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        glSurfaceView.setEGLContextClientVersion(3)
        glSurfaceView.setRenderer(RendererOpenGL(this))
    }
}
