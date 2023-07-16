package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.service.session.UserSession;

/* renamed from: X.1l1  reason: invalid class name */
public final class AnonymousClass1l1 extends AnonymousClass1lO {
    public final Fragment A00;
    public final C84094sX A01;
    public final C11630kW A02;
    public final UserSession A03;

    public final Class modelClass() {
        return AnonymousClass198.class;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.3rz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: com.facebook.redex.IDxCListenerShape15S0400000_1_I2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: com.facebook.redex.IDxCListenerShape15S0400000_1_I2} */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C41882MfV r25, X.M5O r26) {
        /*
            r24 = this;
            r9 = r26
            r1 = r25
            X.198 r1 = (X.AnonymousClass198) r1
            X.13u r9 = (X.C202413u) r9
            r13 = 0
            boolean r11 = X.AnonymousClass0wJ.A1Z(r1, r9)
            com.instagram.user.model.User r8 = r1.A06
            java.lang.Integer r10 = r1.A07
            boolean r12 = r1.A00
            boolean r7 = r1.A09
            X.3Dd r6 = r1.A02
            X.9uI r5 = r1.A04
            java.lang.Integer r0 = r1.A08
            r23 = r0
            X.9uI r0 = r1.A05
            r22 = r0
            X.3Dd r0 = r1.A03
            r21 = r0
            X.3Dd r15 = r1.A01
            r0 = r24
            com.instagram.service.session.UserSession r4 = r0.A03
            androidx.fragment.app.Fragment r3 = r0.A00
            X.0kW r2 = r0.A02
            android.content.Context r14 = X.C18240wQ.A0A(r3, r10, r11)
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r1 = r9.A01
            r1.A00()
            java.lang.String r0 = r8.BK7()
            r1.A09(r0, r13)
            java.lang.String r0 = r8.Ak1()
            if (r12 == 0) goto L_0x005e
            if (r0 == 0) goto L_0x00bc
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00bc
            java.lang.String r13 = r8.Ak1()
            java.lang.String r12 = " • "
            r0 = 2131832393(0x7f112e49, float:1.9297839E38)
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r0 = X.AnonymousClass00U.A0V(r13, r12, r0)
        L_0x005e:
            r1.A08(r0)
            java.lang.CharSequence r12 = X.C59523Ld.A00(r14, r15)
            int r0 = r12.length()
            if (r0 <= 0) goto L_0x006e
            r1.A07(r12)
        L_0x006e:
            java.lang.Integer r20 = X.AnonymousClass006.A00
            r17 = r4
            r18 = r8
            r19 = r10
            r14 = r2
            r15 = r6
            r16 = r5
            r12 = r3
            r13 = r9
            X.4nu r6 = X.C202413u.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.3AK r5 = new X.3AK
            r5.<init>(r3, r8)
            if (r7 == 0) goto L_0x00b9
            com.facebook.redex.IDxCListenerShape15S0400000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape15S0400000_1_I2
            r12 = r4
            r14 = r3
            r15 = r8
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            r1.setOnClickListener(r0)
            r11 = 2
            com.facebook.redex.IDxCListenerShape15S0400000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape15S0400000_1_I2
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x009a:
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r5.A00 = r0
            r1.A04(r5, r4, r8)
            if (r6 == 0) goto L_0x00b8
            java.lang.Integer r18 = X.AnonymousClass006.A01
            r10 = r3
            r11 = r9
            r12 = r2
            r13 = r21
            r14 = r22
            r15 = r4
            r16 = r8
            r17 = r23
            X.4nu r0 = X.C202413u.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.A06(r6, r0)
        L_0x00b8:
            return
        L_0x00b9:
            X.3rz r0 = X.C64863rz.A00
            goto L_0x009a
        L_0x00bc:
            r0 = 2131832393(0x7f112e49, float:1.9297839E38)
            java.lang.String r0 = r14.getString(r0)
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1l1.bind(X.MfV, X.M5O):void");
    }

    public AnonymousClass1l1(Fragment fragment, C84094sX r2, C11630kW r3, UserSession userSession) {
        AnonymousClass0wJ.A1P(userSession, r2);
        this.A03 = userSession;
        this.A00 = fragment;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C202413u(this.A01, new IgdsPeopleCell(C18190wL.A0A(viewGroup), C18200wM.A1Y(viewGroup)));
    }
}
