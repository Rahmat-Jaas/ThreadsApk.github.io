package com.instagram.debug.devoptions;

import X.AnonymousClass00U;
import X.C18250wR;
import X.C41026Luf;
import android.content.Context;

public final class PublicDeveloperOptions$showCasperResult$1 implements Runnable {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ long $minutes;

    public PublicDeveloperOptions$showCasperResult$1(Context context, long j) {
        this.$context = context;
        this.$minutes = j;
    }

    public final void run() {
        C41026Luf luf = new C41026Luf(this.$context);
        luf.A01.A0C = AnonymousClass00U.A08(this.$minutes, "Result is: ");
        luf.A03(AnonymousClass1.INSTANCE, 2131831976);
        C18250wR.A0u(luf);
    }
}
