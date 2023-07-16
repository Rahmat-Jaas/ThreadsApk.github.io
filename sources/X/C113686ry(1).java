package X;

import java.util.Arrays;

/* renamed from: X.6ry  reason: invalid class name and case insensitive filesystem */
public final class C113686ry {
    public AnonymousClass761 A00;
    public final AnonymousClass761 A01;
    public final String A02;

    public final void A00(Object obj, String str) {
        AnonymousClass761 r1 = new AnonymousClass761((C97796Cu) null);
        this.A00.A00 = r1;
        this.A00 = r1;
        r1.A01 = obj;
        r1.A02 = str;
    }

    public final String toString() {
        StringBuilder A0s = C86114wI.A0s(32);
        A0s.append(this.A02);
        A0s.append('{');
        AnonymousClass761 r3 = this.A01.A00;
        String str = "";
        while (r3 != null) {
            Object obj = r3.A01;
            A0s.append(str);
            String str2 = r3.A02;
            if (str2 != null) {
                A0s.append(str2);
                A0s.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                A0s.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                A0s.append(deepToString, 1, deepToString.length() - 1);
            }
            r3 = r3.A00;
            str = ", ";
        }
        return C18190wL.A0o(A0s);
    }

    public /* synthetic */ C113686ry(String str) {
        AnonymousClass761 r0 = new AnonymousClass761((C97796Cu) null);
        this.A01 = r0;
        this.A00 = r0;
        str.getClass();
        this.A02 = str;
    }
}
