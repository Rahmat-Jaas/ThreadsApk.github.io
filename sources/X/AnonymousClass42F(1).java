package X;

import android.content.Context;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.42F  reason: invalid class name */
public final class AnonymousClass42F implements C33788HuV {
    public final String getFilenamePrefix() {
        return "appearance_theme_state";
    }

    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    public final String getTag() {
        return "ThemeStateLogCollector";
    }

    public final String getContentInBackground(Context context) {
        String str;
        JSONObject A0y = C18230wP.A0y();
        try {
            if (C34822La.A00(context)) {
                str = "dark";
            } else {
                str = "light";
            }
            A0y.put("system_theme", str);
            A0y.put("in_app_theme", C08360dF.A00().A00.getInt("dark_mode_toggle_setting", -1));
        } catch (JSONException e) {
            AnonymousClass0LU.A0E("ThemeStateLogCollector", "Unable to create log", e);
        }
        return A0y.toString();
    }
}
