package X;

import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.Status;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;

/* renamed from: X.4Eq  reason: invalid class name and case insensitive filesystem */
public final class C70444Eq implements C82764qE {
    public final /* synthetic */ C23962D3n A00;
    public final /* synthetic */ AymhViewModel A01;
    public final /* synthetic */ C07530bf A02;

    public final void BMv(FragmentActivity fragmentActivity) {
        C04220Ms.A0B(fragmentActivity, 0);
        Throwable cause = this.A00.getCause();
        C04220Ms.A0C(cause, "null cannot be cast to non-null type com.google.android.gms.common.api.ResolvableApiException");
        Status status = ((C32102Af) cause).A00;
        status.A00(fragmentActivity, 64206);
        C07530bf r3 = this.A02;
        C63523hf.A00(status, r3, "aymh", C63533hk.A00(r3), true);
    }

    public C70444Eq(C23962D3n d3n, AymhViewModel aymhViewModel, C07530bf r3) {
        this.A00 = d3n;
        this.A01 = aymhViewModel;
        this.A02 = r3;
    }
}
