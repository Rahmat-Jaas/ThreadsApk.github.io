package X;

import android.util.SparseArray;
import com.facebook.graphql.impls.CredentialResponseImpl;
import com.facebook.graphql.impls.CreditCardCredentialImpl;
import com.facebook.pando.TreeJNI;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7aH  reason: invalid class name and case insensitive filesystem */
public final class C123997aH implements C143158gC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SparseArray A01;
    public final /* synthetic */ M5J A02;
    public final /* synthetic */ C880756q A03;
    public final /* synthetic */ AnonymousClass79R A04;
    public final /* synthetic */ C128167j4 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C123997aH(SparseArray sparseArray, M5J m5j, C880756q r3, AnonymousClass79R r4, C128167j4 r5, String str, String str2, int i) {
        this.A00 = i;
        this.A07 = str;
        this.A05 = r5;
        this.A01 = sparseArray;
        this.A04 = r4;
        this.A06 = str2;
        this.A03 = r3;
        this.A02 = m5j;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Object obj2;
        AnonymousClass7Kx r10 = (AnonymousClass7Kx) obj;
        int i = this.A00;
        if (i == 3) {
            boolean A0I = C04220Ms.A0I(this.A07, "CREATE");
            C128167j4 r1 = this.A05;
            SparseArray sparseArray = this.A01;
            AnonymousClass79R r0 = this.A04;
            if (A0I) {
                C04220Ms.A07(r10);
                r1.A07(sparseArray, r0, r10);
            } else {
                C04220Ms.A07(r10);
                C880756q A022 = AnonymousClass7IT.A02(r1, r0);
                if (AnonymousClass7Kx.A0R(r10) && (obj2 = r10.A01) != null && AnonymousClass7Kx.A0R(C86104wH.A0R(A022))) {
                    obj2.getClass();
                    CredentialResponseImpl.Credential credential = (CredentialResponseImpl.Credential) ((TreeJNI) obj2).getTreeValue("credential", CredentialResponseImpl.Credential.class);
                    CreditCardCredentialImpl creditCardCredentialImpl = null;
                    if (credential != null) {
                        creditCardCredentialImpl = credential.A00();
                    }
                    if (creditCardCredentialImpl != null) {
                        AnonymousClass7Kx A023 = C128167j4.A02(creditCardCredentialImpl, false);
                        if (A023 != null) {
                            C1203179r r7 = (C1203179r) AnonymousClass7Kx.A0D(C86104wH.A0R(A022));
                            List list = r7.A02;
                            C120917Dc.A00().A01(((PaymentMethod) AnonymousClass7Kx.A0D(A023)).Aal(), C121037Du.A01(sparseArray));
                            AnonymousClass8XS r5 = AnonymousClass8XS.A00;
                            ArrayList A0s = C18200wM.A0s(list);
                            Iterator it = list.iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (!AnonymousClass0wJ.A1X(r5.invoke(it.next(), A023))) {
                                    i2++;
                                } else if (i2 != -1) {
                                    A0s.set(i2, A023);
                                }
                            }
                            AnonymousClass7Kx.A0I(A022, C1203179r.A00(r7, (String) null, AnonymousClass00J.A0N(A0s), 510));
                        } else {
                            throw C18180wK.A0a("Required value was null.");
                        }
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
            }
        } else if (i == 7) {
            C128167j4 r2 = this.A05;
            AnonymousClass79R r12 = this.A04;
            C04220Ms.A07(r10);
            r2.A0A(r12, r10, this.A06);
        } else {
            throw C18240wQ.A0j();
        }
        if (AnonymousClass7Kx.A0R(r10) || AnonymousClass7Kx.A0O(r10)) {
            this.A03.A0J(this.A02);
        }
    }
}
