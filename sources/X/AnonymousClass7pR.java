package X;

import android.content.Context;
import com.google.common.collect.EvictingQueue;
import com.instagram.service.session.UserSession;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.7pR  reason: invalid class name */
public final class AnonymousClass7pR implements C33788HuV, AnonymousClass0i1 {
    public static final SimpleDateFormat A03 = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss", Locale.US);
    public final EvictingQueue A00 = new EvictingQueue(50);
    public final C09810gi A01 = C09820gj.A00;
    public final String A02;

    public AnonymousClass7pR(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A02 = userSession.getUserId();
    }

    public final String getFilenameSuffix() {
        return "_interaction_logs.txt";
    }

    public final String getTag() {
        return "FeedInteractionObserverLogCollector";
    }

    public final String getFilenamePrefix() {
        return this.A02;
    }

    public final void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.A00.clear();
        }
    }

    public final String getContentInBackground(Context context) {
        StringWriter A0d = C18230wP.A0d();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
            A0d.append(C18240wQ.A0i(A03, 0)).append(" ").append((CharSequence) null);
            A0d.append(10);
        }
        return C18190wL.A0n(A0d);
    }
}
