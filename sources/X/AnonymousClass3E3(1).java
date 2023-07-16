package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.service.session.UserSession;
import com.instagram.wellbeing.scc.impl.SensitiveContentControlPluginImpl$IXTScreenExitCallback;
import java.util.HashMap;

/* renamed from: X.3E3  reason: invalid class name */
public final class AnonymousClass3E3 {
    public static AnonymousClass3E3 A00;

    public final Fragment A00(FragmentActivity fragmentActivity, C11630kW r8, UserSession userSession, String str, String str2, String str3, HashMap hashMap) {
        boolean A1Y = AnonymousClass0wJ.A1Y(fragmentActivity, userSession);
        AnonymousClass01V.A0p.markerStart(790826917, A1Y ? 1 : 0);
        AnonymousClass01V r2 = AnonymousClass01V.A0p;
        r2.markerAnnotate(790826917, C61973Wo.A01(174, 10, 9), (int) A1Y);
        r2.markerAnnotate(790826917, "analytics_module", r8.getModuleName());
        r2.markerAnnotate(790826917, "location", str);
        r2.markerAnnotate(790826917, "entry_point", str2);
        r2.markerAnnotate(790826917, "nua_action", str3);
        C63743iE A02 = C63743iE.A02("com.instagram.sensitive_content_control.sensitive_content_control_setting", hashMap);
        IgBloksScreenConfig A0N = C18190wL.A0N(userSession);
        C18210wN.A0s(fragmentActivity, A0N, 2131829626);
        A0N.A04 = SensitiveContentControlPluginImpl$IXTScreenExitCallback.A00;
        A0N.A0h = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 2342162090187297680L);
        return C62853b1.A02(A0N, A02);
    }
}
