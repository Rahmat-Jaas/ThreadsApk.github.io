package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.KtLambdaShape47S0200000_I2_8;

/* renamed from: X.8be  reason: invalid class name and case insensitive filesystem */
public final class C141458be extends C141468bf implements C145648kq {
    public final Handler A00;
    public final C141458be A01;
    public final String A02;
    public final boolean A03;
    public volatile C141458be _immediate;

    public C141458be(Handler handler, String str, boolean z) {
        C141458be r0 = null;
        this.A00 = handler;
        this.A02 = str;
        this.A03 = z;
        this._immediate = z ? this : r0;
        C141458be r1 = this._immediate;
        if (r1 == null) {
            r1 = new C141458be(handler, str, true);
            this._immediate = r1;
        }
        this.A01 = r1;
    }

    public static final void A02(Runnable runnable, C27952Ew2 ew2, C141458be r4) {
        StringBuilder A0s = C18190wL.A0s("The task was rejected, the handler underlying the dispatcher '");
        A0s.append(r4);
        AnonymousClass7C2.A00(new CancellationException(C18180wK.A0i("' was closed", A0s)), ew2);
        C25295DjG.A01.A05(runnable, ew2);
    }

    public final boolean A04(C27952Ew2 ew2) {
        if (!this.A03 || !C04220Ms.A0I(Looper.myLooper(), this.A00.getLooper())) {
            return true;
        }
        return false;
    }

    public final void A05(Runnable runnable, C27952Ew2 ew2) {
        if (!this.A00.post(runnable)) {
            A02(runnable, ew2, this);
        }
    }

    public final void Cg9(AnonymousClass8s9 r6, long j) {
        AnonymousClass824 r4 = new AnonymousClass824(r6, this);
        Handler handler = this.A00;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(r4, j)) {
            r6.BQt(new KtLambdaShape47S0200000_I2_8(10, (Object) r4, (Object) this));
        } else {
            A02(r4, r6.getContext(), this);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C141458be) || ((C141458be) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.A00);
    }

    public final String toString() {
        String str;
        C141478bg r0;
        C141478bg r02 = AnonymousClass6ZB.A00;
        if (this == r02) {
            str = AnonymousClass000.A00(257);
        } else {
            str = null;
            try {
                r0 = r02.A06();
            } catch (UnsupportedOperationException unused) {
                r0 = null;
            }
            if (this == r0) {
                str = "Dispatchers.Main.immediate";
            }
        }
        if (str != null) {
            return str;
        }
        String str2 = this.A02;
        if (str2 == null) {
            str2 = this.A00.toString();
        }
        if (this.A03) {
            return AnonymousClass00U.A0L(str2, ".immediate");
        }
        return str2;
    }
}
