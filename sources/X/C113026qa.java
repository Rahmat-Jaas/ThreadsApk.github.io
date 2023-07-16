package X;

import android.os.Handler;
import com.instagram.barcelona.R;
import java.util.AbstractMap;

/* renamed from: X.6qa  reason: invalid class name and case insensitive filesystem */
public final class C113026qa {
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final Handler A03 = AnonymousClass0wJ.A0F();
    public final C110286lQ A04;
    public final Runnable A05;
    public final boolean A06;

    public final void A00() {
        this.A00 = true;
        this.A03.removeCallbacks(this.A05);
        C110286lQ r1 = this.A04;
        AnonymousClass3HX r2 = (AnonymousClass3HX) r1.A04.get();
        if (r2 != null) {
            ((AbstractMap) r2.A00(R.id.bk_context_key_timers)).remove(r1.A03);
        }
    }

    public C113026qa(C110286lQ r2, long j, boolean z) {
        this.A02 = j;
        this.A06 = z;
        this.A00 = false;
        this.A01 = true;
        this.A04 = r2;
        this.A05 = new C135647zp(this);
    }
}
