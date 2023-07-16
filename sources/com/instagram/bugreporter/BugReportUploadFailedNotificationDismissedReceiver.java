package com.instagram.bugreporter;

import X.AnonymousClass006;
import X.C14030oh;
import X.C18180wK;
import X.C34392Jj;
import X.C58533Ga;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BugReportUploadFailedNotificationDismissedReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = C14030oh.A01(353852769);
        if (!(intent.getExtras() == null || intent.getExtras().getString("IgSessionManager.SESSION_TOKEN_KEY") == null)) {
            new C58533Ga(C18180wK.A0V(intent.getExtras()), "BugReportUploadFailedNotificationDismissedReceiver").A00(AnonymousClass006.A05);
        }
        C34392Jj.A00((BugReport) intent.getExtras().getParcelable("BugReporterActivity.INTENT_EXTRA_BUGREPORT"));
        C14030oh.A0E(-902667223, A01, intent);
    }
}
