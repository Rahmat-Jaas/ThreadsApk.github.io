package X;

import android.content.Context;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.42I  reason: invalid class name */
public final class AnonymousClass42I implements C33788HuV {
    public final UserSession A00;
    public final List A01 = AnonymousClass0wJ.A0v();

    public final String getFilenamePrefix() {
        return "main_feed_last_seen_medias";
    }

    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    public final String getTag() {
        return "FeedLastSeenMediasLogCollector";
    }

    public AnonymousClass42I(UserSession userSession) {
        this.A00 = userSession;
    }

    public final String getContentInBackground(Context context) {
        try {
            JSONArray A0i = C18250wR.A0i();
            Iterator it = this.A01.iterator();
            while (it.hasNext()) {
                C18210wN.A1R(it, A0i);
            }
            return A0i.toString();
        } catch (JSONException e) {
            AnonymousClass0LU.A0E("FeedLastSeenMediasLogCollector", "Unable to create log", e);
            return "{}";
        }
    }
}
