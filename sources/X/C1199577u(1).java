package X;

import java.util.Arrays;

/* renamed from: X.77u  reason: invalid class name and case insensitive filesystem */
public final class C1199577u {
    public C108726iq A00;
    public final C108726iq A01;
    public final String A02;

    public static void A00(C1199577u r2, Object obj, String str) {
        C108726iq r1 = new C108726iq();
        r2.A00.A02 = r1;
        r2.A00 = r1;
        r1.A00 = obj;
        r1.A01 = str;
    }

    public final String toString() {
        StringBuilder A0s = C86114wI.A0s(32);
        A0s.append(this.A02);
        A0s.append('{');
        String str = "";
        for (C108726iq r3 = this.A01.A02; r3 != null; r3 = r3.A02) {
            Object obj = r3.A00;
            A0s.append(str);
            if (r3.A01 != null) {
                A0s.append(r3.A01);
                A0s.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                A0s.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                A0s.append(deepToString, 1, deepToString.length() - 1);
            }
            str = ", ";
        }
        return C18190wL.A0o(A0s);
    }

    public C1199577u(String str) {
        C108726iq r0 = new C108726iq();
        this.A01 = r0;
        this.A00 = r0;
        str.getClass();
        this.A02 = str;
    }
}
