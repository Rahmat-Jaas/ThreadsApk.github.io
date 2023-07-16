package com.instagram.dogfoodingassistant.repository;

import X.AnonymousClass34T;
import X.AnonymousClass3Zs;
import X.D2R;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S7100000_I2;
import com.instagram.dogfoodingassistant.api.DogfoodingAssistantApi;
import com.instagram.service.session.UserSession;

public final class DogfoodingAssistantRepository {
    public KtCSuperShape0S7100000_I2 A00;
    public final DogfoodingAssistantApi A01;
    public final AnonymousClass34T A02;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00aa, code lost:
        if (X.AnonymousClass7Ja.A01(r6, r0) == r5) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r11, X.C146958n9 r12) {
        /*
            r10 = this;
            r3 = 30
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1.A00(r3, r12)
            if (r0 == 0) goto L_0x00b6
            r6 = r12
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r6 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b6
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r6.A03
            X.D0E r5 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r6.A00
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 == r1) goto L_0x002e
            if (r0 != r7) goto L_0x00bd
            java.lang.Object r3 = r6.A01
            X.AnonymousClass0OU.A00(r2)
        L_0x0029:
            X.1jA r2 = X.AnonymousClass1jA.A00(r3)
        L_0x002d:
            return r2
        L_0x002e:
            java.lang.Object r11 = r6.A02
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r4 = r6.A01
            com.instagram.dogfoodingassistant.repository.DogfoodingAssistantRepository r4 = (com.instagram.dogfoodingassistant.repository.DogfoodingAssistantRepository) r4
            X.AnonymousClass0OU.A00(r2)
            goto L_0x0049
        L_0x003a:
            X.AnonymousClass0OU.A00(r2)
            com.instagram.dogfoodingassistant.api.DogfoodingAssistantApi r0 = r10.A01
            X.C18240wQ.A1M(r10, r11, r6, r1)
            java.lang.Object r2 = r0.A03(r11, r6)
            if (r2 == r5) goto L_0x00ac
            r4 = r10
        L_0x0049:
            X.3b6 r2 = (X.C62903b6) r2
            boolean r0 = r2 instanceof X.AnonymousClass1jA
            if (r0 == 0) goto L_0x00ad
            X.1jA r2 = (X.AnonymousClass1jA) r2
            java.lang.Object r3 = r2.A00
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S7100000_I2 r3 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S7100000_I2) r3
            r4.A00 = r3
            java.lang.String r2 = r3.A07
            if (r2 == 0) goto L_0x0068
            X.34T r0 = r4.A02
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "dogfooding_assistant_user"
            X.C18180wK.A0v(r1, r0, r2)
        L_0x0068:
            java.lang.String r2 = r3.A06
            if (r2 == 0) goto L_0x0079
            X.34T r0 = r4.A02
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "dogfooding_assistant_tag"
            X.C18180wK.A0v(r1, r0, r2)
        L_0x0079:
            X.34T r0 = r4.A02
            long r1 = java.lang.System.currentTimeMillis()
            r8 = 14400000(0xdbba00, double:7.1145453E-317)
            long r1 = r1 + r8
            android.content.SharedPreferences r9 = r0.A00
            android.content.SharedPreferences$Editor r8 = r9.edit()
            java.lang.String r0 = "dogfooding_assistant_expire_time"
            X.AnonymousClass0wJ.A12(r8, r0, r1)
            r0 = 0
            X.C04220Ms.A0B(r11, r0)
            android.content.SharedPreferences$Editor r1 = r9.edit()
            java.lang.String r0 = "dogfooding_assistant_session"
            X.C18180wK.A0v(r1, r0, r11)
            r2 = 0
            r1 = 13
            kotlin.coroutines.jvm.internal.KtSLambdaShape2S1200000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape2S1200000_I2
            r0.<init>(r4, r11, r2, r1)
            X.C18240wQ.A1M(r3, r2, r6, r7)
            java.lang.Object r0 = X.AnonymousClass7Ja.A01(r6, r0)
            if (r0 != r5) goto L_0x0029
        L_0x00ac:
            return r5
        L_0x00ad:
            boolean r0 = r2 instanceof X.AnonymousClass1jB
            if (r0 != 0) goto L_0x002d
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00b6:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1 r6 = new kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1
            r6.<init>(r10, r12, r3)
            goto L_0x0016
        L_0x00bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.dogfoodingassistant.repository.DogfoodingAssistantRepository.A00(java.lang.String, X.8n9):java.lang.Object");
    }

    public /* synthetic */ DogfoodingAssistantRepository(UserSession userSession) {
        AnonymousClass34T r1 = new AnonymousClass34T(AnonymousClass3Zs.A03(userSession).A02(D2R.A0s, AnonymousClass34T.class));
        DogfoodingAssistantApi dogfoodingAssistantApi = new DogfoodingAssistantApi(userSession);
        this.A02 = r1;
        this.A01 = dogfoodingAssistantApi;
    }
}
