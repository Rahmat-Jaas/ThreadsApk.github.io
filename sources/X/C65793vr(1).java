package X;

import android.widget.RatingBar;
import java.util.HashMap;

/* renamed from: X.3vr  reason: invalid class name and case insensitive filesystem */
public final class C65793vr implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ C84844tx A00;
    public final /* synthetic */ C28291u0 A01;

    public C65793vr(C84844tx r1, C28291u0 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        Integer num;
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("rating", String.valueOf(f));
        if (f > 4.0f) {
            num = AnonymousClass006.A01;
        } else {
            num = AnonymousClass006.A0C;
        }
        this.A00.CE9(this.A01, num, A0y);
    }
}
