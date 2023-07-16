package androidx.core.view;

import X.AnonymousClass0YP;
import X.C1366983y;
import X.C146958n9;
import X.C39144Knq;
import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {414, 416}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
public final class ViewKt$allViews$1 extends C39144Knq implements AnonymousClass0YP {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ View A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, C146958n9 r3) {
        super(2, r3);
        this.A02 = view;
    }

    /* renamed from: A00 */
    public final Object invoke(C146958n9 r3, C1366983y r4) {
        return ((ViewKt$allViews$1) create(r4, r3)).invokeSuspend(Unit.A00);
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.A02, r4);
        viewKt$allViews$1.A01 = obj;
        return viewKt$allViews$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r4 = X.AnonymousClass4WN.A00()
            int r0 = r5.A00
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r1) goto L_0x0026
            X.AnonymousClass0OU.A00(r6)
        L_0x000f:
            kotlin.Unit r4 = kotlin.Unit.A00
            return r4
        L_0x0012:
            X.AnonymousClass0OU.A00(r6)
            java.lang.Object r2 = r5.A01
            X.83y r2 = (X.C1366983y) r2
            android.view.View r0 = r5.A02
            r5.A01 = r2
            r5.A00 = r1
            java.lang.Object r0 = r2.A00(r0, r5)
            if (r0 != r4) goto L_0x002d
            return r4
        L_0x0026:
            java.lang.Object r2 = r5.A01
            X.83y r2 = (X.C1366983y) r2
            X.AnonymousClass0OU.A00(r6)
        L_0x002d:
            android.view.View r1 = r5.A02
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x000f
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.8mw r1 = X.AnonymousClass033.A01(r1)
            r0 = 0
            r5.A01 = r0
            r5.A00 = r3
            java.lang.Object r0 = r2.A01(r5, r1)
            if (r0 != r4) goto L_0x000f
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewKt$allViews$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
