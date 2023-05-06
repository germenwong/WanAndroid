package com.hgm.wanandroid

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 *  这是一个应用程序类，用于传递上下文
 *  需要在注册清单中声明这个文件
 */
@HiltAndroidApp
class MyApp:Application()