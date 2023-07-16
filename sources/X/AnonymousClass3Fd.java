package X;

/* renamed from: X.3Fd  reason: invalid class name */
public final class AnonymousClass3Fd {
    public String A00;
    public String A01;
    public String A02;
    public int A03;

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Message: ");
        A0s.append(this.A01);
        A0s.append("\nType: ");
        A0s.append(this.A02);
        A0s.append("\nCode: ");
        A0s.append(this.A03);
        A0s.append("\nFBTrace ID: ");
        return C18180wK.A0i(this.A00, A0s);
    }

    public AnonymousClass3Fd(String str, String str2, int i, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = i;
        this.A00 = str3;
    }
}
