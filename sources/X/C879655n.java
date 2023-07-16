package X;

import android.os.Build;
import android.view.View;
import java.util.List;

/* renamed from: X.55n  reason: invalid class name and case insensitive filesystem */
public final class C879655n extends AnonymousClass03I implements Runnable, View.OnAttachStateChangeListener, C004402a {
    public AnonymousClass03Y A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass7IK A03;

    public final AnonymousClass03H A01(AnonymousClass03H r2, AnonymousClass03O r3) {
        this.A01 = false;
        return r2;
    }

    public final void A03(AnonymousClass03O r8) {
        this.A01 = false;
        this.A02 = false;
        AnonymousClass03Y r6 = this.A00;
        if (!(r8.A00.A07() == 0 || r6 == null)) {
            AnonymousClass7IK r1 = this.A03;
            C147368pE.A01(r1.A0C, r6);
            C147368pE.A01(r1.A0D, r6);
            AnonymousClass7IK.A02(r1, r6);
        }
        this.A00 = null;
    }

    public final void A04(AnonymousClass03O r2) {
        this.A01 = true;
        this.A02 = true;
    }

    public final void onViewAttachedToWindow(View view) {
        C04220Ms.A0B(view, 0);
        view.requestApplyInsets();
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public C879655n(AnonymousClass7IK r2) {
        super(r2.A0J ^ true ? 1 : 0);
        this.A03 = r2;
    }

    public final AnonymousClass03Y A02(AnonymousClass03Y r2, List list) {
        AnonymousClass7IK r0 = this.A03;
        AnonymousClass7IK.A02(r0, r2);
        if (!r0.A0J) {
            return r2;
        }
        AnonymousClass03Y r22 = AnonymousClass03Y.A01;
        C04220Ms.A08(r22);
        return r22;
    }

    public final void run() {
        if (this.A01) {
            this.A01 = false;
            this.A02 = false;
            AnonymousClass03Y r2 = this.A00;
            if (r2 != null) {
                AnonymousClass7IK r1 = this.A03;
                C147368pE.A01(r1.A0C, r2);
                AnonymousClass7IK.A02(r1, r2);
                this.A00 = null;
            }
        }
    }

    public final AnonymousClass03Y Bky(View view, AnonymousClass03Y r5) {
        AnonymousClass0wJ.A1N(view, r5);
        this.A00 = r5;
        AnonymousClass7IK r2 = this.A03;
        C147368pE.A01(r2.A0D, r5);
        if (this.A01) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.A02) {
            C147368pE.A01(r2.A0C, r5);
            AnonymousClass7IK.A02(r2, r5);
        }
        if (!r2.A0J) {
            return r5;
        }
        AnonymousClass03Y r52 = AnonymousClass03Y.A01;
        C04220Ms.A08(r52);
        return r52;
    }
}
