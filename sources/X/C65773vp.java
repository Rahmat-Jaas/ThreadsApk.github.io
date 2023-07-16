package X;

import android.widget.RadioGroup;
import java.util.List;

/* renamed from: X.3vp  reason: invalid class name and case insensitive filesystem */
public final class C65773vp implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ AnonymousClass3EZ A00;
    public final /* synthetic */ C29261xe A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    public C65773vp(AnonymousClass3EZ r1, C29261xe r2, String str, String str2, List list, boolean z) {
        this.A01 = r2;
        this.A04 = list;
        this.A03 = str;
        this.A02 = str2;
        this.A05 = z;
        this.A00 = r1;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        String A002 = C62563aI.A00(this.A04, i);
        C29261xe r5 = this.A01;
        if (C63803iN.A05(AnonymousClass0TJ.A05, r5.A02, 36317040864136671L).booleanValue()) {
            String str = this.A03;
            if ("video_call".equals(str) && A002.equals("off")) {
                String str2 = this.A02;
                boolean z = this.A05;
                AnonymousClass3EZ r4 = this.A00;
                C25828Dsm A0V = AnonymousClass0wJ.A0V(r5);
                A0V.A0L(2131826063);
                A0V.A0K(2131826062);
                A0V.A0P(new C64063jV(r4, r5, A002, str, str2, z), 2131826064);
                A0V.A0N(C18220wO.A0O(r5, 153), 2131826061);
                AnonymousClass0wJ.A1K(A0V);
                return;
            }
        }
        String str3 = this.A03;
        String str4 = this.A02;
        boolean z2 = this.A05;
        this.A00.A00(A002, str3, "radio");
        if (!C09660ft.A01(r5.getContext())) {
            C63853iS.A0B(r5.getContext());
        } else if (!z2) {
            C63853iS.A0E(r5.getContext(), str4);
        }
    }
}
