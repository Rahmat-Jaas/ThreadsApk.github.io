package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.google.common.collect.ImmutableList;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* renamed from: X.1hK  reason: invalid class name */
public final class AnonymousClass1hK extends C63873iU {
    public final C11630kW A00;
    public final UserSession A01;
    public final String A02;

    public AnonymousClass1hK(C11630kW r1, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void onFailInBackground(C26743EUq eUq) {
        int A03 = C14030oh.A03(509690672);
        AnonymousClass7GV.A01();
        C14030oh.A0A(-781200043, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        String str;
        int A03 = C14030oh.A03(-368562983);
        C21961Sv r14 = (C21961Sv) obj;
        int A032 = C14030oh.A03(1545869228);
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        C1366783w it = ImmutableList.copyOf((Collection) r14.A01).iterator();
        while (it.hasNext()) {
            AnonymousClass379 r1 = (AnonymousClass379) it.next();
            linkedList.add(r1.A01.A00.getId());
            linkedList2.add(r1.A01.A00.BK7());
        }
        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();
        C1366783w it2 = ImmutableList.copyOf((Collection) r14.A00).iterator();
        while (it2.hasNext()) {
            AnonymousClass3H7 r12 = (AnonymousClass3H7) it2.next();
            linkedList3.add(r12.A00());
            linkedList4.add(r12.A01());
        }
        UserSession userSession = this.A01;
        C11630kW r0 = this.A00;
        String str2 = this.A02;
        if (r0 != null) {
            str = r0.getModuleName();
        } else {
            str = null;
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_one_login_response_received"), 1394);
        C18250wR.A0y(A0I, str2);
        Set A002 = AnonymousClass3JN.A00(linkedList);
        AnonymousClass0A2 r2 = A0I.A00;
        r2.A7d(A002, "array_newly_logged_in_child_account_ids");
        r2.A7d(AnonymousClass3JN.A00(linkedList3), "array_newly_login_deferred_child_account_ids");
        C18210wN.A1C(A0I, str);
        ImmutableList<AnonymousClass379> copyOf = ImmutableList.copyOf((Collection) r14.A01);
        LinkedList linkedList5 = new LinkedList();
        for (AnonymousClass379 r5 : copyOf) {
            User user = r5.A01.A00;
            linkedList5.add(user.getId());
            userSession.multipleAccountHelper.A00.A07(user);
            String str3 = r5.A00.A00.A00;
            C61793Vp A003 = C61793Vp.A00(userSession);
            String id = user.getId();
            AnonymousClass7Ko.A0B(!id.equals(A003.A02));
            C18180wK.A0v(A003.A00.edit(), id, str3);
        }
        List list = ((C551932d) userSession.A01(C551932d.class, AnonymousClass4UU.A00)).A00;
        list.clear();
        list.addAll(linkedList5);
        AnonymousClass0BO r02 = userSession.multipleAccountHelper;
        C04620Ok r52 = C06810aP.A01;
        r02.A00.A07(r52.A01(userSession));
        AnonymousClass7GV.A01();
        ImmutableList<AnonymousClass3H7> copyOf2 = ImmutableList.copyOf((Collection) r14.A00);
        for (AnonymousClass3H7 r13 : copyOf2) {
            r13.A01 = userSession.getUserId();
        }
        C62353Yv.A00(userSession).A03(copyOf2);
        AnonymousClass49X.A02(userSession);
        AnonymousClass3LY.A00(userSession).CWx(new AnonymousClass46R(r52.A01(userSession)));
        AnonymousClass3LY.A00(userSession).CWx(new AnonymousClass46X(r52.A01(userSession), linkedList2, linkedList4, linkedList, linkedList3));
        C14030oh.A0A(-1836382614, A032);
        C14030oh.A0A(467315173, A03);
    }
}
