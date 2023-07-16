package X;

import android.content.Context;
import com.google.common.collect.EvictingQueue;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.7pQ  reason: invalid class name */
public final class AnonymousClass7pQ implements C33788HuV, AnonymousClass0i4 {
    public String A00;
    public String A01;
    public final EvictingQueue A02 = new EvictingQueue(100);
    public final SimpleDateFormat A03 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);

    public final void A00(String str, String str2, String str3, String str4) {
        String str5;
        String str6 = str;
        C04220Ms.A0B(str, 0);
        EvictingQueue evictingQueue = this.A02;
        String str7 = this.A00;
        if (str7 == null) {
            str5 = "containerModule";
        } else {
            String str8 = this.A01;
            if (str8 == null) {
                str5 = "sessionId";
            } else {
                evictingQueue.add(new AnonymousClass78H(str7, str6, str8, 1, str2, str3, str4));
                return;
            }
        }
        C04220Ms.A0E(str5);
        throw null;
    }

    public final String getFilenamePrefix() {
        return "ad_delivery_logging";
    }

    public final String getFilenameSuffix() {
        return RealtimeLogsProvider.LOG_SUFFIX;
    }

    public final String getTag() {
        return "SponsoredContentDebugLogger";
    }

    public final String getContentInBackground(Context context) {
        EvictingQueue evictingQueue = this.A02;
        ArrayList A0x = AnonymousClass0wJ.A0x(evictingQueue, 10);
        Iterator it = evictingQueue.iterator();
        while (it.hasNext()) {
            AnonymousClass78H r7 = (AnonymousClass78H) it.next();
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            A0K.A0d("time", r7.A06);
            String str = r7.A01;
            if (str != null) {
                A0K.A0d("container_module", str);
            }
            String str2 = r7.A02;
            if (str2 != null) {
                A0K.A0d("event_name", str2);
            }
            String str3 = r7.A05;
            if (str3 != null) {
                A0K.A0d(AnonymousClass3Q4.A00(9, 10, 83), str3);
            }
            String str4 = r7.A00;
            if (str4 != null) {
                A0K.A0d("ad_id", str4);
            }
            String str5 = r7.A04;
            if (str5 != null) {
                A0K.A0d("media_id", str5);
            }
            String str6 = r7.A03;
            if (str6 != null) {
                A0K.A0d("extra_data", str6);
            }
            A0x.add(C18180wK.A0h(A0K, A0d));
        }
        return C18200wM.A0l("\n", AnonymousClass00J.A0L(A0x));
    }

    public final void onSessionWillEnd() {
        this.A02.clear();
    }
}
