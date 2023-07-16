package X;

import com.facebook.pando.PandoConsistencyServiceJNI;
import com.facebook.pando.PandoGraphQLServiceJNI;
import com.facebook.pando.PandoSubscriptionPrimaryExecutionJNI;
import com.instagram.service.session.UserSession;

/* renamed from: X.620  reason: invalid class name */
public final class AnonymousClass620 extends C126997gL {
    public AnonymousClass620(PandoSubscriptionPrimaryExecutionJNI pandoSubscriptionPrimaryExecutionJNI, UserSession userSession) {
        super(new PandoGraphQLServiceJNI(pandoSubscriptionPrimaryExecutionJNI, (PandoConsistencyServiceJNI) AnonymousClass75J.A01.A00(userSession).A00.getValue(), false), userSession);
    }
}
