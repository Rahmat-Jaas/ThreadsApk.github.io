package com.instagram.realtimeclient.bugreport;

import X.AnonymousClass0LU;
import X.AnonymousClass0OY;
import X.C04220Ms;
import X.C04530Oa;
import X.C04560Oe;
import X.C18190wL;
import X.C18230wP;
import X.C33788HuV;
import android.content.Context;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

public final class RealtimeLogsProvider implements C33788HuV {
    public static final Companion Companion = new Companion();
    public static final String LOG_PREFIX = "realtime_client";
    public static final String LOG_SUFFIX = ".json";
    public static final String TAG = "realtimeClientManagerProvider";
    public final C04530Oa realtimeClientManager$delegate = AnonymousClass0OY.A02(new RealtimeLogsProvider$realtimeClientManager$2(this));
    public final C04560Oe realtimeClientManagerProvider;

    public RealtimeLogsProvider(C04560Oe r2) {
        C04220Ms.A0B(r2, 1);
        this.realtimeClientManagerProvider = r2;
    }

    public static final RealtimeLogsProvider create(UserSession userSession) {
        return Companion.create(userSession);
    }

    public String getFilenamePrefix() {
        return LOG_PREFIX;
    }

    public String getFilenameSuffix() {
        return LOG_SUFFIX;
    }

    public String getTag() {
        return TAG;
    }

    private final RealtimeClientManager getRealtimeClientManager() {
        return (RealtimeClientManager) C18190wL.A0f(this.realtimeClientManager$delegate);
    }

    public String getContentInBackground(Context context) {
        try {
            JSONObject A0y = C18230wP.A0y();
            A0y.put("is_mqtt_connected", getRealtimeClientManager().isMqttConnected());
            A0y.put("mqtt_target_state", getRealtimeClientManager().getMqttTargetState());
            A0y.put("is_receiving_realtime_and_foreground", getRealtimeClientManager().isReceivingRealtimeAndForeground());
            return A0y.toString();
        } catch (JSONException e) {
            AnonymousClass0LU.A0E("RealtimeLogsProvider", "Failed to generate content", e);
            return null;
        }
    }

    public final class Companion {
        public final RealtimeLogsProvider create(UserSession userSession) {
            C04220Ms.A0B(userSession, 0);
            return new RealtimeLogsProvider(new RealtimeLogsProvider$Companion$create$1(userSession));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
