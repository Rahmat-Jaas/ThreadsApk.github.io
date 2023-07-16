package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C146958n9;
import X.C18180wK;
import X.C39142Kno;
import X.C83224qz;
import X.D0E;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.cam.CamDevOptionsViewModel$fetchBrandedContentEligibility$1", f = "CamDevOptionsViewModel.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
public final class CamDevOptionsViewModel$fetchBrandedContentEligibility$1 extends C39142Kno implements AnonymousClass0YP {
    public int label;
    public final /* synthetic */ CamDevOptionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CamDevOptionsViewModel$fetchBrandedContentEligibility$1(CamDevOptionsViewModel camDevOptionsViewModel, C146958n9 r3) {
        super(2, r3);
        this.this$0 = camDevOptionsViewModel;
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        return new CamDevOptionsViewModel$fetchBrandedContentEligibility$1(this.this$0, r4);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return new CamDevOptionsViewModel$fetchBrandedContentEligibility$1(this.this$0, r4).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0OU.A00(obj);
            BrandedContentSettingsRepository brandedContentSettingsRepository = this.this$0.brandedContentRepository;
            List A0n = C18180wK.A0n(UserMonetizationProductType.BRANDED_CONTENT);
            this.label = 1;
            if (brandedContentSettingsRepository.A01(A0n, this) == d0e) {
                return d0e;
            }
        } else if (i == 1) {
            AnonymousClass0OU.A00(obj);
        } else {
            throw AnonymousClass0wJ.A0a();
        }
        this.this$0._bcEligibilityLoading.CrC(C18180wK.A0X());
        this.this$0.hideLoading();
        return Unit.A00;
    }
}
