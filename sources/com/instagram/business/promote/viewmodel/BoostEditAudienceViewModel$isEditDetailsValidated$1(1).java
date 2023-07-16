package com.instagram.business.promote.viewmodel;

import X.AnonymousClass0OU;
import X.AnonymousClass0Y0;
import X.AnonymousClass0wJ;
import X.C146958n9;
import X.C39142Kno;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.business.promote.viewmodel.BoostEditAudienceViewModel$isEditDetailsValidated$1", f = "BoostEditAudienceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BoostEditAudienceViewModel$isEditDetailsValidated$1 extends C39142Kno implements AnonymousClass0Y0 {
    public /* synthetic */ int A00;
    public /* synthetic */ int A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;

    public BoostEditAudienceViewModel$isEditDetailsValidated$1(C146958n9 r2) {
        super(5, r2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int A04 = AnonymousClass0wJ.A04(obj2);
        int A042 = AnonymousClass0wJ.A04(obj3);
        BoostEditAudienceViewModel$isEditDetailsValidated$1 boostEditAudienceViewModel$isEditDetailsValidated$1 = new BoostEditAudienceViewModel$isEditDetailsValidated$1((C146958n9) obj5);
        boostEditAudienceViewModel$isEditDetailsValidated$1.A02 = obj;
        boostEditAudienceViewModel$isEditDetailsValidated$1.A00 = A04;
        boostEditAudienceViewModel$isEditDetailsValidated$1.A01 = A042;
        boostEditAudienceViewModel$isEditDetailsValidated$1.A03 = obj4;
        return boostEditAudienceViewModel$isEditDetailsValidated$1.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0OU.A00(obj);
        String str = (String) this.A02;
        int i = this.A00;
        int i2 = this.A01;
        Object obj2 = this.A03;
        boolean z = true;
        if (i > i2 || str == null || str.length() <= 0 || obj2 == null) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
