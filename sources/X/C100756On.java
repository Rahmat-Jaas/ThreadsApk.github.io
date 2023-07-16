package X;

import android.content.SharedPreferences;
import java.nio.ByteBuffer;

/* renamed from: X.6On  reason: invalid class name and case insensitive filesystem */
public final class C100756On {
    /* JADX INFO: finally extract failed */
    public static final Object A00(AnonymousClass601 r13, C63893iY r14) {
        SharedPreferences.Editor remove;
        boolean A1Z = AnonymousClass0wJ.A1Z(r14, r13);
        String A0D = C63893iY.A0D(r14, 0);
        long A08 = C18190wL.A08(C63893iY.A0A(r14, A1Z ? 1 : 0));
        boolean A01 = AnonymousClass3WF.A01(r14, 2);
        SharedPreferences.Editor edit = AnonymousClass3Zs.A03(C86104wH.A0Y(r13)).A01(D2R.A15).edit();
        C04220Ms.A0B(A0D, 0);
        AnonymousClass6r6 r3 = C103036Xo.A00;
        int length = A0D.length() << 1;
        AnonymousClass7Ko.A04(length, "expectedInputSize must be >= 0 but was %s", C86114wI.A1S(length));
        C111536nq A00 = r3.A00();
        int length2 = A0D.length();
        int i = 0;
        while (i < length2) {
            char charAt = A0D.charAt(i);
            C93815rj r2 = (C93815rj) A00;
            ByteBuffer byteBuffer = r2.A02;
            byteBuffer.putChar(charAt);
            try {
                AnonymousClass7Ko.A06(r2, byteBuffer.array(), 0, 2);
                byteBuffer.clear();
                i++;
            } catch (Throwable th) {
                byteBuffer.clear();
                throw th;
            }
        }
        String A0L = AnonymousClass00U.A0L("switcher_snooze_duration_end_time_", C18190wL.A0n(A00.A00()));
        if (A01) {
            remove = edit.putLong(A0L, System.currentTimeMillis() + A08);
        } else {
            remove = edit.remove(A0L);
        }
        remove.apply();
        return null;
    }
}
