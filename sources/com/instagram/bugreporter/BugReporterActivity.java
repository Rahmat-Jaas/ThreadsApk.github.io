package com.instagram.bugreporter;

import X.AnonymousClass006;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass1c2;
import X.C10300i6;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18230wP;
import X.C34402Jk;
import X.C58533Ga;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;

public class BugReporterActivity extends BaseFragmentActivity {
    public static C58533Ga A01;
    public C10300i6 A00;

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void A0D(Bundle bundle) {
        Fragment A012;
        Bundle A0C = C18190wL.A0C(this);
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        this.A00 = r1.A02(A0C);
        Bundle A0C2 = C18190wL.A0C(this);
        A0C2.getClass();
        A01 = new C58533Ga(r1.A06(A0C2), "BugReporterActivity");
        if (C18230wP.A0I(this) == null) {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("BugReporterActivity.INTENT_EXTRA_BUGREPORT");
            BugReportComposerViewModel bugReportComposerViewModel = (BugReportComposerViewModel) getIntent().getParcelableExtra("BugReporterActivity.INTENT_EXTRA_VIEWMODEL");
            boolean booleanExtra = getIntent().getBooleanExtra("BugReporterActivity.INTENT_GDPR_SCREEN_ENABLED", false);
            if (getIntent().getBooleanExtra("BugReporterActivity.INTENT_UPLOAD_FAILED", false)) {
                A01.A00(AnonymousClass006.A04);
            }
            if (!booleanExtra || bugReportComposerViewModel == null || bugReportComposerViewModel.A08) {
                A012 = AnonymousClass1c2.A01(parcelableExtra, bugReportComposerViewModel, false, C18190wL.A0C(this).getString("IgSessionManager.SESSION_TOKEN_KEY"));
            } else {
                A012 = C34402Jk.A00(parcelableExtra, bugReportComposerViewModel, C18190wL.A0C(this).getString("IgSessionManager.SESSION_TOKEN_KEY"));
            }
            C18220wO.A1B(A012, C18180wK.A0Q(this, this.A00), false);
        }
    }
}
