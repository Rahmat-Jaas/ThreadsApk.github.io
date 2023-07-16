package X;

import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000100_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2502000_I2;
import com.instagram.api.schemas.AdsTargetingGender;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.3wa  reason: invalid class name and case insensitive filesystem */
public final class C65883wa implements C143158gC {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C34613Ibj A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ AnonymousClass0MJ A03;

    public C65883wa(TextView textView, C34613Ibj ibj, String str, AnonymousClass0MJ r4) {
        this.A03 = r4;
        this.A01 = ibj;
        this.A00 = textView;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        TextView textView;
        String str;
        String A0r;
        KtCSuperShape0S2502000_I2 ktCSuperShape0S2502000_I2 = (KtCSuperShape0S2502000_I2) obj;
        if (ktCSuperShape0S2502000_I2 != null) {
            AnonymousClass0MJ r4 = this.A03;
            C34613Ibj ibj = this.A01;
            Iterable<ILe> iterable = (Iterable) ktCSuperShape0S2502000_I2.A04;
            ArrayList A0x = AnonymousClass0wJ.A0x(iterable, 10);
            for (ILe A002 : iterable) {
                ibj.A0Q.getValue();
                A0x.add(I6G.A00(A002));
            }
            String A0H = AnonymousClass00J.A0H(", ", (CharSequence) null, (CharSequence) null, A0x, (AnonymousClass0YY) null, 62);
            AdsTargetingGender adsTargetingGender = (AdsTargetingGender) ktCSuperShape0S2502000_I2.A02;
            if (adsTargetingGender.ordinal() == 1) {
                A0r = ibj.getString(2131822420);
            } else {
                A0r = C18190wL.A0r(Locale.ROOT, adsTargetingGender.A00);
            }
            C04220Ms.A09(A0r);
            String A0k = C18220wO.A0k(ibj, String.valueOf(ktCSuperShape0S2502000_I2.A01), String.valueOf(ktCSuperShape0S2502000_I2.A00), 2131822419);
            C04220Ms.A06(A0k);
            Iterable<KtCSuperShape0S1000100_I2> iterable2 = (Iterable) ktCSuperShape0S2502000_I2.A05;
            ArrayList A0x2 = AnonymousClass0wJ.A0x(iterable2, 10);
            for (KtCSuperShape0S1000100_I2 ktCSuperShape0S1000100_I2 : iterable2) {
                A0x2.add(ktCSuperShape0S1000100_I2.A01);
            }
            String A0H2 = AnonymousClass00J.A0H(", ", (CharSequence) null, (CharSequence) null, A0x2, (AnonymousClass0YY) null, 62);
            ArrayList A0v = AnonymousClass0wJ.A0v();
            A0v.add(A0H);
            A0v.add(A0r);
            A0v.add(A0k);
            if (A0H2.length() > 0) {
                A0v.add(A0H2);
            }
            String A0H3 = AnonymousClass00J.A0H(" | ", (CharSequence) null, (CharSequence) null, A0v, (AnonymousClass0YY) null, 62);
            r4.A00 = A0H3;
            textView = this.A00;
            str = AnonymousClass2KR.A00(this.A02, A0H3);
        } else {
            textView = this.A00;
            str = this.A02;
        }
        textView.setText(str);
    }
}
