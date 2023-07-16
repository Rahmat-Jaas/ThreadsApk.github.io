package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import com.instagram.service.session.UserSession;

/* renamed from: X.3GK  reason: invalid class name */
public abstract class AnonymousClass3GK {
    public boolean A00;
    public final C307522u A01;
    public final GroupLinkPreviewResponse$Success A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final C83224qz A06;
    public final KtCSuperShape0S2000000_I2 A07;
    public final KtCSuperShape0S2000000_I2 A08;
    public final E5N A09;
    public final C28461uL A0A;
    public final C58543Ge A0B;
    public final UserSession A0C;

    public AnonymousClass3GK(KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2, KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I22, C307522u r6, C28461uL r7, C58543Ge r8, GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success, UserSession userSession) {
        this.A0C = userSession;
        this.A0A = r7;
        this.A01 = r6;
        this.A07 = ktCSuperShape0S2000000_I2;
        this.A08 = ktCSuperShape0S2000000_I22;
        this.A02 = groupLinkPreviewResponse$Success;
        this.A0B = r8;
        this.A05 = groupLinkPreviewResponse$Success.A0A;
        this.A03 = groupLinkPreviewResponse$Success.A05;
        this.A04 = groupLinkPreviewResponse$Success.A08;
        E5N A0J = C18250wR.A0J((AnonymousClass0gW) null, 3);
        this.A09 = A0J;
        this.A06 = C84874u0.A00(A0J, 483063461, 3);
    }

    public final boolean A00() {
        boolean A1J;
        if (this instanceof AnonymousClass1oh) {
            AnonymousClass1oh r2 = (AnonymousClass1oh) this;
            GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success = r2.A05;
            if (!groupLinkPreviewResponse$Success.A0F && !groupLinkPreviewResponse$Success.A0C) {
                A1J = r2.A00;
            }
            return false;
        }
        if (!(this instanceof AnonymousClass1oi) && !(this instanceof C25701og)) {
            AnonymousClass1oj r22 = (AnonymousClass1oj) this;
            GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success2 = r22.A04;
            if (!groupLinkPreviewResponse$Success2.A0C) {
                A1J = C18250wR.A1J(r22.A05, String.valueOf(groupLinkPreviewResponse$Success2.A03));
            }
        }
        return false;
        if (A1J) {
            return false;
        }
        return true;
    }
}
