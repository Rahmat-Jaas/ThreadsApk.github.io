package com.instagram.api.prefetch;

import X.AnonymousClass006;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.C145538kf;
import X.C146958n9;
import X.C18220wO;
import X.C25238DiJ;
import X.C39142Kno;
import X.C63623hv;
import X.C86054wC;
import X.D0E;
import X.EAV;
import com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.KtLambdaShape27S0100000_I2_7;
import kotlin.jvm.internal.KtLambdaShape4S1100000_I2;

@DebugMetadata(c = "com.instagram.api.prefetch.IgApiPrefetchSchedulerExtensionsKt$getPrefetchContentLoadingResult$1", f = "IgApiPrefetchSchedulerExtensions.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
public final class IgApiPrefetchSchedulerExtensionsKt$getPrefetchContentLoadingResult$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ EAV A03;
    public final /* synthetic */ C145538kf A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgApiPrefetchSchedulerExtensionsKt$getPrefetchContentLoadingResult$1(EAV eav, C145538kf r3, String str, C146958n9 r5, long j, boolean z) {
        super(2, r5);
        this.A03 = eav;
        this.A05 = str;
        this.A02 = j;
        this.A06 = z;
        this.A04 = r3;
    }

    public final C146958n9 create(Object obj, C146958n9 r10) {
        IgApiPrefetchSchedulerExtensionsKt$getPrefetchContentLoadingResult$1 igApiPrefetchSchedulerExtensionsKt$getPrefetchContentLoadingResult$1 = new IgApiPrefetchSchedulerExtensionsKt$getPrefetchContentLoadingResult$1(this.A03, this.A04, this.A05, r10, this.A02, this.A06);
        igApiPrefetchSchedulerExtensionsKt$getPrefetchContentLoadingResult$1.A01 = obj;
        return igApiPrefetchSchedulerExtensionsKt$getPrefetchContentLoadingResult$1;
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            C86054wC r2 = (C86054wC) this.A01;
            C63623hv.A09("PrefetchScheduler-1", new KtLambdaShape27S0100000_I2_7(r2, 27));
            IDxACallbackShape112S0100000_2_I2 iDxACallbackShape112S0100000_2_I2 = new IDxACallbackShape112S0100000_2_I2(r2, 0);
            EAV eav = this.A03;
            String str = this.A05;
            if (eav.A05(iDxACallbackShape112S0100000_2_I2, this.A04, str, this.A02, this.A06) == AnonymousClass006.A0C) {
                C63623hv.A09("PrefetchScheduler-4", new KtLambdaShape27S0100000_I2_7(r2, 28));
                r2.ADR((Throwable) null);
            }
            KtLambdaShape4S1100000_I2 ktLambdaShape4S1100000_I2 = new KtLambdaShape4S1100000_I2(str, eav, 6);
            this.A00 = 1;
            if (C25238DiJ.A00(this, ktLambdaShape4S1100000_I2, r2) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgApiPrefetchSchedulerExtensionsKt$getPrefetchContentLoadingResult$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
