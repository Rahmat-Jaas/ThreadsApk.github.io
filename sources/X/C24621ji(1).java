package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.1ji  reason: invalid class name and case insensitive filesystem */
public final class C24621ji extends C19819BBt {
    public FragmentActivity A00;
    public UserSession A01;

    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle extras;
        Integer num;
        AnonymousClass3TR r2;
        if (i == 14165 && i2 == -1) {
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A01;
            if (intent != null && (extras = intent.getExtras()) != null) {
                int i3 = extras.getInt("UPGRADE_STATUS");
                String string = extras.getString("static_source_upsell");
                String string2 = extras.getString("qp_source_upsell");
                if (i3 == 0) {
                    num = AnonymousClass006.A00;
                } else if (i3 == 1) {
                    num = AnonymousClass006.A01;
                } else if (i3 == 2) {
                    num = AnonymousClass006.A0C;
                } else if (i3 == 3) {
                    num = AnonymousClass006.A0N;
                } else {
                    throw C18190wL.A0a(AnonymousClass00U.A0J(I17.A00(44), i3));
                }
                AnonymousClass3DE r3 = new AnonymousClass3DE(string2, string);
                boolean z = extras.getBoolean("suppress_messaging_updated_toast");
                int intValue = num.intValue();
                if (intValue == 2) {
                    r2 = AnonymousClass3WL.A02(fragmentActivity.getResources(), new AnonymousClass4DD(fragmentActivity, r3, userSession));
                } else if (intValue == 1) {
                    r2 = C63733iD.A03(fragmentActivity).A0B();
                } else if (intValue == 0 && !z) {
                    C35082Ma.A00(fragmentActivity, E2V.A03(fragmentActivity).A0O.getMeasuredHeight());
                    return;
                } else {
                    return;
                }
                C38040KHr.A01.CWx(new H4Q(r2));
            }
        }
    }

    public C24621ji(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
