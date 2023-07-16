package X;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.task.IDxLTaskShape48S0200000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.3TE  reason: invalid class name */
public final class AnonymousClass3TE {
    public boolean A00 = false;
    public boolean A01 = false;
    public final FragmentActivity A02;
    public final C30938GbW A03;
    public final UserSession A04;
    public final C23411dm A05;

    public static void A00(AnonymousClass3TE r5, Map map) {
        C23411dm r3 = r5.A05;
        C18330wh A012 = C18330wh.A01(r3);
        C18330wh.A02(r3.requireActivity(), A012, 2131830080);
        C13950oZ.A00(A012);
        AnonymousClass4A9 A002 = C63263h8.A00(r5.A04, "com.instagram.settings.about_actions", map);
        AnonymousClass4A9.A01(A002, A012, r5, 14);
        r3.schedule(A002);
    }

    public AnonymousClass3TE(UserSession userSession, C23411dm r5) {
        this.A05 = r5;
        this.A04 = userSession;
        this.A03 = C29781Fu1.A00();
        this.A02 = r5.getActivity();
        C62293Yd A002 = C62293Yd.A00(r5.requireContext().getApplicationContext());
        this.A01 = A002.A01();
        IDxLTaskShape48S0200000_1_I2 iDxLTaskShape48S0200000_1_I2 = new IDxLTaskShape48S0200000_1_I2(4, this, A002);
        C23411dm r0 = this.A05;
        C31155GhB.A01(r0.getContext(), AnonymousClass06E.A00(r0), iDxLTaskShape48S0200000_1_I2);
        this.A00 = AnonymousClass0wJ.A1X(AnonymousClass3WI.A00(userSession).A04.get());
        AnonymousClass4UE r02 = AnonymousClass3WI.A00(userSession).A0B;
        TextUtils.isEmpty((String) r02.A00.A01(r02.A01));
    }
}
