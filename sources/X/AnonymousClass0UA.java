package X;

/* renamed from: X.0UA  reason: invalid class name */
public final class AnonymousClass0UA {
    public final int A00;
    public final AnonymousClass0UE A01;

    public final void A00(String str, int i, Integer num) {
        String str2;
        if (this.A00 != 0 && str != null && !str.startsWith("com.instagram")) {
            for (Object equals : AnonymousClass0UD.A04) {
                if (str.equals(equals)) {
                    return;
                }
            }
            for (String startsWith : AnonymousClass0UD.A03) {
                if (str.startsWith(startsWith)) {
                    return;
                }
            }
            AnonymousClass0UE r2 = this.A01;
            if (num.intValue() != 0) {
                str2 = "QUERY";
            } else {
                str2 = "ACQUIRE_CONTENT_PROVIDER_CLIENT";
            }
            r2.CdI(str2, str, i, AnonymousClass00U.A0L("xapp comm to ", str));
        }
    }

    public AnonymousClass0UA(AnonymousClass0UE r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }
}
