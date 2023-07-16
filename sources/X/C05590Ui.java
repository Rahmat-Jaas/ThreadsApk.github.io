package X;

import java.util.HashSet;

/* renamed from: X.0Ui  reason: invalid class name and case insensitive filesystem */
public final class C05590Ui {
    public int A00;
    public C05580Uh A01;
    public HashSet A02;
    public String[] A03;

    public C05590Ui(String[] strArr, int i) {
        C05580Uh r0;
        int length = strArr.length;
        if (length < 3) {
            throw new IllegalArgumentException("Annotation conditions should have at least 3 elements");
        } else if (i >= 0) {
            String str = strArr[1];
            if (str.equals("any")) {
                r0 = new C07930cS();
            } else if (str.equals("all")) {
                r0 = new C07910cP();
            } else {
                throw new IllegalArgumentException(AnonymousClass00U.A0V("'", str, "' is not a valid operation"));
            }
            this.A01 = r0;
            int i2 = length - 2;
            String[] strArr2 = new String[i2];
            this.A03 = strArr2;
            for (int i3 = 0; i3 < i2; i3++) {
                strArr2[i3] = strArr[i3 + 2];
            }
            this.A02 = new HashSet();
            this.A00 = i;
        } else {
            throw new IllegalArgumentException(AnonymousClass00U.A0J("Fallback sampling rate < 0: ", i));
        }
    }
}
