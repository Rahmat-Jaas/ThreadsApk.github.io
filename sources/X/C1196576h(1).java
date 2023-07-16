package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.76h  reason: invalid class name and case insensitive filesystem */
public final class C1196576h {
    public Integer A00;
    public String A01;
    public boolean A02;
    public final AnonymousClass5KT A03;
    public final UserSession A04;

    private final void A00() {
        C14090on A002;
        String str;
        AnonymousClass5KT r3 = this.A03;
        if (r3 == null) {
            A002 = C10770iu.A00();
            str = "config is null";
        } else {
            if (r3.A02 == null) {
                C10770iu.A00().ABJ("indicatorStyle is null", 817901739);
            }
            Boolean bool = r3.A00;
            if (bool == null) {
                A002 = C10770iu.A00();
                str = "shouldEnableAutoadvance is null";
            } else if (bool.booleanValue() && r3.A01 == null) {
                A002 = C10770iu.A00();
                str = "duration is null";
            } else {
                return;
            }
        }
        A002.ABJ(str, 817901739);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        if (r0 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        if (r6.equals(r5) == false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1196576h(X.AnonymousClass5KT r8, com.instagram.service.session.UserSession r9) {
        /*
            r7 = this;
            r7.<init>()
            r7.A03 = r8
            r7.A04 = r9
            if (r8 == 0) goto L_0x0072
            java.lang.String r6 = r8.A02
        L_0x000b:
            java.lang.String r5 = "dots"
            if (r6 == 0) goto L_0x006e
            int r4 = r6.hashCode()
            r3 = -737004967(0xffffffffd4123259, float:-2.51163967E12)
            r0 = 1328(0x530, float:1.861E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            r0 = 199(0xc7, float:2.79E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            if (r4 == r3) goto L_0x0060
            r0 = 3089482(0x2f244a, float:4.329286E-39)
            if (r4 == r0) goto L_0x0068
            r0 = 780693276(0x2e886f1c, float:6.204301E-11)
            if (r4 != r0) goto L_0x006e
            boolean r0 = r6.equals(r2)
            if (r0 == 0) goto L_0x006e
            r5 = r2
        L_0x0035:
            r7.A01 = r5
            X.5KT r0 = r7.A03
            if (r0 == 0) goto L_0x005b
            java.lang.Boolean r0 = r0.A00
            if (r0 == 0) goto L_0x005b
            boolean r1 = r0.booleanValue()
        L_0x0043:
            r7.A02 = r1
            X.5KT r0 = r7.A03
            if (r0 == 0) goto L_0x004f
            java.lang.Integer r0 = r0.A01
            if (r1 == 0) goto L_0x0058
            if (r0 != 0) goto L_0x0058
        L_0x004f:
            r7.A00()
            r0 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0058:
            r7.A00 = r0
            return
        L_0x005b:
            r7.A00()
            r1 = 0
            goto L_0x0043
        L_0x0060:
            boolean r0 = r6.equals(r1)
            if (r0 == 0) goto L_0x006e
            r5 = r1
            goto L_0x0035
        L_0x0068:
            boolean r0 = r6.equals(r5)
            if (r0 != 0) goto L_0x0035
        L_0x006e:
            r7.A00()
            goto L_0x0035
        L_0x0072:
            r6 = 0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196576h.<init>(X.5KT, com.instagram.service.session.UserSession):void");
    }
}
