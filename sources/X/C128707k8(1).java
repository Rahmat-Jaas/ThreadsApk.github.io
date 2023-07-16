package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;

/* renamed from: X.7k8  reason: invalid class name and case insensitive filesystem */
public final class C128707k8 implements C143608h1 {
    public LayoutInflater A00;
    public final AnonymousClass6S2 A01 = AnonymousClass7Kz.A0F();
    public final Context A02;

    public C128707k8(Context context, int i) {
        C04220Ms.A0B(context, 1);
        AnonymousClass0MJ A17 = C86144wL.A17();
        A17.A00 = context;
        A17.A00 = new ContextThemeWrapper(context, i);
        AnonymousClass4x6 r0 = new AnonymousClass4x6(this, A17);
        this.A02 = r0;
        LayoutInflater from = LayoutInflater.from(r0);
        C04220Ms.A06(from);
        this.A00 = from;
    }

    public final Context getContext() {
        return this.A02;
    }
}
