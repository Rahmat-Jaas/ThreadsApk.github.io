package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4Gb  reason: invalid class name and case insensitive filesystem */
public final class C70774Gb implements C85804vn {
    public static final String __redex_internal_original_name = "QPClientDebugLoggerImpl";
    public final UserSession A00;

    public final void BbU(String str, String str2, Map map) {
        Bc5("cache_state_invalid", (String) null, str2, (List) null, (List) null, A00(map), A01(map), true);
    }

    public final void Bbi(AnonymousClass3VC r13, String str, String str2, Collection collection, Collection collection2, List list) {
        List<C81644o8> list2 = list;
        ArrayList A0x = AnonymousClass0wJ.A0x(list2, 10);
        for (C81644o8 r0 : list2) {
            A0x.add(((C28291u0) r0).A0D);
        }
        Set A0c = AnonymousClass00J.A0c(A0x);
        ArrayList<QuickPromotionSurface> A0s = C18200wM.A0s(r13.A02.keySet());
        ArrayList A0x2 = AnonymousClass0wJ.A0x(A0s, 10);
        for (QuickPromotionSurface A002 : A0s) {
            A0x2.add(r13.A00(A002));
        }
        List<C81644o8> A10 = C02260Al.A10(A0x2);
        ArrayList A0x3 = AnonymousClass0wJ.A0x(A10, 10);
        for (C81644o8 r02 : A10) {
            A0x3.add(((C28291u0) r02).A0D);
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = A0x3.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C18240wQ.A1N(next, A0v, A0c.contains(next) ? 1 : 0);
        }
        boolean A1K = C18250wR.A1K(A0v);
        Collection<QuickPromotionSurface> collection3 = collection;
        ArrayList A0x4 = AnonymousClass0wJ.A0x(collection3, 10);
        for (QuickPromotionSurface quickPromotionSurface : collection3) {
            A0x4.add(String.valueOf(quickPromotionSurface.A00));
        }
        List<Trigger> A102 = C02260Al.A10(collection2);
        ArrayList A0x5 = AnonymousClass0wJ.A0x(A102, 10);
        for (Trigger trigger : A102) {
            A0x5.add(trigger.A01);
        }
        Bc5("clash_manage_resuts", (String) null, str2, A0v, A0x, A0x4, A0x5, A1K);
    }

    public final void Bc0(String str, String str2, Map map) {
        List list;
        List list2;
        if (map != null) {
            list = A00(map);
            list2 = A01(map);
        } else {
            list = null;
            list2 = null;
        }
        Bc5("on_error", (String) null, str2, (List) null, (List) null, list, list2, true);
    }

    public final void Bc5(String str, String str2, String str3, List list, List list2, List list3, List list4, boolean z) {
        C04220Ms.A0B(str, 0);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(this, this.A00), "instagram_quick_promotion_client_debug"), 1967);
        if (AnonymousClass0wJ.A1U(A0I)) {
            A0I.A0Q("dropoff_occurred", C18190wL.A0Z(A0I, "step_name", str, z));
            A0I.A0U("dropped_qp_ids", list);
            A0I.A0U("passed_qp_ids", list2);
            A0I.A0T("payload_id", (String) null);
            A0I.A0T("slot", str3);
            A0I.A0U("surfaces", list3);
            A0I.A0U("trigger_fired", list4);
            A0I.Bb4();
        }
    }

    public final void BcG(C81644o8 r10, Integer num, String str, String str2, boolean z) {
        String str3;
        AnonymousClass0wJ.A1M(num, 0, r10);
        String str4 = str2;
        C04220Ms.A0B(str2, 4);
        List A0n = C18180wK.A0n(((C28291u0) r10).A0D);
        List list = null;
        List list2 = A0n;
        boolean z2 = z;
        if (z) {
            list2 = null;
            list = A0n;
        }
        switch (num.intValue()) {
            case 0:
                str3 = "handle_megaphone";
                break;
            case 1:
                str3 = "handle_message_footer";
                break;
            case 2:
                str3 = "handle_floating_banner";
                break;
            case 3:
                str3 = "handle_rtc_peek";
                break;
            case 4:
                str3 = "handle_tooltip";
                break;
            case 5:
                str3 = "handle_interstitial";
                break;
            case 6:
                str3 = "handle_reels_midcard";
                break;
            default:
                str3 = "handle_bottomsheet";
                break;
        }
        Bc5(str3, (String) null, str4, list, list2, (List) null, (List) null, z2);
    }

    public final void Bd2(String str, String str2, Map map) {
        Bc5("killswitch_enabled", (String) null, str2, (List) null, (List) null, A00(map), A01(map), true);
    }

    public final void Bd5(String str, String str2, Map map) {
        Bc5("local_fetch_scheduled", (String) null, str2, (List) null, (List) null, A00(map), A01(map), false);
    }

    public final void BdF(String str, String str2, Map map) {
        List list;
        List list2;
        if (map != null) {
            list = A00(map);
            list2 = A01(map);
        } else {
            list = null;
            list2 = null;
        }
        Bc5("no_promotions", (String) null, str2, (List) null, (List) null, list, list2, true);
    }

    public final void BdJ(AnonymousClass3VC r12, String str, String str2, Map map) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (QuickPromotionSurface A002 : C18200wM.A0s(r12.A02.keySet())) {
            List<C81644o8> A003 = r12.A00(A002);
            C04220Ms.A06(A003);
            ArrayList A0w = AnonymousClass0wJ.A0w(A003);
            for (C81644o8 r0 : A003) {
                A0w.add(((C28291u0) r0).A0D);
            }
            A0v.addAll(A0w);
        }
        Bc5("promotions_available", (String) null, str2, (List) null, A0v, A00(map), A01(map), false);
    }

    public final void BdX(String str, String str2, Map map) {
        Bc5("remote_fetch_scheduled", (String) null, str2, (List) null, (List) null, A00(map), A01(map), false);
    }

    public final void Bda(String str, String str2, Map map, boolean z) {
        Bc5("request_in_progress", (String) null, str2, (List) null, (List) null, A00(map), A01(map), z);
    }

    public final void Bdp(String str, String str2, Set set, boolean z) {
        ArrayList A0w = AnonymousClass0wJ.A0w(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A0w.add(((Trigger) it.next()).A01);
        }
        Bc5("slot_cooldown", (String) null, str2, (List) null, (List) null, (List) null, A0w, z);
    }

    public final String getModuleName() {
        return "quick_promotion";
    }

    public C70774Gb(UserSession userSession) {
        this.A00 = userSession;
    }

    public static final List A00(Map map) {
        Set<QuickPromotionSurface> keySet = map.keySet();
        ArrayList A0w = AnonymousClass0wJ.A0w(keySet);
        for (QuickPromotionSurface quickPromotionSurface : keySet) {
            A0w.add(String.valueOf(quickPromotionSurface.A00));
        }
        return A0w;
    }

    public static final List A01(Map map) {
        List<Trigger> A10 = C02260Al.A10(map.values());
        ArrayList A0w = AnonymousClass0wJ.A0w(A10);
        for (Trigger trigger : A10) {
            A0w.add(trigger.A01);
        }
        return A0w;
    }
}
