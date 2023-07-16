package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.graphql.instagramschema.IGVideoLoggingSessionDebuggingResponseImpl;

/* renamed from: X.820  reason: invalid class name */
public final class AnonymousClass820 implements Runnable {
    public final /* synthetic */ C106626fL A00;
    public final /* synthetic */ String A01;

    public AnonymousClass820(C106626fL r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        C106626fL r4 = this.A00;
        String str = this.A01;
        C67463zb A002 = C67463zb.A00();
        C67463zb A003 = C67463zb.A00();
        A002.A05("id", str);
        r4.A00.AMA(new PandoGraphQLRequest(C63233h2.A03(AnonymousClass0wJ.A1W(str)), "IGVideoLoggingSessionDebugging", A002.getParamsCopy(), A003.getParamsCopy(), IGVideoLoggingSessionDebuggingResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fetch__XFBVideoPlaySessionObjectFetch"), new C129977nn(str));
    }
}
