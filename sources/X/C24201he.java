package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.service.session.UserSession;

/* renamed from: X.1he  reason: invalid class name and case insensitive filesystem */
public final class C24201he extends C63873iU {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C37047JjS A02;
    public final /* synthetic */ PromoteLaunchOrigin A03;
    public final /* synthetic */ C11630kW A04;
    public final /* synthetic */ BKU A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    public C24201he(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, C37047JjS jjS, PromoteLaunchOrigin promoteLaunchOrigin, C11630kW r5, BKU bku, UserSession userSession, String str, String str2, boolean z) {
        this.A02 = jjS;
        this.A06 = userSession;
        this.A05 = bku;
        this.A08 = str;
        this.A01 = fragment;
        this.A04 = r5;
        this.A07 = str2;
        this.A03 = promoteLaunchOrigin;
        this.A09 = z;
        this.A00 = onDismissListener;
    }

    public final void onFail(AnonymousClass3XX r6) {
        int A032 = C14030oh.A03(1893768535);
        C25828Dsm A0V = AnonymousClass0wJ.A0V(this.A01);
        A0V.A0L(2131833714);
        A0V.A0K(2131833713);
        C18180wK.A1O(A0V, this.A00, 12, 2131831976);
        AnonymousClass0wJ.A1K(A0V);
        C14030oh.A0A(1008041654, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(606441935);
        int A002 = AnonymousClass0wJ.A00(-772035185, obj);
        super.onSuccess(obj);
        UserSession userSession = this.A06;
        BKU bku = this.A05;
        String str = this.A08;
        C37047JjS.A00(this.A01, this.A03, this.A04, bku, userSession, str, this.A07, this.A09);
        C14030oh.A0A(-1794737362, A002);
        C14030oh.A0A(-1708121094, A032);
    }
}
