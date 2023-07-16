package X;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.widget.ImageView;
import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.5fP  reason: invalid class name and case insensitive filesystem */
public final class C90985fP extends M5L implements L1i {
    public static final Mcm A09 = new C127457hB();
    public static final Mcm A0A = new C127467hC();
    public static final Mcm A0B = new C127447hA();
    public Rect A00;
    public C126147ef A01;
    public final long A02;
    public final ContextChain A03;
    public final C142068dl A04;
    public final L1S A05;
    public final IHN A06;
    public final C142098do A07;
    public final Object A08;

    public final L1i A09() {
        return this;
    }

    public final /* synthetic */ C41788Mcl BsR() {
        return C35570Ixq.A00(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90985fP(Uri uri, ContextChain contextChain, C142068dl r7, L1S l1s, IHN ihn, long j) {
        super(AnonymousClass006.A01);
        C142098do r3;
        if (uri == null) {
            r3 = C126187ej.A00;
        } else {
            MSK msk = new MSK();
            msk.put("uri_source", uri);
            AnonymousClass4WK.A0P(msk);
            r3 = new C126177ei(uri, msk);
        }
        C86124wJ.A1N(A0B, this);
        A0I(new Lr9(A09, this));
        C86124wJ.A1N(A0A, this);
        this.A02 = j;
        this.A07 = r3;
        this.A05 = l1s;
        this.A04 = r7;
        this.A06 = ihn;
        this.A08 = "ImageNodeUtils";
        this.A03 = contextChain;
    }

    public static boolean A00(C90985fP r2, C90985fP r3) {
        if (!C002401c.A00(r2.A07, r3.A07) || !C002401c.A00(r2.A06, r3.A06) || !C002401c.A00(r2.A05, r3.A05) || !C002401c.A00(r2.A04, r3.A04)) {
            return true;
        }
        return false;
    }

    public final long A08() {
        return this.A02;
    }

    public final /* synthetic */ boolean ABx() {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object AFU(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(new I2F(AnonymousClass7CI.A00().A00));
        return imageView;
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
