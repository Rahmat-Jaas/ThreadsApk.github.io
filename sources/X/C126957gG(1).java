package X;

import com.facebook.pando.Summary;

/* renamed from: X.7gG  reason: invalid class name and case insensitive filesystem */
public final class C126957gG implements C145218k7 {
    public final C83334rD A00;

    public final void CRg(Summary summary, Object obj) {
        this.A00.onSuccess(new AnonymousClass5z0(summary, obj, 200));
    }

    public final void onError(String str) {
        this.A00.onFailure(new Throwable(str));
    }

    public C126957gG(C83334rD r1) {
        this.A00 = r1;
    }
}
