package com.instagram.quickpromotion.debug.devtool;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0OY;
import X.AnonymousClass0wJ;
import X.AnonymousClass18L;
import X.AnonymousClass1Pw;
import X.AnonymousClass1j3;
import X.AnonymousClass3DC;
import X.AnonymousClass3RV;
import X.AnonymousClass3UU;
import X.AnonymousClass3YD;
import X.AnonymousClass3Zs;
import X.AnonymousClass40H;
import X.AnonymousClass40R;
import X.C04220Ms;
import X.C04530Oa;
import X.C28291u0;
import X.C61563Ua;
import X.C81224nO;
import X.C84854ty;
import X.D2R;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.instagram.service.session.UserSession;
import java.util.EnumSet;
import kotlin.jvm.internal.KtLambdaShape95S0100000_I2_75;

public final class IGDevToolPersistentStateHandler implements C84854ty {
    public final Context A00;
    public final UserSession A01;
    public final C04530Oa A02 = AnonymousClass0OY.A02(new KtLambdaShape95S0100000_I2_75(this, 10));

    public final AnonymousClass3DC AOl(C81224nO r3, String str) {
        return new AnonymousClass40H().A8q(A00(this, (AnonymousClass18L) r3), r3);
    }

    public final AnonymousClass3DC AZp(C81224nO r3, String str) {
        return new AnonymousClass40R().A8q(A00(this, (AnonymousClass18L) r3), r3);
    }

    public final int Aa4(C81224nO r7, Integer num, String str) {
        Integer num2;
        UserSession userSession = this.A01;
        AnonymousClass3YD r2 = new AnonymousClass3YD(AnonymousClass3Zs.A03(userSession).A01(D2R.A1r), userSession.getUserId(), str);
        int intValue = num.intValue();
        if (intValue == 0) {
            num2 = AnonymousClass006.A00;
        } else if (intValue != 1) {
            num2 = AnonymousClass006.A0C;
        } else {
            num2 = AnonymousClass006.A01;
        }
        return r2.A02(num2, AnonymousClass1j3.A02(r7));
    }

    public final String AjR(String str) {
        switch (AnonymousClass3RV.A00[((SharedPreferences) this.A02.getValue()).getInt(AnonymousClass00U.A0L("/QP/force_mode/", Uri.encode(str)), 0)].intValue()) {
            case 1:
                return "(Forced On)";
            case 2:
                return "(Forced Off)";
            case 3:
                return "(Ignore Enable Time)";
            default:
                return "(Default)";
        }
    }

    public static AnonymousClass1Pw A00(IGDevToolPersistentStateHandler iGDevToolPersistentStateHandler, AnonymousClass18L r9) {
        C28291u0 r1 = r9.A01;
        EnumSet copyOf = EnumSet.copyOf(r1.A0F);
        C04220Ms.A06(copyOf);
        String valueOf = String.valueOf(r1.A06.A00);
        AnonymousClass1Pw A002 = ((C61563Ua) C61563Ua.A03.getValue()).A00(iGDevToolPersistentStateHandler.A00, new AnonymousClass3UU(), iGDevToolPersistentStateHandler.A01, valueOf, copyOf, 0);
        C04220Ms.A0C(A002, "null cannot be cast to non-null type com.facebook.quickpromotion.sdk.eligibility.QPEligibilityContext<com.instagram.quickpromotion.intf.Trigger, com.facebook.quickpromotion.sdk.models.QuickPromotion<com.instagram.quickpromotion.intf.Trigger>>");
        return A002;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object BKF(java.lang.String r12, java.util.Map r13, X.C146958n9 r14) {
        /*
            r11 = this;
            r4 = 26
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7.A00(r4, r14)
            if (r0 == 0) goto L_0x0052
            r3 = r14
            kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7 r3 = (kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0052
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r3.A01
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r2 = r3.A00
            r1 = 1
            if (r2 == 0) goto L_0x002a
            if (r2 != r1) goto L_0x005a
            X.AnonymousClass0OU.A00(r0)
        L_0x0024:
            r4 = r0
            if (r0 != 0) goto L_0x0029
            X.0ZV r4 = X.AnonymousClass0ZV.A00
        L_0x0029:
            return r4
        L_0x002a:
            X.AnonymousClass0OU.A00(r0)
            com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper r7 = new com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper
            r7.<init>()
            android.content.Context r6 = r11.A00
            com.instagram.service.session.UserSession r8 = r11.A01
            r3.A00 = r1
            r10 = 0
            r2 = 3
            X.E5N r1 = X.C18250wR.A0J(r10, r2)
            r0 = 700377912(0x29beeb38, float:8.478499E-14)
            X.0gQ r0 = r1.BQy(r0, r2)
            kotlin.coroutines.jvm.internal.KtSLambdaShape0S11001000_I2 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape0S11001000_I2
            r9 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r0 = X.C25599DoZ.A00(r3, r0, r5)
            if (r0 != r4) goto L_0x0024
            return r4
        L_0x0052:
            r0 = 42
            kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7 r3 = new kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7
            r3.<init>(r11, r14, r4, r0)
            goto L_0x0016
        L_0x005a:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler.BKF(java.lang.String, java.util.Map, X.8n9):java.lang.Object");
    }

    public IGDevToolPersistentStateHandler(Context context, UserSession userSession) {
        AnonymousClass0wJ.A1O(context, userSession);
        this.A00 = context;
        this.A01 = userSession;
    }
}
