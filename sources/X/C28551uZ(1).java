package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;

/* renamed from: X.1uZ  reason: invalid class name and case insensitive filesystem */
public final class C28551uZ extends AnonymousClass9UH {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C11630kW A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28551uZ(Activity activity, C12560m7 r2, C11630kW r3, UserSession userSession, String str) {
        super(r2);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = str;
    }

    public final void onFail(AnonymousClass3XX r10) {
        int A032 = C14030oh.A03(355674239);
        C63813iO.A0E(this.A00, "copy_live_item_failed");
        C63673i6.A09(this.A01, this.A02, this.A03, "live_action_sheet", "copy_link", r10.A01);
        C14030oh.A0A(450561893, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(1101081216);
        int A033 = C14030oh.A03(-2015047762);
        String str = ((AnonymousClass1SZ) obj).A00;
        Activity activity = this.A00;
        C09830gl.A01(activity, str, (String) null);
        C63813iO.A00(activity, 2131829646);
        C63673i6.A0A(this.A01, this.A02, this.A03, "live_action_sheet", "copy_link", str);
        C14030oh.A0A(2137903062, A033);
        C14030oh.A0A(222916856, A032);
    }
}
