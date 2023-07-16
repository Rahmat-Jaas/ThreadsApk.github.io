package X;

import com.facebook.pando.PandoConsistencyServiceJNI;
import com.facebook.pando.PandoGraphQLServiceJNI;
import com.instagram.graphservice.service.pando.IGPandoGraphQLPrimaryExecutionJNI;
import com.instagram.service.session.UserSession;

/* renamed from: X.61y  reason: invalid class name and case insensitive filesystem */
public final class C957161y extends C126997gL {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C957161y(PandoConsistencyServiceJNI pandoConsistencyServiceJNI, IGPandoGraphQLPrimaryExecutionJNI iGPandoGraphQLPrimaryExecutionJNI, UserSession userSession) {
        super(new C126987gK(new PandoGraphQLServiceJNI(iGPandoGraphQLPrimaryExecutionJNI, pandoConsistencyServiceJNI, true)), userSession);
        C04220Ms.A0B(pandoConsistencyServiceJNI, 3);
    }
}
