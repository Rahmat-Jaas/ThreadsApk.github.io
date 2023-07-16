package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C1203279s;
import X.C14030oh;
import android.view.View;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.service.session.UserSession;

public final class OnDeviceModelLoader$onViewCreated$3 implements View.OnClickListener {
    public final /* synthetic */ OnDeviceModelLoader this$0;

    public OnDeviceModelLoader$onViewCreated$3(OnDeviceModelLoader onDeviceModelLoader) {
        this.this$0 = onDeviceModelLoader;
    }

    public final void onClick(View view) {
        String str;
        int A05 = C14030oh.A05(-926053585);
        IgTextView igTextView = this.this$0.resultView;
        if (igTextView == null) {
            str = "resultView";
        } else {
            igTextView.setText("");
            UserSession A0X = AnonymousClass0wJ.A0X(this.this$0.userSession$delegate);
            IgEditText igEditText = this.this$0.modelInput;
            if (igEditText == null) {
                str = "modelInput";
            } else {
                String A0n = AnonymousClass0wJ.A0n(igEditText);
                IgEditText igEditText2 = this.this$0.assetInput;
                if (igEditText2 == null) {
                    str = "assetInput";
                } else {
                    String A0n2 = AnonymousClass0wJ.A0n(igEditText2);
                    IgEditText igEditText3 = this.this$0.versionInput;
                    if (igEditText3 == null) {
                        str = "versionInput";
                    } else {
                        C1203279s r2 = new C1203279s(A0X, A0n, A0n2, AnonymousClass0wJ.A0n(igEditText3));
                        OnDeviceModelLoader onDeviceModelLoader = this.this$0;
                        C04220Ms.A0B(onDeviceModelLoader, 0);
                        r2.A01 = onDeviceModelLoader;
                        r2.A03(true);
                        C14030oh.A0C(1967001360, A05);
                        return;
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
