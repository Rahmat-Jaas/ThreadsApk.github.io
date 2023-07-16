package X;

import com.instagram.nux.activity.SignedOutFragmentActivity;

/* renamed from: X.1sZ  reason: invalid class name and case insensitive filesystem */
public final class C27471sZ extends AnonymousClass1hR {
    public final /* synthetic */ SignedOutFragmentActivity A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C27471sZ(androidx.fragment.app.FragmentActivity r3, com.instagram.nux.activity.SignedOutFragmentActivity r4, X.C07530bf r5) {
        /*
            r2 = this;
            r1 = 1
            java.lang.String r0 = X.C62983bG.A00()
            r2.A00 = r4
            r2.<init>(r3, r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27471sZ.<init>(androidx.fragment.app.FragmentActivity, com.instagram.nux.activity.SignedOutFragmentActivity, X.0bf):void");
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-1124997749);
        super.onFinish();
        SignedOutFragmentActivity signedOutFragmentActivity = this.A00;
        C18330wh r0 = signedOutFragmentActivity.A05;
        if (r0 != null && (r0.getOwnerActivity() == null || !signedOutFragmentActivity.A05.getOwnerActivity().isDestroyed())) {
            signedOutFragmentActivity.A05.cancel();
        }
        C14030oh.A0A(-1343414780, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-884246331);
        super.onStart();
        SignedOutFragmentActivity signedOutFragmentActivity = this.A00;
        C18330wh r0 = signedOutFragmentActivity.A05;
        if (r0 != null && !r0.isShowing()) {
            C13950oZ.A00(signedOutFragmentActivity.A05);
            C18250wR.A08().postDelayed(new AnonymousClass4PT(this), 10000);
        }
        C14030oh.A0A(-1922820037, A03);
    }
}
