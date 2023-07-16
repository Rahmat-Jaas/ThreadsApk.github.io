package X;

/* renamed from: X.0eR  reason: invalid class name and case insensitive filesystem */
public final class C08870eR {
    public int A00;
    public long A01;
    public String A02;

    public C08870eR(C08890eT r7) {
        String str = r7.A03;
        if (str == null) {
            str = null;
        } else {
            String[] split = str.split("[_\\-]");
            int length = split.length;
            if (length == 2) {
                str = split[0];
            } else if (length == 4) {
                str = AnonymousClass00U.A0V(split[0], "-", split[2]);
            }
        }
        this.A02 = str;
        this.A00 = (int) (r7.A01 * 100.0f);
        C08800eK r4 = r7.A02;
        this.A01 = Math.max(r4.A07.A00(r4.A04.now()), r4.A02);
    }

    public C08870eR() {
        throw new IllegalStateException("New instances of this class not supported");
    }
}
