package X;

import java.nio.MappedByteBuffer;

/* renamed from: X.0Yy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C06350Yy implements C04490Nw {
    public final /* synthetic */ AnonymousClass0MP A00;

    public /* synthetic */ C06350Yy(AnonymousClass0MP r1) {
        this.A00 = r1;
    }

    public final void CK5(C06180Xz r5) {
        String A0V = AnonymousClass00U.A0V(AnonymousClass0ND.CRITICAL_REPORT.A00, "cadm_", this.A00.A00);
        if (AnonymousClass0O2.A01(A0V)) {
            AnonymousClass0O2 r2 = r5.A00;
            AnonymousClass0O1 valueOf = AnonymousClass0O1.valueOf(A0V);
            synchronized (r2.A02) {
                Integer num = (Integer) r2.A04.get(valueOf.A01);
                if (num != null) {
                    MappedByteBuffer mappedByteBuffer = r2.A01.A00;
                    mappedByteBuffer.position(num.intValue());
                    mappedByteBuffer.put("#\n".getBytes(AnonymousClass0O2.A06));
                }
            }
            return;
        }
        r5.A02.remove(A0V);
        r5.A01.remove(A0V);
    }
}
