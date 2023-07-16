package X;

import com.facebook.redex.IDxObserverShape3S1600000_2_I2;

/* renamed from: X.80y  reason: invalid class name and case insensitive filesystem */
public final class C1359980y implements Runnable {
    public final /* synthetic */ IDxObserverShape3S1600000_2_I2 A00;
    public final /* synthetic */ AnonymousClass7Kx A01;

    public C1359980y(IDxObserverShape3S1600000_2_I2 iDxObserverShape3S1600000_2_I2, AnonymousClass7Kx r2) {
        this.A00 = iDxObserverShape3S1600000_2_I2;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0092, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0093, code lost:
        r0.execute(new X.AnonymousClass835(r8, r9, (java.lang.Object) null, (java.lang.String) null, r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009d, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0057 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0092 A[ExcHandler: IllegalAccessException | IllegalArgumentException (r12v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x001e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            com.facebook.redex.IDxObserverShape3S1600000_2_I2 r2 = r13.A00
            java.lang.Object r8 = r2.A00
            X.76p r8 = (X.C1197276p) r8
            java.lang.Object r1 = r2.A01
            X.7Kx r0 = r13.A01
            java.lang.Object r3 = X.AnonymousClass7Kx.A0D(r0)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r7 = r2.A06
            java.lang.Object r6 = r2.A05
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Object r9 = r2.A04
            X.6ck r9 = (X.C105016ck) r9
            java.lang.Object r0 = r2.A02
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            X.79P r2 = X.C121267Fg.createPayloads(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            byte[] r3 = r3.getBytes(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            java.lang.Object r4 = r2.A00     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            byte[] r4 = (byte[]) r4     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            java.lang.Object r5 = r2.A01     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            byte[] r5 = (byte[]) r5     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            com.fbpay.ptt.impl.Ptt r2 = new com.fbpay.ptt.impl.Ptt     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            java.lang.String r3 = r2.getEncryptionError()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            if (r1 != 0) goto L_0x0066
            r10 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0057, IllegalAccessException | IllegalArgumentException -> 0x0092 }
            if (r1 != 0) goto L_0x0057
            org.json.JSONObject r2 = X.C18250wR.A0j(r3)     // Catch:{ JSONException -> 0x0057, IllegalAccessException | IllegalArgumentException -> 0x0092 }
            java.lang.String r1 = "code"
            r2.getInt(r1)     // Catch:{ JSONException -> 0x0057, IllegalAccessException | IllegalArgumentException -> 0x0092 }
            java.lang.String r1 = "message"
            java.lang.String r3 = r2.getString(r1)     // Catch:{ JSONException -> 0x0057, IllegalAccessException | IllegalArgumentException -> 0x0092 }
        L_0x0057:
            X.88M r12 = new X.88M     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            r12.<init>(r3)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            X.835 r7 = new X.835     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            r11 = r10
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            r0.execute(r7)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            return
        L_0x0066:
            boolean r1 = r6.isEmpty()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            if (r1 == 0) goto L_0x0074
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            X.C1197276p.A00(r2, r8, r9, r1, r0)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            return
        L_0x0074:
            X.6gi r6 = r8.A00     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            java.util.Map r5 = r2.getSigningPayloads()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            X.6kg r4 = new X.6kg     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            r4.<init>(r2, r8, r9, r0)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            java.util.Map r1 = r6.A01     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            java.util.Iterator r3 = X.C18220wO.A0x(r1)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            X.6ch r1 = new X.6ch     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            r1.<init>(r6)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            X.C116986xw.A01(r1, r4, r3, r5, r2)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x0092 }
            return
        L_0x0092:
            r12 = move-exception
            r10 = 0
            X.835 r7 = new X.835
            r11 = r10
            r7.<init>(r8, r9, r10, r11, r12)
            r0.execute(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359980y.run():void");
    }
}
