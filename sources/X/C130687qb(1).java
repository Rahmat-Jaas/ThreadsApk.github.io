package X;

import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.7qb  reason: invalid class name and case insensitive filesystem */
public final class C130687qb implements C144558ih {
    public RefreshableNestedScrollingParent A00;
    public boolean A01;

    public final boolean Chx(AnonymousClass3HX r3, Object obj, int i) {
        if (i != 38) {
            return false;
        }
        boolean A02 = AnonymousClass3WF.A02(obj);
        this.A01 = A02;
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.A00;
        if (refreshableNestedScrollingParent == null) {
            return true;
        }
        refreshableNestedScrollingParent.setRefreshing(A02);
        return true;
    }

    public C130687qb(boolean z) {
        this.A01 = z;
    }
}
