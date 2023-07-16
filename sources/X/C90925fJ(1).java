package X;

import android.content.Context;

/* renamed from: X.5fJ  reason: invalid class name and case insensitive filesystem */
public abstract class C90925fJ extends C91005fR implements L1i {
    public abstract AnonymousClass7H0 A0P(AnonymousClass39P r1, int i, int i2);

    public abstract void A0Q(Context context, Object obj, Object obj2);

    public abstract void A0R(Context context, Object obj, Object obj2);

    public boolean A0S(C90925fJ r3, Object obj, Object obj2) {
        boolean A03;
        C04220Ms.A0B(r3, 0);
        if (!C04220Ms.A0I(obj, obj2)) {
            return true;
        }
        if (this == r3) {
            return false;
        }
        if (!(this instanceof C143498gq) || !(r3 instanceof C143498gq)) {
            A03 = AnonymousClass7Fa.A03(this, r3);
        } else {
            A03 = AnonymousClass7Fa.A01((C143498gq) this, (C143498gq) r3);
        }
        if (!A03) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ C41788Mcl BsR() {
        return C35570Ixq.A00(this);
    }

    public final L1i A09() {
        return this;
    }

    public final /* synthetic */ boolean ABx() {
        return false;
    }

    public final /* synthetic */ boolean BXl() {
        return false;
    }

    public /* synthetic */ int CWo() {
        return 3;
    }

    public C90925fJ(Integer num) {
        super(num);
        Mcm mcm = AnonymousClass6XG.A00;
        C04220Ms.A0C(mcm, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.Binder<com.facebook.litho.SimpleMountable<ContentT of com.facebook.litho.SimpleMountable>, ContentT of com.facebook.litho.SimpleMountable, kotlin.Any?>");
        C86124wJ.A1N(mcm, this);
    }

    public final /* synthetic */ Object AG7(Context context) {
        return AFU(context);
    }

    public final /* synthetic */ C41788Mcl AGD() {
        return BsR();
    }

    public final /* synthetic */ Object B2C() {
        return getClass();
    }
}
