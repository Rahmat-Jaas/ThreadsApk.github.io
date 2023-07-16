package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.0d2  reason: invalid class name and case insensitive filesystem */
public final class C08240d2 implements C33788HuV {
    public final String getFilenamePrefix() {
        return "profilo_internal_log";
    }

    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    public final String getContentInBackground(Context context) {
        if (!AnonymousClass0Vt.A01) {
            return null;
        }
        return AnonymousClass0Vt.A00().A00();
    }

    public final String getTag() {
        return "IgProfiloB4bBugReportLogsProvider";
    }
}
