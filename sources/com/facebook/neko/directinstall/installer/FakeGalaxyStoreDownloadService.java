package com.facebook.neko.directinstall.installer;

import X.AnonymousClass0wJ;
import X.AnonymousClass5NH;
import X.C111446nh;
import X.C14030oh;
import android.os.Bundle;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService;

public final class FakeGalaxyStoreDownloadService extends IGalaxyStoreDownloadService.Stub {
    public IGalaxyStoreDownloadCallback A00;
    public String A01;
    public final C111446nh A02 = new AnonymousClass5NH(this);

    public FakeGalaxyStoreDownloadService() {
        int A03 = C14030oh.A03(1270021089);
        C14030oh.A0A(310584470, A03);
    }

    public final void ACD(String str) {
        int A03 = C14030oh.A03(-1829436563);
        int A032 = C14030oh.A03(1965328464);
        this.A01 = null;
        this.A00 = null;
        C14030oh.A0A(-1466418374, A032);
        C14030oh.A0A(-222412958, A03);
    }

    public final void AIa(Bundle bundle, IGalaxyStoreDownloadCallback iGalaxyStoreDownloadCallback) {
        int A03 = C14030oh.A03(-937945433);
        AnonymousClass0wJ.A1N(bundle, iGalaxyStoreDownloadCallback);
        this.A01 = bundle.getString("packageName");
        this.A00 = iGalaxyStoreDownloadCallback;
        this.A02.A00();
        C14030oh.A0A(1218973145, A03);
    }

    public final void BPQ(Bundle bundle) {
        C14030oh.A0A(-1050939114, C14030oh.A03(1014484981));
    }
}
