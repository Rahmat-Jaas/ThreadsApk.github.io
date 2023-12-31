package X;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7B0  reason: invalid class name */
public final class AnonymousClass7B0 {
    public static final IBinder A00(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return null;
        }
        return attributes.token;
    }

    public static final C134827yR A01() {
        String group;
        String group2;
        String group3;
        String str;
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (!TextUtils.isEmpty(apiVersion) && apiVersion != null && !AnonymousClass8bQ.A0n(apiVersion)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(apiVersion);
                if (matcher.matches() && (group = matcher.group(1)) != null) {
                    int parseInt = Integer.parseInt(group);
                    if (!(Integer.valueOf(parseInt) == null || (group2 = matcher.group(2)) == null)) {
                        int parseInt2 = Integer.parseInt(group2);
                        if (!(Integer.valueOf(parseInt2) == null || (group3 = matcher.group(3)) == null)) {
                            int parseInt3 = Integer.parseInt(group3);
                            if (Integer.valueOf(parseInt3) != null) {
                                if (matcher.group(4) != null) {
                                    str = matcher.group(4);
                                } else {
                                    str = "";
                                }
                                C04220Ms.A09(str);
                                return new C134827yR(parseInt, parseInt2, str, parseInt3);
                            }
                        }
                    }
                }
            }
            return null;
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
        }
        return null;
    }

    public static final SidecarInterface A02(Context context) {
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }
}
