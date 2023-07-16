package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* renamed from: X.03l  reason: invalid class name and case insensitive filesystem */
public final class C008003l implements C003901u {
    public final ContentInfo.Builder A00;

    public final C004101w AB3() {
        return new C004101w(new AnonymousClass03W(this.A00.build()));
    }

    public final void Cl9(int i) {
        this.A00.setFlags(i);
    }

    public final void CmY(Uri uri) {
        this.A00.setLinkUri(uri);
    }

    public final void setExtras(Bundle bundle) {
        this.A00.setExtras(bundle);
    }

    public C008003l(ClipData clipData, int i) {
        this.A00 = new ContentInfo.Builder(clipData, i);
    }
}
