package X;

import android.app.Dialog;
import android.widget.RatingBar;

/* renamed from: X.3vq  reason: invalid class name and case insensitive filesystem */
public final class C65783vq implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ RatingBar.OnRatingBarChangeListener A00;
    public final /* synthetic */ AnonymousClass37K A01;

    public C65783vq(RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, AnonymousClass37K r2) {
        this.A01 = r2;
        this.A00 = onRatingBarChangeListener;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        this.A00.onRatingChanged(ratingBar, f, z);
        Dialog dialog = this.A01.A00;
        dialog.getClass();
        dialog.dismiss();
    }
}
