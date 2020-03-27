package com.implozia.cubeopengl

import android.opengl.GLSurfaceView.Renderer
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10
import javax.microedition.khronos.opengles.GL10.GL_COLOR_BUFFER_BIT

class RendererOpenGL : Renderer {

    private var color = 0f
    private var colorVelocity = 1f/60f

    override fun onDrawFrame(gl: GL10){
        if (color > 1 || color < 0){
            colorVelocity = -colorVelocity
        }
        color += colorVelocity

        gl.glClearColor(color * 0.5f, color, color, 1f)
        gl.glClear(GL_COLOR_BUFFER_BIT)
    }

    override fun onSurfaceCreated(gl: GL10, config: EGLConfig) = Unit
    override fun onSurfaceChanged(gl: GL10, width: Int, height: Int) = Unit
}