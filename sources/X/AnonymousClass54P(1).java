package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.54P  reason: invalid class name */
public final class AnonymousClass54P extends C123497Xd {
    public final /* synthetic */ AnonymousClass7H8 A00;
    public final /* synthetic */ AnonymousClass0YP A01;

    public final C146098ld Bg2(C147618pd r5, List list, long j) {
        C04220Ms.A0B(r5, 0);
        AnonymousClass7H8 r3 = this.A00;
        AnonymousClass7Y7 r2 = r3.A05;
        AnonymousClass69J layoutDirection = r5.getLayoutDirection();
        C04220Ms.A0B(layoutDirection, 0);
        r2.A02 = layoutDirection;
        r2.A00 = r5.Acr();
        r2.A01 = r5.AjK();
        r3.A00 = 0;
        return new C123617Xu(r3, (C146098ld) this.A01.invoke(r2, new Constraints(j)), r3.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass54P(AnonymousClass7H8 r2, AnonymousClass0YP r3) {
        super("Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.");
        this.A00 = r2;
        this.A01 = r3;
    }
}
