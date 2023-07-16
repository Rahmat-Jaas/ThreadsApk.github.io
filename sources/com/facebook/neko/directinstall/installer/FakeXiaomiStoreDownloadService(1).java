package com.facebook.neko.directinstall.installer;

import X.AnonymousClass5NI;
import X.C111446nh;
import X.C14030oh;
import android.os.Bundle;
import com.xiaomi.market.IDownloadCallback;
import com.xiaomi.market.IMarketDownloadService;

public final class FakeXiaomiStoreDownloadService extends IMarketDownloadService.Stub {
    public IDownloadCallback A00;
    public String A01;
    public final C111446nh A02 = new AnonymousClass5NI(this);

    public FakeXiaomiStoreDownloadService() {
        int A03 = C14030oh.A03(303336049);
        C14030oh.A0A(698200755, A03);
    }

    public final boolean AC8(String str) {
        int A03 = C14030oh.A03(-766254722);
        int A032 = C14030oh.A03(-1537892000);
        this.A01 = null;
        this.A00 = null;
        C14030oh.A0A(-2048853029, A032);
        C14030oh.A0A(-1028624088, A03);
        return true;
    }

    public final boolean AIZ(Bundle bundle) {
        int A03 = C14030oh.A03(-1574708869);
        this.A01 = bundle.getString("packageName");
        this.A02.A00();
        C14030oh.A0A(-2099745228, A03);
        return true;
    }

    public final int AOG() {
        C14030oh.A0A(38506948, C14030oh.A03(-386961383));
        return 1;
    }

    public final boolean BSb() {
        C14030oh.A0A(-302789340, C14030oh.A03(-1311441955));
        return true;
    }

    public final boolean CW7(String str) {
        C14030oh.A0A(1416811659, C14030oh.A03(1552795857));
        return false;
    }

    public final boolean CZw(IDownloadCallback iDownloadCallback) {
        int A03 = C14030oh.A03(984874151);
        this.A00 = iDownloadCallback;
        C14030oh.A0A(-2068447587, A03);
        return true;
    }

    public final boolean Cf2(String str) {
        C14030oh.A0A(299937920, C14030oh.A03(777418995));
        return false;
    }

    public final boolean D81(IDownloadCallback iDownloadCallback) {
        int A03 = C14030oh.A03(96305412);
        this.A00 = null;
        C14030oh.A0A(-1960604056, A03);
        return true;
    }
}
