package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.proxygen.TraceEventType;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.433  reason: invalid class name */
public final class AnonymousClass433 implements C27794EtP {
    public static boolean A02;
    public final Activity A00;
    public final UserSession A01;

    public final void A00(C34640IcN icN, C312224t r7, int i, boolean z, boolean z2) {
        C04220Ms.A0B(r7, 1);
        Bundle A06 = C18180wK.A06();
        A06.putSerializable("entry_point", r7);
        A06.putBoolean("private_story_eligible_for_fb", z);
        A06.putBoolean("private_story_share_to_fb", z2);
        C63863iT A022 = C63863iT.A02(icN.getRootActivity(), A06, this.A01, ModalActivity.class, "private_story_audience_picker");
        A022.A0F();
        A022.A0J(icN, i);
    }

    public final void A01(C11630kW r4, C145538kf r5, User user, Integer num) {
        C04220Ms.A0B(user, 1);
        C32165H8c A002 = C34792Kx.A00(r4, this.A01, num, C06750aI.A18(user.getId()), AnonymousClass0wJ.A0v());
        C63873iU.A0F(A002, user, this, 14);
        r5.schedule(A002);
    }

    public final void BaO(C312224t r3) {
        C04220Ms.A0B(r3, 0);
        AnonymousClass2L1.A00(this.A00, r3, this.A01);
    }

    public AnonymousClass433(Activity activity, UserSession userSession) {
        AnonymousClass0wJ.A1O(activity, userSession);
        this.A00 = activity;
        this.A01 = userSession;
        if (C62203Xt.A00 == null) {
            C62203Xt.A00 = new C62203Xt();
        }
    }

    public final void A02(String str, String str2, String str3) {
        Bundle A06 = C18180wK.A06();
        A06.putString("event_source", str3);
        A06.putString(I17.A00(623), str);
        A06.putString(I17.A00(823), str2);
        Activity activity = this.A00;
        C63863iT A022 = C63863iT.A02(activity, A06, this.A01, ModalActivity.class, I17.A00(231));
        if (TraceEventType.Push.equals(TraceEventType.Push)) {
            A022.A0G();
        } else if (TraceEventType.Push.equals("modal")) {
            A022.A0F();
        }
        A022.A0I(activity);
    }

    public final void BsO(String str) {
        C18534AhA A002 = AnonymousClass3LM.A00();
        UserSession userSession = this.A01;
        Activity activity = this.A00;
        C63863iT A06 = C63863iT.A06(activity, A002.A04(C171799zz.A1p, userSession).A00(), userSession, TransparentModalActivity.class, "clips_camera");
        C63863iT.A0E(A06);
        A06.A0I(activity);
    }
}
