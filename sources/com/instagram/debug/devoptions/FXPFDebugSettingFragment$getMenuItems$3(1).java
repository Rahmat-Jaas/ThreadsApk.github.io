package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.AnonymousClass2AI;
import X.C04220Ms;
import X.C14030oh;
import X.C18180wK;
import X.C26141q7;
import X.C28781uy;
import X.C35762Os;
import android.view.View;
import com.instagram.service.session.UserSession;

public final class FXPFDebugSettingFragment$getMenuItems$3 implements View.OnClickListener {
    public final /* synthetic */ String $flow;
    public final /* synthetic */ FXPFDebugSettingFragment$getMenuItems$linkingCallback$1 $linkingCallback;
    public final /* synthetic */ FXPFDebugSettingFragment this$0;

    public FXPFDebugSettingFragment$getMenuItems$3(FXPFDebugSettingFragment fXPFDebugSettingFragment, FXPFDebugSettingFragment$getMenuItems$linkingCallback$1 fXPFDebugSettingFragment$getMenuItems$linkingCallback$1, String str) {
        this.this$0 = fXPFDebugSettingFragment;
        this.$linkingCallback = fXPFDebugSettingFragment$getMenuItems$linkingCallback$1;
        this.$flow = str;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1227229492);
        AnonymousClass2AI r6 = AnonymousClass2AI.A04;
        FXPFDebugSettingFragment fXPFDebugSettingFragment = this.this$0;
        C04220Ms.A0C(fXPFDebugSettingFragment, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        C26141q7 A00 = C35762Os.A00().A00(this.this$0, AnonymousClass0wJ.A0X(this.this$0.userSession$delegate), this.$linkingCallback);
        String str = this.$flow;
        UserSession A0X = AnonymousClass0wJ.A0X(this.this$0.userSession$delegate);
        if (r6 instanceof C28781uy) {
            C04220Ms.A0B(str, 2);
            A00.A06(str);
        } else {
            C18180wK.A1P(fXPFDebugSettingFragment, 0, A0X);
            r6.A04(fXPFDebugSettingFragment, A0X);
        }
        C14030oh.A0C(-826035373, A05);
    }
}
