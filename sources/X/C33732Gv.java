package X;

import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2Gv  reason: invalid class name and case insensitive filesystem */
public final class C33732Gv {
    public static final Object A00(AnonymousClass601 r6, C63893iY r7) {
        C313625r r0;
        Object A0B = C63893iY.A0B(r7, AnonymousClass0wJ.A1Y(r7, r6) ? 1 : 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
        RegFlowExtras regFlowExtras = (RegFlowExtras) C63913ic.A0F(r6).A01(RegFlowExtras.class, AnonymousClass4b7.A00);
        Iterator A0z = AnonymousClass0wJ.A0z((Map) A0B);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            String A0p = C18200wM.A0p(A0o);
            Object value = A0o.getValue();
            if (A0p != null) {
                switch (A0p.hashCode()) {
                    case -1813199520:
                        if (!A0p.equals("force_signup_code")) {
                            break;
                        } else {
                            C04220Ms.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0B = (String) value;
                            break;
                        }
                    case -1615090447:
                        if (!A0p.equals("tos_version")) {
                            break;
                        } else {
                            C04220Ms.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0X = (String) value;
                            break;
                        }
                    case -757782465:
                        if (!A0p.equals("gdpr_required")) {
                            break;
                        } else {
                            C04220Ms.A0C(value, "null cannot be cast to non-null type kotlin.Boolean");
                            regFlowExtras.A0m = AnonymousClass0wJ.A1X(value);
                            break;
                        }
                    case -570881039:
                        if (!A0p.equals("gdpr_state")) {
                            break;
                        } else {
                            C04220Ms.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0C = (String) value;
                            break;
                        }
                    case 3146030:
                        if (!A0p.equals("flow")) {
                            break;
                        } else {
                            C04220Ms.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            if (!C04220Ms.A0I(value, "phone")) {
                                if (!C04220Ms.A0I(value, "email")) {
                                    break;
                                } else {
                                    r0 = C313625r.EMAIL;
                                }
                            } else {
                                r0 = C313625r.PHONE;
                            }
                            regFlowExtras.A03(r0);
                            break;
                        }
                    case 96619420:
                        if (!A0p.equals("email")) {
                            break;
                        } else {
                            C04220Ms.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A08 = (String) value;
                            break;
                        }
                    case 558076639:
                        if (!A0p.equals("age_required")) {
                            break;
                        } else {
                            C04220Ms.A0C(value, "null cannot be cast to non-null type kotlin.Boolean");
                            regFlowExtras.A0g = AnonymousClass0wJ.A1X(value);
                            break;
                        }
                    case 1174780724:
                        if (!A0p.equals("sms_consent")) {
                            break;
                        } else {
                            C04220Ms.A0C(value, "null cannot be cast to non-null type kotlin.Boolean");
                            regFlowExtras.A0p = AnonymousClass0wJ.A1X(value);
                            break;
                        }
                    case 1274229687:
                        if (!A0p.equals("confirmation_code")) {
                            break;
                        } else {
                            C04220Ms.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A05 = (String) value;
                            break;
                        }
                    case 1663300947:
                        if (!A0p.equals("country_code_data")) {
                            break;
                        } else {
                            C04220Ms.A0C(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) value;
                            String A0r = C18220wO.A0r("country_number", map);
                            String A0r2 = C18220wO.A0r("country", map);
                            String A0r3 = C18220wO.A0r("display_string", map);
                            if (!(A0r == null || A0r3 == null || A0r2 == null)) {
                                regFlowExtras.A01 = new CountryCodeData(A0r, A0r3, A0r2);
                                break;
                            }
                        }
                    case 1821199090:
                        if (!A0p.equals("phone_number_without_country_code")) {
                            break;
                        } else {
                            C04220Ms.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0R = (String) value;
                            break;
                        }
                    case 1980340746:
                        if (!A0p.equals("phone_number_with_country_code")) {
                            break;
                        } else {
                            C04220Ms.A0C(value, "null cannot be cast to non-null type kotlin.String");
                            regFlowExtras.A0Q = (String) value;
                            break;
                        }
                }
            }
        }
        return null;
    }
}
