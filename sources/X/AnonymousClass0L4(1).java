package X;

/* renamed from: X.0L4  reason: invalid class name */
public final class AnonymousClass0L4 extends AnonymousClass0Y2 {
    public final /* synthetic */ C07430bV A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0L4(AnonymousClass0O7 r1, C07430bV r2) {
        super(r1);
        this.A00 = r2;
    }

    public final boolean A00(AnonymousClass0O6 r4) {
        String str;
        String str2;
        if (!C07430bV.A03.contains(r4.A00) || (str = r4.A00) == null) {
            return true;
        }
        String str3 = r4.A01;
        if (str3 != null && !str3.equals("")) {
            return true;
        }
        if (str.endsWith("id")) {
            str2 = "0";
        } else {
            str2 = "unknown";
        }
        r4.A01 = str2;
        return true;
    }
}
