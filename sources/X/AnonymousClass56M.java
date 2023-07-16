package X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;

/* renamed from: X.56M  reason: invalid class name */
public final class AnonymousClass56M extends AnonymousClass052 {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C34187I7h A02;

    public AnonymousClass56M(FrameLayout frameLayout, Fragment fragment, C34187I7h i7h) {
        this.A02 = i7h;
        this.A01 = fragment;
        this.A00 = frameLayout;
    }

    public final void A01(Bundle bundle, View view, Fragment fragment, C12560m7 r5) {
        if (fragment == this.A01) {
            r5.A0t(this);
            C34187I7h.A02(view, this.A00);
        }
    }
}
