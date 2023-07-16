package X;

import com.instagram.nux.activity.BloksSignedOutFragmentActivity;

/* renamed from: X.3y6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C66713y6 implements C81794oP {
    public final /* synthetic */ BloksSignedOutFragmentActivity A00;

    public /* synthetic */ C66713y6(BloksSignedOutFragmentActivity bloksSignedOutFragmentActivity) {
        this.A00 = bloksSignedOutFragmentActivity;
    }

    public final void CFA() {
        BloksSignedOutFragmentActivity bloksSignedOutFragmentActivity = this.A00;
        bloksSignedOutFragmentActivity.A09.compareAndSet(true, false);
        BloksSignedOutFragmentActivity.A03(bloksSignedOutFragmentActivity);
    }
}
