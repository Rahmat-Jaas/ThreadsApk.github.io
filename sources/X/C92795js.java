package X;

import android.os.Bundle;
import com.fbpay.hub.merchantinfo.api.MerchantInfo;
import com.fbpay.logging.FBPayLoggerData;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5js  reason: invalid class name and case insensitive filesystem */
public final class C92795js extends C882957m {
    public FBPayLoggerData A00;
    public final C880856r A01 = C880856r.A03();
    public final C143688h9 A02;
    public final C143158gC A03 = C86114wI.A0Q(this, 241);

    public C92795js(C143688h9 r2) {
        this.A02 = r2;
    }

    public final void A03(Bundle bundle) {
        super.A03(bundle);
        this.A00 = C86104wH.A0Q(bundle);
        MerchantInfo merchantInfo = (MerchantInfo) C18240wQ.A0D(bundle, "merchant_info");
        C880856r r3 = this.A01;
        ImmutableList.Builder A0Q = C86164wN.A0Q();
        C92665jc.A00(new AnonymousClass5jV(), A0Q, 2131830419);
        AnonymousClass5jW r1 = new AnonymousClass5jW();
        r1.A02 = 2131830420;
        r1.A04 = merchantInfo.A01;
        A0Q.add((Object) new C92675jd(r1));
        AnonymousClass5jW r12 = new AnonymousClass5jW();
        r12.A02 = 2131830421;
        r12.A04 = merchantInfo.A02;
        A0Q.add((Object) new C92675jd(r12));
        AnonymousClass5jW r13 = new AnonymousClass5jW();
        r13.A02 = 2131830417;
        r13.A04 = merchantInfo.A00;
        r13.A08 = false;
        A0Q.add((Object) new C92675jd(r13));
        AnonymousClass5jU r14 = new AnonymousClass5jU();
        r14.A00 = 2131830418;
        C92655jb.A00(r14, A0Q, this, 66);
        C86144wL.A1E(r3, A0Q);
    }
}
