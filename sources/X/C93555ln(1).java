package X;

import android.content.Context;
import android.os.Looper;
import android.util.Base64;

/* renamed from: X.5ln  reason: invalid class name and case insensitive filesystem */
public final class C93555ln extends C93625lu {
    public final C129107lI A00;

    public final int Ave() {
        return 12800000;
    }

    public C93555ln(Context context, Looper looper, C129107lI r13, C148648rc r14, C148658rd r15, C110886mR r16) {
        super(context, looper, r14, r15, r16, 68);
        Boolean valueOf = Boolean.valueOf((r13 == null ? C129107lI.A02 : r13).A01);
        byte[] bArr = new byte[16];
        AnonymousClass30G.A00.nextBytes(bArr);
        this.A00 = new C129107lI(Base64.encodeToString(bArr, 11), valueOf);
    }
}
