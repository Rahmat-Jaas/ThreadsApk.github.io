package X;

import android.content.Context;
import com.facebook.redex.IDxFunctionShape326S0100000_2_I2;
import com.instagram.common.bloks.component.textinput.BloksEditText;

/* renamed from: X.7hi  reason: invalid class name and case insensitive filesystem */
public final class C127787hi implements Mcm {
    public final /* synthetic */ C90905fH A00;

    public C127787hi(C90905fH r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object AAO(Context context, Object obj, Object obj2, Object obj3) {
        BloksEditText bloksEditText = (BloksEditText) obj;
        C04220Ms.A0B(bloksEditText, 1);
        C90905fH r1 = this.A00;
        AnonymousClass3HX r0 = r1.A01;
        C127397h3 r5 = r1.A02;
        C107206gM r2 = r1.A00;
        C111326n9 A01 = C121977Jb.A01(r2, r0, r5, bloksEditText, obj3);
        if (!AnonymousClass2LL.A00(C127397h3.A0A(r5, 63), false)) {
            return null;
        }
        float textSize = bloksEditText.getTextSize();
        if (A01.A0I == textSize) {
            return null;
        }
        A01.A0I = textSize;
        r2.A00.AKM(new C108066hl(new IDxFunctionShape326S0100000_2_I2((Object) A01, 50), r5.A02));
        return null;
    }

    public final /* bridge */ /* synthetic */ void D82(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        BloksEditText bloksEditText = (BloksEditText) obj;
        C04220Ms.A0B(bloksEditText, 1);
        C90905fH r0 = this.A00;
        C121977Jb.A05(r0.A01, r0.A02, bloksEditText);
    }

    public final /* bridge */ /* synthetic */ boolean CtJ(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
