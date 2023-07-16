package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.bloks.hosting.intf.IgBloksScreenRequestCallback;

/* renamed from: X.4OK  reason: invalid class name */
public final class AnonymousClass4OK implements Runnable {
    public final /* synthetic */ AnonymousClass1c8 A00;

    public AnonymousClass4OK(AnonymousClass1c8 r1) {
        this.A00 = r1;
    }

    public final void run() {
        ViewGroup viewGroup;
        String str;
        AnonymousClass1c8 r3 = this.A00;
        C63113bW r0 = r3.A04;
        r0.getClass();
        Throwable A05 = r0.A05();
        if (A05 == null) {
            A05 = new Throwable("Bloks Request Error");
        }
        AnonymousClass3XX r2 = new AnonymousClass3XX(A05);
        if (!(r3.A09 == null || (str = r3.A0G) == null)) {
            AnonymousClass2JX.A00(r2, "AsyncScreen", str);
        }
        View view = r3.A00;
        if (!(view == null || (viewGroup = (ViewGroup) r3.mView) == null)) {
            viewGroup.removeView(view);
        }
        C19577Ayd ayd = r3.A0E;
        if (ayd == null) {
            C84684tg r02 = r3.A06;
            if (r02 != null) {
                r02.Bex("component_missing");
            }
        } else {
            ayd.A08().setVisibility(0);
        }
        IgBloksScreenRequestCallback igBloksScreenRequestCallback = r3.A0B;
        if (igBloksScreenRequestCallback != null) {
            igBloksScreenRequestCallback.A02(r2);
        }
    }
}
