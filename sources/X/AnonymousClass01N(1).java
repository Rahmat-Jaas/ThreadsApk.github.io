package X;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;

/* renamed from: X.01N  reason: invalid class name */
public final /* synthetic */ class AnonymousClass01N implements AnonymousClass04C {
    public final /* synthetic */ View A00;

    public /* synthetic */ AnonymousClass01N(View view) {
        this.A00 = view;
    }

    public final boolean Br5(Bundle bundle, AnonymousClass04F r9, int i) {
        View view = this.A00;
        if ((i & 1) != 0) {
            try {
                InputContentInfo inputContentInfo = ((AnonymousClass01M) r9.A00).A00;
                inputContentInfo.requestPermission();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        InputContentInfo inputContentInfo2 = ((AnonymousClass01M) r9.A00).A00;
        C003801t r0 = new C003801t(new ClipData(inputContentInfo2.getDescription(), new ClipData.Item(inputContentInfo2.getContentUri())), 2);
        Uri linkUri = inputContentInfo2.getLinkUri();
        C003901u r02 = r0.A00;
        r02.CmY(linkUri);
        r02.setExtras(bundle);
        if (C006702y.A02(view, r02.AB3()) == null) {
            return true;
        }
        return false;
    }
}
