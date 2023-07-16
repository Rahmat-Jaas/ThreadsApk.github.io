package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;

/* renamed from: X.0BU  reason: invalid class name */
public final class AnonymousClass0BU extends Handler {
    public AnonymousClass0AY A00;
    public AnonymousClass0BT A01;
    public final C02160Ab A02;
    public final Object A03 = new Object();
    public final Object A04 = new Object();
    public final /* synthetic */ AnonymousClass0Jk A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0BU(Looper looper, C02160Ab r3, AnonymousClass0Jk r4) {
        super(looper);
        this.A05 = r4;
        this.A02 = r3;
    }

    private AnonymousClass0BR A00() {
        AnonymousClass0Jk r0 = this.A05;
        AnonymousClass0BR r2 = r0.A00;
        if (r2 != null) {
            return r2;
        }
        AnonymousClass0BS r5 = r0.A04;
        Context context = r5.A02;
        AnonymousClass0AW A002 = AnonymousClass0AW.A00(!AnonymousClass0CQ.A00(context).A01());
        File A003 = C14630pr.A00(context, 1543572765);
        A003.mkdirs();
        File file = new File(A003, "micro_batch");
        AnonymousClass0BP r1 = r5.A06;
        int BCk = r1.BCk();
        int AlM = r1.AlM();
        int AUU = r1.AUU();
        AnonymousClass0AU r8 = r5.A04;
        AnonymousClass0LI r7 = r5.A0A;
        String A022 = AnonymousClass0AJ.A02();
        if (A022 == null) {
            A022 = "unknown";
        }
        AnonymousClass0PK r10 = new AnonymousClass0PK(r5.A03, r8, A002, r7, new File(file, A022), BCk, AlM, AUU, r5.A00);
        C02190Ae r4 = r5.A05;
        AnonymousClass0BQ r3 = r5.A07;
        C02570By r12 = new C02570By(r4, file, r3.Bgi());
        Class cls = r5.A0B;
        AnonymousClass0Ba r11 = r5.A09;
        AnonymousClass0BZ r102 = r5.A08;
        boolean z = r5.A0C;
        AnonymousClass0BR r22 = new AnonymousClass0BR(r10, r3, new C03440Ik(context, r102, r11, r12, r3.BJk(), cls, r5.A01, z, r3.BSD(), r3.BZV()));
        r0.A00 = r22;
        return r22;
    }

    private AnonymousClass0BR A01() {
        AnonymousClass0Jk r2 = this.A05;
        if (r2.A01 == null) {
            AnonymousClass0BS r1 = r2.A04;
            AnonymousClass0BP r0 = r1.A06;
            int BCk = r0.BCk();
            int AlM = r0.AlM();
            int AUU = r0.AUU();
            AnonymousClass0AU r5 = r1.A04;
            AnonymousClass0LI r6 = r1.A0A;
            C04480Nv r3 = new C04480Nv(r1.A03, r5, r6, BCk, AlM, AUU);
            Context context = r1.A02;
            C02190Ae r9 = r1.A05;
            AnonymousClass0BQ r12 = r1.A07;
            AnonymousClass0BR r02 = new AnonymousClass0BR(r3, r12, new C03490Iy(context, r9, r6, r12.Aof()));
            r2.A01 = r02;
            r02.A00.A03(this.A00);
        }
        return r2.A01;
    }

    public static void A02(AnonymousClass0BU r2) {
        if (r2.A05.A02.Afa()) {
            synchronized (r2.A04) {
                r2.A01 = null;
            }
        }
    }

