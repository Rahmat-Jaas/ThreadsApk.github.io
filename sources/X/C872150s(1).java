package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.50s  reason: invalid class name and case insensitive filesystem */
public final class C872150s extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C127397h3 A01;

    public C872150s(C127397h3 r1, float f) {
        this.A00 = f;
        this.A01 = r1;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.A00);
        Drawable background = view.getBackground();
        if (background != null) {
            background.getOutline(outline);
            outline.setAlpha(this.A01.A0G(65, 1.0f));
        }
    }
}
