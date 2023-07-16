package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxDListenerShape320S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.0wg  reason: invalid class name and case insensitive filesystem */
public final class C18320wg extends Dialog {
    public UserSession A00;

    public static void A00(C18320wg r3, Integer num) {
        String str;
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r3.A00), "instagram_android_13_notifications_priming_event"), 1687);
        if (AnonymousClass0wJ.A1U(A0I)) {
            switch (C18240wQ.A05(A0I, num, "experiment_group", C63173fJ.A04(AnonymousClass0TJ.A05, 18867898705838362L))) {
                case 4:
                    str = "mock_system_dialog_impression";
                    break;
                case 5:
                    str = "mock_system_dialog_accept_clicked";
                    break;
                case 6:
                    str = "mock_system_dialog_deny_clicked";
                    break;
                default:
                    str = "mock_system_dialog_dismissed";
                    break;
            }
            C18230wP.A1G(A0I, str);
            A0I.Bb4();
        }
    }

    public C18320wg(Activity activity, UserSession userSession) {
        super(activity);
        this.A00 = userSession;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.android13_permission_mock_dialog);
        setCanceledOnTouchOutside(true);
        TextView textView = (TextView) findViewById(R.id.title);
        View findViewById = findViewById(R.id.accept_button);
        View findViewById2 = findViewById(R.id.deny_button);
        if (textView == null || findViewById == null || findViewById2 == null || this.A00 == null) {
            C10450iM.A03("Android13PermissionMockDialog", "screen initial failed");
            return;
        }
        A00(this, AnonymousClass006.A0Y);
        C18200wM.A18(getContext().getResources(), textView, 2131821335);
        AnonymousClass0wJ.A16(findViewById, 264, this);
        AnonymousClass0wJ.A16(findViewById2, 265, this);
        setOnDismissListener(new IDxDListenerShape320S0100000_1_I2(this, 0));
    }

    public final void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
        C08350dD A002 = C08360dF.A00();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = A002.A00;
        AnonymousClass0wJ.A12(sharedPreferences.edit(), "mock_system_notification_permission_dialog_last_shown_timestamp", currentTimeMillis);
        AnonymousClass0wJ.A14(sharedPreferences, "eligible_to_mock_notification_dialog_shown_count", 0);
    }
}
