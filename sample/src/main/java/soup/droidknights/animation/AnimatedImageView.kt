package soup.droidknights.animation

import android.content.Context
import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.widget.AppCompatImageView

class AnimatedImageView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : AppCompatImageView(context, attrs) {

    private var anim: AnimationDrawable? = null
    private var isAttached: Boolean = false

    // Tracks the last image that was set, so that we don't refresh the image if it is exactly
    // the same as the previous one. If this is a resid, we track that. If it's a drawable, we
    // track the hashcode of the drawable.
    private var drawableId: Int = 0

    private fun updateAnim() {
        val drawable = drawable
        if (isAttached) {
            anim?.stop()
        }
        if (drawable is AnimationDrawable) {
            anim = drawable
            if (isShown) {
                drawable.start()
            }
        } else {
            anim = null
        }
    }

    override fun setImageDrawable(drawable: Drawable?) {
        if (drawable != null) {
            if (drawableId == drawable.hashCode()) return
            drawableId = drawable.hashCode()
        } else {
            drawableId = 0
        }
        super.setImageDrawable(drawable)
        updateAnim()
    }

    override fun setImageResource(resid: Int) {
        if (drawableId == resid) return
        drawableId = resid
        super.setImageResource(resid)
        updateAnim()
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        isAttached = true
        updateAnim()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        anim?.stop()
        isAttached = false
    }

    override fun onVisibilityChanged(changedView: View, vis: Int) {
        super.onVisibilityChanged(changedView, vis)
        if (isShown) {
            anim?.start()
        } else {
            anim?.stop()
        }
    }
}
