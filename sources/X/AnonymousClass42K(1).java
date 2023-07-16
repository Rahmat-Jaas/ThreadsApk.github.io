package X;

import android.content.Context;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.42K  reason: invalid class name */
public final class AnonymousClass42K implements C33788HuV {
    public List A00 = AnonymousClass0wJ.A0v();

    public final void A00(String str) {
        C04220Ms.A0B(str, 0);
        List list = this.A00;
        if (!C04220Ms.A0I(AnonymousClass00J.A0D(list), str)) {
            list.add(0, str);
            if (list.size() > 3) {
                C000300e.A0q(list);
            }
        }
    }

    public final String getFilenamePrefix() {
        return "reels_viewer_last_seen_media";
    }

    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    public final String getTag() {
        return "ClipsViewerLogCollector";
    }

    public final String getContentInBackground(Context context) {
        JSONObject A0y = C18230wP.A0y();
        try {
            A0y.put("reels_viewer_last_seen_media", AnonymousClass00J.A0H((CharSequence) null, (CharSequence) null, (CharSequence) null, this.A00, (AnonymousClass0YY) null, 63));
        } catch (JSONException e) {
            AnonymousClass0LU.A0E("ClipsViewerLogCollector", "Unable to create log", e);
        }
        return C18190wL.A0n(A0y);
    }
}
