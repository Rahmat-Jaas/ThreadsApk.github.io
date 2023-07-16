package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C04220Ms;
import X.C133657w8;
import X.C24854Db8;
import X.C28101EyY;
import X.DC1;

public final class MediaKitDevOptionFragment$loggable$2 extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ MediaKitDevOptionFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaKitDevOptionFragment$loggable$2(MediaKitDevOptionFragment mediaKitDevOptionFragment) {
        super(0);
        this.this$0 = mediaKitDevOptionFragment;
    }

    public final C28101EyY invoke() {
        C24854Db8 A00 = DC1.A00(AnonymousClass0wJ.A0X(this.this$0.userSession$delegate));
        MediaKitDevOptionFragment mediaKitDevOptionFragment = this.this$0;
        C04220Ms.A0B(mediaKitDevOptionFragment, 0);
        return new C133657w8(mediaKitDevOptionFragment, A00);
    }
}
