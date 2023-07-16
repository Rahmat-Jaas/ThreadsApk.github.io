package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.api.base.IDxACallbackShape15S0300000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3jf  reason: invalid class name and case insensitive filesystem */
public final class C64123jf implements DialogInterface.OnClickListener {
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

    public C64123jf(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, C37047JjS jjS, PromoteLaunchOrigin promoteLaunchOrigin, C11630kW r5, BKU bku, UserSession userSession, String str, String str2, boolean z) {
        this.A01 = fragment;
        this.A06 = userSession;
        this.A02 = jjS;
        this.A05 = bku;
        this.A08 = str;
        this.A04 = r5;
        this.A07 = str2;
        this.A03 = promoteLaunchOrigin;
        this.A09 = z;
        this.A00 = onDismissListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Fragment fragment = this.A01;
        Context requireContext = fragment.requireContext();
        AnonymousClass06E A002 = AnonymousClass06E.A00(fragment);
        UserSession userSession = this.A06;
        C37047JjS jjS = this.A02;
        BKU bku = this.A05;
        String str = this.A08;
        C11630kW r12 = this.A04;
        String str2 = this.A07;
        C24201he r7 = new C24201he(this.A00, fragment, jjS, this.A03, r12, bku, userSession, str, str2, this.A09);
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        ReelAutoArchiveSettingStr B6D = A0Y.A05.B6D();
        A0Y.A1o(ReelAutoArchiveSettingStr.ON);
        C32165H8c A072 = C63663i4.A07(userSession, true, false);
        A072.A00 = new IDxACallbackShape15S0300000_1_I2(0, (Object) B6D, (Object) A0Y, (Object) r7);
        C31155GhB.A01(requireContext, A002, A072);
    }
}
