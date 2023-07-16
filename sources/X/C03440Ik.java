package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Messenger;
import com.facebook.analytics2.logger.HandlerThreadFactory;
import com.instagram.barcelona.R;
import java.io.File;

/* renamed from: X.0Ik  reason: invalid class name and case insensitive filesystem */
public final class C03440Ik implements C02540Bv {
    public long A00;
    public HandlerThread A01;
    public AnonymousClass0BV A02;
    public C02410Bd A03;
    public AnonymousClass0CD A04;
    public File A05;
    public File A06;
    public File A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B = false;
    public boolean A0C;
    public final Context A0D;
    public final C02570By A0E;
    public final Class A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final long A0I;
    public final AnonymousClass0BZ A0J;
    public final AnonymousClass0Ba A0K;

    private synchronized void A00(AnonymousClass0BV r15) {
        long j;
        synchronized (this) {
            if (!this.A0A) {
                Context context = this.A0D;
                HandlerThreadFactory A042 = C02200Af.A00(context).A04(this.A0F.getName());
                int i = 19;
                if (this.A0E.A03 == AnonymousClass006.A01) {
                    i = 18;
                }
                this.A03 = new C02410Bd(this);
                HandlerThread AFM = A042.AFM("JobRanReceiver", i);
                this.A01 = AFM;
                if (this.A0G) {
                    this.A03.A00 = new Handler(AFM.getLooper());
                    AnonymousClass06O.A00(context).A01(this.A03, new IntentFilter("com.facebook.analytics2.action.UPLOAD_JOB_RAN"));
                    AnonymousClass0CI.A00 = true;
                } else {
                    AnonymousClass0CI.A00(this.A03, context, new Handler(AFM.getLooper()));
                }
                this.A0A = true;
            }
            if (this.A08 == null) {
                AnonymousClass0CD r6 = this.A04;
                if (r6 != null) {
                    j = r6.A01(R.id.jobscheduler_analytics2_micro_batch);
                } else {
                    if (!this.A09) {
                        this.A09 = true;
                        this.A00 = AnonymousClass0CD.A00(this.A0D).A01(R.id.jobscheduler_analytics2_micro_batch);
                    }
                    j = this.A00;
                }
                long j2 = r15.A01;
                if (j > j2) {
                    long j3 = r15.A00;
                    if (j2 == 0 && j3 == 0) {
                        A04();
                    } else {
                        if (r6 != null) {
                            r6.A02(this.A0E, (String) null, R.id.jobscheduler_analytics2_micro_batch, j2, j3);
                        } else {
                            AnonymousClass0CD.A00(this.A0D).A02(this.A0E, (String) null, R.id.jobscheduler_analytics2_micro_batch, j2, j3);
                        }
                        this.A00 = j2;
                    }
                }
            }
        }
    }

    private synchronized void A01(AnonymousClass0BV r2) {
        this.A07 = this.A05;
        A02(r2);
    }

    private synchronized void A02(AnonymousClass0BV r6) {
        AnonymousClass0BV r0 = this.A02;
        if (r0 == null || r6.A01 < r0.A01) {
            this.A02 = r6;
        }
    }

    public static synchronized void A03(C03440Ik r2) {
        synchronized (r2) {
            r2.A00 = Long.MAX_VALUE;
        }
    }

    public final synchronized void D7i() {
        A04();
    }

