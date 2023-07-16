package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3Zj  reason: invalid class name and case insensitive filesystem */
public final class C62383Zj {
    public static final void A00(C318729h r2, AnonymousClass2A9 r3, AnonymousClass2A8 r4, C10300i6 r5, Map map) {
        AnonymousClass0wJ.A1O(r4, r3);
        C04220Ms.A0B(r2, 3);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r5), "fx_upsells_product"), 692);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18220wO.A1D(r4, A0I);
            A0I.A0O(r3, "upsell_flow_entry_point");
            A0I.A0O(r2, "upsell_type");
            C18220wO.A1G(A0I, map);
        }
    }

    public static final void A01(AnonymousClass2A9 r3, AnonymousClass2A8 r4, C10300i6 r5) {
        AnonymousClass0wJ.A1N(r5, r4);
        C04220Ms.A0B(r3, 2);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r5), "fx_upsells_product"), 692);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18220wO.A1D(r4, A0I);
            A0I.A0O(r3, "upsell_flow_entry_point");
            A0I.A0O(C318729h.CAL_FLOW, "upsell_type");
            A0I.Bb4();
        }
    }

    public static final void A02(AnonymousClass2A9 r3, AnonymousClass2A8 r4, C10300i6 r5, Map map) {
        AnonymousClass0wJ.A1O(r4, r3);
        C04220Ms.A0B(map, 3);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r5), "fx_upsells_product"), 692);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18220wO.A1D(r4, A0I);
            A0I.A0O(r3, "upsell_flow_entry_point");
            A0I.A0O(C318729h.CAL_FLOW, "upsell_type");
            C18220wO.A1G(A0I, map);
        }
    }

    public static final void A03(AnonymousClass2A8 r3, C10300i6 r4, Boolean bool, String str) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (str != null) {
            A0y.put("source", str);
        }
        if (bool != null) {
            A0y.put("contact_point_claiming", bool.toString());
        }
        A00(C318729h.CAL_FLOW, AnonymousClass2A9.A0A, r3, r4, A0y);
    }
}
