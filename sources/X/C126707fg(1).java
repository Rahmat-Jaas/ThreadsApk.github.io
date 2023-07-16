package X;

import com.facebook.graphql.impls.DcpFeaturesUploadResponseImpl;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;

/* renamed from: X.7fg  reason: invalid class name and case insensitive filesystem */
public final class C126707fg implements C143358ga {
    public C67463zb A00 = C67463zb.A00();
    public C67463zb A01 = C67463zb.A00();
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = false;

    public final /* bridge */ /* synthetic */ C85754vi AB4() {
        AnonymousClass7Ko.A0B(this.A04);
        AnonymousClass7Ko.A0B(this.A05);
        AnonymousClass7Ko.A0B(this.A03);
        return new PandoGraphQLRequest(C63233h2.A04(this.A02), "DcpFeaturesUpload", this.A00.getParamsCopy(), this.A01.getParamsCopy(), DcpFeaturesUploadResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_post_dcp_features_upload");
    }
}
