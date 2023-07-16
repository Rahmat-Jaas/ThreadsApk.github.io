package X;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.facebook.redex.IDxExecutorShape577S0100000_2_I2;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.7Z5  reason: invalid class name */
public final class AnonymousClass7Z5 implements AnonymousClass8dF {
    public Rect A00;
    public C1202679l A01 = C1202679l.A04;
    public AnonymousClass7HD A02 = new AnonymousClass7HD("", 4, C121767Ia.A01);
    public Runnable A03;
    public List A04 = AnonymousClass0wJ.A0v();
    public AnonymousClass0YY A05 = C77994hi.A00;
    public AnonymousClass0YY A06 = C78004hj.A00;
    public final View A07;
    public final AnonymousClass84X A08 = AnonymousClass84X.A01(new C969367g[16]);
    public final C141828dA A09;
    public final AnonymousClass8dB A0A;
    public final Executor A0B;
    public final C04530Oa A0C = AnonymousClass0OY.A01(AnonymousClass006.A0C, C86154wM.A13(this, 36));

    public AnonymousClass7Z5(View view, AnonymousClass8dB r7) {
        C123887Yy r3 = new C123887Yy(view);
        Choreographer instance = Choreographer.getInstance();
        C04220Ms.A06(instance);
        IDxExecutorShape577S0100000_2_I2 iDxExecutorShape577S0100000_2_I2 = new IDxExecutorShape577S0100000_2_I2(instance, 0);
        this.A07 = view;
        this.A09 = r3;
        this.A0A = r7;
        this.A0B = iDxExecutorShape577S0100000_2_I2;
    }

    public static final void A00(C969367g r1, AnonymousClass7Z5 r2) {
        r2.A08.A0C(r1);
        if (r2.A03 == null) {
            C135087yr r12 = new C135087yr(r2);
            r2.A0B.execute(r12);
            r2.A03 = r12;
        }
    }

    public static final void A01(AnonymousClass7Z5 r2) {
        C123887Yy r22 = (C123887Yy) r2.A09;
        ((InputMethodManager) r22.A02.getValue()).restartInput(r22.A00);
    }
}
