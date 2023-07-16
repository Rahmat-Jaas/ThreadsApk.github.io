package com.instagram.debug.devoptions.cam;

import X.AnonymousClass5z2;
import X.AnonymousClass5z3;
import X.C100976Pk;
import X.C146958n9;
import X.C83234r0;
import X.C86074wE;
import kotlin.Unit;

public final class MediaKitDevOptionViewModel$duplicateMediaKit$1$1$emit$2 implements C83234r0 {
    public final /* synthetic */ C100976Pk $it;
    public final /* synthetic */ MediaKitDevOptionViewModel this$0;

    public MediaKitDevOptionViewModel$duplicateMediaKit$1$1$emit$2(MediaKitDevOptionViewModel mediaKitDevOptionViewModel, C100976Pk r2) {
        this.this$0 = mediaKitDevOptionViewModel;
        this.$it = r2;
    }

    public final Object emit(C100976Pk r3, C146958n9 r4) {
        C86074wE.A01(this.this$0._loadingListState, this.$it instanceof AnonymousClass5z3);
        if (r3 instanceof AnonymousClass5z2) {
            this.this$0.fetchMediaKitList();
        }
        return Unit.A00;
    }
}
