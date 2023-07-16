package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import kotlin.jvm.internal.KtLambdaShape67S0100000_I2_47;

/* renamed from: X.13x  reason: invalid class name and case insensitive filesystem */
public class C202713x extends M5O implements C27897Ev8, C21570BwZ {
    public final IgImageButton A00;
    public final C04530Oa A01;
    public final C04530Oa A02;
    public final C04530Oa A03;
    public final boolean A04;
    public final C04530Oa A05;
    public final C04530Oa A06;
    public final C04530Oa A07;
    public final C04530Oa A08 = A00(this, 10);
    public final C04530Oa A09 = A00(this, 12);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C202713x(View view, String str) {
        super(view);
        C04220Ms.A0B(view, 1);
        this.A00 = (IgImageButton) AnonymousClass0wJ.A0I(view, R.id.image_button);
        this.A03 = A00(view, 11);
        this.A01 = A00(view, 6);
        this.A02 = A00(view, 9);
        this.A04 = C04220Ms.A0I(str, "like_and_share");
        this.A05 = A00(this, 5);
        this.A07 = A00(this, 8);
        this.A06 = A00(this, 7);
    }

    public static C04530Oa A00(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape67S0100000_I2_47(obj, i));
    }

    public final IgdsMediaButton AOn() {
        return (IgdsMediaButton) C18190wL.A0f(this.A05);
    }

    public final IgFrameLayout AOo() {
        return (IgFrameLayout) C18190wL.A0f(this.A06);
    }

    public final View AOp() {
        return (View) C18190wL.A0f(this.A07);
    }

    public final View Arq() {
        return (View) C18190wL.A0f(this.A08);
    }

    public final TextView BCi() {
        return (TextView) C18190wL.A0f(this.A09);
    }
}