    private void A03(AnonymousClass0KD r4, long j) {
        C02530Bu r1;
        if (j == -2 || j == -4) {
            r1 = this.A05.A06;
        } else {
            r1 = this.A05.A07;
        }
        if (r1 != null) {
            AnonymousClass07C.A01("eventListener");
            try {
                r1.onEventReceivedWithParamsCollectionMap(r4, new AnonymousClass0CU());
            } finally {
                AnonymousClass07C.A00();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:47|(3:49|(2:51|53)(1:52)|54)|55|56|57|58|59|60|61|62|63|64|65|66) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:89|90|143|97|98|99|100|101|102|103|104|105|(4:108|(2:110|148)(1:149)|111|106)|147|(4:114|(2:116|150)(1:151)|117|112)|118|119) */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01af, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01b5, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01b6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        X.AnonymousClass07C.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01be, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0110, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0111, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        X.AnonymousClass07C.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0115, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x016a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00e5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            X.0Jk r2 = r10.A05
            X.0BP r0 = r2.A02
            boolean r0 = r0.AfZ()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r1 = r10.A03
            monitor-enter(r1)
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            goto L_0x0012
        L_0x000f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x000f }
            throw r0
        L_0x0012:
            java.lang.String r0 = "handleMessage"
            X.AnonymousClass07C.A01(r0)
            int r1 = r11.what     // Catch:{ all -> 0x01d3 }
            r4 = 1
            if (r1 == r4) goto L_0x009a
            r0 = 3
            if (r1 == r0) goto L_0x0079
            r0 = 4
            if (r1 == r0) goto L_0x005c
            r0 = 7
            if (r1 == r0) goto L_0x0053
            r0 = 8
            if (r1 == r0) goto L_0x01ab
            r0 = 9
            if (r1 != r0) goto L_0x0046
            java.lang.String r0 = "doUpload"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x01d3 }
            X.0BR r0 = r10.A00()     // Catch:{ all -> 0x01ce }
            X.0Bv r0 = r0.A01     // Catch:{ all -> 0x01ce }
            r0.D7i()     // Catch:{ all -> 0x01ce }
            X.0BR r0 = r2.A01     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x01a8
            X.0Bv r0 = r0.A01     // Catch:{ all -> 0x01ce }
            r0.D7i()     // Catch:{ all -> 0x01ce }
            goto L_0x01a8
        L_0x0046:
            java.lang.String r0 = "Unknown what="
            java.lang.String r0 = X.AnonymousClass00U.A0J(r0, r1)     // Catch:{ all -> 0x01d3 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x01d3 }
            r1.<init>(r0)     // Catch:{ all -> 0x01d3 }
            goto L_0x01d2
        L_0x0053:
            java.lang.Object r0 = r11.obj     // Catch:{ all -> 0x01d3 }
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0     // Catch:{ all -> 0x01d3 }
            r0.open()     // Catch:{ all -> 0x01d3 }
            goto L_0x01ab
        L_0x005c:
            java.lang.Object r1 = r11.obj     // Catch:{ all -> 0x01d3 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "doUserLogout"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x01d3 }
            X.0BR r0 = r10.A00()     // Catch:{ all -> 0x01ce }
            X.0Bv r0 = r0.A01     // Catch:{ all -> 0x01ce }
            r0.BiM(r1)     // Catch:{ all -> 0x01ce }
            X.0BR r0 = r2.A01     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x01a8
            X.0Bv r0 = r0.A01     // Catch:{ all -> 0x01ce }
            r0.BiM(r1)     // Catch:{ all -> 0x01ce }
            goto L_0x01a8
        L_0x0079:
            java.lang.Object r1 = r11.obj     // Catch:{ all -> 0x01d3 }
            X.0AY r1 = (X.AnonymousClass0AY) r1     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "doStartNewSession"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x01d3 }
            r10.A00 = r1     // Catch:{ all -> 0x01ce }
            X.0BR r0 = r10.A00()     // Catch:{ all -> 0x01ce }
            X.0Ao r0 = r0.A00     // Catch:{ all -> 0x01ce }
            r0.A03(r1)     // Catch:{ all -> 0x01ce }
            X.0BR r0 = r2.A01     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x01a8
            X.0AY r1 = r10.A00     // Catch:{ all -> 0x01ce }
            X.0Ao r0 = r0.A00     // Catch:{ all -> 0x01ce }
            r0.A03(r1)     // Catch:{ all -> 0x01ce }
            goto L_0x01a8
        L_0x009a:
            int r1 = r11.arg1     // Catch:{ all -> 0x01d3 }
            r0 = 2
            java.lang.Object r5 = r11.obj     // Catch:{ all -> 0x01d3 }
            if (r1 == r0) goto L_0x0116
            X.0Av r5 = (X.C02360Av) r5     // Catch:{ all -> 0x01d3 }
            long r2 = r5.A00     // Catch:{ all -> 0x01d3 }
            X.0Ab r1 = r10.A02     // Catch:{ all -> 0x01d3 }
            if (r1 == 0) goto L_0x00c0
            java.lang.String r0 = "doWaitForWriteBlockRelease"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x01d3 }
            r6 = -2
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            java.lang.Integer r0 = X.AnonymousClass006.A01     // Catch:{ all -> 0x01d3 }
            goto L_0x00ba
        L_0x00b8:
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x01d3 }
        L_0x00ba:
            r1.AAt(r0)     // Catch:{ all -> 0x01d3 }
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x01d3 }
        L_0x00c0:
            java.lang.String r0 = "doWrite"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x01d3 }
            java.lang.String r0 = "writeToDisk"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x01c4 }
            X.0BR r4 = r10.A00()     // Catch:{ 0Ag | 0Am | IOException -> 0x00e5 }
            X.0Ao r0 = r4.A00     // Catch:{ 0Ag | 0Am | IOException -> 0x00e5 }
            X.0KD r6 = r5.A01     // Catch:{ 0Ag | 0Am | IOException -> 0x00e5 }
            r0.A04(r6)     // Catch:{ 0Ag | 0Am | IOException -> 0x00e5 }
            X.0Bv r1 = r4.A01     // Catch:{ 0Ag | 0Am | IOException -> 0x00e5 }
            java.lang.Object r0 = r0.A07()     // Catch:{ 0Ag | 0Am | IOException -> 0x00e5 }
            r1.CmS(r0)     // Catch:{ 0Ag | 0Am | IOException -> 0x00e5 }
            r1.Bi2(r2)     // Catch:{ 0Ag | 0Am | IOException -> 0x00e5 }
            X.AnonymousClass0BR.A00(r4)     // Catch:{ 0Ag | 0Am | IOException -> 0x00e5 }
            goto L_0x00ff
        L_0x00e5:
            X.0BR r4 = r10.A01()     // Catch:{ IOException -> 0x010a }
            X.0Ao r0 = r4.A00     // Catch:{ IOException -> 0x010a }
            X.0KD r6 = r5.A01     // Catch:{ IOException -> 0x010a }
            r0.A04(r6)     // Catch:{ IOException -> 0x010a }
            X.0Bv r1 = r4.A01     // Catch:{ IOException -> 0x010a }
            java.lang.Object r0 = r0.A07()     // Catch:{ IOException -> 0x010a }
            r1.CmS(r0)     // Catch:{ IOException -> 0x010a }
            r1.Bi2(r2)     // Catch:{ IOException -> 0x010a }
            X.AnonymousClass0BR.A00(r4)     // Catch:{ IOException -> 0x010a }
        L_0x00ff:
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x01c4 }
            r10.A03(r6, r2)     // Catch:{ all -> 0x01c4 }
            r6.A02()     // Catch:{ all -> 0x01d3 }
            goto L_0x01a8
        L_0x010a:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0111 }
            r0.<init>(r1)     // Catch:{ all -> 0x0111 }
            throw r0     // Catch:{ all -> 0x0111 }
        L_0x0111:
            r0 = move-exception
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x01c4 }
            throw r0     // Catch:{ all -> 0x01c4 }
        L_0x0116:
            X.0BT r5 = (X.AnonymousClass0BT) r5     // Catch:{ all -> 0x01d3 }
            boolean r0 = r5.A04     // Catch:{ all -> 0x01d3 }
            if (r0 == 0) goto L_0x011f
            r6 = -2
            goto L_0x0121
        L_0x011f:
            r6 = -1
        L_0x0121:
            X.0Ab r3 = r10.A02     // Catch:{ all -> 0x01d3 }
            if (r3 == 0) goto L_0x013c
            java.lang.String r0 = "doWaitForWriteBlockRelease"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x01d3 }
            r1 = -2
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0131
            goto L_0x0134
        L_0x0131:
            java.lang.Integer r0 = X.AnonymousClass006.A01     // Catch:{ all -> 0x01d3 }
            goto L_0x0136
        L_0x0134:
            java.lang.Integer r0 = X.AnonymousClass006.A00     // Catch:{ all -> 0x01d3 }
        L_0x0136:
            r3.AAt(r0)     // Catch:{ all -> 0x01d3 }
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x01d3 }
        L_0x013c:
            java.lang.String r0 = "doWrites"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x01d3 }
            java.lang.Object r1 = r10.A04     // Catch:{ all -> 0x01bf }
            monitor-enter(r1)     // Catch:{ all -> 0x01bf }
            r5.A05 = r4     // Catch:{ all -> 0x01b8 }
            X.0BT r0 = r10.A01     // Catch:{ all -> 0x01b8 }
            if (r0 != r5) goto L_0x014d
            r0 = 0
            r10.A01 = r0     // Catch:{ all -> 0x01b8 }
        L_0x014d:
            monitor-exit(r1)     // Catch:{ all -> 0x01b8 }
            java.lang.String r0 = "writeToDisk"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x01bf }
            X.0BR r1 = r10.A00()     // Catch:{ 0Ag | 0Am | IOException -> 0x016a }
            X.0KD[] r9 = r5.A09     // Catch:{ 0Ag | 0Am | IOException -> 0x016a }
            long[] r8 = r5.A06     // Catch:{ 0Ag | 0Am | IOException -> 0x016a }
            int r0 = r5.A01     // Catch:{ 0Ag | 0Am | IOException -> 0x016a }
            r1.A01(r8, r9, r0)     // Catch:{ 0Ag | 0Am | IOException -> 0x016a }
            X.0KD[] r7 = r5.A08     // Catch:{ 0Ag | 0Am | IOException -> 0x016a }
            long[] r6 = r5.A07     // Catch:{ 0Ag | 0Am | IOException -> 0x016a }
            int r0 = r5.A02     // Catch:{ 0Ag | 0Am | IOException -> 0x016a }
            r1.A01(r6, r7, r0)     // Catch:{ 0Ag | 0Am | IOException -> 0x016a }
            goto L_0x0180
        L_0x016a:
            X.0BR r1 = r10.A01()     // Catch:{ IOException -> 0x01af }
            X.0KD[] r9 = r5.A09     // Catch:{ IOException -> 0x01af }
            long[] r8 = r5.A06     // Catch:{ IOException -> 0x01af }
            int r0 = r5.A01     // Catch:{ IOException -> 0x01af }
            r1.A01(r8, r9, r0)     // Catch:{ IOException -> 0x01af }
            X.0KD[] r7 = r5.A08     // Catch:{ IOException -> 0x01af }
            long[] r6 = r5.A07     // Catch:{ IOException -> 0x01af }
            int r0 = r5.A02     // Catch:{ IOException -> 0x01af }
            r1.A01(r6, r7, r0)     // Catch:{ IOException -> 0x01af }
        L_0x0180:
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x01bf }
            r4 = 0
            r3 = 0
        L_0x0185:
            int r0 = r5.A01     // Catch:{ all -> 0x01bf }
            if (r3 >= r0) goto L_0x0195
            r2 = r9[r3]     // Catch:{ all -> 0x01bf }
            if (r2 == 0) goto L_0x0192
            r0 = r8[r3]     // Catch:{ all -> 0x01bf }
            r10.A03(r2, r0)     // Catch:{ all -> 0x01bf }
        L_0x0192:
            int r3 = r3 + 1
            goto L_0x0185
        L_0x0195:
            int r0 = r5.A02     // Catch:{ all -> 0x01bf }
            if (r4 >= r0) goto L_0x01a5
            r2 = r7[r4]     // Catch:{ all -> 0x01bf }
            if (r2 == 0) goto L_0x01a2
            r0 = r6[r4]     // Catch:{ all -> 0x01bf }
            r10.A03(r2, r0)     // Catch:{ all -> 0x01bf }
        L_0x01a2:
            int r4 = r4 + 1
            goto L_0x0195
        L_0x01a5:
            r5.A00()     // Catch:{ all -> 0x01d3 }
        L_0x01a8:
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x01d3 }
        L_0x01ab:
            X.AnonymousClass07C.A00()
            return
        L_0x01af:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x01b6 }
            r0.<init>(r1)     // Catch:{ all -> 0x01b6 }
            throw r0     // Catch:{ all -> 0x01b6 }
        L_0x01b6:
            r0 = move-exception
            goto L_0x01bb
        L_0x01b8:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b8 }
            goto L_0x01be
        L_0x01bb:
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x01bf }
        L_0x01be:
            throw r0     // Catch:{ all -> 0x01bf }
        L_0x01bf:
            r1 = move-exception
            r5.A00()     // Catch:{ all -> 0x01d3 }
            goto L_0x01ca
        L_0x01c4:
            r1 = move-exception
            X.0KD r0 = r5.A01     // Catch:{ all -> 0x01d3 }
            r0.A02()     // Catch:{ all -> 0x01d3 }
        L_0x01ca:
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x01d3 }
            goto L_0x01d2
        L_0x01ce:
            r1 = move-exception
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x01d3 }
        L_0x01d2:
            throw r1     // Catch:{ all -> 0x01d3 }
        L_0x01d3:
            r0 = move-exception
            X.AnonymousClass07C.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BU.handleMessage(android.os.Message):void");
    }
}
