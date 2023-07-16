package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* renamed from: X.4x6  reason: invalid class name */
public final class AnonymousClass4x6 extends ContextWrapper {
    public final /* synthetic */ C128707k8 A00;
    public final /* synthetic */ AnonymousClass0MJ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4x6(C128707k8 r2, AnonymousClass0MJ r3) {
        super((Context) r3.A00);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final Resources getResources() {
        Resources resources = C86154wM.A0A(this.A01.A00).getResources();
        C04220Ms.A06(resources);
        return resources;
    }
}
