package X;

import android.app.Activity;
import android.net.Uri;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.1hs  reason: invalid class name and case insensitive filesystem */
public final class C24311hs extends C63873iU {
    public Activity A00;
    public C11630kW A01;
    public UserSession A02;
    public ProgressButton A03;
    public AnonymousClass265 A04;

    public C24311hs(Activity activity, C11630kW r2, UserSession userSession, ProgressButton progressButton, AnonymousClass265 r5) {
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = progressButton;
    }

    public final void onFail(AnonymousClass3XX r15) {
        String str;
        int i;
        int A032 = C14030oh.A03(186434913);
        Activity activity = this.A00;
        if (activity.isFinishing()) {
            i = -1725588272;
        } else {
            ProgressButton progressButton = this.A03;
            if (progressButton != null) {
                progressButton.setShowProgressBar(false);
            }
            Object obj = r15.A00;
            if (obj != null) {
                str = ((AnonymousClass1j3) obj).getErrorMessage();
            } else {
                str = null;
            }
            UserSession userSession = this.A02;
            String str2 = this.A04.A01;
            C62323Yh.A00(userSession, Boolean.valueOf(AnonymousClass0wJ.A1Y(userSession, str2)), str2, "client_reg_register_feo2_service_fail", "register auto conf failed", "registration_flow", "ar_code_sms", (String) null, (String) null, str, (String) null);
            C67323zM.A06(activity, (Uri) null, this.A01, userSession);
            i = 1665026649;
        }
        C14030oh.A0A(i, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(858092601);
        super.onStart();
        ProgressButton progressButton = this.A03;
        if (progressButton != null) {
            progressButton.setShowProgressBar(true);
        }
        C14030oh.A0A(-1652722847, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = C14030oh.A03(404683185);
        int A033 = C14030oh.A03(-1301644236);
        Activity activity = this.A00;
        if (activity.isFinishing()) {
            i = 1279955873;
        } else {
            ProgressButton progressButton = this.A03;
            if (progressButton != null) {
                progressButton.setShowProgressBar(false);
            }
            C62323Yh r5 = C62323Yh.A00;
            UserSession userSession = this.A02;
            r5.A03(userSession, this.A04.A01, "client_reg_register_feo2_service_success", (String) null, "registration_flow", "ar_code_sms");
            C67323zM.A06(activity, (Uri) null, this.A01, userSession);
            i = 449275953;
        }
        C14030oh.A0A(i, A033);
        C14030oh.A0A(-1800902221, A032);
    }
}
