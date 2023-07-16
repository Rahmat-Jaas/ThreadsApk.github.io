package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* renamed from: X.4x8  reason: invalid class name */
public final class AnonymousClass4x8 extends ContextWrapper {
    public final Context A00;
    public final AnonymousClass6S2 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4x8(Context context, AnonymousClass6S2 r3) {
        super(context);
        C04220Ms.A0B(r3, 2);
        this.A00 = context;
        this.A01 = r3;
    }

    public final Resources getResources() {
        Context context = this.A00;
        C04220Ms.A0B(context, 0);
        Resources resources = context.getResources();
        C04220Ms.A06(resources);
        return resources;
    }

    public static AnonymousClass4x8 A00(Context context) {
        AnonymousClass6S2 A0F = AnonymousClass7Kz.A0F();
        C04220Ms.A06(A0F);
        return new AnonymousClass4x8(context, A0F);
    }
}
