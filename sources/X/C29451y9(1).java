package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.1y9  reason: invalid class name and case insensitive filesystem */
public final class C29451y9 extends C18730xl {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C84164se A02;
    public final /* synthetic */ C696249i A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29451y9(Context context, FragmentActivity fragmentActivity, C84164se r3, C696249i r4, String str, int i) {
        super(i);
        this.A03 = r4;
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A04 = str;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        C696249i r0 = this.A03;
        FragmentActivity fragmentActivity = this.A01;
        r0.A0A(this.A00, fragmentActivity, this.A02, r0.A05, this.A04);
    }
}
