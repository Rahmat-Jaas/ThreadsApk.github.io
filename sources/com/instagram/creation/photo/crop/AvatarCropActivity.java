package com.instagram.creation.photo.crop;

import X.AnonymousClass01J;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0wJ;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18250wR;
import X.C25529DnJ;
import X.C30975Gcb;
import X.C33660Hs7;
import X.FOQ;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.creation.base.CropInfo;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public final class AvatarCropActivity extends IgFragmentActivity implements C33660Hs7 {
    public UserSession A00;

    public final void Bns() {
        setResult(0);
        finish();
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void BzC(Location location, Uri uri, CropInfo cropInfo, String str, String str2, String str3, HashMap hashMap, int i, int i2) {
        C18200wM.A10(this, C18250wR.A05(uri.toString()));
    }

    public final void onCreate(Bundle bundle) {
        int A002 = C14030oh.A00(975380221);
        requestWindowFeature(1);
        super.onCreate(bundle);
        C30975Gcb.A01(this);
        AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
        Bundle A0C = C18190wL.A0C(this);
        if (A0C != null) {
            this.A00 = r1.A06(A0C);
            setContentView((int) R.layout.activity_single_container);
            if (getSupportFragmentManager().A0L(R.id.layout_container_main) == null) {
                AnonymousClass01J A0L = C18220wO.A0L(this);
                C25529DnJ.A02.A01();
                FOQ foq = new FOQ();
                foq.setArguments(C18190wL.A0C(this));
                A0L.A0D(foq, R.id.layout_container_main);
                A0L.A00();
            }
            C14030oh.A07(-376666201, A002);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A07(1347945438, A002);
        throw A0b;
    }
}
