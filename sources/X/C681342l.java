package X;

import java.util.Map;

/* renamed from: X.42l  reason: invalid class name and case insensitive filesystem */
public final class C681342l implements C84144sc {
    public final /* synthetic */ AnonymousClass1cX A00;

    public C681342l(AnonymousClass1cX r1) {
        this.A00 = r1;
    }

    public final void Byt() {
        AnonymousClass1cX r2 = this.A00;
        AnonymousClass0wJ.A0R(r2.A05).A0I = true;
        r2.A03.setVisibility(0);
        r2.A0D.setVisibility(8);
        r2.A06.A00();
        AnonymousClass1cX.A01(r2);
    }

    public final void Byu(AnonymousClass3DP r13) {
        AnonymousClass1cX r2 = this.A00;
        AnonymousClass10K r1 = r2.A07;
        r1.A05.BcA(new C37408JrQ("intro", r1.A08, "quick_conversion_settings", (String) null, (String) null, (Map) null, (Map) null, C67203z9.A01(r13)));
        if (r13 != null) {
            AnonymousClass0wJ.A0R(r2.A05).A07 = C67203z9.A00(r2.requireContext(), r13);
            AnonymousClass0wJ.A0R(r2.A05).A0E = r13.A0C;
        }
    }

    public final void Bys(AnonymousClass3XX r11) {
        String A02 = C63483hZ.A02(r11);
        String A01 = C63483hZ.A01(r11);
        AnonymousClass10K r1 = this.A00.A07;
        r1.A05.BcB(new C37408JrQ("intro", r1.A08, "quick_conversion_settings", A02, A01, (Map) null, (Map) null, (Map) null));
    }
}
