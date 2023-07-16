package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bloks.foa.screenqueries.screencontainer.ScreenContainerDelegate;

/* renamed from: X.3yF  reason: invalid class name and case insensitive filesystem */
public final class C66773yF implements C84864tz, C84884uA, C81874oX {
    public final C14340pE A00 = new C14340pE(this);
    public final LLH A01;
    public final Context A02;
    public final ScreenContainerDelegate A03;
    public final C66833yP A04;
    public final /* synthetic */ C125257cn A05 = C125257cn.A00;

    public C66773yF(Context context, C66833yP r4, C83454rP r5) {
        C04220Ms.A0B(r4, 2);
        this.A02 = context;
        this.A04 = r4;
        this.A01 = new LLH(context);
        this.A03 = C32322Bg.A00(context, r4, this, r5, AnonymousClass006.A00);
        this.A00.A0A(AnonymousClass061.CREATED);
    }

    public final C41822MeD BaU(C112976qV r8, M5L m5l, C127397h3 r10, C127397h3 r11, int i, int i2) {
        return this.A05.BaU(r8, m5l, r10, r11, i, i2);
    }

    public final void CZg() {
    }

    public final void AHt() {
        this.A03.A04.A04();
    }

    public final String ATg() {
        return this.A04.A07;
    }

    public final View AZg(Context context) {
        ScreenContainerDelegate screenContainerDelegate = this.A03;
        Context context2 = screenContainerDelegate.A02;
        C121247Ez r3 = screenContainerDelegate.A04;
        LLF llf = new LLF(context2);
        llf.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r3.A06(llf);
        return llf;
    }

    public final LLH Ame() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ void BrU(C81864oW r3) {
        C66873yT r32 = (C66873yT) r3;
        C04220Ms.A0B(r32, 0);
        AnonymousClass7Di r1 = (AnonymousClass7Di) r32.A00;
        if (r1 != null) {
            this.A01.setRenderTree(r1);
        }
    }

    public final void CnI(AnonymousClass3B8 r2) {
        ScreenContainerDelegate screenContainerDelegate = this.A03;
        if (screenContainerDelegate != null) {
            screenContainerDelegate.A00 = r2;
            if (r2 != null) {
                screenContainerDelegate.A00();
            }
        }
    }

    public final void destroy() {
        this.A00.A0A(AnonymousClass061.DESTROYED);
    }

    public final Context getContext() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass062 getLifecycle() {
        return this.A00;
    }
}
