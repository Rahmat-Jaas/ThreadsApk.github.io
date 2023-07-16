package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C39142Kno;
import X.C83224qz;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.cam.CamDevOptionsViewModel$toggleBrandedContentPaidPartnershipLabel$1", f = "CamDevOptionsViewModel.kt", i = {0}, l = {182}, m = "invokeSuspend", n = {"newOptInStatus"}, s = {"I$0"})
public final class CamDevOptionsViewModel$toggleBrandedContentPaidPartnershipLabel$1 extends C39142Kno implements AnonymousClass0YP {
    public int I$0;
    public int label;
    public final /* synthetic */ CamDevOptionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CamDevOptionsViewModel$toggleBrandedContentPaidPartnershipLabel$1(CamDevOptionsViewModel camDevOptionsViewModel, C146958n9 r3) {
        super(2, r3);
        this.this$0 = camDevOptionsViewModel;
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        return new CamDevOptionsViewModel$toggleBrandedContentPaidPartnershipLabel$1(this.this$0, r4);
    }

    public final Object invoke(C83224qz r3, C146958n9 r4) {
        return new CamDevOptionsViewModel$toggleBrandedContentPaidPartnershipLabel$1(this.this$0, r4).invokeSuspend(Unit.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.D0E r4 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r3) goto L_0x0069
            int r2 = r5.I$0
            X.AnonymousClass0OU.A00(r6)
        L_0x000e:
            boolean r1 = X.AnonymousClass0wJ.A1X(r6)
            com.instagram.debug.devoptions.cam.CamDevOptionsViewModel r0 = r5.this$0
            if (r1 == 0) goto L_0x0031
            if (r2 != 0) goto L_0x0019
            r3 = 0
        L_0x0019:
            r0.configureUserEligibility(r3)
            com.instagram.debug.devoptions.cam.CamDevOptionsViewModel r0 = r5.this$0
            r0.fetchBrandedContentEligibility()
            com.instagram.debug.devoptions.cam.CamDevOptionsViewModel r1 = r5.this$0
            r0 = 2131825571(0x7f1113a3, float:1.9284002E38)
            r1.showToast(r0)
        L_0x0029:
            com.instagram.debug.devoptions.cam.CamDevOptionsViewModel r0 = r5.this$0
            r0.hideLoading()
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0031:
            X.4wE r1 = r0._bcEligibilityLoading
            java.lang.Boolean r0 = X.C18180wK.A0X()
            r1.CrC(r0)
            com.instagram.debug.devoptions.cam.CamDevOptionsViewModel r0 = r5.this$0
            r0.notifyFailure()
            goto L_0x0029
        L_0x0040:
            X.AnonymousClass0OU.A00(r6)
            com.instagram.debug.devoptions.cam.CamDevOptionsViewModel r0 = r5.this$0
            X.4wE r0 = r0._bcEligibilityLoading
            X.C86074wE.A01(r0, r3)
            com.instagram.debug.devoptions.cam.CamDevOptionsViewModel r0 = r5.this$0
            X.4wG r0 = r0.bcEligibility
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            r2 = r0 ^ 1
            com.instagram.debug.devoptions.cam.CamDevOptionsViewModel r0 = r5.this$0
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r1 = r0.brandedContentRepository
            com.instagram.service.session.UserSession r0 = r0.userSession
            r5.I$0 = r2
            r5.label = r3
            java.lang.Object r6 = r1.A00(r0, r5, r2)
            if (r6 != r4) goto L_0x000e
            return r4
        L_0x0069:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.cam.CamDevOptionsViewModel$toggleBrandedContentPaidPartnershipLabel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
