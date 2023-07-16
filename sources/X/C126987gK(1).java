package X;

import com.facebook.pando.IPandoGraphQLService;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.concurrent.Executor;

/* renamed from: X.7gK  reason: invalid class name and case insensitive filesystem */
public final class C126987gK implements IPandoGraphQLService {
    public final IPandoGraphQLService A00;

    public final IPandoGraphQLService.Result initiate(String str, PandoGraphQLRequest pandoGraphQLRequest, C145218k7 r6, Executor executor) {
        C04220Ms.A0B(pandoGraphQLRequest, 1);
        IPandoGraphQLService.Result initiate = this.A00.initiate(str, pandoGraphQLRequest, new C126947gF(r6), executor);
        return new IPandoGraphQLService.Result(initiate.tree, new C126977gI(r6, initiate.cancelToken));
    }

    public final void publish(String str) {
        this.A00.publish(str);
    }

    public final void publishTreeUpdater(TreeUpdaterJNI treeUpdaterJNI) {
        this.A00.publishTreeUpdater(treeUpdaterJNI);
    }

    public final IPandoGraphQLService.Result subscribe(Object obj, Class cls, C145218k7 r6, Executor executor) {
        IPandoGraphQLService.Result subscribe = this.A00.subscribe(obj, TreeJNI.class, new C126947gF(r6), executor);
        return new IPandoGraphQLService.Result(subscribe.tree, new C126977gI(r6, subscribe.cancelToken));
    }

    public C126987gK(IPandoGraphQLService iPandoGraphQLService) {
        this.A00 = iPandoGraphQLService;
    }
}
