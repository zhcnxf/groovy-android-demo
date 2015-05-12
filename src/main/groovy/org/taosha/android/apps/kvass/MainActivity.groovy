package org.taosha.android.apps.kvass

import android.app.Activity
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.app.WallpaperManager

class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        window.navigationBarColor = 0x00000000
        window.statusBarColor = 0x00000000
        window.backgroundDrawable = new ColorDrawable(0xff007c28i)

        title = 'Groovy Android Demo'
        contentView = R.layout.activity_main
    }

}
