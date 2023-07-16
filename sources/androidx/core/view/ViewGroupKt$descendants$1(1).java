package androidx.core.view;

import X.AnonymousClass0YP;
import X.C1366983y;
import X.C146958n9;
import X.C39144Knq;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {119, 121}, m = "invokeSuspend", n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
public final class ViewGroupKt$descendants$1 extends C39144Knq implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ ViewGroup A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewGroupKt$descendants$1(ViewGroup viewGroup, C146958n9 r3) {
        super(2, r3);
        this.A06 = viewGroup;
    }

    /* renamed from: A00 */
    public final Object invoke(C146958n9 r3, C1366983y r4) {
        return ((ViewGroupKt$descendants$1) create(r4, r3)).invokeSuspend(Unit.A00);
    }

    public final C146958n9 create(Object obj, C146958n9 r4) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.A06, r4);
        viewGroupKt$descendants$1.A05 = obj;
        return viewGroupKt$descendants$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r8 = X.AnonymousClass4WN.A00()
            int r0 = r9.A02
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0066
            int r5 = r9.A01
            int r4 = r9.A00
            if (r0 == r6) goto L_0x0039
            java.lang.Object r3 = r9.A03
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r2 = r9.A05
            X.83y r2 = (X.C1366983y) r2
            X.AnonymousClass0OU.A00(r10)
        L_0x001b:
            int r4 = r4 + 1
        L_0x001d:
            if (r4 >= r5) goto L_0x0075
            android.view.View r1 = r3.getChildAt(r4)
            X.C04220Ms.A06(r1)
            r9.A05 = r2
            r9.A03 = r3
            r9.A04 = r1
            r9.A00 = r4
            r9.A01 = r5
            r9.A02 = r6
            java.lang.Object r0 = r2.A00(r1, r9)
            if (r0 != r8) goto L_0x0048
            return r8
        L_0x0039:
            java.lang.Object r1 = r9.A04
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r3 = r9.A03
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r2 = r9.A05
            X.83y r2 = (X.C1366983y) r2
            X.AnonymousClass0OU.A00(r10)
        L_0x0048:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x001b
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.8mw r1 = X.AnonymousClass033.A01(r1)
            r9.A05 = r2
            r9.A03 = r3
            r0 = 0
            r9.A04 = r0
            r9.A00 = r4
            r9.A01 = r5
            r9.A02 = r7
            java.lang.Object r0 = r2.A01(r9, r1)
            if (r0 != r8) goto L_0x001b
            return r8
        L_0x0066:
            X.AnonymousClass0OU.A00(r10)
            java.lang.Object r2 = r9.A05
            X.83y r2 = (X.C1366983y) r2
            android.view.ViewGroup r3 = r9.A06
            r4 = 0
            int r5 = r3.getChildCount()
            goto L_0x001d
        L_0x0075:
            kotlin.Unit r8 = kotlin.Unit.A00
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewGroupKt$descendants$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
