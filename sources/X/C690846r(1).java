package X;

import android.text.TextUtils;

/* renamed from: X.46r  reason: invalid class name and case insensitive filesystem */
public final class C690846r implements C82394pY {
    public final /* synthetic */ AnonymousClass1ci A00;

    public C690846r(AnonymousClass1ci r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        Integer num;
        int i;
        int A03 = C14030oh.A03(-249644485);
        AnonymousClass45R r6 = (AnonymousClass45R) obj;
        int A032 = C14030oh.A03(238554300);
        AnonymousClass1ci r2 = this.A00;
        if (!C63553hn.A00(r2.A09, r2.A0B).equals(r6.A02)) {
            i = -247086657;
        } else {
            String str = r6.A01;
            if (!TextUtils.isEmpty(str)) {
                num = r6.A00;
            } else {
                str = C18230wP.A0l(r2);
                num = AnonymousClass006.A00;
            }
            r2.Cth(str, num);
            i = -1961064093;
        }
        C14030oh.A0A(i, A032);
        C14030oh.A0A(751747426, A03);
    }
}
