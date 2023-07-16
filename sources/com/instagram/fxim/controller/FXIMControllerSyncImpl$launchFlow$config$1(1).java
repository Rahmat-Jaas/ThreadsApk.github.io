package com.instagram.fxim.controller;

import X.AnonymousClass24Z;
import X.AnonymousClass3GB;
import X.C146958n9;
import X.C22291Ug;
import X.C25237DiI;
import X.C27952Ew2;
import X.C70054Ca;
import X.C81494nt;
import android.os.Parcel;
import com.bloks.foa.cds.bottomsheet.config.CdsOpenScreenDismissCallback;
import com.instagram.arp.profilepicture.AvatarProfilePictureHelper$saveAvatarProfilePicture$1;

public final class FXIMControllerSyncImpl$launchFlow$config$1 implements CdsOpenScreenDismissCallback {
    public final /* synthetic */ C81494nt A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    public FXIMControllerSyncImpl$launchFlow$config$1(C81494nt r1) {
        this.A00 = r1;
    }

    public final void Bu6(int i) {
        C70054Ca r0 = (C70054Ca) this.A00;
        AnonymousClass3GB r3 = r0.A00;
        C22291Ug r02 = r0.A01;
        AnonymousClass24Z r4 = r02.A00;
        String str = r02.A02;
        String str2 = r02.A01;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new AvatarProfilePictureHelper$saveAvatarProfilePicture$1(r3, r4, str, str2, (C146958n9) null), r3.A09, 3);
    }
}
