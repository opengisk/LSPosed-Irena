package org.lsposed.manager.ui.widget

import android.content.Context
import android.util.AttributeSet
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.google.android.material.color.MaterialColors

class MaterialSwipeRefreshLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : SwipeRefreshLayout(context, attrs) {

    init {
        setColorSchemeColors(MaterialColors.getColor(this, com.google.android.material.R.attr.colorPrimary))
        setProgressBackgroundColorSchemeColor(MaterialColors.getColor(this, com.google.android.material.R.attr.colorSurfaceContainer))
    }
}