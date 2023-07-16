package com.instagram.shopping.repository.destination.home;

import X.AnonymousClass0OU;
import X.AnonymousClass0YY;
import X.C11630kW;
import X.C146958n9;
import X.C18149Aad;
import X.C18240wQ;
import X.C19560AyM;
import X.C25817DsW;
import X.C39142Kno;
import X.C63623hv;
import X.C84714tk;
import X.C86124wJ;
import X.C86164wN;
import X.D0E;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0110000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S1210000_I2;

@DebugMetadata(c = "com.instagram.shopping.repository.destination.home.ShoppingHomeLiveRepository$fetchHeartbeat$1$1", f = "ShoppingHomeLiveRepository.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
public final class ShoppingHomeLiveRepository$fetchHeartbeat$1$1 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public final /* synthetic */ C18149Aad A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingHomeLiveRepository$fetchHeartbeat$1$1(C18149Aad aad, String str, C146958n9 r4, boolean z) {
        super(1, r4);
        this.A01 = aad;
        this.A02 = str;
        this.A03 = z;
    }

    public final C146958n9 create(C146958n9 r5) {
        return new ShoppingHomeLiveRepository$fetchHeartbeat$1$1(this.A01, this.A02, r5, this.A03);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            C18149Aad aad = this.A01;
            UserSession userSession = aad.A04;
            C11630kW r0 = aad.A02;
            String str = this.A02;
            IDxFlowShape93S0200000_1_I2 A0V = C86124wJ.A0V(C63623hv.A03(C19560AyM.A00(userSession, str, r0.getModuleName()).A02(), 1266612415, C18240wQ.A1X(str) ? 1 : 0, 14), 31);
            boolean z = this.A03;
            C84714tk A07 = C63623hv.A07(new KtSLambdaShape2S0110000_I2(aad, (C146958n9) null, 23, z), C63623hv.A08(new KtSLambdaShape2S1210000_I2((Object) aad, str, (C146958n9) null, 1, z), A0V));
            this.A00 = 1;
            if (C25817DsW.A01(this, A07) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((ShoppingHomeLiveRepository$fetchHeartbeat$1$1) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }
}
