package X;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* renamed from: X.049  reason: invalid class name */
public final class AnonymousClass049 extends InputConnectionWrapper {
    public final /* synthetic */ AnonymousClass04C A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass049(InputConnection inputConnection, AnonymousClass04C r3) {
        super(inputConnection, false);
        this.A00 = r3;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        AnonymousClass04C r2 = this.A00;
        AnonymousClass04F r1 = null;
        if (inputContentInfo != null) {
            r1 = new AnonymousClass04F(new AnonymousClass01M(inputContentInfo));
        }
        if (r2.Br5(bundle, r1, i)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
