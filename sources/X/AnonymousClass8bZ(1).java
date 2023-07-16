package X;

import android.os.Handler;
import android.view.Choreographer;
import java.util.List;

/* renamed from: X.8bZ  reason: invalid class name */
public final class AnonymousClass8bZ extends C27219EgD {
    public static final ThreadLocal A0A = new C1374988u();
    public static final C04530Oa A0B = AnonymousClass0OY.A02(AnonymousClass8Fk.A00);
    public List A00 = AnonymousClass0wJ.A0v();
    public List A01 = AnonymousClass0wJ.A0v();
    public boolean A02;
    public boolean A03;
    public final Handler A04;
    public final Choreographer A05;
    public final C148808sD A06;
    public final AnonymousClass83R A07 = new AnonymousClass83R(this);
    public final Object A08 = C86144wL.A0d();
    public final AnonymousClass8AL A09 = new AnonymousClass8AL();

    public final void A05(Runnable runnable, C27952Ew2 ew2) {
        C04220Ms.A0B(runnable, 1);
        synchronized (this.A08) {
            this.A09.A0X(runnable);
            if (!this.A03) {
                this.A03 = true;
                Handler handler = this.A04;
                AnonymousClass83R r1 = this.A07;
                handler.post(r1);
                if (!this.A02) {
                    this.A02 = true;
                    this.A05.postFrameCallback(r1);
                }
            }
        }
    }

    public static final void A02(AnonymousClass8bZ r3) {
        AnonymousClass8AL r1;
        Object obj;
        Runnable runnable;
        boolean z;
        while (true) {
            Object obj2 = r3.A08;
            synchronized (obj2) {
                r1 = r3.A09;
                if (r1.isEmpty()) {
                    obj = null;
                } else {
                    obj = r1.A0U();
                }
                runnable = (Runnable) obj;
            }
            if (runnable != null) {
                runnable.run();
            } else {
                synchronized (obj2) {
                    z = false;
                    if (r1.isEmpty()) {
                        r3.A03 = false;
                    } else {
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
            }
        }
    }

    public AnonymousClass8bZ(Handler handler, Choreographer choreographer) {
        this.A05 = choreographer;
        this.A04 = handler;
        this.A06 = new AnonymousClass7WD(choreographer);
    }
}
