package X;

import android.text.TextUtils;

/* renamed from: X.83N  reason: invalid class name */
public final class AnonymousClass83N implements Runnable {
    public final /* synthetic */ Throwable A00;
    public final /* synthetic */ C109836kh A01;
    public final /* synthetic */ Object A02;

    public AnonymousClass83N(C109836kh r1, Object obj, Throwable th) {
        this.A01 = r1;
        this.A00 = th;
        this.A02 = obj;
    }

    public static void A00(AnonymousClass83N r4, String str, Throwable th) {
        C109836kh r0 = r4.A01;
        C1197276p r2 = r0.A01;
        Object obj = r4.A02;
        r0.A03.execute(new AnonymousClass835(r2, r0.A02, obj, str, th));
    }

    public final void run() {
        IllegalArgumentException e = this.A00;
        String str = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                str = this.A01.A00.decodeResponse(str);
            }
        } catch (IllegalArgumentException e2) {
        } finally {
            A00(this, str, e2);
        }
    }
}
