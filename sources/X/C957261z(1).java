package X;

import com.facebook.pando.PandoConsistencyServiceJNI;
import com.facebook.pando.PandoGraphQLServiceJNI;
import com.facebook.pando.PandoPrimaryExecution;
import com.instagram.service.session.UserSession;

/* renamed from: X.61z  reason: invalid class name and case insensitive filesystem */
public final class C957261z extends C126997gL {
    public C957261z(PandoConsistencyServiceJNI pandoConsistencyServiceJNI, PandoPrimaryExecution pandoPrimaryExecution, UserSession userSession) {
        super(new PandoGraphQLServiceJNI(pandoPrimaryExecution, pandoConsistencyServiceJNI, false), userSession);
    }
}
