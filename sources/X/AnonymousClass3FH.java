package X;

/* renamed from: X.3FH  reason: invalid class name */
public final class AnonymousClass3FH {
    public final long A00;
    public final String A01;
    public final String A02;

    public final String toString() {
        String str = this.A02;
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A01);
        A0r.append(" : ");
        long j = this.A00;
        if (str == null) {
            A0r.append(j);
        } else {
            A0r.append(j);
            A0r.append(" : ");
            A0r.append(str);
        }
        return A0r.toString();
    }

    public AnonymousClass3FH(String str, long j, String str2) {
        this.A01 = str;
        this.A00 = j;
        this.A02 = str2;
    }
}
