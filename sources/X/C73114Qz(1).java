package X;

import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import java.util.HashMap;

/* renamed from: X.4Qz  reason: invalid class name and case insensitive filesystem */
public final class C73114Qz implements Runnable {
    public final /* synthetic */ AnonymousClass1cM A00;
    public final /* synthetic */ String A01;

    public C73114Qz(AnonymousClass1cM r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        AnonymousClass1cM r5 = this.A00;
        r5.A08.D8y(this.A01);
        C84654td r1 = r5.A08;
        if (r1 != null) {
            if ((r5.A0K || r5.A0J) && r5.A0A != null) {
                C130667qT A0S = C18230wP.A0S(r5, r5.A0E);
                PageSelectionOverrideData pageSelectionOverrideData = r5.A0A;
                String str = r5.A0F;
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put("entry_point", str);
                A0y.put("waterfall_id", pageSelectionOverrideData.A08);
                A0y.put("prior_module", "create_page");
                A0y.put("presentation_style", pageSelectionOverrideData.A05);
                C24711ju r0 = r5.A0D;
                r0.getClass();
                r0.A01();
                AnonymousClass3L1.A00(r5.A0E, "create_page", r5.A0F, AnonymousClass1cM.A00(r5), r5.A0A.A08);
                C10300i6 r12 = r5.A0E;
                String str2 = r5.A0A.A02;
                str2.getClass();
                AnonymousClass4A9 A002 = C63263h8.A00(r12, str2, A0y);
                AnonymousClass4A9.A01(A002, A0S, r5, 0);
                r5.schedule(A002);
            } else {
                C18230wP.A1P(r1);
            }
            AnonymousClass1cM.A02(r5);
        }
    }
}
