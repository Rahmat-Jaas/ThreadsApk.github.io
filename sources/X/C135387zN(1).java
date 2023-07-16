package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.instagram.barcelona.R;

/* renamed from: X.7zN  reason: invalid class name and case insensitive filesystem */
public final class C135387zN implements Runnable {
    public final /* synthetic */ AnonymousClass51z A00;

    public C135387zN(AnonymousClass51z r1) {
        this.A00 = r1;
    }

    public final void run() {
        Drawable indeterminateDrawable = this.A00.getIndeterminateDrawable();
        C04220Ms.A0C(indeterminateDrawable, AnonymousClass000.A00(7));
        Drawable findDrawableByLayerId = ((LayerDrawable) indeterminateDrawable).findDrawableByLayerId(R.id.layer_item_icon);
        C04220Ms.A0C(findDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
        ((Animatable) findDrawableByLayerId).start();
    }
}
