package X;

import com.instagram.model.venue.Venue;

/* renamed from: X.4Dd  reason: invalid class name and case insensitive filesystem */
public final class C70204Dd implements Bx5 {
    public final /* synthetic */ C34628Ic3 A00;

    public C70204Dd(C34628Ic3 ic3) {
        this.A00 = ic3;
    }

    public final void C2Q(AnonymousClass1U8 r4) {
        C34628Ic3 ic3 = this.A00;
        ic3.A0C = r4;
        E2V.A0G(C18190wL.A0M(ic3));
        AnonymousClass3VI r1 = ic3.A0A;
        r1.A04 = "fetch_data";
        r1.A07 = "location_page";
        r1.A01 = "view_information";
        r1.A06 = ic3.A0I;
        Venue venue = ic3.A0E;
        if (venue != null) {
            r1.A05 = venue.A04();
        }
        r1.A00();
    }

    public final void C2R(String str) {
        C34628Ic3 ic3 = this.A00;
        AnonymousClass3VI r1 = ic3.A0A;
        r1.A04 = "fetch_data_error";
        r1.A07 = "location_page";
        r1.A01 = "view_information";
        r1.A06 = ic3.A0I;
        r1.A03 = str;
        Venue venue = ic3.A0E;
        if (venue != null) {
            r1.A05 = venue.A04();
        }
        r1.A00();
    }
}
