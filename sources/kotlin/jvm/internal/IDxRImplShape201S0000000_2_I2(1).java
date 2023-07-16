package kotlin.jvm.internal;

import X.AnonymousClass019;
import X.AnonymousClass0YM;
import X.AnonymousClass0wJ;
import X.AnonymousClass7JD;
import X.C04220Ms;
import X.C121697Hn;
import X.C128367jS;
import X.C18180wK;
import X.C81204nM;
import X.C86164wN;
import X.C880856r;
import X.C8L;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebookpay.msc.overview.viewmodel.OverviewViewModel;
import java.util.Map;
import kotlin.Unit;

public class IDxRImplShape201S0000000_2_I2 extends AnonymousClass019 implements AnonymousClass0YM {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IDxRImplShape201S0000000_2_I2(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            if (r9 == 0) goto L_0x0012
            java.lang.Class<X.C8L> r3 = X.C8L.class
            java.lang.String r4 = "updateTimeIntervalForTimedSticker"
            java.lang.String r5 = "updateTimeIntervalForTimedSticker(Ljava/lang/String;II)V"
        L_0x000b:
            r1 = 3
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0012:
            java.lang.Class<com.facebookpay.msc.overview.viewmodel.OverviewViewModel> r3 = com.facebookpay.msc.overview.viewmodel.OverviewViewModel.class
            java.lang.String r4 = "onClickCard"
            java.lang.String r5 = "onClickCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.IDxRImplShape201S0000000_2_I2.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Parcelable A002;
        Object obj4 = obj3;
        Object obj5 = obj2;
        String str = (String) obj;
        if (this.A00 != 0) {
            int A04 = AnonymousClass0wJ.A04(obj5);
            int A042 = AnonymousClass0wJ.A04(obj4);
            C04220Ms.A0B(str, 0);
            C8L.A06((C8L) this.receiver, str, A04, A042);
        } else {
            String str2 = (String) obj5;
            String str3 = (String) obj4;
            AnonymousClass0wJ.A1N(str, str2);
            OverviewViewModel overviewViewModel = (OverviewViewModel) this.receiver;
            OverviewViewModel.A02(overviewViewModel, "user_click_payouthub_atomic", str, (String) null, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null, 508);
            C880856r r3 = overviewViewModel.A00;
            Bundle A06 = C18180wK.A06();
            C81204nM r0 = (C81204nM) overviewViewModel.A03.A08();
            if (r0 == null) {
                A002 = null;
            } else {
                A002 = C121697Hn.A00(r0);
            }
            A06.putParcelable("financial_entity", A002);
            A06.putString("filter_transaction_type", str3);
            C86164wN.A17(A06, overviewViewModel);
            AnonymousClass7JD.A02(r3, new C128367jS(A06, str2));
        }
        return Unit.A00;
    }
}
