package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C146958n9;
import X.C18180wK;
import X.C39142Kno;
import X.C83224qz;
import X.C86074wE;
import X.D0E;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.cam.CamDevOptionsViewModel$toggleBCCreatorMarketplaceOnboarding$1", f = "CamDevOptionsViewModel.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
public final class CamDevOptionsViewModel$toggleBCCreatorMarketplaceOnboarding$1 extends C39142Kno implements AnonymousClass0YP {
    public int label;
    public final /* synthetic */ CamDevOptionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CamDevOptionsViewModel$toggleBCCreatorMarketplaceOnboarding$1(CamDevOptionsViewModel camDevOptionsViewModel, C146958n9 r3) {
        super(2, r3);
        this.this$0 = camDevOptionsViewModel;
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        return new CamDevOptionsViewModel$toggleBCCreatorMarketplaceOnboarding$1(this.this$0, r4);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return new CamDevOptionsViewModel$toggleBCCreatorMarketplaceOnboarding$1(this.this$0, r4).invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0OU.A00(obj);
            C86074wE.A01(this.this$0._creatorMarketplaceOnboardingLoading, true);
            boolean z = !AnonymousClass0wJ.A1X(this.this$0.isOnboardedToCreatorMarketplace.getValue());
            BrandedContentSettingsRepository brandedContentSettingsRepository = this.this$0.brandedContentRepository;
            this.label = 1;
            obj = brandedContentSettingsRepository.A02(this, z);
            if (obj == d0e) {
                return d0e;
            }
        } else if (i == 1) {
            AnonymousClass0OU.A00(obj);
        } else {
            throw AnonymousClass0wJ.A0a();
        }
        boolean A1X = AnonymousClass0wJ.A1X(obj);
        CamDevOptionsViewModel camDevOptionsViewModel = this.this$0;
        if (A1X) {
            camDevOptionsViewModel.fetchCreatorMarketplaceOnboardingStatus();
            this.this$0.showToast(2131825570);
        } else {
            camDevOptionsViewModel._creatorMarketplaceOnboardingLoading.CrC(C18180wK.A0X());
            this.this$0.notifyFailure();
        }
        this.this$0.hideLoading();
        return Unit.A00;
    }
}
