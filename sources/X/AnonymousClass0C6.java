package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.analytics2.logger.HandlerThreadFactory;

/* renamed from: X.0C6  reason: invalid class name */
public final class AnonymousClass0C6 {
    public final Context A00;
    public final SparseArray A01 = new SparseArray(2);

    public static synchronized void A00(C02580Bz r9, AnonymousClass0C0 r10, AnonymousClass0C6 r11) {
        synchronized (r11) {
            C02580Bz r8 = r9;
            int i = r9.A00;
            C02870Df r92 = new C02870Df(r10, r11, i);
            Context context = r11.A00;
            C02200Af A002 = C02200Af.A00(context);
            C02570By r1 = r8.A01;
            HandlerThreadFactory A04 = A002.A04(r1.A08);
            try {
                SparseArray sparseArray = r11.A01;
                if (sparseArray.get(i) == null || ((AnonymousClass0C5) sparseArray.get(i)).A00 == null) {
                    Integer num = r1.A03;
                    int i2 = 19;
                    if (num == AnonymousClass006.A01) {
                        i2 = 18;
                    }
                    AnonymousClass0C1 r5 = new AnonymousClass0C1(context, A04.AFM(AnonymousClass00U.A0J("UploadJobHandlerManager-", i), i2), r8, r92, A04.CYs());
                    AnonymousClass0C5 r0 = (AnonymousClass0C5) sparseArray.get(i);
                    if (r0 == null) {
                        r0 = new AnonymousClass0C5();
                        sparseArray.put(i, r0);
                    }
                    r0.A00 = r5;
                    synchronized (r5) {
                        try {
                            if (!r5.A04) {
                                r5.A04 = true;
                                r5.sendMessage(r5.obtainMessage(1));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } else {
                    throw new IllegalStateException(AnonymousClass00U.A0L("Trying to create a new handler when one already exists for jobId: ", String.valueOf(i)));
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public AnonymousClass0C6(Context context) {
        this.A00 = context;
    }
}
