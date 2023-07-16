package X;

import com.instagram.barcelona.R;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;

/* renamed from: X.7zp  reason: invalid class name and case insensitive filesystem */
public final class C135647zp implements Runnable {
    public final /* synthetic */ C113026qa A00;

    public C135647zp(C113026qa r1) {
        this.A00 = r1;
    }

    public final void run() {
        C113026qa r7 = this.A00;
        C110286lQ r6 = r7.A04;
        WeakReference weakReference = r6.A04;
        Object obj = weakReference.get();
        if (obj != null) {
            C109326jp r3 = r6.A02;
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A02(r6.A03, 0);
            C61043Rr.A00(r6.A01, C86154wM.A0R(A002, obj, 1), r3);
        }
        if (!r7.A06) {
            AnonymousClass3HX r2 = (AnonymousClass3HX) weakReference.get();
            if (r2 != null) {
                ((AbstractMap) r2.A00(R.id.bk_context_key_timers)).remove(r6.A03);
            }
        } else if (!r7.A00 && !r7.A01) {
            r7.A03.postDelayed(this, r7.A02);
        }
    }
}
