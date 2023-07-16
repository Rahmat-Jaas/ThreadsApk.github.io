package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.0Ay  reason: invalid class name and case insensitive filesystem */
public final class C02380Ay extends Handler {
    public AnonymousClass0AY A00;
    public C02370Ax A01;
    public final C02160Ab A02;
    public final Integer A03;
    public final Object A04 = new Object();
    public final Object A05 = new Object();
    public final /* synthetic */ C02390Az A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C02380Ay(Looper looper, C02160Ab r3, C02390Az r4, Integer num) {
        super(looper);
        this.A06 = r4;
        this.A02 = r3;
        this.A03 = num;
    }

    private C02300Ap A00() {
        C02390Az r4 = this.A06;
        C02300Ap r1 = r4.A00;
        if (r1 != null) {
            return r1;
        }
        C02310Aq r12 = r4.A02;
        Context context = r12.A03;
        AnonymousClass0AW A002 = AnonymousClass0AW.A00(!AnonymousClass0CQ.A00(context).A01());
        String str = r12.A0C;
        File A003 = C14630pr.A00(context, 1543572765);
        A003.mkdirs();
        File file = new File(A003, str);
        AnonymousClass0BP r0 = r12.A08;
        int BCk = r0.BCk();
        int AlM = r0.AlM();
        int AUU = r0.AUU();
        AnonymousClass0AU r122 = r12.A06;
        AnonymousClass0LI r14 = r12.A0A;
        String A022 = AnonymousClass0AJ.A02();
        if (A022 == null) {
            A022 = "unknown";
        }
        AnonymousClass0PK r10 = new AnonymousClass0PK(r12.A04, r122, A002, r14, new File(file, A022), BCk, AlM, AUU, r12.A01);
        int i = r12.A00;
        C02570By r8 = new C02570By(r12.A07, file, HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS);
        AnonymousClass0AH r7 = r12.A05;
        Class cls = r12.A0B;
        AnonymousClass0CG r02 = r12.A09;
        Context context2 = context;
        C02300Ap r13 = new C02300Ap(r10, new AnonymousClass0DO(context2, r7, r8, r02.AjT(), r02.ASj(), cls, i, r12.A02, r12.A0D));
        r4.A00 = r13;
        return r13;
    }

    private C02300Ap A01() {
        C02390Az r3 = this.A06;
        if (r3.A01 == null) {
            C02310Aq r1 = r3.A02;
            AnonymousClass0BP r0 = r1.A08;
            int BCk = r0.BCk();
            int AlM = r0.AlM();
            int AUU = r0.AUU();
            AnonymousClass0AU r6 = r1.A06;
            AnonymousClass0LI r7 = r1.A0A;
            C02300Ap r02 = new C02300Ap(new C04480Nv(r1.A04, r6, r7, BCk, AlM, AUU), new AnonymousClass0L8(r1.A03, r1.A07, r7));
            r3.A01 = r02;
            r02.A00.A03(this.A00);
        }
        return r3.A01;
    }

    public static void A02(C02380Ay r2) {
        if (r2.A06.A04.Afa()) {
            synchronized (r2.A05) {
                r2.A01 = null;
            }
        }
    }

