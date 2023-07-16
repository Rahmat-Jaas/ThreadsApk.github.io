package X;

import android.transition.Transition;
import java.util.ArrayList;

/* renamed from: X.05T  reason: invalid class name */
public final class AnonymousClass05T implements Transition.TransitionListener {
    public final /* synthetic */ C12810mW A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public AnonymousClass05T(C12810mW r1, Object obj, Object obj2, ArrayList arrayList, ArrayList arrayList2) {
        this.A00 = r1;
        this.A01 = obj;
        this.A03 = arrayList;
        this.A02 = obj2;
        this.A04 = arrayList2;
    }

    public final void onTransitionStart(Transition transition) {
        Object obj = this.A01;
        if (obj != null) {
            this.A00.A0I(obj, this.A03, (ArrayList) null);
        }
        Object obj2 = this.A02;
        if (obj2 != null) {
            this.A00.A0I(obj2, this.A04, (ArrayList) null);
        }
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }
}
