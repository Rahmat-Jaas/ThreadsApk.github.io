package X;

import java.util.Map;

/* renamed from: X.0Xm  reason: invalid class name and case insensitive filesystem */
public final class C06060Xm implements AnonymousClass0IT {
    public final /* synthetic */ String A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ C04560Oe A02;
    public final /* synthetic */ C04560Oe A03;
    public final /* synthetic */ C04560Oe A04;

    public C06060Xm(String str, Map map, C04560Oe r3, C04560Oe r4, C04560Oe r5) {
        this.A04 = r3;
        this.A03 = r4;
        this.A02 = r5;
        this.A00 = str;
        this.A01 = map;
    }

    public final void handleUncaughtException(Thread thread, Throwable th, AnonymousClass0IN r10) {
        String str;
        String str2;
        C04560Oe r0 = this.A04;
        String str3 = null;
        if (r0 == null) {
            str = null;
        } else {
            str = (String) r0.get();
        }
        C04560Oe r02 = this.A03;
        if (r02 == null) {
            str2 = null;
        } else {
            str2 = (String) r02.get();
        }
        C04560Oe r03 = this.A02;
        if (r03 != null) {
            str3 = (String) r03.get();
        }
        AnonymousClass0NW.A01(str, str2, str3, this.A00, th, this.A01);
    }
}
