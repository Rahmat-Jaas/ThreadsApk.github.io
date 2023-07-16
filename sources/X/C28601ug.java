package X;

import android.widget.CompoundButton;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.1ug  reason: invalid class name and case insensitive filesystem */
public final class C28601ug extends AnonymousClass9UH {
    public final CompoundButton A00;
    public final AnonymousClass3F6 A01;
    public final boolean A02;
    public final boolean A03;
    public final /* synthetic */ C29361xq A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28601ug(CompoundButton compoundButton, C12560m7 r2, AnonymousClass3F6 r3, C29361xq r4, boolean z, boolean z2) {
        super(r2);
        this.A04 = r4;
        this.A00 = compoundButton;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = r3;
    }

    private void A00(boolean z) {
        String str;
        C29361xq r0 = this.A04;
        AnonymousClass3VR r4 = r0.A07;
        String str2 = r0.A08;
        boolean z2 = this.A03;
        AnonymousClass3F6 r02 = this.A01;
        if (z2) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        r4.A02(str2, AnonymousClass00U.A0V(str, "-", r02.toString()), "time_range", z);
    }

    public final void onFail(AnonymousClass3XX r7) {
        int A032 = C14030oh.A03(-1629938132);
        C29361xq r4 = this.A04;
        C63813iO.A03(r4.A04, "reset_time_range_failed", 2131837305, 0);
        boolean z = this.A02;
        CompoundButton compoundButton = this.A00;
        if (compoundButton != null) {
            C18240wQ.A0y(compoundButton, z);
            compoundButton.setOnCheckedChangeListener(r4.A05);
        }
        A00(false);
        C14030oh.A0A(-135928976, A032);
    }

    public final void onSuccess(Object obj) {
        int A032 = C14030oh.A03(1250290171);
        boolean z = this.A03;
        CompoundButton compoundButton = this.A00;
        if (compoundButton != null) {
            C18240wQ.A0y(compoundButton, z);
            compoundButton.setOnCheckedChangeListener(this.A04.A05);
        }
        C58773Hd r1 = this.A04.A06.A00;
        AnonymousClass366 r0 = r1.A00;
        r0.getClass();
        r1.A00(r0);
        A00(true);
        C14030oh.A0A(2135034843, A032);
    }
}
