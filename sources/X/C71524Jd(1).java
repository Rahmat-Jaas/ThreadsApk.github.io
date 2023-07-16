package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.4Jd  reason: invalid class name and case insensitive filesystem */
public final class C71524Jd implements C83744rv {
    public final /* synthetic */ C62703aY A00;

    public C71524Jd(C62703aY r1) {
        this.A00 = r1;
    }

    public final void BrW() {
        Fragment fragment;
        Context context;
        C62703aY r1 = this.A00;
        if (r1.A00 && (fragment = (Fragment) r1.A08.get()) != null && (context = fragment.getContext()) != null) {
            AnonymousClass3ZC.A01(context, AnonymousClass006.A0j);
        }
    }

    public final void onDismiss() {
        Fragment fragment;
        Context context;
        C62703aY r1 = this.A00;
        if (r1.A00 && (fragment = (Fragment) r1.A08.get()) != null && (context = fragment.getContext()) != null) {
            AnonymousClass3ZC.A01(context, AnonymousClass006.A00);
        }
    }
}