    private void A03(AnonymousClass0KD r3) {
        C02530Bu r1 = this.A06.A05;
        if (r1 != null) {
            AnonymousClass07C.A01("eventListener");
            try {
                r1.onEventReceivedWithParamsCollectionMap(r3, new AnonymousClass0CU());
            } finally {
                AnonymousClass07C.A00();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:60|61|62|63) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:100|101|102|103|(1:105)) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r1 = A01();
        r2 = r3.A04;
        r1.A01(r2, r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r1 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x013b, code lost:
        if (r1 != null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x013d, code lost:
        r1.onEventsWritten(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x015e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0164, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0165, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        r1 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x016c, code lost:
        if (r1 != null) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x016e, code lost:
        r1.onEventsWritten(r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0173, code lost:
        X.AnonymousClass07C.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0176, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r1 = A01();
        r1.A00.A04(r3);
        X.C02300Ap.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        X.AnonymousClass07C.A00();
        r0 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00dc, code lost:
        if (r0 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ee, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ef, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        X.AnonymousClass07C.A00();
        r0 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f5, code lost:
        if (r0 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00f7, code lost:
        r0.onEventsWritten(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00fa, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x012e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x00cb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r6) {
        /*
            r5 = this;
            X.0Az r4 = r5.A06
            X.0BP r0 = r4.A04
            boolean r0 = r0.AfZ()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r1 = r5.A04
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
            int r1 = r6.what     // Catch:{ all -> 0x018b }
            r2 = 1
            if (r1 == r2) goto L_0x0093
            r0 = 3
            if (r1 == r0) goto L_0x006c
            r0 = 4
            if (r1 == r0) goto L_0x004f
            r0 = 7
            if (r1 == r0) goto L_0x0046
            r0 = 8
            if (r1 == r0) goto L_0x015a
            r0 = 9
            if (r1 != r0) goto L_0x017f
            java.lang.String r0 = "doUpload"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x018b }
            X.0Ap r0 = r5.A00()     // Catch:{ all -> 0x008d }
            X.0Bv r0 = r0.A01     // Catch:{ all -> 0x008d }
            r0.D7i()     // Catch:{ all -> 0x008d }
            X.0Ap r0 = r4.A01     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0157
            X.0Bv r0 = r0.A01     // Catch:{ all -> 0x008d }
            r0.D7i()     // Catch:{ all -> 0x008d }
            goto L_0x0157
        L_0x0046:
            java.lang.Object r0 = r6.obj     // Catch:{ all -> 0x018b }
            android.os.ConditionVariable r0 = (android.os.ConditionVariable) r0     // Catch:{ all -> 0x018b }
            r0.open()     // Catch:{ all -> 0x018b }
            goto L_0x015a
        L_0x004f:
            java.lang.Object r1 = r6.obj     // Catch:{ all -> 0x018b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "doUserLogout"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x018b }
            X.0Ap r0 = r5.A00()     // Catch:{ all -> 0x008d }
            X.0Bv r0 = r0.A01     // Catch:{ all -> 0x008d }
            r0.BiM(r1)     // Catch:{ all -> 0x008d }
            X.0Ap r0 = r4.A01     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0157
            X.0Bv r0 = r0.A01     // Catch:{ all -> 0x008d }
            r0.BiM(r1)     // Catch:{ all -> 0x008d }
            goto L_0x0157
        L_0x006c:
            java.lang.Object r1 = r6.obj     // Catch:{ all -> 0x018b }
            X.0AY r1 = (X.AnonymousClass0AY) r1     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "doStartNewSession"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x018b }
            r5.A00 = r1     // Catch:{ all -> 0x008d }
            X.0Ap r0 = r5.A00()     // Catch:{ all -> 0x008d }
            X.0Ao r0 = r0.A00     // Catch:{ all -> 0x008d }
            r0.A03(r1)     // Catch:{ all -> 0x008d }
            X.0Ap r0 = r4.A01     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0157
            X.0AY r1 = r5.A00     // Catch:{ all -> 0x008d }
            X.0Ao r0 = r0.A00     // Catch:{ all -> 0x008d }
            r0.A03(r1)     // Catch:{ all -> 0x008d }
            goto L_0x0157
        L_0x008d:
            r0 = move-exception
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x018b }
            goto L_0x018a
        L_0x0093:
            X.0Ab r1 = r5.A02     // Catch:{ all -> 0x018b }
            if (r1 == 0) goto L_0x00a4
            java.lang.String r0 = "doWaitForWriteBlockRelease"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x018b }
            java.lang.Integer r0 = r5.A03     // Catch:{ all -> 0x018b }
            r1.AAt(r0)     // Catch:{ all -> 0x018b }
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x018b }
        L_0x00a4:
            int r1 = r6.arg1     // Catch:{ all -> 0x018b }
            r0 = 2
            java.lang.Object r3 = r6.obj     // Catch:{ all -> 0x018b }
            if (r1 == r0) goto L_0x0100
            X.0KD r3 = (X.AnonymousClass0KD) r3     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "doWrite"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "writeToDisk"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x00fb }
            X.0Ap r1 = r5.A00()     // Catch:{ 0Ag | 0Am | IOException -> 0x00cb }
            X.0Ao r0 = r1.A00     // Catch:{ 0Ag | 0Am | IOException -> 0x00cb }
            r0.A04(r3)     // Catch:{ 0Ag | 0Am | IOException -> 0x00cb }
            X.C02300Ap.A00(r1)     // Catch:{ 0Ag | 0Am | IOException -> 0x00cb }
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x00fb }
            X.0Bu r0 = r4.A05     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x00e1
            goto L_0x00de
        L_0x00cb:
            X.0Ap r1 = r5.A01()     // Catch:{ IOException -> 0x00e8 }
            X.0Ao r0 = r1.A00     // Catch:{ IOException -> 0x00e8 }
            r0.A04(r3)     // Catch:{ IOException -> 0x00e8 }
            X.C02300Ap.A00(r1)     // Catch:{ IOException -> 0x00e8 }
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x00fb }
            X.0Bu r0 = r4.A05     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x00e1
        L_0x00de:
            r0.onEventsWritten(r2)     // Catch:{ all -> 0x00fb }
        L_0x00e1:
            r5.A03(r3)     // Catch:{ all -> 0x00fb }
            r3.A02()     // Catch:{ all -> 0x018b }
            goto L_0x0157
        L_0x00e8:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x00ef }
            r0.<init>(r1)     // Catch:{ all -> 0x00ef }
            throw r0     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r1 = move-exception
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x00fb }
            X.0Bu r0 = r4.A05     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x00fa
            r0.onEventsWritten(r2)     // Catch:{ all -> 0x00fb }
        L_0x00fa:
            throw r1     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r0 = move-exception
            r3.A02()     // Catch:{ all -> 0x018b }
            goto L_0x017b
        L_0x0100:
            X.0Ax r3 = (X.C02370Ax) r3     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "doWrites"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x018b }
            java.lang.Object r1 = r5.A05     // Catch:{ all -> 0x0177 }
            monitor-enter(r1)     // Catch:{ all -> 0x0177 }
            r3.A03 = r2     // Catch:{ all -> 0x0167 }
            X.0Ax r0 = r5.A01     // Catch:{ all -> 0x0167 }
            if (r0 != r3) goto L_0x0113
            r0 = 0
            r5.A01 = r0     // Catch:{ all -> 0x0167 }
        L_0x0113:
            monitor-exit(r1)     // Catch:{ all -> 0x0167 }
            java.lang.String r0 = "writeToDisk"
            X.AnonymousClass07C.A01(r0)     // Catch:{ all -> 0x0177 }
            X.0Ap r1 = r5.A00()     // Catch:{ 0Ag | 0Am | IOException -> 0x012e }
            X.0KD[] r2 = r3.A04     // Catch:{ 0Ag | 0Am | IOException -> 0x012e }
            int r0 = r3.A01     // Catch:{ 0Ag | 0Am | IOException -> 0x012e }
            r1.A01(r2, r0)     // Catch:{ 0Ag | 0Am | IOException -> 0x012e }
            X.0Bu r1 = r4.A05     // Catch:{ all -> 0x0177 }
            if (r1 == 0) goto L_0x0142
            int r0 = r3.A01     // Catch:{ all -> 0x0177 }
            r1.onEventsWritten(r0)     // Catch:{ all -> 0x0177 }
            goto L_0x0142
        L_0x012e:
            X.0Ap r1 = r5.A01()     // Catch:{ IOException -> 0x015e }
            X.0KD[] r2 = r3.A04     // Catch:{ IOException -> 0x015e }
            int r0 = r3.A01     // Catch:{ IOException -> 0x015e }
            r1.A01(r2, r0)     // Catch:{ IOException -> 0x015e }
            X.0Bu r1 = r4.A05     // Catch:{ all -> 0x0177 }
            if (r1 == 0) goto L_0x0142
            int r0 = r3.A01     // Catch:{ all -> 0x0177 }
            r1.onEventsWritten(r0)     // Catch:{ all -> 0x0177 }
        L_0x0142:
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x0177 }
            r1 = 0
        L_0x0146:
            int r0 = r3.A01     // Catch:{ all -> 0x0177 }
            if (r1 >= r0) goto L_0x0154
            r0 = r2[r1]     // Catch:{ all -> 0x0177 }
            if (r0 == 0) goto L_0x0151
            r5.A03(r0)     // Catch:{ all -> 0x0177 }
        L_0x0151:
            int r1 = r1 + 1
            goto L_0x0146
        L_0x0154:
            r3.A00()     // Catch:{ all -> 0x018b }
        L_0x0157:
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x018b }
        L_0x015a:
            X.AnonymousClass07C.A00()
            return
        L_0x015e:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0165 }
            r0.<init>(r1)     // Catch:{ all -> 0x0165 }
            throw r0     // Catch:{ all -> 0x0165 }
        L_0x0165:
            r2 = move-exception
            goto L_0x016a
        L_0x0167:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0167 }
            goto L_0x0176
        L_0x016a:
            X.0Bu r1 = r4.A05     // Catch:{ all -> 0x0177 }
            if (r1 == 0) goto L_0x0173
            int r0 = r3.A01     // Catch:{ all -> 0x0177 }
            r1.onEventsWritten(r0)     // Catch:{ all -> 0x0177 }
        L_0x0173:
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x0177 }
        L_0x0176:
            throw r2     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            r3.A00()     // Catch:{ all -> 0x018b }
        L_0x017b:
            X.AnonymousClass07C.A00()     // Catch:{ all -> 0x018b }
            goto L_0x018a
        L_0x017f:
            java.lang.String r0 = "Unknown what="
            java.lang.String r1 = X.AnonymousClass00U.A0J(r0, r1)     // Catch:{ all -> 0x018b }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x018b }
            r0.<init>(r1)     // Catch:{ all -> 0x018b }
        L_0x018a:
            throw r0     // Catch:{ all -> 0x018b }
        L_0x018b:
            r0 = move-exception
            X.AnonymousClass07C.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02380Ay.handleMessage(android.os.Message):void");
    }
}
