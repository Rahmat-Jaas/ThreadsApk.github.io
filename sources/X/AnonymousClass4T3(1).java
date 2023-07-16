package X;

import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.model.business.BusinessInfo;
import java.util.HashMap;

/* renamed from: X.4T3  reason: invalid class name */
public final class AnonymousClass4T3 implements Runnable {
    public final /* synthetic */ AnonymousClass1cM A00;
    public final /* synthetic */ BusinessInfo A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public AnonymousClass4T3(AnonymousClass1cM r1, BusinessInfo businessInfo, String str, String str2, String str3) {
        this.A00 = r1;
        this.A01 = businessInfo;
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
    }

    public final void run() {
        AnonymousClass1cM r6 = this.A00;
        AnonymousClass0wJ.A0R(r6.A08).A06 = this.A01;
        AnonymousClass0wJ.A0R(r6.A08).A0F = this.A02;
        ((BusinessConversionActivity) r6.A08).A08.getValue();
        String str = this.A04;
        C84654td r4 = r6.A08;
        String str2 = this.A03;
        String A0Z = C18250wR.A0Z(r6.A0B);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("page_name", str);
        C18250wR.A1E(str2, A0y);
        A0y.put("subcategory_id", A0Z);
        r4.Bel(AnonymousClass3z8.A02(A0y));
        AnonymousClass1cM.A02(r6);
    }
}
