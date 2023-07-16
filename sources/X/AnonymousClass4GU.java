package X;

/* renamed from: X.4GU  reason: invalid class name */
public final class AnonymousClass4GU implements C82884qQ {
    public final AnonymousClass3UU A00;
    public final String A01;
    public final boolean A02;

    public final boolean CW4(C58743Gz r4) {
        boolean z;
        AnonymousClass3UU r0 = this.A00;
        String str = (String) r0.A01.get(this.A01);
        if (str != null) {
            z = Boolean.parseBoolean(str);
        } else {
            z = false;
        }
        if (this.A02 == z) {
            return true;
        }
        return false;
    }

    public AnonymousClass4GU(AnonymousClass3UU r1, String str, boolean z) {
        this.A00 = r1;
        this.A02 = z;
        this.A01 = str;
    }
}
