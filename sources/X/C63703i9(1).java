package X;

import android.content.SharedPreferences;
import com.instagram.model.shopping.ProductSource;
import com.instagram.service.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3i9  reason: invalid class name and case insensitive filesystem */
public final class C63703i9 {
    public static final C63703i9 A00 = new C63703i9();

    public static final synchronized SharedPreferences A00(C63703i9 r3, UserSession userSession) {
        SharedPreferences A02;
        synchronized (r3) {
            A02 = AnonymousClass3Zs.A03(userSession).A02(D2R.A23, C63703i9.class);
        }
        return A02;
    }

    public static SharedPreferences A01(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return A00(A00, userSession);
    }

    public static final ProductSource A02(UserSession userSession) {
        SharedPreferences A002;
        String str;
        C04220Ms.A0B(userSession, 0);
        C171179wC A03 = A03(userSession);
        int ordinal = A03.ordinal();
        String str2 = null;
        if (ordinal != 1) {
            if (ordinal == 2) {
                A002 = A00(A00, userSession);
                str = "shopping_collection_id";
            }
            return new ProductSource(A03, str2);
        }
        A002 = A00(A00, userSession);
        str = "shopping_brand_id";
        String string = A002.getString(str, (String) null);
        if (string == null) {
            return null;
        }
        str2 = string;
        return new ProductSource(A03, str2);
    }

    public static final void A06(UserSession userSession) {
        AnonymousClass0wJ.A13(A01(userSession).edit(), "has_entered_pdp_via_product_sticker", true);
    }

    public static final void A08(UserSession userSession, AnonymousClass36K r7) {
        C04220Ms.A0B(userSession, 0);
        try {
            SharedPreferences.Editor edit = A00(A00, userSession).edit();
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            if (r7.A00 != null) {
                A0K.A0U("incentives_nux_last_seen_times");
                A0K.A0J();
                Iterator A0u = C18190wL.A0u(r7.A00);
                while (A0u.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0u);
                    A0K.A0U(C18200wM.A0p(A0o));
                    if (A0o.getValue() == null) {
                        A0K.A0H();
                    } else {
                        A0K.A0O(C18190wL.A08(A0o.getValue()));
                    }
                }
                A0K.A0G();
            }
            C18180wK.A0v(edit, "incentives_nux_metadata", C18180wK.A0h(A0K, A0d));
        } catch (IOException unused) {
            C10450iM.A03("ShoppingPreferences", "Could not serialize json for incentives nux metadata");
        }
    }

    public static final void A09(UserSession userSession, AnonymousClass36L r7) {
        C04220Ms.A0B(userSession, 0);
        try {
            SharedPreferences.Editor edit = A00(A00, userSession).edit();
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            if (r7.A00 != null) {
                A0K.A0U("incentives_offers_last_seen_times");
                A0K.A0J();
                Iterator A0u = C18190wL.A0u(r7.A00);
                while (A0u.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(A0u);
                    A0K.A0U(C18200wM.A0p(A0o));
                    if (A0o.getValue() == null) {
                        A0K.A0H();
                    } else {
                        A0K.A0O(C18190wL.A08(A0o.getValue()));
                    }
                }
                A0K.A0G();
            }
            C18180wK.A0v(edit, "incentives_offer_metadata", C18180wK.A0h(A0K, A0d));
        } catch (IOException unused) {
            C10450iM.A03("ShoppingPreferences", "Could not serialize json for incentives offer metadata.");
        }
    }

    public static final C171179wC A03(UserSession userSession) {
        String A0h = C18200wM.A0h(A01(userSession), "last_selected_product_source_type");
        if (A0h != null) {
            C171179wC A002 = C171179wC.A00(A0h);
            C04220Ms.A06(A002);
            return A002;
        }
        C04620Ok r1 = C06810aP.A01;
        if (r1.A01(userSession).A2p() || r1.A01(userSession).A2o()) {
            return C171179wC.BRAND;
        }
        return C171179wC.CATALOG;
    }

    public static final AnonymousClass36K A04(UserSession userSession) {
        String string = A01(userSession).getString("incentives_nux_metadata", (String) null);
        if (string != null) {
            try {
                return C49902s8.parseFromJson(C18180wK.A0L(string));
            } catch (IOException unused) {
                C10450iM.A03("ShoppingPreferences", "Could not parse json for incentive nux metadata");
            }
        }
        return null;
    }

    public static final AnonymousClass36L A05(UserSession userSession) {
        String string = A01(userSession).getString("incentives_offer_metadata", (String) null);
        if (string != null) {
            try {
                return C49912s9.parseFromJson(C18180wK.A0L(string));
            } catch (IOException unused) {
                C10450iM.A03("ShoppingPreferences", "Could not parse json for incentives offer metadata.");
            }
        }
        return null;
    }

    public static final void A07(UserSession userSession, long j) {
        AnonymousClass0wJ.A12(A01(userSession).edit(), "ig_funded_incentive_pdp_banner_last_seen_time", j);
    }
}
