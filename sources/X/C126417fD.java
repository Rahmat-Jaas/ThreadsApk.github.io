package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.commerce.cart.graphql.CommerceShopsViewerCartResponseImpl;

/* renamed from: X.7fD  reason: invalid class name and case insensitive filesystem */
public final class C126417fD implements C27604EqD {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        return new PandoGraphQLRequest(C63233h2.A01(), "CommerceShopsViewerCart", this.A00.getParamsCopy(), this.A01.getParamsCopy(), CommerceShopsViewerCartResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_shops_viewer");
    }
}
