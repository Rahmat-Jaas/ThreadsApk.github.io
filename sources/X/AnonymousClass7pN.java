package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.redex.IDxLCallbacksShape579S0100000_2_I2;
import java.lang.ref.WeakReference;

/* renamed from: X.7pN  reason: invalid class name */
public final class AnonymousClass7pN implements C33788HuV {
    public static AnonymousClass7pN A02;
    public static final C118116zm A03 = new C118116zm();
    public WeakReference A00;
    public final Application.ActivityLifecycleCallbacks A01;

    public final String getFilenamePrefix() {
        return "image_cache_state_log";
    }

    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    public final String getTag() {
        return "ImageCacheBugReportLogsProvider";
    }

    public final String getContentInBackground(Context context) {
        Activity activity;
        View findViewById;
        StringBuilder A0s = C18190wL.A0s("Disk Cache Journal:\n");
        A0s.append("=========================\n\n");
        A0s.append("Memory Cache Content:\n");
        A0s.append("=========================\n\n");
        A0s.append("Image Views On Screen:\n");
        A0s.append("=========================\n\n");
        WeakReference weakReference = this.A00;
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null || (findViewById = activity.findViewById(16908290)) == null) {
            A0s.append("Couldn't get views hierarchy");
        } else {
            C118116zm.A00(findViewById, A03, A0s);
        }
        return A0s.toString();
    }

    public AnonymousClass7pN(Context context) {
        IDxLCallbacksShape579S0100000_2_I2 iDxLCallbacksShape579S0100000_2_I2 = new IDxLCallbacksShape579S0100000_2_I2(this, 1);
        this.A01 = iDxLCallbacksShape579S0100000_2_I2;
        ((Application) C86154wM.A09(context)).registerActivityLifecycleCallbacks(iDxLCallbacksShape579S0100000_2_I2);
    }
}
