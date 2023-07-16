package com.instagram.wellbeing.timespent.activity;

import X.AnonymousClass006;
import X.AnonymousClass01J;
import X.AnonymousClass3UZ;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public final class TimeSpentDashboardActivity extends BaseFragmentActivity {
    public UserSession A00;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void A0D(Bundle bundle) {
        AnonymousClass3UZ r0;
        if (getSupportFragmentManager().A0L(R.id.layout_container_main) == null && (r0 = AnonymousClass3UZ.A02) != null) {
            Fragment A02 = r0.A00().A02(this.A00, AnonymousClass006.A0N);
            AnonymousClass01J A0L = C18220wO.A0L(this);
            A0L.A0D(A02, R.id.layout_container_main);
            A0L.A00();
        }
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.left_in, R.anim.right_out);
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(595417369);
        this.A00 = C18180wK.A0V(C18190wL.A0C(this));
        super.onCreate(bundle);
        overridePendingTransition(R.anim.right_in, R.anim.left_out);
        C14030oh.A07(-746640960, A002);
    }
}
