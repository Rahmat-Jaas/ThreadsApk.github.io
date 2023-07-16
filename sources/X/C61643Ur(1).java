package X;

import android.content.Context;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import kotlin.jvm.internal.KtLambdaShape45S0200000_I2_6;
import kotlin.jvm.internal.KtLambdaShape90S0100000_I2_70;

/* renamed from: X.3Ur  reason: invalid class name and case insensitive filesystem */
public final class C61643Ur {
    public boolean A00;
    public final Context A01;
    public final C84364t1 A02;
    public final AnonymousClass0ZU A03;
    public final C10300i6 A04;
    public final AnonymousClass0YY A05;

    public C61643Ur(Context context, C10300i6 r3, C84364t1 r4, AnonymousClass0ZU r5, AnonymousClass0YY r6) {
        C04220Ms.A0B(r6, 4);
        this.A03 = r5;
        this.A04 = r3;
        this.A01 = context;
        this.A05 = r6;
        this.A02 = r4;
    }

    public final void A00() {
        String str = (String) this.A03.invoke();
        if (AnonymousClass8bP.A0L(str).toString().length() != 0) {
            C32165H8c A002 = C63503hc.A00(this.A01, this.A04, str, this.A00);
            A002.A00 = new C24241hk(this, str);
            this.A05.invoke(A002);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C61643Ur(Context context, AnonymousClass06E r8, C10300i6 r9, C84364t1 r10, SearchEditText searchEditText) {
        this(context, r9, r10, (AnonymousClass0ZU) new KtLambdaShape90S0100000_I2_70(searchEditText, 43), (AnonymousClass0YY) new KtLambdaShape45S0200000_I2_6(46, (Object) r8, (Object) context));
        AnonymousClass0wJ.A1O(searchEditText, r9);
        C04220Ms.A0B(context, 3);
    }
}
