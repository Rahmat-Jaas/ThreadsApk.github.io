package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.analytics2.logger.PrivacyControlledUploader;
import java.util.Iterator;

/* renamed from: X.0C1  reason: invalid class name */
public final class AnonymousClass0C1 extends Handler {
    public static final AnonymousClass0Q7 A0D = new AnonymousClass0Q7();
    public static final AnonymousClass0LI A0E = new AnonymousClass0LI();
    public PrivacyControlledUploader A00;
    public AnonymousClass0CB A01;
    public Iterator A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05;
    public final Context A06;
    public final C002000x A07 = new C002000x(2);
    public final AnonymousClass0EU A08 = new AnonymousClass0EU(this);
    public final C02580Bz A09;
    public final AnonymousClass0C0 A0A;
    public final HandlerThread A0B;
    public final boolean A0C;

    private void A00() {
        AnonymousClass07C.A01("exitStateMachine");
        try {
            Context context = this.A06;
            C02580Bz r0 = this.A09;
            int i = r0.A00;
            AnonymousClass0CI.A01(context, this.A07, r0.A02, i, this.A05);
            this.A0A.BxC();
            if (this.A0C) {
                this.A0B.quit();
            }
        } finally {
            AnonymousClass07C.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        X.AnonymousClass0LU.A0I("UploadJobHandler", "ACS provider init failed", r2);
        r10 = new com.facebook.analytics2.logger.DefaultFalcoAcsProvider();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0121, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0122, code lost:
        r3.A0A.CV4(false);
        A00();
        r1 = new java.lang.RuntimeException(X.AnonymousClass00U.A0L("Failed to create instance of ", r7), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0151, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0152, code lost:
        X.AnonymousClass07C.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0155, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:13:0x0021, B:52:0x00d4] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r18) {
        /*
            r17 = this;
            r3 = r17
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0156
            r2 = r18
            int r1 = r2.what
            r0 = 1
            if (r1 == r0) goto L_0x0075
            r0 = 2
            if (r1 == r0) goto L_0x0057
            r0 = 3
            if (r1 == r0) goto L_0x0050
            r0 = 4
            if (r1 == r0) goto L_0x0041
            r0 = 5
            if (r1 != r0) goto L_0x0035
            java.lang.Object r2 = r2.obj
            java.lang.String r0 = "doUploadFailure"
            X.AnonymousClass07C.A01(r0)
            r1 = 3
            X.0JW r0 = X.AnonymousClass0LU.A01     // Catch:{ all -> 0x0151 }
            boolean r0 = r0.isLoggable(r1)     // Catch:{ all -> 0x0151 }
            if (r0 == 0) goto L_0x002c
            r2.toString()     // Catch:{ all -> 0x0151 }
        L_0x002c:
            r1 = 1
            r3.A05 = r1     // Catch:{ all -> 0x0151 }
            X.0C0 r0 = r3.A0A     // Catch:{ all -> 0x0151 }
            r0.CV4(r1)     // Catch:{ all -> 0x0151 }
            goto L_0x004c
        L_0x0035:
            java.lang.String r0 = "Unknown what="
            java.lang.String r1 = X.AnonymousClass00U.A0J(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0041:
            java.lang.String r0 = "doNoMoreInput"
            X.AnonymousClass07C.A01(r0)
            r1 = 0
            X.0C0 r0 = r3.A0A     // Catch:{ all -> 0x0151 }
            r0.CV4(r1)     // Catch:{ all -> 0x0151 }
        L_0x004c:
            X.AnonymousClass07C.A00()
            goto L_0x0053
        L_0x0050:
            r0 = 1
            r3.A03 = r0
        L_0x0053:
            r3.A00()
            return
        L_0x0057:
            java.lang.String r0 = "doMaybeUploadNext"
            X.AnonymousClass07C.A01(r0)
            X.0CB r1 = r3.A01     // Catch:{ all -> 0x0151 }
            java.util.Iterator r0 = r1.A00     // Catch:{ all -> 0x0151 }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x0151 }
            if (r0 == 0) goto L_0x006b
            r1.A00()     // Catch:{ all -> 0x0151 }
            goto L_0x0137
        L_0x006b:
            r0 = 4
            android.os.Message r0 = r3.obtainMessage(r0)     // Catch:{ all -> 0x0151 }
            r3.sendMessage(r0)     // Catch:{ all -> 0x0151 }
            goto L_0x0137
        L_0x0075:
            java.lang.String r0 = "doInit"
            X.AnonymousClass07C.A01(r0)
            X.0Bz r0 = r3.A09     // Catch:{ all -> 0x0151 }
            X.0By r6 = r0.A01     // Catch:{ all -> 0x0151 }
            java.lang.String r4 = r6.A0A     // Catch:{ all -> 0x0151 }
            android.content.Context r8 = r3.A06     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x013b }
            X.0Af r1 = X.C02200Af.A00(r8)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x013b }
            java.util.ArrayList r0 = r1.A04     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x013b }
            java.lang.Object r5 = X.C02200Af.A01(r1, r4, r0)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x013b }
            X.0Ca r5 = (X.C02590Ca) r5     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x013b }
            if (r5 == 0) goto L_0x0137
            java.lang.String r2 = r6.A06     // Catch:{ all -> 0x0151 }
            if (r2 == 0) goto L_0x00d1
            X.0Af r1 = X.C02200Af.A00(r8)     // Catch:{ all -> 0x0151 }
            java.util.ArrayList r0 = r1.A05     // Catch:{ all -> 0x0151 }
            java.lang.Object r4 = X.C02200Af.A02(r1, r2, r0)     // Catch:{ all -> 0x0151 }
            X.0Q7 r4 = (X.AnonymousClass0Q7) r4     // Catch:{ all -> 0x0151 }
        L_0x00a0:
            java.lang.String r2 = r6.A07     // Catch:{ all -> 0x0151 }
            if (r2 == 0) goto L_0x00cf
            X.0Af r1 = X.C02200Af.A00(r8)     // Catch:{ all -> 0x0151 }
            java.util.ArrayList r0 = r1.A02     // Catch:{ all -> 0x0151 }
            java.lang.Object r14 = X.C02200Af.A02(r1, r2, r0)     // Catch:{ all -> 0x0151 }
            com.facebook.flexiblesampling.SamplingPolicyConfig r14 = (com.facebook.flexiblesampling.SamplingPolicyConfig) r14     // Catch:{ all -> 0x0151 }
        L_0x00b0:
            X.0LI r1 = A0E     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = r6.A05     // Catch:{ all -> 0x0151 }
            X.0AT r9 = new X.0AT     // Catch:{ all -> 0x0151 }
            r9.<init>(r8, r1, r14, r0)     // Catch:{ all -> 0x0151 }
            java.lang.String r2 = r6.A04     // Catch:{ all -> 0x0151 }
            if (r2 == 0) goto L_0x00c6
            X.0Af r1 = X.C02200Af.A00(r8)     // Catch:{ all -> 0x0151 }
            java.util.ArrayList r0 = r1.A01     // Catch:{ all -> 0x0151 }
            X.C02200Af.A02(r1, r2, r0)     // Catch:{ all -> 0x0151 }
        L_0x00c6:
            java.io.File r12 = r6.A02     // Catch:{ all -> 0x0151 }
            X.0EU r11 = r3.A08     // Catch:{ all -> 0x0151 }
            int r13 = r6.A01     // Catch:{ all -> 0x0151 }
            java.lang.String r7 = r6.A00     // Catch:{ all -> 0x0151 }
            goto L_0x00d4
        L_0x00cf:
            r14 = 0
            goto L_0x00b0
        L_0x00d1:
            X.0Q7 r4 = A0D     // Catch:{ all -> 0x0151 }
            goto L_0x00a0
        L_0x00d4:
            X.0Af r1 = X.C02200Af.A00(r8)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0121, NullPointerException -> 0x00e1 }
            java.util.ArrayList r0 = r1.A00     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0121, NullPointerException -> 0x00e1 }
            java.lang.Object r10 = X.C02200Af.A01(r1, r7, r0)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0121, NullPointerException -> 0x00e1 }
            com.facebook.analytics2.logger.DefaultFalcoAcsProvider r10 = (com.facebook.analytics2.logger.DefaultFalcoAcsProvider) r10     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x0121, NullPointerException -> 0x00e1 }
            goto L_0x00ee
        L_0x00e1:
            r2 = move-exception
            java.lang.String r1 = "UploadJobHandler"
            java.lang.String r0 = "ACS provider init failed"
            X.AnonymousClass0LU.A0I(r1, r0, r2)     // Catch:{ all -> 0x0151 }
            com.facebook.analytics2.logger.DefaultFalcoAcsProvider r10 = new com.facebook.analytics2.logger.DefaultFalcoAcsProvider     // Catch:{ all -> 0x0151 }
            r10.<init>()     // Catch:{ all -> 0x0151 }
        L_0x00ee:
            X.0B9 r8 = new X.0B9     // Catch:{ all -> 0x0151 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0151 }
            r3.A02 = r8     // Catch:{ all -> 0x0151 }
            com.facebook.analytics2.logger.PrivacyControlledUploader r13 = r3.A00     // Catch:{ all -> 0x0151 }
            if (r13 != 0) goto L_0x011c
            com.facebook.analytics2.logger.PrivacyControlledUploader r13 = new com.facebook.analytics2.logger.PrivacyControlledUploader     // Catch:{ all -> 0x0151 }
            r13.<init>(r4, r5)     // Catch:{ all -> 0x0151 }
            r3.A00 = r13     // Catch:{ all -> 0x0151 }
        L_0x0100:
            java.lang.Integer r15 = r6.A03     // Catch:{ all -> 0x0151 }
            X.0Ds r12 = new X.0Ds     // Catch:{ all -> 0x0151 }
            r12.<init>(r3)     // Catch:{ all -> 0x0151 }
            X.0CB r11 = new X.0CB     // Catch:{ all -> 0x0151 }
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0151 }
            r3.A01 = r11     // Catch:{ all -> 0x0151 }
            r8.hasNext()     // Catch:{ all -> 0x0151 }
            r0 = 2
            android.os.Message r0 = r3.obtainMessage(r0)     // Catch:{ all -> 0x0151 }
            r3.sendMessage(r0)     // Catch:{ all -> 0x0151 }
            goto L_0x0137
        L_0x011c:
            r13.A00 = r4     // Catch:{ all -> 0x0151 }
            r13.A01 = r5     // Catch:{ all -> 0x0151 }
            goto L_0x0100
        L_0x0121:
            r2 = move-exception
            r1 = 0
            X.0C0 r0 = r3.A0A     // Catch:{ all -> 0x0151 }
            r0.CV4(r1)     // Catch:{ all -> 0x0151 }
            r3.A00()     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = "Failed to create instance of "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r7)     // Catch:{ all -> 0x0151 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0151 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0151 }
            goto L_0x0150
        L_0x0137:
            X.AnonymousClass07C.A00()
            return
        L_0x013b:
            r2 = move-exception
            r1 = 0
            X.0C0 r0 = r3.A0A     // Catch:{ all -> 0x0151 }
            r0.CV4(r1)     // Catch:{ all -> 0x0151 }
            r3.A00()     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = "Failed to create instance of "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r4)     // Catch:{ all -> 0x0151 }
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0151 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0151 }
        L_0x0150:
            throw r1     // Catch:{ all -> 0x0151 }
        L_0x0151:
            r0 = move-exception
            X.AnonymousClass07C.A00()
            throw r0
        L_0x0156:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0C1.handleMessage(android.os.Message):void");
    }

    public AnonymousClass0C1(Context context, HandlerThread handlerThread, C02580Bz r5, AnonymousClass0C0 r6, boolean z) {
        super(handlerThread.getLooper());
        this.A06 = context;
        this.A0B = handlerThread;
        this.A09 = r5;
        this.A0A = r6;
        this.A0C = z;
    }
}
