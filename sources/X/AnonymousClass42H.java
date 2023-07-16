package X;

import android.content.Context;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.wellbeing.timeinapp.jnibindings.TimeInAppControllerWrapper;
import com.google.common.collect.ImmutableList;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.42H  reason: invalid class name */
public final class AnonymousClass42H implements C33788HuV {
    public final UserSession A00;

    public final String getFilenamePrefix() {
        return "screen_time_extras";
    }

    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    public final String getTag() {
        return "ScreenTimeFlyTrapExtrasProvider";
    }

    public AnonymousClass42H(UserSession userSession) {
        this.A00 = userSession;
    }

    public final String getContentInBackground(Context context) {
        NullPointerException th;
        ImmutableList immutableList;
        TimeInAppControllerWrapper timeInAppControllerWrapper;
        JSONObject A0y = C18230wP.A0y();
        try {
            UserSession userSession = this.A00;
            AnonymousClass0TJ A0J = C18180wK.A0J(userSession);
            if (C63803iN.A0E(A0J, userSession, 36327052433172333L)) {
                int[] A02 = AnonymousClass3VQ.A01.A02(0);
                C04220Ms.A06(A02);
                StringBuilder A0r = C18200wM.A0r();
                A0r.append("");
                int i = 0;
                for (int i2 : A02) {
                    i++;
                    if (i > 1) {
                        A0r.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    }
                    A0r.append(String.valueOf(i2));
                }
                A0r.append("");
                A0y.put("aggregated_screen_time", C18190wL.A0n(A0r));
            }
            if (C63803iN.A0E(A0J, userSession, 36327052433106796L)) {
                AnonymousClass376 r6 = (AnonymousClass376) AnonymousClass3VQ.A01.A00.get();
                if (r6 != null) {
                    synchronized (r6) {
                        try {
                            timeInAppControllerWrapper = r6.A00;
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    if (timeInAppControllerWrapper != null) {
                        immutableList = timeInAppControllerWrapper.queryIntervalsWithEvent(Long.MIN_VALUE, Long.MAX_VALUE);
                    } else {
                        immutableList = ImmutableList.of();
                    }
                } else {
                    immutableList = ImmutableList.of();
                }
                C04220Ms.A06(immutableList);
                JSONArray A0i = C18250wR.A0i();
                Iterator it = immutableList.iterator();
                if (it.hasNext()) {
                    it.next();
                    th = C18210wN.A0W("convertToJSONObject");
                    throw th;
                }
                A0y.put("screen_time_raw_intervals", A0i.toString());
            }
        } catch (Throwable th3) {
            C10450iM.A03("Instagram.ScreenTime.FlyTrapReport", AnonymousClass0wJ.A0t("Unable to build flytrap report:", th3));
        }
        return A0y.toString();
    }
}
