package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import java.io.File;

/* renamed from: X.7s7  reason: invalid class name and case insensitive filesystem */
public final class C131487s7 implements C21800C0z {
    public final /* synthetic */ AnonymousClass601 A00;
    public final /* synthetic */ C63893iY A01;
    public final /* synthetic */ File A02;

    public final /* synthetic */ void Bsd(View view) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r4 == 1) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            r0 = 1
            if (r4 != r0) goto L_0x0019
            r0 = -1
            if (r5 != r0) goto L_0x001b
            java.io.File r0 = r3.A02
            android.net.Uri r2 = android.net.Uri.fromFile(r0)
            X.601 r1 = r3.A00
            X.3iY r0 = r3.A01
            X.AnonymousClass7GY.A01(r2, r1, r0)
        L_0x0013:
            X.601 r0 = r3.A00
            X.C63913ic.A0R(r0, r3)
            return
        L_0x0019:
            if (r4 != r0) goto L_0x0024
        L_0x001b:
            if (r5 != 0) goto L_0x0024
            X.601 r1 = r3.A00
            X.3iY r0 = r3.A01
            X.AnonymousClass7GY.A02(r1, r0)
        L_0x0024:
            java.io.File r0 = r3.A02
            r0.delete()
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131487s7.onActivityResult(int, int, android.content.Intent):void");
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public C131487s7(AnonymousClass601 r1, C63893iY r2, File file) {
        this.A02 = file;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onDestroyView() {
        C63913ic.A0R(this.A00, this);
    }
}
