package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.4D8  reason: invalid class name */
public final class AnonymousClass4D8 implements C39777Kzl {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public final void onDismiss() {
    }

    public final void onShow() {
    }

    public AnonymousClass4D8(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = fragmentActivity;
    }

    public final void onButtonClick(View view) {
        UserSession userSession = this.A01;
        AnonymousClass3Ui.A00(C60583Pr.A01(userSession), C63823iP.A05(userSession), (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, "ig_quiet_mode_confirmation_toast_edit_tap", this.A02, (Map) null, 4088);
        FragmentActivity fragmentActivity = this.A00;
        C63863iT.A04(fragmentActivity, C18180wK.A06(), userSession, ModalActivity.class, "time_spent_dashboard").A0I(fragmentActivity);
    }
}
