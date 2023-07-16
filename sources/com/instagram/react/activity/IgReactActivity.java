package com.instagram.react.activity;

import X.AnonymousClass01J;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C34611Ibh;
import X.C39649KxS;
import android.os.Bundle;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;

public class IgReactActivity extends BaseFragmentActivity implements C39649KxS {
    public PermissionsModule A00;
    public C10300i6 A01;

    public final void CeF(PermissionsModule permissionsModule, String[] strArr, int i) {
        this.A00 = permissionsModule;
        requestPermissions(strArr, i);
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        PermissionsModule permissionsModule = this.A00;
        if (permissionsModule != null && permissionsModule.onRequestPermissionsResult(i, strArr, iArr)) {
            this.A00 = null;
        }
    }

    public final void A0D(Bundle bundle) {
        if (getSupportFragmentManager().A0L(R.id.layout_container_main) == null) {
            C34611Ibh ibh = new C34611Ibh();
            ibh.setArguments(C18190wL.A0C(this));
            AnonymousClass01J A0L = C18220wO.A0L(this);
            A0L.A0D(ibh, R.id.layout_container_main);
            A0L.A00();
        }
    }

    public final void finish() {
        super.finish();
        C18200wM.A11(this, getIntent(), "IgReactActivity.EXTRA_ACTIVITY_ANIMATION");
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(-1930693958);
        super.onCreate(bundle);
        this.A01 = C18190wL.A0S(C18190wL.A0C(this));
        int[] intArrayExtra = getIntent().getIntArrayExtra("IgReactActivity.EXTRA_ACTIVITY_ANIMATION");
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            overridePendingTransition(intArrayExtra[0], intArrayExtra[1]);
        }
        C14030oh.A07(79003697, A002);
    }
}
