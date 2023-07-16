package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.5fM  reason: invalid class name and case insensitive filesystem */
public final class C90955fM extends M5L implements L1i {
    public static Mcm A0B = new C127477hD();
    public static Mcm A0C = new C127487hE();
    public static Mcm A0D = new C127497hF();
    public static Mcm A0E = new C127507hG();
    public int A00 = -1;
    public int A01 = 0;
    public int A02;
    public long A03;
    public Drawable A04;
    public Drawable A05;
    public View.OnClickListener A06;
    public C127397h3 A07;
    public C108166hv A08;
    public boolean A09 = true;
    public final AnonymousClass3HX A0A;

    public final L1i A09() {
        return this;
    }

    public final /* synthetic */ C41788Mcl BsR() {
        return C35570Ixq.A00(this);
    }

    public C90955fM(AnonymousClass3HX r7, long j, boolean z) {
        super(AnonymousClass006.A01);
        this.A03 = j;
        A0K(new Lr9(A0B, this), new Lr9(A0C, this), new Lr9(A0E, this), new Lr9(A0D, this));
        this.A02 = 0;
        this.A08 = new C108166hv();
        this.A0A = r7;
        A0K(new Lr9(new C127697hZ(), this), new Lr9(new C127707ha(), this));
        if (!z) {
            C86124wJ.A1N(new C127797hj(this), this);
        }
    }

    public final long A08() {
        return this.A03;
    }

    public final /* synthetic */ boolean ABx() {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        return new C90885fF(context);
    }

    public final /* synthetic */ boolean BXl() {
        return false;
    }

    public final /* synthetic */ int CWo() {
        return 3;
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
