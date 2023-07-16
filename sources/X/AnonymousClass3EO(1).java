package X;

import android.os.Bundle;
import com.facebook.redex.IDxECallbackShape789S0100000_6_I2;
import com.instagram.model.venue.Venue;
import java.util.Map;

/* renamed from: X.3EO  reason: invalid class name */
public final class AnonymousClass3EO {
    public final /* synthetic */ C34628Ic3 A00;

    public AnonymousClass3EO(C34628Ic3 ic3) {
        this.A00 = ic3;
    }

    public final void A00() {
        String str;
        C34628Ic3 ic3 = this.A00;
        if (ic3.A0C != null) {
            C25787Ds0 ds0 = C25787Ds0.A00;
            C23381dg r4 = new C23381dg();
            r4.A01 = ic3.A0C;
            r4.A00 = ic3.A0A;
            Bundle A06 = C18180wK.A06();
            A06.putString("location_id_key", ic3.A0I);
            Venue venue = ic3.A0E;
            if (venue != null) {
                A06.putString("fb_page_id_key", venue.A04());
            }
            A06.putString("info_page_logging_entry_point", "location_page");
            r4.setArguments(A06);
            C25786Drz A0Q = AnonymousClass0wJ.A0Q(ic3.getActivity(), ic3.A0G);
            A0Q.A03 = r4;
            A0Q.A0C(ic3, 0);
            A0Q.A04 = new IDxECallbackShape789S0100000_6_I2(ic3, 1);
            A0Q.A05();
            AnonymousClass3VI r42 = ic3.A0A;
            String str2 = ic3.A0I;
            Venue venue2 = ic3.A0E;
            if (venue2 != null) {
                str = venue2.A04();
            } else {
                str = null;
            }
            r42.A01((C15680ri) null, "location_page", "tap_component", "view_information", str2, str, (String) null, (Map) null);
        }
    }
}
