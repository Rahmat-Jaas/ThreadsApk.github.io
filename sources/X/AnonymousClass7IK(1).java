package X;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.foundation.layout.WindowInsets;
import com.instagram.barcelona.R;
import java.util.WeakHashMap;

/* renamed from: X.7IK  reason: invalid class name */
public final class AnonymousClass7IK {
    public static final C111346nB A0N = new C111346nB();
    public static final WeakHashMap A0O = new WeakHashMap();
    public int A00;
    public final AnonymousClass7VF A01 = new AnonymousClass7VF(4, "captionBar");
    public final AnonymousClass7VF A02;
    public final AnonymousClass7VF A03;
    public final AnonymousClass7VF A04;
    public final AnonymousClass7VF A05;
    public final AnonymousClass7VF A06;
    public final AnonymousClass7VF A07;
    public final AnonymousClass7VF A08;
    public final AnonymousClass7VF A09;
    public final C879655n A0A;
    public final AnonymousClass7VE A0B;
    public final AnonymousClass7VE A0C;
    public final AnonymousClass7VE A0D;
    public final AnonymousClass7VE A0E;
    public final AnonymousClass7VE A0F;
    public final AnonymousClass7VE A0G;
    public final AnonymousClass7VE A0H;
    public final AnonymousClass7VE A0I;
    public final boolean A0J;
    public final WindowInsets A0K;
    public final WindowInsets A0L;
    public final WindowInsets A0M;

    public static /* synthetic */ void A02(AnonymousClass7IK r3, AnonymousClass03Y r4) {
        r3.A01.A00(r4);
        r3.A03.A00(r4);
        r3.A02.A00(r4);
        r3.A05.A00(r4);
        r3.A06.A00(r4);
        r3.A07.A00(r4);
        r3.A08.A00(r4);
        r3.A09.A00(r4);
        r3.A04.A00(r4);
        AnonymousClass7VE r1 = r3.A0B;
        AnonymousClass03V r2 = r4.A00;
        A01(r1, r2, 4);
        A01(r3.A0E, r2, 2);
        A01(r3.A0F, r2, 1);
        A01(r3.A0G, r2, 7);
        A01(r3.A0H, r2, 64);
        AnonymousClass025 A072 = r2.A07();
        if (A072 != null) {
            AnonymousClass01T A002 = A072.A00();
            C04220Ms.A06(A002);
            AnonymousClass7VE r0 = r3.A0I;
            r0.A00.CrC(C97926Dm.A00(A002));
        }
        C121637Hc.A04();
    }

    public AnonymousClass7IK(View view) {
        boolean z;
        Boolean bool;
        View view2;
        AnonymousClass7VF r8 = new AnonymousClass7VF(128, "displayCutout");
        this.A02 = r8;
        AnonymousClass7VF r9 = new AnonymousClass7VF(8, "ime");
        this.A03 = r9;
        AnonymousClass7VF r7 = new AnonymousClass7VF(32, "mandatorySystemGestures");
        this.A04 = r7;
        this.A05 = new AnonymousClass7VF(2, "navigationBars");
        this.A06 = new AnonymousClass7VF(1, "statusBars");
        AnonymousClass7VF r3 = new AnonymousClass7VF(7, "systemBars");
        this.A07 = r3;
        AnonymousClass7VF r6 = new AnonymousClass7VF(16, "systemGestures");
        this.A08 = r6;
        AnonymousClass7VF r5 = new AnonymousClass7VF(64, "tappableElement");
        this.A09 = r5;
        AnonymousClass01T r1 = AnonymousClass01T.A04;
        C04220Ms.A09(r1);
        AnonymousClass7VE r4 = new AnonymousClass7VE(C97926Dm.A00(r1), "waterfall");
        this.A0I = r4;
        AnonymousClass0wJ.A1Z(r3, r9);
        AnonymousClass7VD r32 = new AnonymousClass7VD(new AnonymousClass7VD(r3, r9), r8);
        this.A0L = r32;
        AnonymousClass0wJ.A1Z(r5, r7);
        AnonymousClass7VD r2 = new AnonymousClass7VD(new AnonymousClass7VD(new AnonymousClass7VD(r5, r7), r6), r4);
        this.A0M = r2;
        this.A0K = new AnonymousClass7VD(r32, r2);
        this.A0B = A00(r1, "captionBarIgnoringVisibility");
        this.A0E = A00(r1, "navigationBarsIgnoringVisibility");
        this.A0F = A00(r1, "statusBarsIgnoringVisibility");
        this.A0G = A00(r1, "systemBarsIgnoringVisibility");
        this.A0H = A00(r1, "tappableElementIgnoringVisibility");
        this.A0D = A00(r1, "imeAnimationTarget");
        this.A0C = A00(r1, "imeAnimationSource");
        ViewParent parent = view.getParent();
        Object obj = null;
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            obj = view2.getTag(R.id.consume_window_insets_tag);
        }
        if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
            z = true;
        } else {
            z = bool.booleanValue();
        }
        this.A0J = z;
        this.A0A = new C879655n(this);
    }

    public static AnonymousClass7VE A00(AnonymousClass01T r1, String str) {
        C04220Ms.A09(r1);
        return new AnonymousClass7VE(C97926Dm.A00(r1), str);
    }

    public static void A01(AnonymousClass7VE r2, AnonymousClass03V r3, int i) {
        AnonymousClass01T A062 = r3.A06(i);
        C04220Ms.A06(A062);
        r2.A00.CrC(C97926Dm.A00(A062));
    }
}
