package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.4Mv  reason: invalid class name and case insensitive filesystem */
public final class C72174Mv implements C83904sB {
    public final /* synthetic */ C10300i6 A00;
    public final /* synthetic */ FragmentActivity A01;

    public C72174Mv(FragmentActivity fragmentActivity, C10300i6 r2) {
        this.A01 = fragmentActivity;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void BzL(AnonymousClass3DI r8, Object obj) {
        RegFlowExtras regFlowExtras = (RegFlowExtras) obj;
        r8.getClass();
        regFlowExtras.getClass();
        regFlowExtras.A01().getClass();
        FragmentActivity fragmentActivity = this.A01;
        String str = regFlowExtras.A0Y;
        C67283zI.A04(fragmentActivity, new C15720rm(AnonymousClass2AT.valueOf(r8.A08).A01), regFlowExtras.A01(), regFlowExtras.A02(), AnonymousClass006.A00, str);
    }

    public final void BzX() {
        C10300i6 r1 = this.A00;
        C18180wK.A1K(C63313hF.A00(r1, "registration_flow_aborted"), r1);
        this.A01.getSupportFragmentManager().A1C("reg_gdpr_entrance", 1);
    }
}
