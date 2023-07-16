package kotlin.coroutines.jvm.internal;

import X.AnonymousClass29W;
import X.AnonymousClass2AC;
import X.AnonymousClass2AD;
import X.AnonymousClass5Ha;
import X.C115316ur;
import X.C146958n9;
import X.C27236EjA;
import X.C880856r;
import android.content.Context;
import com.facebook.forker.Process;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.upsell.api.CLNoticeApi;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KtCImplShape0S0801000_I2 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0801000_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A09 = i;
        this.A08 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCImplShape0S0801000_I2) || ((KtCImplShape0S0801000_I2) obj).A09 != i) {
            return false;
        }
        return true;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A09;
        this.A07 = obj;
        this.A00 |= Process.WAIT_RESULT_TIMEOUT;
        switch (i) {
            case 0:
                return ((CheckoutHandler) this.A08).A0D((C880856r) null, (PaymentRequest) null, (C115316ur) null, (List) null, (Map) null, (Map) null, this);
            case 1:
                return ClipsMidcardValidDisplayModelUtil.A00((Context) null, (AnonymousClass5Ha) null, (ClipsMidcardValidDisplayModelUtil) this.A08, (UserSession) null, this);
            case 2:
                return FanClubConsiderationViewModel.A03((Context) null, (FanClubConsiderationViewModel) this.A08, (Set) null, this);
            default:
                return ((CLNoticeApi) this.A08).A00((AnonymousClass2AC) null, (AnonymousClass29W) null, (AnonymousClass2AD) null, (UserSession) null, this);
        }
    }
}
