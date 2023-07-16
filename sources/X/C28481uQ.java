package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.1uQ  reason: invalid class name and case insensitive filesystem */
public final class C28481uQ extends AnonymousClass1hH {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ BKU A01;
    public final /* synthetic */ C21839C2o A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28481uQ(Activity activity, Fragment fragment, C12560m7 r3, BKU bku, C21839C2o c2o, UserSession userSession, String str) {
        super(activity, r3);
        this.A01 = bku;
        this.A03 = userSession;
        this.A00 = fragment;
        this.A02 = c2o;
        this.A04 = str;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-1008398442);
        int A033 = C14030oh.A03(1437357016);
        String str = ((C21761Sb) obj).A00;
        Bundle A06 = C18180wK.A06();
        BKU bku = this.A01;
        UserSession userSession = this.A03;
        A06.putString("android.intent.extra.TEXT", AnonymousClass3iG.A00(bku, userSession, str));
        FragmentActivity activity = this.A00.getActivity();
        C21839C2o c2o = this.A02;
        AnonymousClass3iG.A01(activity, A06, c2o, bku, userSession, str);
        BKN bkn = bku.A0f;
        C63673i6.A0B(c2o, userSession, bkn.A4Y, this.A04, "system_share_sheet", str, bkn.A4h);
        C14030oh.A0A(-554465325, A033);
        C14030oh.A0A(-609061953, A032);
    }

    public final void onFail(AnonymousClass3XX r9) {
        int A032 = C14030oh.A03(560629044);
        super.onFail(r9);
        C63673i6.A09(this.A02, this.A03, this.A01.A0f.A4Y, this.A04, "system_share_sheet", r9.A01);
        C14030oh.A0A(516192467, A032);
    }
}
