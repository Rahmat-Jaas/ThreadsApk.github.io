package X;

import java.util.List;

/* renamed from: X.1j1  reason: invalid class name */
public final class AnonymousClass1j1 extends C685344e {
    public String A00;
    public String A01;
    public String A02;
    public List A03;

    public AnonymousClass1j1() {
        this("", "", "");
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("\n        [FacebookPostingAccount] id=id=");
        A0s.append(this.A01);
        A0s.append("; name=");
        A0s.append(this.A02);
        A0s.append("; has_access_token=");
        A0s.append(!C18180wK.A1W(this.A00.length()));
        return AnonymousClass4n8.A08(C18180wK.A0i(";\\n\n        ", A0s));
    }

    public AnonymousClass1j1(String str, String str2, String str3) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(str3, 3);
        AnonymousClass0ZV r0 = AnonymousClass0ZV.A00;
        this.A03 = r0;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A03 = r0;
    }
}
