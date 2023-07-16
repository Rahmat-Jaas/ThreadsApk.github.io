package X;

/* renamed from: X.6rW  reason: invalid class name and case insensitive filesystem */
public final class C113496rW {
    public final int A00;
    public final CharSequence A01;

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj instanceof C113496rW) {
            C113496rW r5 = (C113496rW) obj;
            if (this.A00 == r5.A00) {
                CharSequence charSequence = r5.A01;
                CharSequence charSequence2 = this.A01;
                if (charSequence2 != null) {
                    str = charSequence2.toString();
                } else {
                    str = null;
                }
                if (charSequence != null) {
                    str2 = charSequence.toString();
                } else {
                    str2 = null;
                }
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                    return true;
                } else if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str;
        Integer valueOf = Integer.valueOf(this.A00);
        CharSequence charSequence = this.A01;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        return C86124wJ.A0H(valueOf, str);
    }

    public C113496rW(int i, CharSequence charSequence) {
        this.A00 = i;
        this.A01 = charSequence;
    }
}
