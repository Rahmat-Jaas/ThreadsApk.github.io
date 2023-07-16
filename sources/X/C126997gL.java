package X;

import com.facebook.pando.IPandoGraphQLService;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.service.session.UserSession;
import java.util.concurrent.Executor;

/* renamed from: X.7gL  reason: invalid class name and case insensitive filesystem */
public class C126997gL implements IPandoGraphQLService {
    public final UserSession A00;
    public final IPandoGraphQLService A01;

    public final IPandoGraphQLService.Result initiate(String str, PandoGraphQLRequest pandoGraphQLRequest, C145218k7 r4, Executor executor) {
        C04220Ms.A0B(pandoGraphQLRequest, 1);
        IPandoGraphQLService.Result initiate = this.A01.initiate(str, pandoGraphQLRequest, r4, executor);
        C04220Ms.A06(initiate);
        return initiate;
    }

    public final void publish(String str) {
        this.A01.publish(str);
    }

    public final void publishTreeUpdater(TreeUpdaterJNI treeUpdaterJNI) {
        this.A01.publishTreeUpdater(treeUpdaterJNI);
    }

    public final IPandoGraphQLService.Result subscribe(Object obj, Class cls, C145218k7 r5, Executor executor) {
        IPandoGraphQLService.Result subscribe = this.A01.subscribe(obj, TreeJNI.class, r5, executor);
        C04220Ms.A06(subscribe);
        return subscribe;
    }

    public C126997gL(IPandoGraphQLService iPandoGraphQLService, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = iPandoGraphQLService;
    }
}
