package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7pK  reason: invalid class name */
public final class AnonymousClass7pK implements C33788HuV {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public final String getFilenamePrefix() {
        return "canvas_caf_log";
    }

    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    public final String getTag() {
        return "SharedCanvasCafLogsProvider";
    }

    public final String getContentInBackground(Context context) {
        return null;
    }
}
