package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.intf.IgBloksScreenExitCallback;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.2zc  reason: invalid class name and case insensitive filesystem */
public final class C54542zc {
    public static void A00(FragmentActivity fragmentActivity, C11630kW r6, UserSession userSession, AnonymousClass20V r8, String str, String str2, String str3, String str4, String str5) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (str4 != null) {
            Map A04 = C63203gz.A04(C18230wP.A0n(r6));
            A04.put("selected_support_inbox_item_id", str4);
            Map A0E = AnonymousClass4WJ.A0E(A04);
            new C62743ad(fragmentActivity2, (IgBloksScreenExitCallback) null, r6, (C37383Jqm) null, userSession, new C29631yz(), (Boolean) null, AnonymousClass006.A01, "com.bloks.www.ig.ixt.triggers.screen.support_inbox", (String) null, A0E).A04();
            return;
        }
        C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, userSession);
        C34650Ica ica = new C34650Ica();
        Bundle A0E2 = AnonymousClass0wJ.A0E(userSession);
        A0E2.putString("SupportInboxDetailFragment.ARG_REPORTED_CONTENT_ID", str);
        A0E2.putString("SupportInboxDetailFragment.ARG_CTRL_TYPE", str3);
        A0E2.putString("SupportInboxDetailFragment.ARG_TICKET_ID", str2);
        A0E2.putString("SupportInboxDetailFragment.ARG_STORY_ID", str5);
        A0E2.putSerializable("SupportInboxDetailFragment.ARG_SOURCE", r8);
        C18180wK.A0x(A0E2, ica, A0Q);
    }
}
