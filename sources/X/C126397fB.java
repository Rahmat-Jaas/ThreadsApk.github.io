package X;

import com.facebook.graphql.impls.OnDeviceFLFeaturesResponseImpl;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.7fB  reason: invalid class name and case insensitive filesystem */
public final class C126397fB implements C27604EqD {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A06 = false;

    public final /* bridge */ /* synthetic */ C146418mD build() {
        AnonymousClass7Ko.A0B(this.A04);
        AnonymousClass7Ko.A0B(this.A05);
        AnonymousClass7Ko.A0B(this.A03);
        AnonymousClass7Ko.A0B(this.A06);
        return new PandoGraphQLRequest(C63233h2.A04(this.A02), "OnDeviceFLFeatures", this.A00.getParamsCopy(), this.A01.getParamsCopy(), OnDeviceFLFeaturesResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "on_device_fl_features");
    }
}
