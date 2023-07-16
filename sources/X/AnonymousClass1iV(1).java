package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;

/* renamed from: X.1iV  reason: invalid class name */
public class AnonymousClass1iV extends C63873iU {
    public final Context A00;

    public AnonymousClass1iV(Context context) {
        this.A00 = context;
    }

    public void A00(C22131Tm r6) {
        int A03 = C14030oh.A03(1932809641);
        if (!TextUtils.isEmpty(r6.A04)) {
            C63813iO.A0F(r6.A04);
        } else if (TextUtils.isEmpty(r6.A03) || TextUtils.isEmpty(r6.A00)) {
            C63813iO.A04(2131832181);
        } else {
            String str = r6.A03;
            String str2 = r6.A00;
            C25828Dsm A0W = C18190wL.A0W(this.A00);
            if (str != null) {
                A0W.A02 = str;
            }
            A0W.A0p(str2);
            A0W.A0P((DialogInterface.OnClickListener) null, 2131831976);
            A0W.A0e((DialogInterface.OnDismissListener) null);
            AnonymousClass0wJ.A1K(A0W);
        }
        C14030oh.A0A(-1370760612, A03);
    }

    public void onFail(AnonymousClass3XX r4) {
        String string;
        int A03 = C14030oh.A03(-547096977);
        Object obj = r4.A00;
        if (obj != null) {
            C22131Tm r1 = (C22131Tm) obj;
            if (!TextUtils.isEmpty(r1.A02)) {
                string = r1.A02;
                C63813iO.A0F(string);
                C14030oh.A0A(-201996041, A03);
            }
        }
        string = this.A00.getString(2131834837);
        C63813iO.A0F(string);
        C14030oh.A0A(-201996041, A03);
    }

    public void onFinish() {
        int A03 = C14030oh.A03(-426021182);
        super.onFinish();
        C14030oh.A0A(377985985, A03);
    }

    public void onStart() {
        int A03 = C14030oh.A03(-420231557);
        super.onStart();
        C14030oh.A0A(674034795, A03);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-433924964);
        A00((C22131Tm) obj);
        C14030oh.A0A(-300879432, A03);
    }
}
