package com.instagram.settings.activity;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C11630kW;
import X.C14030oh;
import X.C18190wL;
import X.C18230wP;
import X.C18240wQ;
import X.C63493hb;
import X.C64543mW;
import X.KJ8;
import android.os.Bundle;
import android.view.MotionEvent;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;

public final class NotificationSettingsHandlerActivity extends IgFragmentActivity implements C11630kW {
    public final C04530Oa A00 = C18240wQ.A0l(AnonymousClass006.A0C, this, 8);

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C04220Ms.A0B(motionEvent, 0);
        C64543mW.A01(C64543mW.A00(AnonymousClass0wJ.A0U(this.A00)), AnonymousClass006.A01, System.currentTimeMillis());
        return super.dispatchTouchEvent(motionEvent);
    }

    public final String getModuleName() {
        return "notification_settings_handler";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-1897045012);
        super.onCreate(bundle);
        setTheme(R.style.IgPanorama);
        setContentView((int) R.layout.activity_single_container);
        C04530Oa r1 = this.A00;
        if (r1.getValue() instanceof UserSession) {
            UserSession A0Z = C18230wP.A0Z();
            if ("android.intent.action.MAIN".equals(getIntent().getAction()) && getIntent().hasCategory("android.intent.category.NOTIFICATION_PREFERENCES")) {
                KJ8.A0G.A0G(getIntent(), AnonymousClass006.A0Y);
                C63493hb.A03(this, A0Z);
            }
        } else {
            AnonymousClass3YR.A00.A02(this, C18190wL.A0C(this), AnonymousClass0wJ.A0U(r1));
        }
        C14030oh.A07(31092000, A002);
    }
}
