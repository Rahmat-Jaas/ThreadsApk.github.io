package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.1qR  reason: invalid class name and case insensitive filesystem */
public final class C26341qR extends IgdsMediaButton {
    public C26341qR(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        if (getBackground() != null && !isEnabled()) {
            Drawable background = getBackground();
            int i = 255;
            if (!z) {
                i = 77;
            }
            background.setAlpha(i);
        }
    }
}
