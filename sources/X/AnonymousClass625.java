package X;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.625  reason: invalid class name */
public final class AnonymousClass625 extends AnonymousClass4DQ {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C58393Fi A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final void CPO(C25918DvM dvM) {
        C04220Ms.A0B(dvM, 0);
        C19513Axa axa = C19513Axa.A00;
        Context context = this.A00.getContext();
        C04220Ms.A0C(context, C18170wI.A00(2));
        String str = this.A05;
        C04220Ms.A0A(str);
        C58393Fi r0 = this.A01;
        UserSession userSession = r0.A00;
        String str2 = r0.A02;
        String str3 = r0.A01;
        String str4 = this.A04;
        String str5 = this.A03;
        String str6 = str5;
        String str7 = str4;
        String str8 = str3;
        String str9 = str2;
        String str10 = str;
        axa.A0j((FragmentActivity) context, A00.A0N, C171619zh.UNKNOWN, C171749zu.A0K, A01.A0A, userSession, (Long) null, str10, str9, str8, str7, str6, (String) null, (String) null, (String) null, this.A02, this.A07, (String) null, (String) null, this.A06, (HashMap) null);
    }

    public AnonymousClass625(ImageView imageView, C58393Fi r2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = imageView;
        this.A05 = str;
        this.A01 = r2;
        this.A04 = str2;
        this.A03 = str3;
        this.A02 = str4;
        this.A07 = str5;
        this.A06 = str6;
    }
}
