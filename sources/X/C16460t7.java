package X;

import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.Map;

/* renamed from: X.0t7  reason: invalid class name and case insensitive filesystem */
public final class C16460t7 implements C17550v8 {
    public final /* synthetic */ FbnsServiceDelegate A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    public C16460t7(FbnsServiceDelegate fbnsServiceDelegate, String str, String str2, Map map) {
        this.A00 = fbnsServiceDelegate;
        this.A02 = str;
        this.A03 = map;
        this.A01 = str2;
    }

    public final void ByG(Integer num) {
        FbnsServiceDelegate.A01(this.A00, "reg_sent_fail", this.A02, this.A01, C17470ux.A01(num), this.A03);
    }

    public final void CMz(long j) {
        FbnsServiceDelegate.A01(this.A00, "reg_sent_success", this.A02, this.A01, (String) null, this.A03);
    }
}
