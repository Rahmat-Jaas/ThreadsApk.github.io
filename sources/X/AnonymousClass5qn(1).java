package X;

import android.content.Context;

/* renamed from: X.5qn  reason: invalid class name */
public final class AnonymousClass5qn extends AnonymousClass52I {
    public final /* synthetic */ AnonymousClass5qq A00;
    public final /* synthetic */ AnonymousClass0ZU A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5qn(Context context, AnonymousClass5qq r2, AnonymousClass0ZU r3, int i) {
        super(context, i);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final void cancel() {
        AnonymousClass0ZU r0 = this.A01;
        if (r0 == null) {
            super.cancel();
        } else {
            r0.invoke();
        }
    }

    public final void onBackPressed() {
        if (!this.A00.BfI()) {
            super.onBackPressed();
        }
    }
}
