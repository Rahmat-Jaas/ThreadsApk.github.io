package X;

import android.content.Context;
import com.instagram.realtimeclient.requeststream.IGRealtimeGraphQLObserverHolder;
import com.instagram.service.session.UserSession;

/* renamed from: X.6l9  reason: invalid class name and case insensitive filesystem */
public final class C110116l9 {
    public final Context A00;
    public final IGRealtimeGraphQLObserverHolder A01;
    public final C30925GbF A02;
    public final UserSession A03;

    public /* synthetic */ C110116l9(Context context, UserSession userSession) {
        IGRealtimeGraphQLObserverHolder instanceDistillery = IGRealtimeGraphQLObserverHolder.getInstanceDistillery(userSession);
        C04220Ms.A06(instanceDistillery);
        C30925GbF A002 = C36982Tk.A00();
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = instanceDistillery;
        this.A02 = A002;
    }
}
