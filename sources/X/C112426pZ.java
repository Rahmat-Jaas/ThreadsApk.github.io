package X;

/* renamed from: X.6pZ  reason: invalid class name and case insensitive filesystem */
public final class C112426pZ {
    public final int A00;
    public final String A01;
    public final String A02;

    public C112426pZ(String str, int i, String str2) {
        this.A02 = str;
        this.A00 = i;
        this.A01 = str2;
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A02);
        A0r.append(' ');
        A0r.append(this.A00);
        String str = this.A01;
        if (str != null) {
            A0r.append(' ');
            A0r.append(str);
        }
        return A0r.toString();
    }
}