    public final synchronized void A04() {
        synchronized (this) {
            Context context = this.A0D;
            ((AnonymousClass0Kv) AnonymousClass0CD.A00(context)).A01.cancel(R.id.jobscheduler_analytics2_micro_batch);
            A03(this);
            try {
                this.A08 = "com.facebook.analytics2.logger.UPLOAD_NOW";
                if (!AnonymousClass0CQ.A00(context).A01()) {
                    AnonymousClass0CE.A01().A02(context, (Bundle) null, this.A0E, new AnonymousClass0CJ(0, 0, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", R.id.jobscheduler_analytics2_micro_batch);
                } else {
                    try {
                        AnonymousClass0CE A012 = AnonymousClass0CE.A01();
                        C02570By r8 = this.A0E;
                        boolean z = this.A0H;
                        A012.A03(context, r8, "com.facebook.analytics2.logger.UPLOAD_NOW", R.id.jobscheduler_analytics2_micro_batch, this.A0I, z);
                        this.A0B = true;
                        AnonymousClass0CP.A00(context).A05(new AnonymousClass0CN(context, (Bundle) null, (Messenger) null, r8, new AnonymousClass0CJ(0, 0, "com.facebook.analytics2.logger.UPLOAD_NOW"), "com.facebook.analytics2.logger.UPLOAD_NOW", R.id.jobscheduler_analytics2_micro_batch), "com.facebook.analytics2.logger.UPLOAD_NOW");
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

    public final void Bhx() {
        AnonymousClass0BV r2 = this.A02;
        synchronized (this) {
            this.A06 = this.A05;
            A02(r2);
        }
        A00(this.A02);
    }

    public final void Bi1() {
        A01(this.A02);
        A00(this.A02);
    }

    public final void Bi2(long j) {
        AnonymousClass0BV A002 = this.A0K.A00(j);
        A01(A002);
        A00(A002);
    }

    public final void Bi3(long[] jArr, int i, int i2) {
        AnonymousClass0Ba r6 = this.A0K;
        AnonymousClass0BV A002 = r6.A00(-1);
        long j = A002.A01;
        long j2 = A002.A00;
        while (i < i2) {
            AnonymousClass0BV A003 = r6.A00(jArr[i]);
            j = Math.min(j, A003.A01);
            j2 = Math.min(j2, A003.A00);
            i++;
        }
        AnonymousClass0BV r4 = new AnonymousClass0BV(j, j2);
        A01(r4);
        A00(r4);
    }

    public final synchronized void BiM(String str) {
        synchronized (this) {
            try {
                this.A06 = null;
                this.A07 = null;
                this.A02 = null;
                Context context = this.A0D;
                ((AnonymousClass0Kv) AnonymousClass0CD.A00(context)).A01.cancel(R.id.jobscheduler_analytics2_micro_batch);
                A03(this);
                this.A08 = "com.facebook.analytics2.logger.USER_LOGOUT";
                String str2 = str;
                if (!AnonymousClass0CQ.A00(context).A01()) {
                    AnonymousClass0CE A012 = AnonymousClass0CE.A01();
                    C02570By r14 = this.A0E;
                    Bundle bundle = new Bundle();
                    bundle.putString("user_id", str2);
                    A012.A02(context, bundle, r14, (AnonymousClass0CJ) null, "com.facebook.analytics2.logger.USER_LOGOUT", R.id.jobscheduler_analytics2_micro_batch);
                } else {
                    try {
                        AnonymousClass0CP A002 = AnonymousClass0CP.A00(context);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("user_id", str2);
                        A002.A05(new AnonymousClass0CN(context, bundle2, (Messenger) null, this.A0E, (AnonymousClass0CJ) null, "com.facebook.analytics2.logger.USER_LOGOUT", R.id.jobscheduler_analytics2_micro_batch), "com.facebook.analytics2.logger.USER_LOGOUT");
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
            this.A05 = file;
        }
    }

    public C03440Ik(Context context, AnonymousClass0BZ r3, AnonymousClass0Ba r4, C02570By r5, AnonymousClass0CD r6, Class cls, long j, boolean z, boolean z2, boolean z3) {
        this.A0D = context;
        this.A0E = r5;
        this.A0F = cls;
        this.A0K = r4;
        this.A0J = r3;
        A03(this);
        this.A0H = z;
        this.A0I = j;
        this.A04 = r6;
        this.A0C = z2;
        this.A0G = z3;
    }
}
