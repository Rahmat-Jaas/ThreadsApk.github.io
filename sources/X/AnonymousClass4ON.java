package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4ON  reason: invalid class name */
public final class AnonymousClass4ON implements Runnable {
    public final /* synthetic */ AnonymousClass1c8 A00;

    public AnonymousClass4ON(AnonymousClass1c8 r1) {
        this.A00 = r1;
    }

    public final void run() {
        ViewGroup viewGroup;
        AnonymousClass1c8 r2 = this.A00;
        C19577Ayd ayd = r2.A0E;
        if (ayd == null) {
            C84684tg r0 = r2.A06;
            if (r0 != null) {
                r0.Bex("component_missing");
            }
        } else if (ayd.A0A()) {
            ayd.A08().setVisibility(8);
        }
        C19577Ayd ayd2 = r2.A0D;
        if (ayd2 != null && ayd2.A0A()) {
            ayd2.A08().setVisibility(8);
        }
        View view = r2.A00;
        if (!(view == null || (viewGroup = (ViewGroup) r2.mView) == null)) {
            viewGroup.removeView(view);
        }
        C18240wQ.A0w(r2.A01);
    }
}
