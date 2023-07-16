package X;

import android.animation.LayoutTransition;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.List;

/* renamed from: X.770  reason: invalid class name */
public final class AnonymousClass770 {
    public Button A00;
    public ScrollView A01;
    public TextView A02;
    public final Handler A03 = AnonymousClass0wJ.A0F();
    public final Handler A04 = AnonymousClass0wJ.A0F();
    public final C109686kP A05 = new C109686kP();
    public final C110296lR A06 = new C110296lR();
    public final C121077Ea A07;
    public final Runnable A08 = new C135197z2(this);
    public final Runnable A09 = new C135207z3(this);

    public static final void A00() {
        List<View> list = AnonymousClass7IZ.A04;
        for (View view : list) {
            ViewParent parent = view.getParent();
            C04220Ms.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setLayoutTransition((LayoutTransition) null);
            ViewParent parent2 = view.getParent();
            C04220Ms.A0C(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent2).removeView(view);
        }
        list.clear();
    }

    public AnonymousClass770(C121077Ea r2) {
        this.A07 = r2;
    }
}
