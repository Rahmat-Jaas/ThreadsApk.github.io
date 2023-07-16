package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.google.common.collect.ImmutableList;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3h6  reason: invalid class name and case insensitive filesystem */
public final class C63243h6 {
    public static final C63243h6 A00 = new C63243h6();

    public static final Map A00(ImmutableList immutableList, ImmutableList immutableList2) {
        AnonymousClass28T r0;
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (immutableList.size() == immutableList2.size()) {
            int size = immutableList2.size();
            for (int i = 0; i < size; i++) {
                Object obj = immutableList.get(i);
                C04220Ms.A06(obj);
                AnonymousClass29J r2 = (AnonymousClass29J) obj;
                int ordinal = r2.ordinal();
                if (!(ordinal == 0 || ordinal == 1)) {
                    r2 = AnonymousClass29J.AVATAR;
                }
                Object obj2 = immutableList2.get(i);
                C04220Ms.A06(obj2);
                if (((AnonymousClass218) obj2).ordinal() == 1) {
                    r0 = AnonymousClass28T.FACEBOOK;
                } else {
                    r0 = AnonymousClass28T.INSTAGRAM;
                }
                A0y.put(r2, r0);
            }
        }
        return A0y;
    }

    public static final void A01(AnonymousClass2A7 r3, AnonymousClass2A6 r4, UserSession userSession, Map map) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "fx_identity_product"), 685);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0O(r3, "fx_im_logger_events");
            A0I.A0O(r4, "flow_type");
            A0I.A0O(C317028q.INSTAGRAM, "initiator_account_type");
            A0I.A0S("initiator_account_id", AnonymousClass0wJ.A0d(userSession.getUserId()));
            A0I.A0S("target_identity_id", (Long) null);
            A0I.A0V("target_identity_resource_source_of_truth", map);
            A0I.Bb4();
        }
    }

    public static final void A02(AnonymousClass2A7 r6, C319129l r7, UserSession userSession) {
        AnonymousClass28S r1;
        AnonymousClass0wJ.A1N(userSession, r6);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "fx_identity_product"), 685);
        A0I.A0O(r6, "fx_im_logger_events");
        A0I.A0O(AnonymousClass2A6.A02, "flow_type");
        A0I.A0O(C317028q.INSTAGRAM, "initiator_account_type");
        A0I.A0S("initiator_account_id", AnonymousClass0wJ.A0d(userSession.getUserId()));
        A0I.A0O(r7, "type_of_reminder");
        HashMap A0y = AnonymousClass0wJ.A0y();
        HashMap hashMap = null;
        try {
            long parseLong = Long.parseLong(userSession.getUserId());
            AnonymousClass266 A0g = AnonymousClass0wJ.A0Y(userSession).A0g();
            if (AnonymousClass266.A05 == A0g) {
                r1 = AnonymousClass28S.IG_CREATOR;
            } else if (AnonymousClass266.A04 == A0g) {
                r1 = AnonymousClass28S.IG_BUSINESS;
            } else {
                C10450iM.A03("FxImLogger", AnonymousClass0wJ.A0t("UserAccountType expected to be MEDIA_CREATOR or BUSINESS, but got: ", A0g));
                A0I.A0V("target_identity_info", hashMap);
                A0I.Bb4();
            }
            A0y.put(Long.valueOf(parseLong), r1);
            hashMap = A0y;
        } catch (NumberFormatException e) {
            C10450iM.A03("FxImLogger", C18230wP.A0t("Error parsing userid to long: ", e));
        }
        A0I.A0V("target_identity_info", hashMap);
        A0I.Bb4();
    }

    public static final void A03(AnonymousClass2A7 r3, C319129l r4, UserSession userSession) {
        AnonymousClass0wJ.A1N(userSession, r3);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "fx_identity_product"), 685);
        A0I.A0O(r3, "fx_im_logger_events");
        A0I.A0O(AnonymousClass2A6.A07, "flow_type");
        A0I.A0O(C317028q.INSTAGRAM, "initiator_account_type");
        A0I.A0S("initiator_account_id", AnonymousClass0wJ.A0d(userSession.getUserId()));
        A0I.A0O(r4, "type_of_reminder");
        A0I.Bb4();
    }
}
