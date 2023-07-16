package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import com.facebook.analytics2.logger.HandlerThreadFactory;
import java.io.File;

/* renamed from: X.0DO  reason: invalid class name */
public final class AnonymousClass0DO implements C02540Bv {
    public long A00;
    public File A01;
    public File A02;
    public File A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07 = false;
    public final int A08;
    public final Context A09;
    public final AnonymousClass0AH A0A;
    public final C02570By A0B;
    public final AnonymousClass0CF A0C;
    public final AnonymousClass0CF A0D;
    public final Class A0E;
    public final boolean A0F;
    public final long A0G;

    private synchronized void A00(long j, long j2) {
        synchronized (this) {
            if (!this.A06) {
                Context context = this.A09;
                HandlerThreadFactory A042 = C02200Af.A00(context).A04(this.A0E.getName());
                int i = 19;
                if (this.A0B.A03 == AnonymousClass006.A01) {
                    i = 18;
                }
                AnonymousClass0CI.A00(new AnonymousClass0C9(this), context, new Handler(A042.AFM("JobRanReceiver", i).getLooper()));
                this.A06 = true;
            }
            if (this.A04 == null) {
                if (!this.A05) {
                    this.A05 = true;
                    this.A00 = AnonymousClass0CD.A00(this.A09).A01(this.A08);
                }
                long j3 = j;
                if (this.A00 > j) {
                    long j4 = j2;
                    if (j == 0 && j2 == 0) {
                        A02();
                    } else {
                        AnonymousClass0CD.A00(this.A09).A02(this.A0B, (String) null, this.A08, j3, j4);
                        this.A00 = j;
                    }
                }
            }
        }
    }

    public static synchronized void A01(AnonymousClass0DO r2) {
        synchronized (r2) {
            r2.A00 = Long.MAX_VALUE;
        }
    }

    public final void Bhx() {
        AnonymousClass0CF r0;
        AnonymousClass0CF r02;
        synchronized (this) {
            this.A02 = this.A01;
        }
        AnonymousClass0AH r1 = this.A0A;
        if (r1.AOB()) {
            r0 = this.A0C;
        } else {
            r0 = this.A0D;
        }
        long j = r0.A02;
        if (r1.AOB()) {
            r02 = this.A0C;
        } else {
            r02 = this.A0D;
        }
        A00(j, r02.A00);
    }

    public final void Bi1() {
        AnonymousClass0CF r0;
        AnonymousClass0CF r02;
        synchronized (this) {
            this.A03 = this.A01;
        }
        AnonymousClass0AH r1 = this.A0A;
        if (r1.AOB()) {
            r0 = this.A0C;
        } else {
            r0 = this.A0D;
        }
        long j = r0.A03;
        if (r1.AOB()) {
            r02 = this.A0C;
        } else {
            r02 = this.A0D;
        }
        A00(j, r02.A01);
    }

    public final synchronized void D7i() {
        A02();
    }

    public final synchronized void A02() {
        synchronized (this) {
            Context context = this.A09;
            AnonymousClass0CD A002 = AnonymousClass0CD.A00(context);
            int i = this.A08;
            ((AnonymousClass0Kv) A002).A01.cancel(i);
            A01(this);
            try {
                this.A04 = "com.facebook.analytics2.logger.UPLOAD_NOW";
                if (!AnonymousClass0CQ.A00(context).A01()) {
                    AnonymousClass0CE.A01().A02(context, (Bundle) null, this.A0B, new AnonymousClass0CJ(0, 0, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", i);
                } else {
                    try {
                        AnonymousClass0CE A012 = AnonymousClass0CE.A01();
                        C02570By r8 = this.A0B;
                        A012.A03(context, r8, "com.facebook.analytics2.logger.UPLOAD_NOW", i, this.A0G, this.A0F);
                        this.A07 = true;
                        AnonymousClass0CP.A00(context).A05(new AnonymousClass0CN(context, (Bundle) null, (Messenger) null, r8, new AnonymousClass0CJ(0, 0, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", i), "com.facebook.analytics2.logger.UPLOAD_NOW");
                    } catch (IllegalArgumentException e) {
                        th = new RuntimeException(e);
                        throw th;
                    }
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public final void Bi2(long j) {
        throw new UnsupportedOperationException("only expected to be called for micro batch!");
    }

    public final void Bi3(long[] jArr, int i, int i2) {
        throw new UnsupportedOperationException("only expected to be called for micro batch!");
    }

    public final synchronized void BiM(String str) {
        synchronized (this) {
            try {
                this.A02 = null;
                this.A03 = null;
                Context context = this.A09;
                AnonymousClass0CD A002 = AnonymousClass0CD.A00(context);
                int i = this.A08;
                ((AnonymousClass0Kv) A002).A01.cancel(i);
                A01(this);
                this.A04 = "com.facebook.analytics2.logger.USER_LOGOUT";
                String str2 = str;
                if (!AnonymousClass0CQ.A00(context).A01()) {
                    AnonymousClass0CE A012 = AnonymousClass0CE.A01();
                    C02570By r14 = this.A0B;
                    Bundle bundle = new Bundle();
                    bundle.putString("user_id", str2);
                    A012.A02(context, bundle, r14, (AnonymousClass0CJ) null, "com.facebook.analytics2.logger.USER_LOGOUT", i);
                } else {
                    try {
                        AnonymousClass0CP A003 = AnonymousClass0CP.A00(context);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("user_id", str2);
                        A003.A05(new AnonymousClass0CN(context, bundle2, (Messenger) null, this.A0B, (AnonymousClass0CJ) null, "com.facebook.analytics2.logger.USER_LOGOUT", i), "com.facebook.analytics2.logger.USER_LOGOUT");
                    } catch (IllegalArgumentException e) {
                        th = new RuntimeException(e);
                        throw th;
                    }
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void CmS(Object obj) {
        File file = (File) obj;
        synchronized (this) {
            this.A01 = file;
        }
    }

    public AnonymousClass0DO(Context context, AnonymousClass0AH r3, C02570By r4, AnonymousClass0CF r5, AnonymousClass0CF r6, Class cls, int i, long j, boolean z) {
        this.A09 = context;
        this.A08 = i;
        this.A0B = r4;
        this.A0A = r3;
        this.A0E = cls;
        this.A0D = r5;
        this.A0C = r6;
        A01(this);
        this.A0F = z;
        this.A0G = j;
    }
}
