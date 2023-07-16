package X;

import android.content.Context;
import com.instagram.service.session.UserSession;

/* renamed from: X.1hU  reason: invalid class name */
public final class AnonymousClass1hU extends C63873iU {
    public final /* synthetic */ BKU A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ Context A04;

    public AnonymousClass1hU(Context context, BKU bku, UserSession userSession, int i, boolean z) {
        this.A04 = context;
        this.A03 = i;
        this.A00 = bku;
        this.A02 = z;
        this.A01 = userSession;
    }

    public final void onFail(AnonymousClass3XX r7) {
        int A032 = C14030oh.A03(473845);
        C04220Ms.A0B(r7, 0);
        super.onFail(r7);
        BKU bku = this.A00;
        bku.A0f.A2p = Boolean.valueOf(!this.A02);
        C63813iO.A03(this.A04, "network_error", 2131831662, 0);
        bku.AAy(this.A01);
        C14030oh.A0A(747401672, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(1126277854);
        int A033 = C14030oh.A03(258046361);
        C04220Ms.A0B(obj, 0);
        super.onSuccess(obj);
        C63813iO.A03(this.A04, (String) null, this.A03, 0);
        C14030oh.A0A(1658095431, A033);
        C14030oh.A0A(1803246093, A032);
    }
}
