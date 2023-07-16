package X;

import com.facebook.graphql.impls.ScriptingPackagesLatestVersionQueryResponseImpl;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.7f2  reason: invalid class name */
public final class AnonymousClass7f2 implements C27604EqD {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;

    public final /* bridge */ /* synthetic */ C146418mD build() {
        return new PandoGraphQLRequest(C63233h2.A04(this.A02), "ScriptingPackagesLatestVersionQuery", this.A00.getParamsCopy(), this.A01.getParamsCopy(), ScriptingPackagesLatestVersionQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ar_scripting_modules_package_download");
    }
}
