package X;

import java.util.List;

/* renamed from: X.4KK  reason: invalid class name */
public final class AnonymousClass4KK implements C04850Pk {
    public final /* synthetic */ String A00;
    public final /* synthetic */ List A01;

    public AnonymousClass4KK(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ void ADn(AnonymousClass0PT r6) {
        AnonymousClass4KN r62 = (AnonymousClass4KN) r6;
        if (r62 != null && !AnonymousClass0hA.A08(r62.A00)) {
            List list = this.A01;
            String str = this.A00;
            String str2 = r62.A00;
            if (str2 != null) {
                list.add(C63843iR.A00(str, str2, "Instagram", "Instagram", "inactive_logged_in_accounts"));
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
    }
}
