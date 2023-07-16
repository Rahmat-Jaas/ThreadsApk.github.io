package X;

import java.util.Map;

/* renamed from: X.7sE  reason: invalid class name and case insensitive filesystem */
public final class C131517sE implements C82404pZ {
    public final /* synthetic */ C110916mU A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C86054wC A03;

    public C131517sE(C110916mU r1, String str, String str2, C86054wC r4) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = r1;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        if (!((C40289Lbs) obj).A01) {
            AnonymousClass68V r5 = AnonymousClass68V.ITEM_TYPE_INAPP;
            String str = this.A02;
            String str2 = this.A01;
            C110916mU r0 = this.A00;
            r0.A04.BaP(r0.A00, new C22153CJj(r5, str, AnonymousClass00U.A0j("{\"sku\":\"", str, "\",\"product_id\":\"", str2, "\",\"product_session_id\":\"", r0.A06, "\"}"), str2, (String) null, (Map) null, 2024), new C127067gV(this.A03), (AnonymousClass34X) null);
            return;
        }
        C86054wC r2 = this.A03;
        r2.D7w(new AnonymousClass5LK());
        r2.ADR((Throwable) null);
    }
}
