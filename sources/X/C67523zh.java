package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.3zh  reason: invalid class name and case insensitive filesystem */
public final class C67523zh implements C81934oe {
    public final /* synthetic */ C19140zM A00;

    public C67523zh(C19140zM r1) {
        this.A00 = r1;
    }

    public final void Br6(Bundle bundle, AnonymousClass32F r5) {
        FragmentActivity requireActivity = this.A00.requireActivity();
        Intent A002 = AnonymousClass3XO.A00(requireActivity.getIntent(), bundle, r5);
        int i = 0;
        if (r5 == null) {
            i = -1;
        }
        requireActivity.setResult(i, A002);
        requireActivity.finish();
    }
}
