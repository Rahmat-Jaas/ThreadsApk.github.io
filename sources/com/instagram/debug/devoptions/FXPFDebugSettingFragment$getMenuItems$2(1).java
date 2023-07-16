package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C14030oh;
import X.C26141q7;
import X.C35762Os;
import X.C83964sH;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public final class FXPFDebugSettingFragment$getMenuItems$2 implements View.OnClickListener {
    public final /* synthetic */ String $flow;
    public final /* synthetic */ FXPFDebugSettingFragment$getMenuItems$linkingCallback$1 $linkingCallback;
    public final /* synthetic */ FXPFDebugSettingFragment this$0;

    public FXPFDebugSettingFragment$getMenuItems$2(FXPFDebugSettingFragment fXPFDebugSettingFragment, FXPFDebugSettingFragment$getMenuItems$linkingCallback$1 fXPFDebugSettingFragment$getMenuItems$linkingCallback$1, String str) {
        this.this$0 = fXPFDebugSettingFragment;
        this.$linkingCallback = fXPFDebugSettingFragment$getMenuItems$linkingCallback$1;
        this.$flow = str;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1609119766);
        FXPFDebugSettingFragment fXPFDebugSettingFragment = this.this$0;
        FragmentActivity activity = fXPFDebugSettingFragment.getActivity();
        if (activity != null) {
            FXPFDebugSettingFragment$getMenuItems$linkingCallback$1 fXPFDebugSettingFragment$getMenuItems$linkingCallback$1 = this.$linkingCallback;
            String str = this.$flow;
            C35762Os.A00();
            UserSession A0X = AnonymousClass0wJ.A0X(fXPFDebugSettingFragment.userSession$delegate);
            AnonymousClass0wJ.A1M(A0X, 0, fXPFDebugSettingFragment$getMenuItems$linkingCallback$1);
            new C26141q7((Activity) activity, (C10300i6) A0X, (C83964sH) fXPFDebugSettingFragment$getMenuItems$linkingCallback$1).A06(str);
        }
        C14030oh.A0C(-492443234, A05);
    }
}
