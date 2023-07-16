package com.instagram.debug.devoptions.cam;

import X.AnonymousClass0wJ;
import X.AnonymousClass3XJ;
import X.C04220Ms;
import X.C14030oh;
import X.C26224E4q;
import X.C84764tp;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.mediakit.analytics.MediaKitEntryPoint;
import com.instagram.mediakit.config.MediaKitConfig;
import com.instagram.service.session.UserSession;

public final class MediaKitDevOptionFragment$updateActionBar$1 implements View.OnClickListener {
    public final /* synthetic */ boolean $isNew;
    public final /* synthetic */ MediaKitDevOptionFragment this$0;

    public MediaKitDevOptionFragment$updateActionBar$1(boolean z, MediaKitDevOptionFragment mediaKitDevOptionFragment) {
        this.$isNew = z;
        this.this$0 = mediaKitDevOptionFragment;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(2061777216);
        if (this.$isNew) {
            C84764tp A00 = AnonymousClass3XJ.A00();
            FragmentActivity requireActivity = this.this$0.requireActivity();
            UserSession A0X = AnonymousClass0wJ.A0X(this.this$0.userSession$delegate);
            C04220Ms.A0B(A0X, 1);
            C26224E4q.A00(requireActivity, new MediaKitConfig(MediaKitEntryPoint.DEV_OPTIONS, (String) null, (String) null), (C26224E4q) A00, A0X);
        } else {
            this.this$0.getMediaKitDevOptionViewModel().updateMediaKitJson((String) this.this$0.mediaKitJsonValue.getValue());
        }
        C14030oh.A0C(29689400, A05);
    }
}
